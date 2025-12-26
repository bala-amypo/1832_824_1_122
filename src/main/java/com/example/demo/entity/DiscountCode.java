package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalSales;
    private Double campaign;

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }

    public Double getCampaign() {
        return campaign;
    }

    public void setCampaign(Double campaign) {
        this.campaign = campaign;
    }
}
