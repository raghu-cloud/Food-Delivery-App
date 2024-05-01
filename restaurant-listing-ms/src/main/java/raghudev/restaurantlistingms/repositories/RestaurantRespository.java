package raghudev.restaurantlistingms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import raghudev.restaurantlistingms.entyties.RestaurantEntity;

public interface RestaurantRespository extends JpaRepository<RestaurantEntity, Integer> {
}
