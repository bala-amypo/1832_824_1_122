package com.example.demo.service.impl;

import com.example.demo.model.DiscountCode;
import com.example.demo.model.RoiReport;
import com.example.demo.repository.DiscountCodeRepository;
import com.example.demo.repository.RoiReportReepository;
import com.example.demo.service.RoiService;
import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class RoiServiceImpl implements RoiService {

    private final RoiReportReepository roiRepository;
    private final DiscountCodeRepository discountCodeRepository;

    public RoiServiceImpl(RoiReportReepository roiRepository,
                          DiscountCodeRepository discountCodeRepository) {
        this.roiRepository = roiRepository;
        this.discountCodeRepository = discountCodeRepository;
    }

    @Override
    public RoiReport generateReportForCode(Long discountCodeId) {

        DiscountCode code = discountCodeRepository.findById(discountCodeId)
                .orElseThrow(() -> new RuntimeException("Discount code not found"));

        double roiValue = code.getTotalSales() - code.getCampaign().getBudget();

        RoiReport report = new RoiReport();
        report.setDiscountCode(code);
        report.setRoiValue(roiValue);
        report.setGeneratedDate(LocalDate.now());

        return roiRepository.save(report);
    }

    @Override
    public RoiReport getReportById(Long id) {
        return roiRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ROI report not found"));
    }

    @Override
    public List<RoiReport> getReportsForInfluencer(Long influencerId) {
        return roiRepository.findByDiscountCodeInfluencerId(influencerId);
    }

    @Override
    public List<RoiReport> getAllRoiReports() {
        return roiRepository.findAll();
    }
}
