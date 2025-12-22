@Service
@RequiredArgsConstructor
public class DiscountCodeService {

    private final DiscountCodeRepository discountCodeRepository;
    private final InfluencerRepository influencerRepository;
    private final CampaignRepository campaignRepository;

    public DiscountCode createCode(DiscountCode code, Long influencerId, Long campaignId) {

        Influencer influencer = influencerRepository.findById(influencerId)
                .orElseThrow(() -> new RuntimeException("Influencer not found"));

        Campaign campaign = campaignRepository.findById(campaignId)
                .orElseThrow(() -> new RuntimeException("Campaign not found"));

        code.setInfluencer(influencer);
        code.setCampaign(campaign);
        code.setActive(true);

        return discountCodeRepository.save(code);
    }

    public DiscountCode getById(Long id) {
        return discountCodeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Discount code not found"));
    }

    public List<DiscountCode> getByInfluencer(Long influencerId) {
        return discountCodeRepository.findByInfluencerId(influencerId);
    }

    public List<DiscountCode> getByCampaign(Long campaignId) {
        return discountCodeRepository.findByCampaignId(campaignId);
    }

    public void deactivate(Long id) {
        DiscountCode code = getById(id);
        code.setActive(false);
        discountCodeRepository.save(code);
    }
}
