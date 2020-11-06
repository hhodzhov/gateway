package com.hhodzhov.gateway.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hhodzhov.gateway.enumeration.Base;
import lombok.Data;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class CurrencyDTO {

    @JsonProperty("date")
    private String dateOfRate;

    @Enumerated(EnumType.STRING)
    private Base base;

    @JsonProperty("rates")
    private RateDTO rate;

}
