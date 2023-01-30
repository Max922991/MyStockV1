package com.example.mystockv1.services;

import com.example.mystockv1.repositories.AdmissionRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdmissionService {
    private final AdmissionRepo admissionRepo;

}
