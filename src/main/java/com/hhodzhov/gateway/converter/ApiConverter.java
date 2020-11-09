package com.hhodzhov.gateway.converter;

import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.model.Currency;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ApiConverter {

    private final ModelMapper modelMapper;

    public CurrencyDTO convert(Currency currency) {
        CurrencyDTO result = modelMapper.map(currency, CurrencyDTO.class);
        result.setDateOfRate(currency.getRate().getDateReceived().toString());
        return result;
    }
}
