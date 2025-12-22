@Service
@RequiredArgsConstructor
public class RoiReportServiceImpl implements RoiReportService {

    private final RoiReportRepository roiReportRepository;
    private final SaleTransactionRepository saleRepository;
    private final DiscountCodeRepository discountCodeRepository;

    @Override
    public RoiReport generate(Long discountCodeId) {

        DiscountCode code = discountCodeRepository.findById(discountCodeId)
                .orElseThrow(() -> new RuntimeException("Discount code not found"));

        List<SaleTransaction> sales = saleRepository.findByDiscountCodeId(discountCodeId);

        double revenue = sales.stream()
                .mapToDouble(SaleTransaction::getSaleAmount)
                .sum();

        double budget = code.getCampaign().getBudget();
        double roi = budget == 0 ? 0 : (revenue - budget) / budget;

        RoiReport report = new RoiReport();
        report.setDiscountCode(code);
        report.setRevenue(revenue);
        report.setRoi(roi);

        return roiReportRepository.save(report);
    }

    @Override
    public RoiReport getById(Long id) {
        return roiReportRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("ROI report not found"));
    }

    @Override
    public List<RoiReport> getByInfluencer(Long influencerId) {
        return roiReportRepository.findAll()
                .stream()
                .filter(r -> r.getDiscountCode().getInfluencer().getId().equals(influencerId))
                .toList();
    }

    @Override
    public List<RoiReport> getByCampaign(Long campaignId) {
        return roiReportRepository.findAll()
                .stream()
                .filter(r -> r.getDiscountCode().getCampaign().getId().equals(campaignId))
                .toList();
    }
}
