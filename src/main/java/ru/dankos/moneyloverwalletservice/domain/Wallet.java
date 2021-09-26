package ru.dankos.moneyloverwalletservice.domain;

import lombok.Data;

import java.util.Currency;

@Data
public class Wallet {
    Long id;
    String name;
    Long balance;
    Currency currency;
}
