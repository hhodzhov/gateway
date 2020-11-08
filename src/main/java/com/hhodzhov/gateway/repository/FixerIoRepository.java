package com.hhodzhov.gateway.repository;

import com.hhodzhov.gateway.model.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FixerIoRepository extends JpaRepository<Currency, Long> {
}
