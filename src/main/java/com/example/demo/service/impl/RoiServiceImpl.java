package com.example.demo.service.impl;

import com.example.demo.service.RoiService;
import org.springframework.stereotype.Service;

@Service   // 🔴 THIS ANNOTATION IS REQUIRED
public class RoiServiceImpl implements RoiService {

    @Override
    public Double calculateRoi(Long discountCodeId) {
        // Dummy logic (replace with real calculation later)
        return 25.0;
    }
}
