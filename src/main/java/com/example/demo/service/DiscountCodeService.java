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

    public List<DiscountCode> getAllDiscountCodes() {
        return discountCodeRepository.findAll();
    }

    public DiscountCode getDiscountCodeById(Long id) {
        return discountCodeRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Discount code not found"));
    }

    public List<DiscountCode> getDiscountCodesByCampaign(Long campaignId) {
        return discountCodeRepository.findByCampaignId(campaignId);
    }

    public List<DiscountCode> getDiscountCodesByInfluencer(Long influencerId) {
        return discountCodeRepository.findByInfluencerId(influencerId);
    }

    public void deleteDiscountCode(Long id) {
        DiscountCode discountCode = getDiscountCodeById(id);
        discountCodeRepository.delete(discountCode);
    }
}
