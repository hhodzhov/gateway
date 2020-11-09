package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.ApiPayload;
import java.util.List;

public interface XmlApiService {
    Currency getCurrentInfo(ApiPayload apiPayload);

    List<Currency> getHistory(ApiPayload apiPayload);
}
