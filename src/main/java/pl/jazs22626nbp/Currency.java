package pl.jazs22626nbp;

public class Currency {
    private String effectiveDate;
    private Double mid;

    public Currency() {}

    public Currency(String effectiveDate, Double mid) {
        this.effectiveDate = effectiveDate;
        this.mid = mid;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Double getMid() {
        return mid;
    }

    public void setMid(Double mid) {
        this.mid = mid;
    }
}
