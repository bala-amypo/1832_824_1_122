package com.example.demo.service.impl;

import com.example.demo.entity.RoiReport;
import com.example.demo.repository.RoiRepository;
import com.example.demo.service.RoiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoiServiceImpl implements RoiService {

    @Autowired
    private RoiRepository roiRepository;

    @Override
    public RoiReport generateRoiForCode(Long codeId) {
        RoiReport report = new RoiReport();
        report.setCodeId(codeId);
        // revenue vs cost calculation assumed
        return roiRepository.save(report);
    }

    @Override
    public RoiReport getReportById(Long id) {
        return roiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Report not found"));
    }

    @Override
    public List<RoiReport> getReportsForInfluencer(Long influencerId) {
        return roiRepository.findByInfluencerId(influencerId);
    }

    @Override
    public List<RoiReport> getReportsForCampaign(Long campaignId) {
        return roiRepository.findByCampaignId(campaignId);
    }
}
