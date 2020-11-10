package com.hhodzhov.gateway.controller;

import com.hhodzhov.gateway.converter.ApiConverter;
import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.payload.ApiPayload;
import com.hhodzhov.gateway.service.JsonApiService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;
import com.hhodzhov.gateway.constants.Endpoints;

@RestController
@RequestMapping("/json_api")
@RequiredArgsConstructor
public class JsonApiController {

    private final JsonApiService jsonApiService;
    private final ApiConverter apiConverter;

    @PostMapping(path = Endpoints.JSON_API_CURRENT,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public CurrencyDTO getCurrentInfo(@RequestBody ApiPayload apiPayload) {
        return apiConverter.convert(jsonApiService.getCurrentInfo(apiPayload));
    }

    @PostMapping(path = Endpoints.JSON_API_HISTORY,
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<CurrencyDTO> getHistory(@RequestBody ApiPayload apiPayload) {
        return jsonApiService.getCurrencyHistory(apiPayload)
                .stream()
                .map(apiConverter::convert)
                .collect(Collectors.toList());
    }
}
