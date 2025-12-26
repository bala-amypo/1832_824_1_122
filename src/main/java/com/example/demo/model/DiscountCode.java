package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double totalSales;      // ✅ REQUIRED
    private Double campaign;        // campaign cost
    private Long influencerId;      // ✅ REQUIRED for repository query

    // ===== GETTERS & SETTERS =====

    public Long getId() {
        return id;
    }

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

    public Long getInfluencerId() {
        return influencerId;
    }

    public void setInfluencerId(Long influencerId) {
        this.influencerId = influencerId;
    }
}
