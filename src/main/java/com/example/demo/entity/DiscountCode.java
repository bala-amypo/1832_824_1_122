package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "discount_codes", uniqueConstraints = {
        @UniqueConstraint(columnNames = "code")
})
public class DiscountCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @ManyToOne
    @JoinColumn(name = "influencer_id")
    private Influencer influencer;

    @ManyToOne
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    private Double discountPercentage;

    private Boolean active = true;

    public DiscountCode() {
    }

    public DiscountCode(String code, Influencer influencer, Campaign campaign, Double discountPercentage) {
        this.code = code;
        this.influencer = influencer;
        this.campaign = campaign;
        this.discountPercentage = discountPercentage;
        this.active = true;
    }

    // getters & setters
    public Long getId() { return id; }
    public String getCode() { return code; }
    public Influencer getInfluencer() { return influencer; }
    public Campaign getCampaign() { return campaign; }
    public Double getDiscountPercentage() { return discountPercentage; }
    public Boolean getActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setCode(String code) { this.code = code; }
    public void setInfluencer(Influencer influencer) { this.influencer = influencer; }
    public void setCampaign(Campaign campaign) { this.campaign = campaign; }
    public void setDiscountPercentage(Double discountPercentage) { this.discountPercentage = discountPercentage; }
    public void setActive(Boolean active) { this.active = active; }
}
