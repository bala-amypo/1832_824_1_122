@Entity
public class Influencer {
@Id @GeneratedValue
private Long id;
private String name;
private String email;
private String platform;
private Integer followerCount;
private Boolean active = true;
}