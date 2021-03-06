package com.hhodzhov.gateway.repository;

import com.hhodzhov.gateway.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

    @Query(value = "select * from currency curr "
            + "        join rate r on curr.rate_id = r.id "
            + "        where curr.base_rate = ?1 "
            + "        order by r.date_received desc "
            + "        limit 1", nativeQuery = true)
    Optional<Currency> getLatestInfoByBaseRate(String baseRate);

    @Query(value = "select * from currency curr "
            + "        join rate r on curr.rate_id = r.id "
            + "        where curr.base_rate = ?1 "
            + "        and r.date_received >= date_sub(now(), interval ?2 hour)", nativeQuery = true)
    List<Currency> getCurrencyHistoryByHours(String baseRate, int hours);



}
