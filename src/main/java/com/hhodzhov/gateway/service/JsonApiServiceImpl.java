package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.ApiPayload;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JsonApiServiceImpl implements JsonApiService {

    private final ApiService apiService;

    @Override
    @Transactional
    public Currency getCurrentInfo(ApiPayload apiPayload) {
        return apiService.getCurrentInfo(apiPayload);
    }

    @Override
    public List<Currency> getCurrencyHistory(ApiPayload apiPayload) {
        return apiService.getCurrencyHistory(apiPayload);
    }
}
