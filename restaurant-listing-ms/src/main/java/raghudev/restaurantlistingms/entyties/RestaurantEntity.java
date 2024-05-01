package raghudev.restaurantlistingms.entyties;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class RestaurantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int restaurantId;
    private String name;
    private String restaurantDescription;
    @OneToOne(targetEntity = RestaurantAddress.class, cascade = CascadeType.ALL)
    private RestaurantAddress restaurantAddress;

}
