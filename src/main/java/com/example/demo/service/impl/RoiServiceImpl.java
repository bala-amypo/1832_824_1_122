package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.RoiReport;
import com.example.demo.repository.RoiReportRepository;
import com.example.demo.service.RoiService;
import java.util.List;

public class RoiServiceImpl implements RoiService {

    private final RoiReportRepository roiReportRepository;

    public RoiServiceImpl(RoiReportRepository roiReportRepository) {
        this.roiReportRepository = roiReportRepository;
    }

    @Override
    public RoiReport generateReportForCode(Long discountCodeId) {
        RoiReport report = new RoiReport();
        report.setRoiPercentage(10.0);
        return roiReportRepository.save(report);
    }

    @Override
    public RoiReport getReportById(Long id) {
        return roiReportRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ROI report not found"));
    }

    @Override
    public List<RoiReport> getReportsForInfluencer(Long influencerId) {
        return roiReportRepository.findByDiscountCodeInfluencerId(influencerId);
    }
}
