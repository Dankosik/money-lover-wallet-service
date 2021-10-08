package ru.dankos.moneyloverwalletservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class OperationDto implements Serializable {
    Long id;
    String date;
    Long walletId;
    CategoryDto category;
    Long operationSum;
    String note;
}
