package com.hhodzhov.gateway.schedule;

import com.hhodzhov.gateway.service.CurrencyService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class RateScheduler {
    private CurrencyService currencyService;

    public RateScheduler(final CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @Scheduled(fixedRateString = "${app.scheduled}")
    public void scheduleRatesUpdate() {
        System.out.println("Start refreshing data from fixer");
        currencyService.refreshDataFromFixerIo();
        System.out.println("Task performed on: " + new Date());
    }
}
