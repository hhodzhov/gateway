package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.exception.ApiException;
import com.hhodzhov.gateway.model.ClientRequest;
import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.JsonApiPayload;
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
public class JsonApiServiceImpl implements JsonApiService {

    private final ClientRequestService clientRequestService;
    private final ModelMapper modelMapper;
    private final FixerIOService fixerIOService;

    @Override
    @Transactional
    public Currency getCurrentInfo(JsonApiPayload jsonApiPayload) {
        validateRequestId(jsonApiPayload.getRequestId());

        createClientRequest(jsonApiPayload);

        return fixerIOService.getLatestInfo(jsonApiPayload.getCurrency())
                .orElseThrow(() -> new ApiException("No such info exist with currency:"
                        + jsonApiPayload.getCurrency().toString()));
    }

    @Override
    public List<Currency> getCurrencyHistory(JsonApiPayload jsonApiPayload) {
        validateRequestId(jsonApiPayload.getRequestId());

        createClientRequest(jsonApiPayload);

        return fixerIOService.getHistoryByHours(jsonApiPayload.getCurrency(), jsonApiPayload.getPeriod());
    }


    private void createClientRequest(JsonApiPayload jsonApiPayload) {
        ClientRequest clientRequest = modelMapper.map(jsonApiPayload, ClientRequest.class);

        LocalDateTime requestDate =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(jsonApiPayload.getTimestamp()),
                        TimeZone.getDefault().toZoneId());
        clientRequest.setRequestDate(requestDate);

        clientRequestService.save(clientRequest);
    }

    private void validateRequestId(String requestId) {
        if (clientRequestService.existsByRequestId(requestId)) {
            throw new ApiException("Request with id: " + requestId + " already exists");
        }
    }
}
