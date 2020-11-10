package com.hhodzhov.gateway.client;

import com.hhodzhov.gateway.dto.CurrencyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import com.hhodzhov.gateway.constants.Endpoints;

@Component
public class FixerIOClient {

    private RestTemplate restTemplate;

    @Value("${fixer.key}")
    private String fixerAccessKey;

    @Autowired
    public FixerIOClient(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public CurrencyDTO getCurrency() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Accept", "*/*");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(Endpoints.FIXER_URL)
                .queryParam("access_key", fixerAccessKey);
        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<CurrencyDTO> response = restTemplate.exchange(
                builder.toUriString(),
                HttpMethod.GET,
                entity,
                new ParameterizedTypeReference<CurrencyDTO>() {
                });

        return response.getBody();
    }
}
