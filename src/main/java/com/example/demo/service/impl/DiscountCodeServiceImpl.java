package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.DiscountCode;
import com.example.demo.repository.DiscountCodeRepository;
import com.example.demo.service.DiscountCodeService;
import java.util.List;

public class DiscountCodeServiceImpl implements DiscountCodeService {

    private final DiscountCodeRepository discountCodeRepository;

    public DiscountCodeServiceImpl(DiscountCodeRepository discountCodeRepository) {
        this.discountCodeRepository = discountCodeRepository;
    }

    @Override
    public DiscountCode getDiscountCodeById(Long id) {
        return discountCodeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
    }

    @Override
    public DiscountCode updateDiscountCode(Long id, DiscountCode updated) {
        DiscountCode existing = discountCodeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));

        if (updated.getDiscountPercentage() != null &&
                (updated.getDiscountPercentage() < 0 || updated.getDiscountPercentage() > 100)) {
            throw new IllegalArgumentException("percentage out of range");
        }

        existing.setCodeValue(updated.getCodeValue());
        existing.setDiscountPercentage(updated.getDiscountPercentage());
        return discountCodeRepository.save(existing);
    }

    @Override
    public List<DiscountCode> getCodesForInfluencer(Long influencerId) {
        return discountCodeRepository.findByInfluencerId(influencerId);
    }

    @Override
    public List<DiscountCode> getCodesForCampaign(Long campaignId) {
        return discountCodeRepository.findByCampaignId(campaignId);
    }
}
