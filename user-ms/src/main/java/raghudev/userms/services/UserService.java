package raghudev.userms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import raghudev.userms.dtos.UserDTO;
import raghudev.userms.entities.UserEntity;
import raghudev.userms.mappers.UserMapper;
import raghudev.userms.repositories.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserDTO> getAllUsers(){
        try{
            List<UserEntity> entityList = userRepository.findAll();
            List<UserDTO> resDTO = entityList.stream()
                    .map(UserMapper::getUserDTO)
                    .collect(Collectors.toList());
            return resDTO;
        }catch (Exception e){
            throw new RuntimeException(
                    "Error in Fetching Users");
        }
    }

    public UserDTO getUserById(int id){
        try{
            UserEntity entity = userRepository.getById(id);
            return UserMapper.getUserDTO(entity);
        }catch (Exception e){
            throw new RuntimeException("Restaurant not Found !!");
        }
    }

    public UserDTO addUser(UserDTO userDTO){
        try{
            UserEntity entity = UserMapper.getUserEntity(userDTO);
            UserEntity userEntity = userRepository.save(entity);
            return UserMapper.getUserDTO(userEntity);
        }catch (Exception e){
            throw new RuntimeException("Error in saving the Restaurant");
        }
    }
}
