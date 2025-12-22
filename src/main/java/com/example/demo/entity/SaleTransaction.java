@Entity
public class SaleTransaction {
@Id @GeneratedValue
private Long id;
private Double saleAmount;
private LocalDateTime timestamp;


@ManyToOne
private DiscountCode discountCode;
}