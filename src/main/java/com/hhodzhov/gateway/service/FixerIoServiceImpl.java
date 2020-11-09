package com.hhodzhov.gateway.service;

import static constants.General.DATE_TIME_PATTERN;
import com.hhodzhov.gateway.client.FixerIOClient;
import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.repository.FixerIoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
@Setter
public class FixerIoServiceImpl implements FixerIOService {

    private ModelMapper modelMapper;
    private FixerIoRepository fixerIoRepository;
    private FixerIOClient fixerIOClient;

    public FixerIoServiceImpl(final ModelMapper modelMapper, final FixerIoRepository fixerIoRepository,
                              final FixerIOClient fixerIOClient) {
        this.modelMapper = modelMapper;
        this.fixerIoRepository = fixerIoRepository;
        this.fixerIOClient = fixerIOClient;
    }

    @Override
    public void refreshDataFromFixerIo() {
        CurrencyDTO currencyDTO = fixerIOClient.getCurrency();

        if (currencyDTO != null) {
            Currency currency = createCurrency(currencyDTO);
            fixerIoRepository.save(currency);
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
