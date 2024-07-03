package org.example.summerproject24.Service.UserService;

import org.example.summerproject24.DTO.UserDTO;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Repository.UserRepository;
import org.example.summerproject24.Service.UserService.UserUtils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


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

    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserUtils::toUserDTO)
                .toList();
    }
}
