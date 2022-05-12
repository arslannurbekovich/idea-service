package kg.easy.ideaservice.controllers;

import kg.easy.ideaservice.models.dto.UserDto;
import kg.easy.ideaservice.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService= userService;
    }
    @PostMapping("/save")
    public UserDto saveUser(@RequestBody UserDto userDto){
        return userService.save(userDto);
    }

    //PathVariable прочитать и реализовать метод получение идеи по id
    @GetMapping("/getById")
    public UserDto findById(@RequestParam Long id){
        return userService.findById(id);
    }
}
