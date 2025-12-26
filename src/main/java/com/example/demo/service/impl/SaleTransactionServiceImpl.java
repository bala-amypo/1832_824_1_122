package com.example.demo.service.impl;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.entity.SaleTransaction;
import com.example.demo.repository.SaleTransactionRepository;
import com.example.demo.service.SaleTransactionService;
import java.sql.Timestamp;
import java.util.List;

public class SaleTransactionServiceImpl implements SaleTransactionService {

    private final SaleTransactionRepository saleTransactionRepository;

    public SaleTransactionServiceImpl(SaleTransactionRepository saleTransactionRepository) {
        this.saleTransactionRepository = saleTransactionRepository;
    }

    @Override
    public SaleTransaction createSale(SaleTransaction transaction) {
        if (transaction.getTransactionAmount().signum() <= 0) {
            throw new IllegalArgumentException("Transaction amount must be > 0");
        }
        if (transaction.getTransactionDate() == null) {
            transaction.setTransactionDate(new Timestamp(System.currentTimeMillis()));
        }
        return saleTransactionRepository.save(transaction);
    }

    @Override
    public List<SaleTransaction> getSalesForCode(Long discountCodeId) {
        return saleTransactionRepository.findByDiscountCodeId(discountCodeId);
    }

    @Override
    public List<SaleTransaction> getSalesForInfluencer(Long influencerId) {
        return saleTransactionRepository.findByDiscountCodeInfluencerId(influencerId);
    }

    @Override
    public List<SaleTransaction> getSalesForCampaign(Long campaignId) {
        return saleTransactionRepository.findByDiscountCodeCampaignId(campaignId);
    }
}
