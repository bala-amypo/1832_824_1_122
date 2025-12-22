@Service
@RequiredArgsConstructor
public class RoiReportService {

    private final SaleTransactionRepository saleRepository;
    private final DiscountCodeRepository discountCodeRepository;
    private final RoiReportRepository roiReportRepository;

    public RoiReport generate(Long discountCodeId) {

        DiscountCode code = discountCodeRepository.findById(discountCodeId)
                .orElseThrow(() -> new RuntimeException("Discount code not found"));

        List<SaleTransaction> sales = saleRepository.findByDiscountCodeId(discountCodeId);

        double revenue = sales.stream()
                .mapToDouble(SaleTransaction::getSaleAmount)
                .sum();

        double campaignBudget = code.getCampaign().getBudget();
        double roi = campaignBudget == 0 ? 0 : (revenue - campaignBudget) / campaignBudget;

        RoiReport report = new RoiReport();
        report.setDiscountCode(code);
        report.setRevenue(revenue);
        report.setRoi(roi);

        return roiReportRepository.save(report);
    }

    public RoiReport getById(Long id) {
        return roiReportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ROI report not found"));
    }

    public List<RoiReport> getByInfluencer(Long influencerId) {
        return roiReportRepository.findAll()
                .stream()
                .filter(r -> r.getDiscountCode().getInfluencer().getId().equals(influencerId))
                .toList();
    }

    public List<RoiReport> getByCampaign(Long campaignId) {
        return roiReportRepository.findAll()
                .stream()
                .filter(r -> r.getDiscountCode().getCampaign().getId().equals(campaignId))
                .toList();
    }
}
