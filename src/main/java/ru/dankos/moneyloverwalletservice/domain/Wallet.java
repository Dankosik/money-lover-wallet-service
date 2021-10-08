package ru.dankos.moneyloverwalletservice.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Currency;

@Entity
@Table(name = "wallets")
@Data
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "balance")
    Long balance;
    @Column(name = "currency")
    Currency currency;
}
