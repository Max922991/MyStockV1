package com.example.mystockv1.dto;

import lombok.Data;

import java.util.List;

@Data
public class AdmissionDTO {
    private Long stockId;
    private List<Long> productsId;
}
