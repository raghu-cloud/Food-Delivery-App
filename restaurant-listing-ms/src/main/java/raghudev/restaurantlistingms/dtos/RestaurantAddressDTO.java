package raghudev.restaurantlistingms.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import raghudev.restaurantlistingms.entyties.RestaurantAddress;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantAddressDTO {

    private int restaurantId;
    private String name;
    private String restaurantDescription;
    private RestaurantAddress restaurantAddress;
}
