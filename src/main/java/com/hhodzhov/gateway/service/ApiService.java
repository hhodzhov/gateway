package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.ApiPayload;
import java.util.List;

public interface ApiService {

    Currency getCurrentInfo(ApiPayload apiPayload);

    List<Currency> getCurrencyHistory(ApiPayload apiPayload);
}
