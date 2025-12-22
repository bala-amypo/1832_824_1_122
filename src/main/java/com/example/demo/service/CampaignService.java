@Service
@RequiredArgsConstructor
public class CampaignService {

    private final CampaignRepository campaignRepository;

    public Campaign createCampaign(Campaign campaign) {
        campaign.setActive(true);
        return campaignRepository.save(campaign);
    }

    public Campaign getById(Long id) {
        return campaignRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Campaign not found"));
    }

    public List<Campaign> getAll() {
        return campaignRepository.findAll();
    }

    public Campaign update(Long id, Campaign updated) {
        Campaign campaign = getById(id);
        campaign.setName(updated.getName());
        campaign.setBudget(updated.getBudget());
        return campaignRepository.save(campaign);
    }

    public void deactivate(Long id) {
        Campaign campaign = getById(id);
        campaign.setActive(false);
        campaignRepository.save(campaign);
    }
}
