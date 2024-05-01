package raghudev.restaurantlistingms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import raghudev.restaurantlistingms.dtos.RestaurantDTO;
import raghudev.restaurantlistingms.services.RestaurantService;

import java.util.List;

@RestController

public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/restaurants")
    public ResponseEntity<List<RestaurantDTO>> getAllRestaurant(){
        return ResponseEntity.ok(restaurantService.getAllRestaurant());
    }

    @GetMapping("/restaurants/{id}")
    public ResponseEntity<RestaurantDTO> getRestaurant(@PathVariable Integer id){
        return ResponseEntity.ok(restaurantService.getRestaurantById(id));
    }

    @PostMapping("/addRestaurant")
    public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody  RestaurantDTO restaurantDTO){
        return ResponseEntity.ok(restaurantService.createRestaurant(restaurantDTO));
    }
}
