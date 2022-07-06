package pl.jazs22626nbp;

import pl.jazs22626nbp.Currency;

import java.util.List;

public class NBPResponse {
    private List<Currency> rates;

    public NBPResponse() {}

    public NBPResponse(List<Currency> rates) {
        this.rates = rates;
    }

    public List<Currency> getRates() {
        return rates;
    }

    public void setRates(List<Currency> rates) {
        this.rates = rates;
    }
}
