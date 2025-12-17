package com.example.demo.dto;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
@Entity
public class Campaign{
    @ID
    private Long id;
    private String campaignName;
    private Date startDate;
    private BigDecimal budget;
    private Boolean active;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getCampaignName(){
        return campaignName;
    }

    public void setcampaignName(String campaignName){
        this.campaignName=campaignName;
    }

    public Date getStartDate(){
        return startDate;
    }

    public void setStartDate(Date startDate){
        this.startDate=startDate;
    }

    public BigDecimal getBudget(){
        return getBudget;
    }

    public void setBudget(BigDecimal budget){
        this.budget=budget;
    }
    public Boolean getActive(){
        return active;
    }

    public void setActive(B)
}