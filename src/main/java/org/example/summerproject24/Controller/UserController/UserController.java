package org.example.summerproject24.Controller.UserController;

import org.example.summerproject24.DTO.UserDTO;
import org.example.summerproject24.Service.UserService.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public UserDTO createNewUser(@RequestBody UserDTO user){
        return userService.createNewUser(user);
    }

}
