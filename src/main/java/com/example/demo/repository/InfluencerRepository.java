package com.example.demo.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Influencer;

public interface InfluencerRepository extends JpaRepository<Influencer,Long>{
    
}