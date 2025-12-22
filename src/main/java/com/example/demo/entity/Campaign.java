@Entity
public class Campaign {
@Id @GeneratedValue
private Long id;
private String name;
private Double budget;
private Boolean active = true;
}