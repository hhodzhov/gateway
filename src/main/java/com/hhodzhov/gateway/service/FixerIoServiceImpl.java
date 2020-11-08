package com.hhodzhov.gateway.service;

import static constants.General.DATE_TIME_PATTERN;
import com.hhodzhov.gateway.repository.FixerIoCustomRepository;
import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.model.Currency;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import constants.Endpoints;

@Service
@Setter
public class FixerIoServiceImpl implements FixerIOService {

    private final ModelMapper modelMapper;
    private final FixerIoCustomRepository fixerIoCustomRepository;

    private RestTemplate restTemplate = new RestTemplate();

    //TODO :: check why this property is always null
    @Value("${fixer.key}")
    private String fixerAccessKey;

    public FixerIoServiceImpl(ModelMapper modelMapper, FixerIoCustomRepository fixerIoCustomRepository) {
        this.modelMapper = modelMapper;
        this.fixerIoCustomRepository = fixerIoCustomRepository;
    }

    @Override
    public void refreshDataFromFixerIo() {
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

        CurrencyDTO currencyDTO = response.getBody();

        if (currencyDTO != null) {
            Currency currency = createCurrency(currencyDTO);
            fixerIoCustomRepository.persist(currency);
        }
    }

    private Currency createCurrency(CurrencyDTO currencyDTO) {
        Currency currency = modelMapper.map(currencyDTO, Currency.class);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);
        LocalDate date = LocalDate.parse(currencyDTO.getDateOfRate(), formatter);
        LocalDateTime dateTime = date.atStartOfDay();

        currency.getRate().setDate(dateTime);
        currency.getRate().setDateReceived(LocalDateTime.now());

        return currency;
    }
}
