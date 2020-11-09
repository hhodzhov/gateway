package com.hhodzhov.gateway.controller;

import com.hhodzhov.gateway.converter.JsonApiConverter;
import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.payload.JsonApiPayload;
import com.hhodzhov.gateway.service.JsonApiService;
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

    private final JsonApiService jsonApiService;
    private final JsonApiConverter jsonApiConverter;

    @PostMapping(Endpoints.JSON_API_CURRENT)
    public CurrencyDTO getCurrentInfo(@RequestBody JsonApiPayload jsonApiPayload) {
        return jsonApiConverter.convert(jsonApiService.getCurrentInfo(jsonApiPayload));
    }

    @PostMapping(Endpoints.JSON_API_HISTORY)
    public List<CurrencyDTO> getHistory(@RequestBody JsonApiPayload jsonApiPayload) {
        return jsonApiService.getCurrencyHistory(jsonApiPayload)
                .stream()
                .map(jsonApiConverter::convert)
                .collect(Collectors.toList());
    }
}
