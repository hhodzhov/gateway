package com.hhodzhov.gateway.enumeration;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(converter = BaseRateDeserializer.class)
public enum BaseRate {
    EUR("EUR");

    private String isoCode;

    BaseRate(String isoCode) {
        this.isoCode = isoCode;
    }
}
