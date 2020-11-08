package com.hhodzhov.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhodzhov.gateway.enumeration.Base;
import lombok.Data;

@Data
public class JsonApiHistoryPayload {

    private String requestId;

    private long timestamp;

    @JsonProperty("client")
    private String clientId;

    private Base currency;

    private int period;
}
