package org.example.summerproject24.Controller.UserController;

import org.example.summerproject24.DTO.UserDTO;
import org.example.summerproject24.Service.UserService.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/add")
    public UserDTO createNewUser(@RequestBody UserDTO user){
        return userService.createNewUser(user);
    }

}
