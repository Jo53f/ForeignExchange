package com.example.foreignexchange;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

public record Currency(
        @Id
        int Id,
        String symbol,
        String name,
        String symbol_native,
        int decimal_digits,
        int rounding,
        String code,
        String name_plural,
        String type
) {
}
