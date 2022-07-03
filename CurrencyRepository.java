package com.jazs22626nbp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.jazs22626nbp.CurrencyResponse;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyResponse, Long> {

    @Modifying
    @Query(value = "INSERT into CurrencyResponse (id, `avg`, currency, fromDate, toDate, createdAt) values (:avg, :currency, :fromDate, :toDate, :createdAt)", nativeQuery = true)
    CurrencyResponse save(@Param("avg") BigDecimal avg, @Param("currency") String currency, @Param("fromDate") LocalDate from, @Param("toDate") LocalDate to, @Param("createdAt") Instant createdAt);
}

