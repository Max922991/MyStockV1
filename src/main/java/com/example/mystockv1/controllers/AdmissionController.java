package com.example.mystockv1.controllers;

import com.example.mystockv1.dto.AdmissionDTO;
import com.example.mystockv1.payload.MessageResponse;
import com.example.mystockv1.services.AdmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admission")
@RequiredArgsConstructor
public class AdmissionController {
    private final AdmissionService admissionService;

    @PostMapping("/create")
    public ResponseEntity<MessageResponse> createDocument(@RequestBody AdmissionDTO admissionDTO) {
        return new ResponseEntity<>(admissionService.formationOfAdmission(admissionDTO), HttpStatus.CREATED);
    }
}
