package com.example.demo.service.impl;

import com.example.demo.model.Campaign;
import com.example.demo.model.RoiReport;
import com.example.demo.repository.CampaignRepository;
import com.example.demo.repository.RoiRepository;
import com.example.demo.service.RoiService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RoiServiceImpl implements RoiService {

    private final CampaignRepository campaignRepository;
    private final RoiRepository roiRepository;

    public RoiServiceImpl(CampaignRepository campaignRepository,
                          RoiRepository roiRepository) {
        this.campaignRepository = campaignRepository;
        this.roiRepository = roiRepository;
    }

    @Override
    public RoiReport generateRoiForCampaign(Long campaignId) {

        Campaign campaign = campaignRepository.findById(campaignId)
                .orElseThrow(() -> new RuntimeException("Campaign not found"));

        double roiValue = campaign.getRevenue() - campaign.getBudget();

        RoiReport roi = new RoiReport();
        roi.setCampaign(campaign);
        roi.setRoiValue(roiValue);
        roi.setGeneratedDate(LocalDate.now());

        return roiRepository.save(roi);
    }

    @Override
    public List<RoiReport> getAllRoiReports() {
        return roiRepository.findAll();
    }
}
