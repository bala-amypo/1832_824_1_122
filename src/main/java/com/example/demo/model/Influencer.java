package com.example.demo.dto;
import jakarta.presistence.Entity;
import jakarta.presistence.Id;
@Entity
public class Influencer{
    @Id
    private Long id;
    private String name;
    private String socialHandle;
    private String email;
    private Boolean active;
    private Timestamp createdAt;

    public Long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getSocialHandle(){
        return socialHandle;
    }

    public void setSocialHandle(String socialHandle){
        this.socialHandle=socialHandle;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public Boolean getActive(){
        return active;
    }

    public void setActive(Boolean active){
        this.active=active;
    }
    public Timestamp getCreatedAt(){
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt){
        this.createdAt=createdAt;
    }

    public Influencer(Long id,String name,String socialHandle,String email,Boolean active,Timestamp createdAt )
    this.id=id;
    this.name=name;
    this.socialHandle=socialHandle;
    this.email=email;
    this.active=active;
    this.createdAt=createdAt;
}

public Influencer(){
    
}