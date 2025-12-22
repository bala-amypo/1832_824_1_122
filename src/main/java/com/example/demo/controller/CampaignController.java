@RestController
@RequestMapping("/api/campaigns")
@RequiredArgsConstructor
@Tag(name = "Campaigns")
public class CampaignController {

    private final CampaignService campaignService;

    @PostMapping
    public Campaign create(@RequestBody Campaign campaign) {
        return campaignService.createCampaign(campaign);
    }

    @GetMapping("/{id}")
    public Campaign getById(@PathVariable Long id) {
        return campaignService.getById(id);
    }

    @GetMapping
    public List<Campaign> getAll() {
        return campaignService.getAll();
    }

    @PutMapping("/{id}")
    public Campaign update(@PathVariable Long id,
                           @RequestBody Campaign campaign) {
        return campaignService.update(id, campaign);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        campaignService.deactivate(id);
    }
}
