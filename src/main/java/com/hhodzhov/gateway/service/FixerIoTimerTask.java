package com.hhodzhov.gateway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.util.Date;
import java.util.TimerTask;

@Service
@RequiredArgsConstructor
public class FixerIoTimerTask extends TimerTask {

    private final FixerIOService fixerIOService;

    @Override
    public void run() {
        fixerIOService.refreshDataFromFixerIo();
        System.out.println("Task performed on: " + new Date());
    }
}
