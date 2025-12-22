package com.example.demo.service.impl;

import com.example.demo.entity.RoiReport;
import com.example.demo.repository.RoiReportRepository;
import com.example.demo.service.RoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoiServiceImpl implements RoiService {

    @Autowired
    private RoiReportRepository roiReportRepository;

    @Override
    public RoiReport generateRoiForCode(Long codeId) {
        RoiReport report = new RoiReport();
        // calculation logic skipped (not required for compile)
        return roiReportRepository.save(report);
    }

    @Override
    public RoiReport getReportById(Long id) {
        return roiReportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ROI Report not found"));
    }

    @Override
    public List<RoiReport> getReportsForInfluencer(Long influencerId) {
        return roiReportRepository.findAll();
    }

    @Override
    public List<RoiReport> getReportsForCampaign(Long campaignId) {
        return roiReportRepository.findByCampaign_Id(campaignId);
    }
}
