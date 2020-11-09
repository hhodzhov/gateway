package com.hhodzhov.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhodzhov.gateway.enumeration.BaseRate;
import lombok.Data;

@Data
public class JsonApiHistoryPayload {

    private String requestId;

    private long timestamp;

    @JsonProperty("client")
    private String clientId;

    private BaseRate currency;

    private int period;
}
