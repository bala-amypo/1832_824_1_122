import com.example.demo.entity.DiscountCode;

public interface DiscountCodeService {
    DiscountCode create(DiscountCode code);
    DiscountCode getById(Long id);
    List<DiscountCode> getAll();
}
