package com.hhodzhov.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhodzhov.gateway.enumeration.Base;
import lombok.Data;

@Data
public class JsonApiCurrentPayload {

    private String requestId;

    @JsonProperty("client")
    private String clientId;

    private Base currency;

    private long timestamp;
}
