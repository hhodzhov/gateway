package com.hhodzhov.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhodzhov.gateway.enumeration.BaseRate;
import lombok.Data;

@Data
public class JsonApiCurrentPayload {

    private String requestId;

    @JsonProperty("client")
    private String clientId;

    private BaseRate currency;

    private long timestamp;
}
