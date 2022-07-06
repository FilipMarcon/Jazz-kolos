package pl.jazs22626nbp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    final private CurrencyService currencyService;

    public RestController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping("/{currency}")
    public ResponseEntity<CurrencyResponse> getCurrency(@PathVariable String currency, @RequestParam(value = "last", defaultValue = "1") int last) {
        return ResponseEntity.ok(currencyService.getCurrency(currency, last));
    }

}

