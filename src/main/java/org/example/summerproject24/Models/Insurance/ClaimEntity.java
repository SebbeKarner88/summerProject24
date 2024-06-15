package org.example.summerproject24.Models.Insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Insurance.ClaimStatus;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class ClaimEntity {
    @MongoId
    private UUID claimId;
    private UUID insuranceId;
    private LocalDate dateOfClaim;
    private String claimInfo;
    private ClaimStatus claimStatus;
}
