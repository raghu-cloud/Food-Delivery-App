package raghudev.restaurantlistingms.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import raghudev.restaurantlistingms.dtos.APIResponse;

import java.time.LocalTime;

@ControllerAdvice
public class RestaurantExceptionHandler {

    @ExceptionHandler(ResourceNotFoudnException.class)
    public ResponseEntity<APIResponse> handleResourceNotFoundException(ResourceNotFoudnException resourceNotFoudnException) {
        APIResponse apiResponse = new APIResponse(LocalTime.now(),
                resourceNotFoudnException.getMessage());
        return ResponseEntity.status(500).body(apiResponse);
    }

    @ExceptionHandler(DataPersistatException.class)
    public ResponseEntity<APIResponse> handleDataPersistatException(DataPersistatException dataPersistatException) {
        APIResponse apiResponse = new APIResponse(LocalTime.now(),
                dataPersistatException.getMessage());
        return ResponseEntity.status(500).body(apiResponse);
    }
}
