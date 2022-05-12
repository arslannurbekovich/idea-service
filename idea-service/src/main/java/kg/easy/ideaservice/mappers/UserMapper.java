package kg.easy.ideaservice.mappers;

import kg.easy.ideaservice.mappers.impl.UserMapperImpl;
import kg.easy.ideaservice.models.dto.UserDto;
import kg.easy.ideaservice.models.entity.User;

public interface UserMapper {

    UserMapper INSTANCE =new UserMapperImpl();
    User userDtoToUser(UserDto userDto);

    UserDto userToUserDto(User user);
}
