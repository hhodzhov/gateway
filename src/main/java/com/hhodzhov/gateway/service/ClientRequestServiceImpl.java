package com.hhodzhov.gateway.service;

import com.hhodzhov.gateway.model.ClientRequest;
import com.hhodzhov.gateway.repository.ClientRequestRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientRequestServiceImpl implements ClientRequestService {

    private final ClientRequestRepository clientRequestRepository;

    @Override
    public boolean existsByRequestId(String requestId) {
        if (StringUtils.isBlank(requestId)) {
            return false;
        }

        return clientRequestRepository.existsByRequestId(requestId);
    }

    @Override
    @Transactional
    public ClientRequest save(ClientRequest clientRequest) {
        return clientRequestRepository.save(clientRequest);
    }
}
