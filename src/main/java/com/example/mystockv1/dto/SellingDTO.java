package com.example.mystockv1.dto;

import lombok.Data;

import java.util.List;

@Data
public class SellingDTO {
    private Long stockId;
    private List<Long> productsId;
}
