package com.hhodzhov.gateway.repository;

import com.hhodzhov.gateway.model.ClientRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRequestRepository extends JpaRepository<ClientRequest, Long> {

    boolean existsByRequestId(String requestId);
}
