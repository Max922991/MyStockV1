package com.example.mystockv1.models;

import javax.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

/**
 * Продажа (Номер, Склад, Список товаров). Заводится при продаже товара.
 * Содержит список товаров, их количество и цены продажи.
 * В документе указывается склад, с которого списывают товары.
 */
@Data
@NoArgsConstructor
@Table(name = "sellings")
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Selling {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "quantity")
    int quantity;
    @Column(name = "sale_price")
    Integer salePrice;
    @ManyToOne       //??????????
    Stock stock;
    @ManyToMany    // ??????????
    List<Product> products = new ArrayList<>();
}
