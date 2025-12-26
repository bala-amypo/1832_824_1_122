package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    @ManyToOne
    private DiscountCode discountCode;
}
