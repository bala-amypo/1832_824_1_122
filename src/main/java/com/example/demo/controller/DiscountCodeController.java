@RestController
@RequestMapping("/api/discount-codes")
@RequiredArgsConstructor
@Tag(name = "Discount Codes")
public class DiscountCodeController {

    private final DiscountCodeService discountCodeService;

    @PostMapping
    public DiscountCode create(@RequestParam Long influencerId,
                               @RequestParam Long campaignId,
                               @RequestBody DiscountCode code) {
        return discountCodeService.createCode(code, influencerId, campaignId);
    }

    @GetMapping("/{id}")
    public DiscountCode getById(@PathVariable Long id) {
        return discountCodeService.getById(id);
    }

    @GetMapping("/influencer/{influencerId}")
    public List<DiscountCode> byInfluencer(@PathVariable Long influencerId) {
        return discountCodeService.getByInfluencer(influencerId);
    }

    @GetMapping("/campaign/{campaignId}")
    public List<DiscountCode> byCampaign(@PathVariable Long campaignId) {
        return discountCodeService.getByCampaign(campaignId);
    }

    @PutMapping("/{id}/deactivate")
    public void deactivate(@PathVariable Long id) {
        discountCodeService.deactivate(id);
    }
}
