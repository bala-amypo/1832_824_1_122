package com.example.demo.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.DiscountCode;

public interface DiscountCodeRepository extends JpaRepository<DiscountCode,Long>{
    
}