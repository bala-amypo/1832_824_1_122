@Entity
public class RoiReport {
@Id @GeneratedValue
private Long id;
private Double revenue;
private Double roi;


@ManyToOne
private DiscountCode discountCode;
}