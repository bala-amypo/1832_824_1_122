package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "influencers")
public class Influencer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String socialHandle;
    private boolean active = true;

    public Influencer() {
    }

    public Influencer(String name, String socialHandle, boolean active) {
        this.name = name;
        this.socialHandle = socialHandle;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSocialHandle() {
        return socialHandle;
    }

    public boolean isActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSocialHandle(String socialHandle) {
        this.socialHandle = socialHandle;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
