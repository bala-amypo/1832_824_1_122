@Service
@RequiredArgsConstructor
public class SaleTransactionService {

    private final SaleTransactionRepository saleTransactionRepository;
    private final DiscountCodeRepository discountCodeRepository;

    public SaleTransaction logSale(Long discountCodeId, Double amount) {

        DiscountCode code = discountCodeRepository.findById(discountCodeId)
                .orElseThrow(() -> new RuntimeException("Discount code not found"));

        SaleTransaction sale = new SaleTransaction();
        sale.setDiscountCode(code);
        sale.setSaleAmount(amount);
        sale.setTimestamp(LocalDateTime.now());

        return saleTransactionRepository.save(sale);
    }

    public SaleTransaction getById(Long id) {
        return saleTransactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sale not found"));
    }

    public List<SaleTransaction> getByDiscountCode(Long codeId) {
        return saleTransactionRepository.findByDiscountCodeId(codeId);
    }

    public List<SaleTransaction> getByInfluencer(Long influencerId) {
        return saleTransactionRepository.findAll()
                .stream()
                .filter(s -> s.getDiscountCode().getInfluencer().getId().equals(influencerId))
                .toList();
    }

    public List<SaleTransaction> getByCampaign(Long campaignId) {
        return saleTransactionRepository.findAll()
                .stream()
                .filter(s -> s.getDiscountCode().getCampaign().getId().equals(campaignId))
                .toList();
    }
}
