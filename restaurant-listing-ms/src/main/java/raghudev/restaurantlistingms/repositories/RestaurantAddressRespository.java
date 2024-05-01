package raghudev.restaurantlistingms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import raghudev.restaurantlistingms.entyties.RestaurantAddress;

@Repository
public interface RestaurantAddressRespository extends JpaRepository<RestaurantAddress,Integer> {
}
