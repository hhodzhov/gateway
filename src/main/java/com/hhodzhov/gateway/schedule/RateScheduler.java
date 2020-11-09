package com.hhodzhov.gateway.schedule;

import com.hhodzhov.gateway.service.FixerIOService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import java.util.Date;

@Component
public class RateScheduler {
    private FixerIOService fixerIOService;

    public RateScheduler(final FixerIOService fixerIOService) {
        this.fixerIOService = fixerIOService;
    }

    @Scheduled(fixedRateString = "${app.scheduled}")
    public void scheduleRatesUpdate() {
        System.out.println("Start refreshing data from fixer");
        fixerIOService.refreshDataFromFixerIo();
        System.out.println("Task performed on: " + new Date());
    }
}
