package com.example.foreignexchange;


import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface CurrencyRepository extends ListCrudRepository<Currency, String> {

    Currency findCurrencyByCode(String code);
}
