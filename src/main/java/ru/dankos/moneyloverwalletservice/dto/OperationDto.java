package ru.dankos.moneyloverwalletservice.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OperationDto {
    Long id;
    Date date;
    Long walletId;
    Long categoryId;
    Long operationSum;
    String note;
}
