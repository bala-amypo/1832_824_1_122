package com.example.demo.service.impl;

import com.example.demo.model.DiscountCode;
import com.example.demo.repository.DiscountCodeRepository;
import com.example.demo.service.DiscountCodeService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class DiscountCodeServiceImpl implements DiscountCodeService {

    private final DiscountCodeRepository discountCodeRepository;

    public DiscountCodeServiceImpl(DiscountCodeRepository discountCodeRepository) {
        this.discountCodeRepository = discountCodeRepository;
    }

    @Override
    public DiscountCode createDiscountCode(DiscountCode discountCode) {
        return discountCodeRepository.save(discountCode);
    }

    @Override
    public DiscountCode updateDiscountCode(Long id, DiscountCode discountCode) {
        DiscountCode existing =
                discountCodeRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException("DiscountCode not found with id " + id));

        existing.setCode(discountCode.getCode());
        existing.setCampaign(discountCode.getCampaign());
        existing.setInfluencer(discountCode.getInfluencer());

        return discountCodeRepository.save(existing);
    }

    @Override
    public DiscountCode getDiscountCodeById(Long id) {
        return discountCodeRepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("DiscountCode not found with id " + id));
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
