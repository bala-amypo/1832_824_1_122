package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class RoiReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DiscountCode discountCode;

    private double roiValue;

    private LocalDate generatedDate;

    // getters & setters

    public Long getId() {
        return id;
    }

    public DiscountCode getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }

    public double getRoiValue() {
        return roiValue;
    }

    public void setRoiValue(double roiValue) {
        this.roiValue = roiValue;
    }

    public LocalDate getGeneratedDate() {
        return generatedDate;
    }

    public void setGeneratedDate(LocalDate generatedDate) {
        this.generatedDate = generatedDate;
    }
}
