package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "sale_transactions")
public class SaleTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private DiscountCode discountCode;

    private BigDecimal transactionAmount;
    private Timestamp transactionDate;
    private Long customerId;

    public SaleTransaction() {
    }

    public SaleTransaction(DiscountCode discountCode, BigDecimal transactionAmount,
                           Timestamp transactionDate, Long customerId) {
        this.discountCode = discountCode;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public DiscountCode getDiscountCode() {
        return discountCode;
    }

    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    public Timestamp getTransactionDate() {
        return transactionDate;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }

    public void setTransactionAmount(BigDecimal transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public void setTransactionDate(Timestamp transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
