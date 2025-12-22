@Service
@RequiredArgsConstructor
public class SaleTransactionServiceImpl implements SaleTransactionService {

    private final SaleTransactionRepository saleRepository;
    private final DiscountCodeRepository discountCodeRepository;

    @Override
    public SaleTransaction logSale(Long discountCodeId, Double amount) {

        DiscountCode code = discountCodeRepository.findById(discountCodeId)
                .orElseThrow(() -> new RuntimeException("Discount code not found"));

        SaleTransaction sale = new SaleTransaction();
        sale.setDiscountCode(code);
        sale.setSaleAmount(amount);
        sale.setTimestamp(LocalDateTime.now());

        return saleRepository.save(sale);
    }

    @Override
    public SaleTransaction getById(Long id) {
        return saleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Sale not found"));
    }

    @Override
    public List<SaleTransaction> getByDiscountCode(Long codeId) {
        return saleRepository.findByDiscountCodeId(codeId);
    }

    @Override
    public List<SaleTransaction> getByInfluencer(Long influencerId) {
        return saleRepository.findAll()
                .stream()
                .filter(s -> s.getDiscountCode().getInfluencer().getId().equals(influencerId))
                .toList();
    }

    @Override
    public List<SaleTransaction> getByCampaign(Long campaignId) {
        return saleRepository.findAll()
                .stream()
                .filter(s -> s.getDiscountCode().getCampaign().getId().equals(campaignId))
                .toList();
    }
}
