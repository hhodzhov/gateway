package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.JsonApiCurrentPayload;
import com.hhodzhov.gateway.payload.JsonApiHistoryPayload;
import com.hhodzhov.gateway.repository.FixerIoRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JsonApiServiceImpl implements JsonApiService {

    private FixerIoRepository fixerIoRepository;

    @Override
    public Currency getCurrentInfo(JsonApiCurrentPayload jsonApiCurrentPayload) {

        //add logic for getting the current info

        /*

        1 - check why you will need the client id
        2 - check why you will need the timestamp
        3 - check the request id for the duplication of requests - investigate this
        4 - when everything is clear just make a query to DB with given parameters and return the result

         */


        return null;
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
