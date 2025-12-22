package com.example.demo.controller;

import com.example.demo.model.SaleTransaction;
import com.example.demo.service.SaleTransactionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sales")
@Tag(name = "Sales Transactions")
public class SaleTransactionController {

    private final SaleTransactionService saleService;

    public SaleTransactionController(SaleTransactionService saleService) {
        this.saleService = saleService;
    }

    @PostMapping
    public SaleTransaction logSale(@RequestBody SaleTransaction sale) {
        return saleService.logSale(sale);
    }

    @GetMapping("/{id}")
    public SaleTransaction getById(@PathVariable Long id) {
        return saleService.getById(id);
    }

    @GetMapping("/code/{codeId}")
    public List<SaleTransaction> byCode(@PathVariable Long codeId) {
        return saleService.getByDiscountCode(codeId);
    }

    @GetMapping("/influencer/{influencerId}")
    public List<SaleTransaction> byInfluencer(@PathVariable Long influencerId) {
        return saleService.getByInfluencer(influencerId);
    }

    @GetMapping("/campaign/{campaignId}")
    public List<SaleTransaction> byCampaign(@PathVariable Long campaignId) {
        return saleService.getByCampaign(campaignId);
    }
}
