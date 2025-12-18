package com.example.demo.dto;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
import java.math.BigDecimal;
import java.time.Instant;
@Entity
public class RoiReport {
    @Id
    private Long id;
    private String campaign;
    private String influencer;
    private BigDecimal totalSales;
    private BigDecimal totalRevenue;
    private BigDecimal roiPercentage;
    private Instant generatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public String getInfluencer() {
        return influencer;
    }

    public void setInfluencer(String influencer) {
        this.influencer = influencer;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    public BigDecimal getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(BigDecimal totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public BigDecimal getRoiPercentage() {
        return roiPercentage;
    }

    public void setRoiPercentage(BigDecimal roiPercentage) {
        this.roiPercentage = roiPercentage;
    }

    public Instant getGeneratedAt() {
        return generatedAt;
    }

    public void setGeneratedAt(Instant generatedAt) {
        this.generatedAt = generatedAt;
    }
    public RoiReport(Long id,String campaign,String influencer,BigDecimal totalSales,BigDecimal totalRevenue,BigDecimal roiPercentage,Timestamp generatedAt)
    this.id=id;
    this.campaign=campaign;
    this.influencer=influencer;
    this.totalSales=totalSales;
    this.totalRevenue=totalRevenue;
    this.roiPercentage=roiPercentage;
    this.generatedAt=generatedAt;
}
public RoiReport(){

}
