package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.ClientRequest;

public interface ClientRequestService {
    boolean existsByRequestId(String requestId);

    ClientRequest save(ClientRequest clientRequest);
}
