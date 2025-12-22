@Service
@RequiredArgsConstructor
public class InfluencerServiceImpl implements InfluencerService {

    private final InfluencerRepository influencerRepository;

    @Override
    public Influencer createInfluencer(Influencer influencer) {
        influencer.setActive(true);
        return influencerRepository.save(influencer);
    }

    @Override
    public Influencer getById(Long id) {
        return influencerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Influencer not found"));
    }

    @Override
    public List<Influencer> getAll() {
        return influencerRepository.findAll();
    }

    @Override
    public Influencer update(Long id, Influencer updated) {
        Influencer influencer = getById(id);
        influencer.setName(updated.getName());
        influencer.setEmail(updated.getEmail());
        influencer.setPlatform(updated.getPlatform());
        influencer.setFollowerCount(updated.getFollowerCount());
        return influencerRepository.save(influencer);
    }

    @Override
    public void deactivate(Long id) {
        Influencer influencer = getById(id);
        influencer.setActive(false);
        influencerRepository.save(influencer);
    }
}
