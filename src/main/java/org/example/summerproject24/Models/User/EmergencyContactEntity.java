package org.example.summerproject24.Models.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class EmergencyContactEntity {
    private String name;
    private String relationship;
    private String phoneNumber;
    private String email;
}
