@Service
@RequiredArgsConstructor
public class InfluencerService {

    private final InfluencerRepository influencerRepository;

    public Influencer createInfluencer(Influencer influencer) {
        influencer.setActive(true);
        return influencerRepository.save(influencer);
    }

    public Influencer getById(Long id) {
        return influencerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Influencer not found"));
    }

    public List<Influencer> getAll() {
        return influencerRepository.findAll();
    }

    public Influencer update(Long id, Influencer updated) {
        Influencer existing = getById(id);
        existing.setName(updated.getName());
        existing.setEmail(updated.getEmail());
        existing.setPlatform(updated.getPlatform());
        existing.setFollowerCount(updated.getFollowerCount());
        return influencerRepository.save(existing);
    }

    public void deactivate(Long id) {
        Influencer influencer = getById(id);
        influencer.setActive(false);
        influencerRepository.save(influencer);
    }
}
