package com.example.demo.entity;

import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "influencers", uniqueConstraints = {
        @UniqueConstraint(columnNames = "socialHandle")
})
public class Influencer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(nullable = false, unique = true)
    private String socialHandle;

    private String email;

    private Boolean active = true;

    private Timestamp createdAt;

    public Influencer() {
    }

    public Influencer(String name, String socialHandle, String email) {
        this.name = name;
        this.socialHandle = socialHandle;
        this.email = email;
        this.active = true;
    }

    @PrePersist
    protected void onCreate() {
        this.createdAt = new Timestamp(System.currentTimeMillis());
    }

    // getters & setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getSocialHandle() { return socialHandle; }
    public String getEmail() { return email; }
    public Boolean getActive() { return active; }
    public Timestamp getCreatedAt() { return createdAt; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setSocialHandle(String socialHandle) { this.socialHandle = socialHandle; }
    public void setEmail(String email) { this.email = email; }
    public void setActive(Boolean active) { this.active = active; }
}
