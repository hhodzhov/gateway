package com.hhodzhov.gateway.model;

import com.hhodzhov.gateway.enumeration.BaseRate;
import lombok.Data;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class ClientRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String requestId;

    private LocalDateTime requestDate;

    private String clientId;

    @Enumerated(EnumType.STRING)
    private BaseRate currency;
}
