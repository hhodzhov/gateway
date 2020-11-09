package com.hhodzhov.gateway.enumeration;

import com.fasterxml.jackson.databind.util.StdConverter;

public class BaseRateDeserializer extends StdConverter<String, BaseRate> {
    @Override
    public BaseRate convert(String s) {
        return BaseRate.valueOf(s);
    }
}
