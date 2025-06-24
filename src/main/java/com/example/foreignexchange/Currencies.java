package com.example.foreignexchange;

import java.util.Map;

public record Currencies(
        Map<String, Currency> data
) {
}
