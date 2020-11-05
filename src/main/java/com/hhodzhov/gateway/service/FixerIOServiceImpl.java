package com.hhodzhov.gateway.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import constants.Endpoints;

@Service
public class FixerIOServiceImpl implements FixerIOService {

    @Value("${fixer.key}")
    private String fixerAccessKey;

    private RestTemplate restTemplate = new RestTemplate();

    @Override
    public ResponseEntity<?> getRealTimeData() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Accept", "*/*");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(Endpoints.FIXER_URL)
                .queryParam("access_key", fixerAccessKey);

        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<String> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                String.class);

        return response;
    }
}
