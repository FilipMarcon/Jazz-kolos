package pl.jazs22626nbp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class CurrencyResponse {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CurrencyResponse() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal avg;
    private String currency;
    private LocalDate fromDate;
    private LocalDate toDate;
    private LocalDateTime createdAt = LocalDateTime.now();


    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CurrencyResponse(Long id, BigDecimal avg, String currency, LocalDate fromDate, LocalDate toDate) {
        this.id = id;
        this.avg = avg;
        this.currency = currency;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public CurrencyResponse(BigDecimal avg, String currency, LocalDate fromDate, LocalDate toDate) {
        this.avg = avg;
        this.currency = currency;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public BigDecimal getAvg() {
        return avg;
    }

    public void setAvg(BigDecimal avg) {
        this.avg = avg;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate from) {
        this.fromDate = from;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate to) {
        this.toDate = to;
    }
}

