// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Temporal;
// import jakarta.persistence.TemporalType;
// import java.math.BigDecimal;
// import java.util.Date;

// @Entity
// public class Campaign {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String campaignName;

//     @Temporal(TemporalType.DATE)
//     private Date startDate;

//     @Temporal(TemporalType.DATE)
//     private Date endDate;

//     private BigDecimal budget;

//     private Boolean active;

//     public Campaign() {
//     }

//     public Campaign(Long id,
//                     String campaignName,
//                     Date startDate,
//                     Date endDate,
//                     BigDecimal budget,
//                     Boolean active) {
//         this.id = id;
//         this.campaignName = campaignName;
//         this.startDate = startDate;
//         this.endDate = endDate;
//         this.budget = budget;
//         this.active = active;
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public String getCampaignName() {
//         return campaignName;
//     }

//     public void setCampaignName(String campaignName) {
//         this.campaignName = campaignName;
//     }

//     public Date getStartDate() {
//         return startDate;
//     }

//     public void setStartDate(Date startDate) {
//         this.startDate = startDate;
//     }

//     public Date getEndDate() {
//         return endDate;
//     }

//     public void setEndDate(Date endDate) {
//         this.endDate = endDate;
//     }

//     public BigDecimal getBudget() {
//         return budget;
//     }

//     public void setBudget(BigDecimal budget) {
//         this.budget = budget;
//     }

//     public Boolean getActive() {
//         return active;
//     }

//     public void setActive(Boolean active) {
//         this.active = active;
//     }
// }
