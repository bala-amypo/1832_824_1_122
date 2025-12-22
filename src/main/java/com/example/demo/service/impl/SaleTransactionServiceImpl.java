package com.example.demo.service.impl;

import com.example.demo.entity.DiscountCode;
import com.example.demo.entity.SaleTransaction;
import com.example.demo.repository.DiscountCodeRepository;
import com.example.demo.repository.SaleTransactionRepository;
import com.example.demo.service.SaleTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleTransactionServiceImpl implements SaleTransactionService {

    @Autowired
    private SaleTransactionRepository transactionRepository;

    @Autowired
    private DiscountCodeRepository discountCodeRepository;

    @Override
    public SaleTransaction logTransaction(SaleTransaction transaction) {
        DiscountCode code = discountCodeRepository.findById(
                transaction.getDiscountCode().getId())
                .orElseThrow(() -> new RuntimeException("Invalid discount code"));

        if (!code.isActive()) {
            throw new RuntimeException("Discount code inactive");
        }
        return transactionRepository.save(transaction);
    }

    @Override
    public SaleTransaction getTransactionById(Long id) {
        return transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));
    }

    @Override
    public List<SaleTransaction> getSalesForCode(Long codeId) {
        return transactionRepository.findByDiscountCodeId(codeId);
    }

    @Override
    public List<SaleTransaction> getSalesForInfluencer(Long influencerId) {
        return transactionRepository.findByInfluencerId(influencerId);
    }

    @Override
    public List<SaleTransaction> getSalesForCampaign(Long campaignId) {
        return transactionRepository.findByCampaignId(campaignId);
    }
}
