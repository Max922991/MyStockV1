package com.example.mystockv1.services;

import com.example.mystockv1.repositories.SellingRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellingService {
    private final SellingRepo sellingRepo;
}
