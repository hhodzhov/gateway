package com.hhodzhov.gateway.service;

import org.springframework.http.ResponseEntity;

public interface FixerIOService {
    ResponseEntity<?> getRealTimeData();
}
