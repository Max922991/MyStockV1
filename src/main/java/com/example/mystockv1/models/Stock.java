package com.example.mystockv1.models;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * Склад (Наименование). На складе может храниться несколько товаров.
 */
@Data
@NoArgsConstructor
@Table(name = "stocks")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name")
    String name;
}
