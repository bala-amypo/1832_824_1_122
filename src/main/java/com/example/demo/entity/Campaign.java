package com.example.demo.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "campaigns", uniqueConstraints = {
        @UniqueConstraint(columnNames = "campaignName")
})
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String campaignName;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;

    private BigDecimal budget;

    private Boolean active = true;

    public Campaign() {
    }

    public Campaign(String campaignName, Date startDate, Date endDate, BigDecimal budget) {
        this.campaignName = campaignName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.budget = budget;
        this.active = true;
    }

    // getters & setters
    public Long getId() { return id; }
    public String getCampaignName() { return campaignName; }
    public Date getStartDate() { return startDate; }
    public Date getEndDate() { return endDate; }
    public BigDecimal getBudget() { return budget; }
    public Boolean getActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setCampaignName(String campaignName) { this.campaignName = campaignName; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }
    public void setBudget(BigDecimal budget) { this.budget = budget; }
    public void setActive(Boolean active) { this.active = active; }
}
