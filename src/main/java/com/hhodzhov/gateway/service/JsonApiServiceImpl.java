package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.exception.ApiException;
import com.hhodzhov.gateway.model.ClientRequest;
import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.JsonApiCurrentPayload;
import com.hhodzhov.gateway.payload.JsonApiHistoryPayload;
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
    public Currency getCurrentInfo(JsonApiCurrentPayload jsonApiCurrentPayload) {
        if (clientRequestService.existsByRequestId(jsonApiCurrentPayload.getRequestId())) {
            throw new ApiException("Request with id: " + jsonApiCurrentPayload.getRequestId() + " already exists");
        }

        createClientRequest(jsonApiCurrentPayload);

        return fixerIOService.getLatestInfo(jsonApiCurrentPayload.getCurrency())
                .orElseThrow(() -> new ApiException("No such info exist with currency:"
                        + jsonApiCurrentPayload.getCurrency().toString()));
    }

    private void createClientRequest(JsonApiCurrentPayload jsonApiCurrentPayload) {
        ClientRequest clientRequest = modelMapper.map(jsonApiCurrentPayload, ClientRequest.class);

        LocalDateTime requestDate =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(jsonApiCurrentPayload.getTimestamp()),
                        TimeZone.getDefault().toZoneId());
        clientRequest.setRequestDate(requestDate);

        clientRequestService.save(clientRequest);
    }

    @Override
    public List<Currency> getCurrencyHistory(JsonApiHistoryPayload jsonApiHistoryPayload) {

        //add logic for getting history

        /*

        1 - check why you will need the client id
        2 - check why you will need the timestamp
        3 - check the request id for the duplication of requests - investigate this
        4 - when everything is clear just make a query to DB with given parameters and return the result

         */

        return null;
    }
}
