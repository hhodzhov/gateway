package com.hhodzhov.gateway;

import com.hhodzhov.gateway.repository.FixerIoCustomRepository;
import com.hhodzhov.gateway.service.FixerIOService;
import com.hhodzhov.gateway.service.FixerIoServiceImpl;
import com.hhodzhov.gateway.service.FixerIoTimerTask;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Timer;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);

        GatewayApplication gatewayApplication = new GatewayApplication();
        FixerIoTimerTask timerTask = new FixerIoTimerTask(gatewayApplication.fixerIOService());

        Timer timer = new Timer("Timer");

        long delay = 1000L;

        //5 seconds
        long period = 1000L * 5L;

        timer.scheduleAtFixedRate(timerTask, delay, period);
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }

    @Bean
    public FixerIoCustomRepository fixerIoRepository() {
        return new FixerIoCustomRepository();
    }

    @Bean
    public FixerIOService fixerIOService() {
        return new FixerIoServiceImpl(modelMapper(), fixerIoRepository());
    }
}
