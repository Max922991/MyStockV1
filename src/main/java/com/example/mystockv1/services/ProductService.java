package com.example.mystockv1.services;

import com.example.mystockv1.models.Product;
import com.example.mystockv1.repositories.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    public Product getProductById(Long id) {
        return productRepo.findById(id).orElse(null);
    }
    public void deleteProductById(Long id) {
        productRepo.deleteById(id);
    }
    public void saveProduct(Product product) {
        productRepo.save(product);
    }
}
