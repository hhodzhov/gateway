package com.hhodzhov.gateway.controller;

import com.hhodzhov.gateway.service.FixerIOService;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import constants.Endpoints;

@RestController
@RequiredArgsConstructor
public class FixerIOController {

    private final FixerIOService fixerIOService;
//
//    @GetMapping(Endpoints.FIXER_DATA)
//    public ResponseEntity<?> getRealTimeDataFromFixerIO() {
//        return fixerIOService.getRealTimeData();
//    }
}
