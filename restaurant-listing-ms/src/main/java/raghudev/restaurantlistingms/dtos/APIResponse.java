package raghudev.restaurantlistingms.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class APIResponse {
    LocalTime timeStamp;
    String errorMessage;
}
