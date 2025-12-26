package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.DiscountCode;
import com.example.demo.repository.DiscountCodeRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DiscountCodeService {

    private final DiscountCodeRepository discountCodeRepository;

    public DiscountCodeService(DiscountCodeRepository discountCodeRepository) {
        this.discountCodeRepository = discountCodeRepository;
    }

    public DiscountCode createDiscountCode(DiscountCode discountCode) {
        return discountCodeRepository.save(discountCode);
    }

    public DiscountCode updateDiscountCode(Long id, DiscountCode updated) {
        DiscountCode existing = getDiscountCodeById(id);

        existing.setCode(updated.getCode());
        existing.setDiscountPercentage(updated.getDiscountPercentage());
        existing.setCampaign(updated.getCampaign());
        existing.setInfluencer(updated.getInfluencer());

        return discountCodeRepository.save(existing);
    }

    public DiscountCode getDiscountCodeById(Long id) {
        return discountCodeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Discount code not found"));
    }

    public List<DiscountCode> getCodesForInfluencer(Long influencerId) {
        return discountCodeRepository.findByInfluencerId(influencerId);
    }

    public List<DiscountCode> getCodesForCampaign(Long campaignId) {
        return discountCodeRepository.findByCampaignId(campaignId);
    }

    public List<DiscountCode> getAllDiscountCodes() {
        return discountCodeRepository.findAll();
    }

    public void deleteDiscountCode(Long id) {
        DiscountCode discountCode = getDiscountCodeById(id);
        discountCodeRepository.delete(discountCode);
    }
}
