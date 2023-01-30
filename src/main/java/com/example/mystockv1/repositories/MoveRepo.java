package com.example.mystockv1.repositories;

import com.example.mystockv1.models.Move;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoveRepo extends JpaRepository<Move, Long> {
}
