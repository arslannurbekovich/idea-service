package kg.easy.ideaservice.services.impl;

import kg.easy.ideaservice.dao.UserRepository;
import kg.easy.ideaservice.mappers.UserMapper;
import kg.easy.ideaservice.models.dto.UserDto;
import kg.easy.ideaservice.models.entity.User;
import kg.easy.ideaservice.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository= userRepository;
    }
    @Override
    public UserDto save(UserDto userDto) {
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);
        user = userRepository.save(user);

        return UserMapper.INSTANCE.userToUserDto(user);
    }

    @Override
    public UserDto findById(Long id) {

        //реализовать
        return null;
    }
}
