package com.example.demo.controller;

import com.example.demo.model.DiscountCode;
import com.example.demo.service.DiscountCodeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discount-codes")
@Tag(name = "Discount Codes")
public class DiscountCodeController {

    private final DiscountCodeService discountCodeService;

    public DiscountCodeController(DiscountCodeService discountCodeService) {
        this.discountCodeService = discountCodeService;
    }

    @PostMapping
    public DiscountCode create(@RequestBody DiscountCode code) {
        return discountCodeService.create(code);
    }

    @PutMapping("/{id}")
    public DiscountCode update(@PathVariable Long id, @RequestBody DiscountCode code) {
        return discountCodeService.update(id, code);
    }

    @GetMapping("/{id}")
    public DiscountCode getById(@PathVariable Long id) {
        return discountCodeService.getById(id);
    }

    @GetMapping("/influencer/{influencerId}")
    public List<DiscountCode> byInfluencer(@PathVariable Long influencerId) {
        return discountCodeService.getByInfluencer(influencerId);
    }

    @GetMapping("/campaign/{campaignId}")
    public List<DiscountCode> byCampaign(@PathVariable Long campaignId) {
        return discountCodeService.getByCampaign(campaignId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        discountCodeService.deactivate(id);
    }
}
