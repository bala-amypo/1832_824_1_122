package com.example.demo.controller;

import com.example.demo.service.RoiService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roi")
public class RoiReportController {

    private final RoiService roiService;

    public RoiReportController(RoiService roiService) {
        this.roiService = roiService;
    }

    @GetMapping("/{discountCodeId}")
    public Double calculateRoi(@PathVariable Long discountCodeId) {
        return roiService.calculateRoi(discountCodeId);
    }

    @GetMapping
    public List<Double> getAllRoiReports() {
        return roiService.getAllRoiReports();
    }
}
