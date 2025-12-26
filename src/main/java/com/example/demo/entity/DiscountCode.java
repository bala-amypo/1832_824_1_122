package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "discount_code")
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String code;
    private Double discountPercentage;
    private Double totalSales;
    private Double campaign;   // 🔥 REQUIRED for ROI

    // getters & setters
    public Double getCampaign() {
        return campaign;
    }

    public void setCampaign(Double campaign) {
        this.campaign = campaign;
    }
}
