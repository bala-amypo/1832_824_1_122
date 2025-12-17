package com.example.demo.dto;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
import java.math.BigDecimal;
import java.time.Instant;
@Entity
public class SaleTransaction {
    @Id
    private Long id;
    private DiscountCode discountCode;
    private BigDecimal saleAmount;
    private Instant transactionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DiscountCode getDiscountCode() {
        return discountCode;
    }

    public void setDiscountCode(DiscountCode discountCode) {
        this.discountCode = discountCode;
    }

    public BigDecimal getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(BigDecimal saleAmount) {
        this.saleAmount = saleAmount;
    }

    public Instant getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Instant transactionDate) {
        this.transactionDate = transactionDate;
    }
    
}
