package com.example.mystockv1.repositories;

import com.example.mystockv1.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long> {
}
