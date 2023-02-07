package com.example.mystockv1.services;

import com.example.mystockv1.dto.AdmissionDTO;
import com.example.mystockv1.exceptions.ProductNotFoundException;
import com.example.mystockv1.exceptions.StockNotFoundException;
import com.example.mystockv1.models.Admission;
import com.example.mystockv1.models.Product;
import com.example.mystockv1.models.Stock;
import com.example.mystockv1.payload.MessageResponse;
import com.example.mystockv1.repositories.AdmissionRepo;
import com.example.mystockv1.repositories.ProductRepo;
import com.example.mystockv1.repositories.StockRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdmissionService {
    private final AdmissionRepo admissionRepo;
    private final StockRepo stockRepo;
    private final ProductRepo productRepo;


    public MessageResponse formationOfAdmission(AdmissionDTO admissionDTO) {
        Admission admission = new Admission();

        long stockId = admissionDTO.getStockId();
        Stock stock = stockRepo.findById(stockId)
                .orElseThrow(() -> new StockNotFoundException("Stock with id = " + stockId + " isn't found"));

        for (Long productId : admissionDTO.getProductsId()) {
            Product product = productRepo.findById(productId)
                    .orElseThrow(() -> new ProductNotFoundException("Product with id = " + productId + " isn't found"));
            admission.getProducts().add(product);
        }

        int quantity = admission.getProducts().size();

        admission.setStock(stock);
        admission.setQuantity(quantity);
        admissionRepo.save(admission);
        return new MessageResponse("Create new Admission document with Stock (" + stock.getName() + ") & Product list size (" + quantity + ")");
    }
}
