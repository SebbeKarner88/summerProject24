package org.example.summerproject24.DTO;

import lombok.Value;
import org.example.summerproject24.Enums.Roles.Roles;
import org.example.summerproject24.Models.Insurance.ClaimEntity;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.example.summerproject24.Models.User.EmergencyContactEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Value
public class UserDTO {
    UUID userId;
    String username;
    String password;
    String email;
    String firstName;
    String lastName;
    String socialSecurityNumber;
    String phoneNumber;
    String address;
    LocalDate createdAt;
    LocalDate updatedAt;
    List<Roles> roles;
    List<InsuranceEntity> insurances;
    List<ClaimEntity> claims;
    EmergencyContactEntity emergencyContact;
}