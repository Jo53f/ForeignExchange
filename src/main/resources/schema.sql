DROP TABLE IF EXISTS Currency;
DROP SEQUENCE IF EXISTS currency_id_seq;

CREATE SEQUENCE currency_id_seq;
CREATE TABLE IF NOT EXISTS Currency (
    id INT PRIMARY KEY DEFAULT nextval('currency_id_seq'),
    symbol VARCHAR(250),
    "name" VARCHAR(250),
    symbol_native VARCHAR(250),
    decimal_digits INT,
    rounding INT,
    code VARCHAR(250),
    name_plural VARCHAR(250),
    "type" VARCHAR(250)
);