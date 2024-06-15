package org.example.summerproject24.Models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Roles.Roles;
import org.example.summerproject24.Models.Insurance.ClaimEntity;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Document("user")
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @MongoId
    private UUID userId;
    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private String phoneNumber;
    private String address;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private List<Roles> roles;
    private List<InsuranceEntity> insurances;
    private List<ClaimEntity> claims;
    private EmergencyContactEntity emergencyContact;

}
