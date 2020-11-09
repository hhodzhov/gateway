package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.exception.ApiException;
import com.hhodzhov.gateway.model.ClientRequest;
import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.ApiPayload;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.TimeZone;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private final ClientRequestService clientRequestService;
    private final ModelMapper modelMapper;
    private final CurrencyService currencyService;

    @Override
    @Transactional
    public Currency getCurrentInfo(ApiPayload apiPayload) {
        validateRequestId(apiPayload.getRequestId());

        createClientRequest(apiPayload);

        return currencyService.getLatestInfo(apiPayload.getCurrency())
                .orElseThrow(() -> new ApiException("No such info exist with currency:"
                        + apiPayload.getCurrency().toString()));
    }

    @Override
    public List<Currency> getCurrencyHistory(ApiPayload apiPayload) {
        validateRequestId(apiPayload.getRequestId());

        createClientRequest(apiPayload);

        if (apiPayload.getPeriod() == null) {
            throw new ApiException("Period cannot be null");
        }

        return currencyService.getHistoryByHours(apiPayload.getCurrency(), apiPayload.getPeriod());
    }

    private void createClientRequest(ApiPayload apiPayload) {
        ClientRequest clientRequest = modelMapper.map(apiPayload, ClientRequest.class);

        if (apiPayload.getTimestamp() != null) {
            LocalDateTime requestDate =
                    LocalDateTime.ofInstant(Instant.ofEpochSecond(apiPayload.getTimestamp()),
                            TimeZone.getDefault().toZoneId());
            clientRequest.setRequestDate(requestDate);
        }

        clientRequestService.save(clientRequest);
    }

    private void validateRequestId(String requestId) {
        if (clientRequestService.existsByRequestId(requestId)) {
            throw new ApiException("Request with id: " + requestId + " already exists");
        }
    }
}
