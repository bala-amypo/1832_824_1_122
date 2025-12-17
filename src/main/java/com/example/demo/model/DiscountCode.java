package com.example.demo.dto;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
@Entity
public class DiscountCode {
    @Id
    private Long id;
    private String code;
    private String influencer;
    private String campaign;
    private Double discountPercentage;
    private Boolean active;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfluencer() {
        return influencer;
    }

    public void setInfluencer(String influencer) {
        this.influencer = influencer;
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
public DiscountCode(Long id,String code,String Influencer,String campaign,Double discountPercentage,Boolean active)
this.id=id;
this.code-code;
this.Influencer=Influencer;
this.campaign=campaign;
this.discountPercentage=discountPercentage;
this.active=active;


}
