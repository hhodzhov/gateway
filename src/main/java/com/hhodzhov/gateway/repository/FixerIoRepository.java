package com.hhodzhov.gateway.repository;

import com.hhodzhov.gateway.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface FixerIoRepository extends JpaRepository<Currency, Long> {

    @Query(value = "select * from currency curr "
            + "join rate r on curr.rate_id = r.id "
            + "where curr.base_rate = ?1 "
            + "order by r.date_received desc "
            + "limit 1", nativeQuery = true)
    Optional<Currency> getLatestInfoByBaseRate(String baseRate);

}
