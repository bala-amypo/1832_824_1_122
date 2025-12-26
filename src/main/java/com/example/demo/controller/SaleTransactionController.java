package com.example.demo.controller;

import com.example.demo.entity.SaleTransaction;
import com.example.demo.service.SaleTransactionService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")
public class SaleTransactionController {

    private final SaleTransactionService saleTransactionService;

    public SaleTransactionController(SaleTransactionService saleTransactionService) {
        this.saleTransactionService = saleTransactionService;
    }

    @PostMapping
    public ResponseEntity<SaleTransaction> createSale(
            @RequestBody SaleTransaction transaction) {

        return ResponseEntity.ok(saleTransactionService.createSale(transaction));
    }

    @GetMapping("/code/{discountCodeId}")
    public ResponseEntity<List<SaleTransaction>> getSalesForCode(
            @PathVariable Long discountCodeId) {

        return ResponseEntity.ok(
                saleTransactionService.getSalesForCode(discountCodeId));
    }

    @GetMapping("/influencer/{influencerId}")
    public ResponseEntity<List<SaleTransaction>> getSalesForInfluencer(
            @PathVariable Long influencerId) {

        return ResponseEntity.ok(
                saleTransactionService.getSalesForInfluencer(influencerId));
    }

    @GetMapping("/campaign/{campaignId}")
    public ResponseEntity<List<SaleTransaction>> getSalesForCampaign(
            @PathVariable Long campaignId) {

        return ResponseEntity.ok(
                saleTransactionService.getSalesForCampaign(campaignId));
    }
}
