package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.ApiPayload;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;

@Service
@RequiredArgsConstructor
public class XmlApiServiceImpl implements XmlApiService {

    private final ApiService apiService;

    @Override
    public Currency getCurrentInfo(ApiPayload apiPayload) {
        return apiService.getCurrentInfo(apiPayload);
    }

    @Override
    public List<Currency> getHistory(ApiPayload apiPayload) {
        return apiService.getCurrencyHistory(apiPayload);
    }
}
