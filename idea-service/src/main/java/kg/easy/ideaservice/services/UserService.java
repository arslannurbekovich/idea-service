package kg.easy.ideaservice.services;


import kg.easy.ideaservice.models.dto.UserDto;

public interface UserService {


    UserDto save(UserDto userDto);

    UserDto findById(Long id);
}
