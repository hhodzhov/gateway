package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.JsonApiCurrentPayload;
import com.hhodzhov.gateway.payload.JsonApiHistoryPayload;
import java.util.List;

public interface JsonApiService {
    Currency getCurrentInfo(JsonApiCurrentPayload jsonApiCurrentPayload);

    List<Currency> getCurrencyHistory(JsonApiHistoryPayload jsonApiHistoryPayload);
}
