public interface DiscountCodeRepository extends JpaRepository<DiscountCode, Long> {
List<DiscountCode> findByInfluencerId(Long id);
List<DiscountCode> findByCampaignId(Long id);
}