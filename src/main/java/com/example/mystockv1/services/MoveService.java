package com.example.mystockv1.services;

import com.example.mystockv1.repositories.MoveRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MoveService {
    private final MoveRepo moveRepo;
}
