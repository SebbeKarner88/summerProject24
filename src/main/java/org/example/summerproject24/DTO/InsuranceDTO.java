package org.example.summerproject24.DTO;

import lombok.Value;
import org.example.summerproject24.Enums.Insurance.CoverageAmount;
import org.example.summerproject24.Enums.Insurance.Insurance;
import org.example.summerproject24.Models.Payment.PaymentInfoEntity;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class InsuranceDTO {

    UUID insuranceId;
    Insurance InsuranceType;
    String info;
    LocalDate startDate;
    LocalDate endDate;
    CoverageAmount coverageAmount;
    PaymentInfoEntity paymentInfoEntity;
}
