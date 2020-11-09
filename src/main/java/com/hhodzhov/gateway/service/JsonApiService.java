package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.JsonApiPayload;
import java.util.List;

public interface JsonApiService {
    Currency getCurrentInfo(JsonApiPayload jsonApiPayload);

    List<Currency> getCurrencyHistory(JsonApiPayload jsonApiPayload);
}
