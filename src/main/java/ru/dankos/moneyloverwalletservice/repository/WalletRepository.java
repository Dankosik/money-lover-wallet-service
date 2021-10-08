package ru.dankos.moneyloverwalletservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.dankos.moneyloverwalletservice.domain.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
