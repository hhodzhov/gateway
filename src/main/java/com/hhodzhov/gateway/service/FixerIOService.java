package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.enumeration.BaseRate;
import com.hhodzhov.gateway.model.Currency;
import java.util.Optional;

public interface FixerIOService {
    void refreshDataFromFixerIo();

    Optional<Currency> getLatestInfo(BaseRate baseRate);
}
