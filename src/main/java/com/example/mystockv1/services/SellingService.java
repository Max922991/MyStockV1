package com.example.mystockv1.services;

import com.example.mystockv1.dto.SellingDTO;
import com.example.mystockv1.exceptions.ProductNotFoundException;
import com.example.mystockv1.exceptions.StockNotFoundException;
import com.example.mystockv1.models.Product;
import com.example.mystockv1.models.Selling;
import com.example.mystockv1.models.Stock;
import com.example.mystockv1.payload.MessageResponse;
import com.example.mystockv1.repositories.ProductRepo;
import com.example.mystockv1.repositories.SellingRepo;
import com.example.mystockv1.repositories.StockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SellingService {
    private final SellingRepo sellingRepo;
    private final ProductRepo productRepo;
    private final StockRepo stockRepo;

    public MessageResponse sellingProduct(SellingDTO sellingDTO) {
        Selling selling = new Selling();

        long stockId = sellingDTO.getStockId();
        Stock stock = stockRepo.findById(sellingDTO.getStockId()).orElseThrow(() -> new StockNotFoundException("Stock with id = " + stockId + " isn't found"));
        for (Long productId : sellingDTO.getProductsId()) {
            Product product = productRepo.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product with id = " + productId + " isn't found"));
            selling.getProducts().add(product);
        }

        int quantity = selling.getProducts().size();

        selling.setStock(stock);
        selling.setQuantity(quantity);
        sellingRepo.save(selling);

        return new MessageResponse("Create new Admission document with Stock (" + stock.getName() + ") & Product list size (" + quantity + ")");
    }

}
