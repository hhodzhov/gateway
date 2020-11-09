package com.hhodzhov.gateway.payload;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhodzhov.gateway.enumeration.BaseRate;
import lombok.Data;
import javax.validation.constraints.NotNull;

@Data
public class JsonApiCurrentPayload {

    @NotNull(message = "Request Id cannot be null")
    private String requestId;

    @NotNull(message = "Client cannot be null")
    @JsonProperty("client")
    private String clientId;

    @NotNull(message = "Currency cannot be null")
    private BaseRate currency;

    @NotNull(message = "Timestamp cannot be null")
    private long timestamp;
}
