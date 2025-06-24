package com.example.foreignexchange;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/currency")
public class CurrencyController {
    private final CurrencyRepository currencyRepository;

    public CurrencyController(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @GetMapping
    List<Currency> test() {
        return currencyRepository.findAll();
    }

    @GetMapping("{code}")
    Currency findByCode(@PathVariable String code) {
        return currencyRepository.findCurrencyByCode(code);
    }
}
