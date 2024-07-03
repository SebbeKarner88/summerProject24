package org.example.summerproject24.Models.Insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Insurance.CoverageAmount;
import org.example.summerproject24.Enums.Insurance.Insurance;
import org.example.summerproject24.Models.Payment.PaymentInfoEntity;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.UUID;

@Document("insurance")
@AllArgsConstructor
@Getter
@Setter
public class InsuranceEntity {
    @MongoId
    private UUID insuranceId;
    private UUID userId;
    private Insurance InsuranceType;
    private String info;
    private LocalDate startDate;
    private LocalDate endDate;
    private CoverageAmount coverageAmount;
    private PaymentInfoEntity paymentInfoEntity;
}
