package ru.dankos.moneyloverwalletservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    Long id;
    String name;
    CategoryType categoryType;
    CategoryDto parent;
    List<CategoryDto> categories;
}
