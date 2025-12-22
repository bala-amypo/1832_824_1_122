@RestController
@RequestMapping("/api/roi")
@RequiredArgsConstructor
@Tag(name = "ROI Reports")
public class RoiReportController {

    private final RoiReportService roiReportService;

    @PostMapping("/generate/{codeId}")
    public RoiReport generate(@PathVariable Long codeId) {
        return roiReportService.generate(codeId);
    }

    @GetMapping("/{id}")
    public RoiReport getById(@PathVariable Long id) {
        return roiReportService.getById(id);
    }

    @GetMapping("/influencer/{influencerId}")
    public List<RoiReport> byInfluencer(@PathVariable Long influencerId) {
        return roiReportService.getByInfluencer(influencerId);
    }

    @GetMapping("/campaign/{campaignId}")
    public List<RoiReport> byCampaign(@PathVariable Long campaignId) {
        return roiReportService.getByCampaign(campaignId);
    }
}
