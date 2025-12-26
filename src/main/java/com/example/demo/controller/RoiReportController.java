package com.example.demo.controller;

import com.example.demo.model.RoiReport;
import com.example.demo.service.RoiService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roi")
public class RoiReportController {

    private final RoiService roiService;

    public RoiReportController(RoiService roiService) {
        this.roiService = roiService;
    }

    @PostMapping("/code/{discountCodeId}")
    public ResponseEntity<RoiReport> generateReportForCode(
            @PathVariable Long discountCodeId) {

        return ResponseEntity.ok(
                roiService.generateReportForCode(discountCodeId));
    }

    @GetMapping("/{reportId}")
    public ResponseEntity<RoiReport> getReport(@PathVariable Long reportId) {
        return ResponseEntity.ok(roiService.getReportById(reportId));
    }

    @GetMapping("/influencer/{influencerId}")
    public ResponseEntity<List<RoiReport>> getReportsForInfluencer(
            @PathVariable Long influencerId) {

        return ResponseEntity.ok(
                roiService.getReportsForInfluencer(influencerId));
    }
}
