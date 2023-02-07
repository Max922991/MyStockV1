package com.example.mystockv1.controllers;

import com.example.mystockv1.dto.SellingDTO;
import com.example.mystockv1.payload.MessageResponse;
import com.example.mystockv1.services.SellingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/selling")
@RequiredArgsConstructor
public class SellingController {

    private final SellingService sellingService;

    @PostMapping("/create")
    public ResponseEntity<MessageResponse> addSelling(@RequestBody SellingDTO sellingDTO) {
        return new ResponseEntity<>(sellingService.sellingProduct(sellingDTO), HttpStatus.CREATED);
    }
}
