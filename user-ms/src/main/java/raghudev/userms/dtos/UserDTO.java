package raghudev.userms.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import raghudev.userms.entities.AddressEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private int userId;
    private String userName;
    private String userPassword;
    private AddressEntity addressEntity;
}
