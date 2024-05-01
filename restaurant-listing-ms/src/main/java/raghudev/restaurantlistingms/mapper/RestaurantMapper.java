package raghudev.restaurantlistingms.mapper;

import raghudev.restaurantlistingms.dtos.RestaurantDTO;
import raghudev.restaurantlistingms.entyties.RestaurantEntity;

public class RestaurantMapper {

    public static RestaurantDTO getRestaurantDTO(RestaurantEntity restaurantEntity){
        return  new RestaurantDTO(restaurantEntity.getRestaurantId(),
                restaurantEntity.getName(),
                restaurantEntity.getRestaurantDescription(),
                restaurantEntity.getRestaurantAddress());
    }

    public static RestaurantEntity getRestaurantEntity(RestaurantDTO restaurantDTO){
        return new RestaurantEntity(restaurantDTO.getRestaurantId(),
                restaurantDTO.getName(),
                restaurantDTO.getRestaurantDescription(),
                restaurantDTO.getRestaurantAddress());
    }
}
