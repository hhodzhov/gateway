package com.hhodzhov.gateway.controller;

import com.hhodzhov.gateway.converter.ApiConverter;
import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.payload.ApiPayload;
import com.hhodzhov.gateway.service.XmlApiService;
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
@RequestMapping("/xml_api")
@RequiredArgsConstructor
public class XmlApiController {

    private final XmlApiService xmlApiService;
    private final ApiConverter apiConverter;

    @PostMapping(path = Endpoints.XML_API_COMMAND,
            consumes = {MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE})
    public List<CurrencyDTO> getCurrentInfo(@RequestBody ApiPayload apiPayload) {

        if (apiPayload != null && apiPayload.getPeriod() == null) {
            return List.of(apiConverter.convert(xmlApiService.getCurrentInfo(apiPayload)));
        }

        return xmlApiService.getHistory(apiPayload)
                .stream()
                .map(apiConverter::convert)
                .collect(Collectors.toList());
    }
}
