package ru.dankos.moneyloverwalletservice.rabbitlistener;

import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import ru.dankos.moneyloverwalletservice.domain.Wallet;
import ru.dankos.moneyloverwalletservice.dto.CategoryType;
import ru.dankos.moneyloverwalletservice.dto.OperationDto;
import ru.dankos.moneyloverwalletservice.repository.WalletRepository;


@AllArgsConstructor
@Component
public class OperationListener {
    private final WalletRepository walletRepository;

    @RabbitListener(queues = "operation-created-queue")
    public void saveWallet(OperationDto operation) {
        Wallet wallet = walletRepository.findById(operation.getWalletId()).get();
        wallet.setBalance(calculateNewWalletSum(operation, wallet));
        walletRepository.save(wallet);
    }

    private long calculateNewWalletSum(OperationDto operation, Wallet wallet) {
        long newWalletSum;
        if (operation.getCategory().getCategoryType().equals(CategoryType.EXPENSE)) {
            newWalletSum = wallet.getBalance() - operation.getOperationSum();
        } else {
            newWalletSum = wallet.getBalance() + operation.getOperationSum();
        }
        return newWalletSum;
    }

}
