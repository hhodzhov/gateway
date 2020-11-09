package com.hhodzhov.gateway.controller;

import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.payload.JsonApiCurrentPayload;
import com.hhodzhov.gateway.payload.JsonApiHistoryPayload;
import com.hhodzhov.gateway.service.JsonApiService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;
import constants.Endpoints;

@RestController
@RequestMapping("/json_api")
@RequiredArgsConstructor
public class JsonApiController {

    private final ModelMapper modelMapper;
    private final JsonApiService jsonApiService;

    @PostMapping(Endpoints.JSON_API_CURRENT)
    public CurrencyDTO getCurrentInfo(@RequestBody JsonApiCurrentPayload jsonApiCurrentPayload) {
        Currency currentInfo = jsonApiService.getCurrentInfo(jsonApiCurrentPayload);
        CurrencyDTO result = modelMapper.map(currentInfo, CurrencyDTO.class);
        result.setDateOfRate(currentInfo.getRate().getDateReceived().toString());
        return result;
    }

    @PostMapping(Endpoints.JSON_API_HISTORY)
    public List<CurrencyDTO> getHistory(@RequestBody JsonApiHistoryPayload jsonApiHistoryPayload) {
        return jsonApiService.getCurrencyHistory(jsonApiHistoryPayload)
                .stream()
                .map(history -> modelMapper.map(history, CurrencyDTO.class))
                .collect(Collectors.toList());
    }
}
