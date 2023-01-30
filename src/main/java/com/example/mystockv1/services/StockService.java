package com.example.mystockv1.services;

import com.example.mystockv1.models.Stock;
import com.example.mystockv1.repositories.StockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockService {
    private final StockRepo stockRepo;

    public void addStock(Stock stock) {
        stockRepo.save(stock);
    }
    public void deleteStockById(Long id) {
        stockRepo.deleteById(id);
    }


}
