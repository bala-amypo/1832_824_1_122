// @RestController
// @RequestMapping("/api/influencers")
// @RequiredArgsConstructor
// @Tag(name = "Influencers")
// public class InfluencerController {

//     private final InfluencerService influencerService;

//     @PostMapping
//     public Influencer create(@RequestBody Influencer influencer) {
//         return influencerService.createInfluencer(influencer);
//     }

//     @GetMapping("/{id}")
//     public Influencer getById(@PathVariable Long id) {
//         return influencerService.getById(id);
//     }

//     @GetMapping
//     public List<Influencer> getAll() {
//         return influencerService.getAll();
//     }

//     @PutMapping("/{id}")
//     public Influencer update(@PathVariable Long id,
//                              @RequestBody Influencer influencer) {
//         return influencerService.update(id, influencer);
//     }

//     @PutMapping("/{id}/deactivate")
//     public void deactivate(@PathVariable Long id) {
//         influencerService.deactivate(id);
//     }
// }
