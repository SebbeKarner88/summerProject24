package org.example.summerproject24.Service.UserService.UserUtils;

import org.example.summerproject24.DTO.UserDTO;
import org.example.summerproject24.Enums.Roles.Roles;
import org.example.summerproject24.Models.User.UserEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserUtils {

    public static UserEntity toUserEntity(UserDTO userDto) {
        return new UserEntity(
                userDto.getUserId(),
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getEmail(),
                userDto.getFirstName(),
                userDto.getLastName(),
                userDto.getSocialSecurityNumber(),
                userDto.getPhoneNumber(),
                userDto.getAddress(),
                userDto.getCreatedAt(),
                userDto.getUpdatedAt(),
                userDto.getRoles(),
                userDto.getInsurances(),
                userDto.getClaims(),
                userDto.getEmergencyContact()
        );
    }

    public static UserDTO toUserDTO(UserEntity userEntity) {
        return new UserDTO(
                userEntity.getUserId(),
                userEntity.getUsername(),
                userEntity.getPassword(),
                userEntity.getEmail(),
                userEntity.getFirstName(),
                userEntity.getLastName(),
                userEntity.getSocialSecurityNumber(),
                userEntity.getPhoneNumber(),
                userEntity.getAddress(),
                userEntity.getCreatedAt(),
                userEntity.getUpdatedAt(),
                userEntity.getRoles(),
                userEntity.getInsurances(),
                userEntity.getClaims(),
                userEntity.getEmergencyContact()
        );
    }

    public static UserEntity initiateNewUser(UserEntity newUser) {
        newUser.setUserId(UUID.randomUUID());
        newUser.setCreatedAt(LocalDate.now());
        newUser.setUpdatedAt(LocalDate.now());
        newUser.setRoles(List.of(Roles.USER));
        newUser.setInsurances(new ArrayList<>());
        newUser.setClaims(new ArrayList<>());
        return newUser;
    }
}
