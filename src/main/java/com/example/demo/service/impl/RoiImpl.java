package com.example.demo.service.impl;

import com.example.demo.model.RoiReport;
import com.example.demo.repository.RoiReportRepository;
import com.example.demo.service.RoiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoiImpl implements RoiService {

    private final RoiReportRepository roiReportRepository;

    public RoiImpl(RoiReportRepository roiReportRepository) {
        this.roiReportRepository = roiReportRepository;
    }

    @Override
    public RoiReport generateReport(Long codeId) {
        // TODO: implement calculation logic
        return new RoiReport();
    }

    @Override
    public RoiReport getReport(Long id) {
        return roiReportRepository.findById(id).orElse(null);
    }

    @Override
    public List<RoiReport> getByInfluencer(Long influencerId) {
        return roiReportRepository.findByInfluencerId(influencerId);
    }

    @Override
    public List<RoiReport> getByCampaign(Long campaignId) {
        return roiReportRepository.findByCampaignId(campaignId);
    }
}
