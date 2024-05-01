package raghudev.restaurantlistingms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raghudev.restaurantlistingms.dtos.RestaurantDTO;
import raghudev.restaurantlistingms.entyties.RestaurantEntity;
import raghudev.restaurantlistingms.exceptions.DataPersistatException;
import raghudev.restaurantlistingms.exceptions.ResourceNotFoudnException;
import raghudev.restaurantlistingms.mapper.RestaurantMapper;
import raghudev.restaurantlistingms.repositories.RestaurantRespository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class RestaurantService {

    @Autowired
    RestaurantRespository restaurantRespository;

    public List<RestaurantDTO> getAllRestaurant(){
        try{
            List<RestaurantEntity> entityList = restaurantRespository.findAll();
            List<RestaurantDTO> resDTO = entityList.stream()
                    .map(RestaurantMapper::getRestaurantDTO)
                    .collect(Collectors.toList());
            return resDTO;
        }catch (Exception e){
            throw new ResourceNotFoudnException("Error in Fetching Restaurants");
        }
        //return RestaurantMapper.getRestaurantDTO(entityList

    }

    public RestaurantDTO getRestaurantById(int id){
        try{
            RestaurantEntity entity = restaurantRespository.getById(id);
            return RestaurantMapper.getRestaurantDTO(entity);
        }catch (Exception e){
            throw new ResourceNotFoudnException("Restaurant not Found !!");
        }
    }

    public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO){
        try{
            RestaurantEntity entity = RestaurantMapper.getRestaurantEntity(restaurantDTO);
            RestaurantEntity restaurantEntity = restaurantRespository.save(entity);
            return RestaurantMapper.getRestaurantDTO(restaurantEntity);
        }catch (Exception e){
            throw new DataPersistatException("Error in saving the Restaurant");
        }
    }

}
