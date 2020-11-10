package com.hhodzhov.gateway.schedule;

import com.hhodzhov.gateway.service.CurrencyService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;
import java.util.Date;

@Component
@Slf4j
public class RateScheduler {
    private CurrencyService currencyService;

    public RateScheduler(final CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @Scheduled(fixedRateString = "${app.scheduled}")
    public void scheduleRatesUpdate() {
        log.info("Start refreshing data from fixer");
        currencyService.refreshDataFromFixerIo();
        log.info("Task performed on: " + new Date());
    }
}
