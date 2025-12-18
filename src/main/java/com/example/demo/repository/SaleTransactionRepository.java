package com.example.demo.repository;
 
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.SaleTransaction;

public interface SaleTransactionRepository extends JpaRepository<SaleTransaction,Long>{
    
}