package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Campaign;
import com.example.demo.repository.CampaignRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CampaignService {

    private final CampaignRepository campaignRepository;

    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    public Campaign createCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    public Campaign getCampaignById(Long id) {
        return campaignRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Campaign not found"));
    }

    public Campaign updateCampaign(Long id, Campaign updatedCampaign) {
        Campaign existing = getCampaignById(id);

        existing.setCampaignName(updatedCampaign.getCampaignName());
        existing.setStartDate(updatedCampaign.getStartDate());
        existing.setEndDate(updatedCampaign.getEndDate());

        // ❌ REMOVE budget if your entity does not have it
        // existing.setBudget(updatedCampaign.getBudget());

        return campaignRepository.save(existing);
    }

    public void deleteCampaign(Long id) {
        Campaign campaign = getCampaignById(id);
        campaignRepository.delete(campaign);
    }
}
