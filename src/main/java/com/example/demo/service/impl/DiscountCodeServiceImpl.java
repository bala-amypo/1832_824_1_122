package com.example.demo.service;

import com.example.demo.entity.DiscountCode;
import java.util.List;

public interface DiscountCodeService {

    DiscountCode create(DiscountCode code);
    DiscountCode getById(Long id);
    List<DiscountCode> getAll();
}
