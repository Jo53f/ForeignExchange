package com.example.foreignexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ForeignExchangeApplication {

    private static final Logger log = LoggerFactory.getLogger(ForeignExchangeApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ForeignExchangeApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CurrencyRepository currencyRepository) {
        return args -> {
            //Currency currency = new Currency(50,"£", "British Pound", "£", 2, 2, "GBP", "pounds", "fiat", 0);
            //currencyRepository.save(currency);
            //log.info("{}", currency);
        };
    }

}
