package com.example.foreignexchange;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aot.hint.TypeReference;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

@Component
public class JsonDataLoader implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(JsonDataLoader.class);
    private final CurrencyRepository currencyRepository;
    private final ObjectMapper objectMapper;

    String URI = "/data/currencies.json";

    public JsonDataLoader(CurrencyRepository currencyRepository, ObjectMapper objectMapper) {
        this.currencyRepository = currencyRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public void run(String... args) throws Exception {

        if (currencyRepository.count() == 0) {
            try (InputStream inputStream = TypeReference.class.getResourceAsStream(URI)) {
                Currencies currencies = objectMapper.readValue(inputStream, Currencies.class);
                log.info("Json being added, {} record found", currencies.data().size());
                currencyRepository.saveAll(currencies.data().values());
                log.info("Json data added");
            } catch (IOException e) {
                throw new RuntimeException("Failed to load, check IO", e);
            }
        } else {
            log.info("Not adding Json data, Database already populated.");
        }
    }
}
