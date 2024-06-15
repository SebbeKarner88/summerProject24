package org.example.summerproject24.Service.UserService;

import org.example.summerproject24.DTO.UserDTO;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Repository.UserRepopsitory.UserRepository;
import org.example.summerproject24.Service.UserService.UserUtils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public UserDTO createNewUser(UserDTO user) {
        UserEntity newUser = UserUtils.toUserEntity(user);
        newUser = UserUtils.initiateNewUser(newUser);
        userRepository.save(newUser);
        return UserUtils.toUserDTO(newUser);
    }



}
