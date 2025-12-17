package com.example.demo.dto;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
@Entity
public class Campaign{
    @Id
    private Long id;
    private String campaignName;
    private Date startDate;
    private Date endDate;
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

    public Date getEndDate(){
        return EndDate;
    }

    public void setEnDate(Date endDate){
        this.endDate=endDate;
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

    public void setActive(Boolean active){
        this.active=active;
    }
    public Campaign(Long id,String .campaignName,Date startDate,Date endDate,BigDecimal budget,Boolean active)
    this.id=id;
    this.campaignName=campaignName;
    this.startDate=startDate;
    this.endDate=endDate;
    this.budget=budget;
    this.active=active;

    public Campaign(){

    }
}