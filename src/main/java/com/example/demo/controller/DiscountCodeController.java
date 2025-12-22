package com.example.demo.controller;

import com.example.demo.entity.DiscountCode;
import com.example.demo.service.DiscountCodeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/discount-codes")
@Tag(name = "Discount Codes")
public class DiscountCodeController {

    @Autowired
    private DiscountCodeService discountCodeService;

    @PostMapping
    public DiscountCode createCode(@RequestBody DiscountCode code) {
        return discountCodeService.createDiscountCode(code);
    }

    @PutMapping("/{id}")
    public DiscountCode updateCode(@PathVariable Long id,
                                   @RequestBody DiscountCode code) {
        return discountCodeService.updateDiscountCode(id, code);
    }

    @GetMapping("/{id}")
    public DiscountCode getCode(@PathVariable Long id) {
        return discountCodeService.getCodeById(id);
    }

    @GetMapping("/influencer/{influencerId}")
    public List<DiscountCode> getCodesByInfluencer(@PathVariable Long influencerId) {
        return discountCodeService.getCodesByInfluencer(influencerId);
    }

    @GetMapping("/campaign/{campaignId}")
    public List<DiscountCode> getCodesByCampaign(@PathVariable Long campaignId) {
        return discountCodeService.getCodesByCampaign(campaignId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivateCode(@PathVariable Long id) {
        discountCodeService.deactivateCode(id);
    }
}
