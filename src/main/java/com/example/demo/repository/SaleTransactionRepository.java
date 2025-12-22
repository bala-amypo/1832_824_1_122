public interface SaleTransactionRepository extends JpaRepository<SaleTransaction, Long> {
List<SaleTransaction> findByDiscountCodeId(Long id);
}