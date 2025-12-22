// @RestController
// @RequestMapping("/api/sales")
// @RequiredArgsConstructor
// @Tag(name = "Sales Transactions")
// public class SaleTransactionController {

//     private final SaleTransactionService saleTransactionService;

//     @PostMapping
//     public SaleTransaction logSale(@RequestParam Long discountCodeId,
//                                    @RequestParam Double amount) {
//         return saleTransactionService.logSale(discountCodeId, amount);
//     }

//     @GetMapping("/{id}")
//     public SaleTransaction getById(@PathVariable Long id) {
//         return saleTransactionService.getById(id);
//     }

//     @GetMapping("/code/{codeId}")
//     public List<SaleTransaction> byDiscountCode(@PathVariable Long codeId) {
//         return saleTransactionService.getByDiscountCode(codeId);
//     }

//     @GetMapping("/influencer/{influencerId}")
//     public List<SaleTransaction> byInfluencer(@PathVariable Long influencerId) {
//         return saleTransactionService.getByInfluencer(influencerId);
//     }

//     @GetMapping("/campaign/{campaignId}")
//     public List<SaleTransaction> byCampaign(@PathVariable Long campaignId) {
//         return saleTransactionService.getByCampaign(campaignId);
//     }
// }
