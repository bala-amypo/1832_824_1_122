package com.example.demo.ent;

import jakarta.persistence.*;

@Entity
public class RoiReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DiscountCode discountCode;

    private Double roi;

    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }

    public void setRoi(Double roi) {
        this.roi = roi;
    }
}
