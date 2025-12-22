package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sale_transactions")
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "discount_code_id")
    private DiscountCode discountCode;

    private BigDecimal saleAmount;

    private Timestamp transactionDate;

    public SaleTransaction() {
    }

    public SaleTransaction(DiscountCode discountCode, BigDecimal saleAmount) {
        this.discountCode = discountCode;
        this.saleAmount = saleAmount;
    }

    @PrePersist
    protected void onCreate() {
        this.transactionDate = new Timestamp(System.currentTimeMillis());
    }

    // getters & setters
    public Long getId() { return id; }
    public DiscountCode getDiscountCode() { return discountCode; }
    public BigDecimal getSaleAmount() { return saleAmount; }
    public Timestamp getTransactionDate() { return transactionDate; }

    public void setId(Long id) { this.id = id; }
    public void setDiscountCode(DiscountCode discountCode) { this.discountCode = discountCode; }
    public void setSaleAmount(BigDecimal saleAmount) { this.saleAmount = saleAmount; }
}
