package com.example.demo.service.impl;

import com.example.demo.entity.DiscountCode;
import com.example.demo.entity.RoiReport;
import com.example.demo.repository.DiscountCodeRepository;
import org.springframework.stereotype.Service;

@Service
public class RoiServiceImpl {

    private final DiscountCodeRepository repository;

    public RoiServiceImpl(DiscountCodeRepository repository) {
        this.repository = repository;
    }

    public RoiReport calculate(Long id) {
        DiscountCode code = repository.findById(id).orElseThrow();

        double roi = code.getTotalSales() - code.getCampaign();

        RoiReport report = new RoiReport();
        report.setDiscountCode(code);
        report.setRoi(roi);

        return report;
    }
}
