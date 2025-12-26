package com.example.demo.service.impl;

import com.example.demo.service.RoiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoiServiceImpl implements RoiService {

    @Override
    public Double calculateRoi(Long discountCodeId) {
        // dummy logic (replace later)
        return 30.0;
    }

    @Override
    public List<Double> getAllRoiReports() {
        // dummy data
        return List.of(10.0, 20.0, 30.0);
    }
}
