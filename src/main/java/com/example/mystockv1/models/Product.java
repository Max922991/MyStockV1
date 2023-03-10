package com.example.mystockv1.models;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * Товар (Артикул, Наименование, Цена последней закупки, Цена последней продажи).
 */
@Data
@NoArgsConstructor
@Table(name = "products")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name")
    String name;

    @Column(name = "last_purchase_price")
    Integer lastPurchasePrice;

    @Column(name = "last_sale_price")
    Integer lastSalePrice;


    
}
