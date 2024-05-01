package raghudev.userms.mappers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import raghudev.userms.dtos.UserDTO;
import raghudev.userms.entities.UserEntity;

@Data
@AllArgsConstructor
public class UserMapper {

    public static UserDTO getUserDTO(UserEntity userEntity){
            return new UserDTO(userEntity.getUserId(),
                    userEntity.getUserName(),
                    userEntity.getUserPassword(),
                    userEntity.getAddressEntity());
    }

    public static UserEntity getUserEntity(UserDTO userDTO){
        return new UserEntity(userDTO.getUserId(),
                userDTO.getUserName(),
                userDTO.getUserPassword(),
                userDTO.getAddressEntity());
    }
}
