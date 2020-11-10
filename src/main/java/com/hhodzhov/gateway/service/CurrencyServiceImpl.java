package com.hhodzhov.gateway.service;

import static com.hhodzhov.gateway.constants.General.DATE_TIME_PATTERN;
import com.hhodzhov.gateway.client.FixerIOClient;
import com.hhodzhov.gateway.dto.CurrencyDTO;
import com.hhodzhov.gateway.enumeration.BaseRate;
import com.hhodzhov.gateway.model.Currency;
import com.hhodzhov.gateway.repository.CurrencyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
@Setter
public class CurrencyServiceImpl implements CurrencyService {

    private ModelMapper modelMapper;
    private CurrencyRepository currencyRepository;
    private FixerIOClient fixerIOClient;

    public CurrencyServiceImpl(final ModelMapper modelMapper, final CurrencyRepository currencyRepository,
                               final FixerIOClient fixerIOClient) {
        this.modelMapper = modelMapper;
        this.currencyRepository = currencyRepository;
        this.fixerIOClient = fixerIOClient;
    }

    @Override
    public void refreshDataFromFixerIo() {
        CurrencyDTO currencyDTO = fixerIOClient.getCurrency();

        if (currencyDTO != null) {
            Currency currency = createCurrency(currencyDTO);
            currencyRepository.save(currency);
        }
    }

    @Override
    public Optional<Currency> getLatestInfo(BaseRate baseRate) {
        return currencyRepository.getLatestInfoByBaseRate(baseRate.toString());
    }

    @Override
    public List<Currency> getHistoryByHours(BaseRate baseRate, int hours) {
        return currencyRepository.getCurrencyHistoryByHours(baseRate.toString(), hours);
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
