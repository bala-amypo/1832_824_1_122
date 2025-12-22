package com.example.demo.repository;

import com.example.demo.entity.DiscountCode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountCodeRepository extends JpaRepository<DiscountCode, Long> {

    DiscountCode findByCode(String code);
}
