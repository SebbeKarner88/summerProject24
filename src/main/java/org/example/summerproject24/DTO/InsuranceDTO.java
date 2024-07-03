package org.example.summerproject24.DTO;

import lombok.Value;
import org.example.summerproject24.Enums.Insurance.CoverageAmount;
import org.example.summerproject24.Enums.Insurance.Insurance;
import org.example.summerproject24.Models.Payment.CreditCardPaymentEntity;
import org.example.summerproject24.Models.Payment.InvoicePaymentEntity;

import java.time.LocalDate;
import java.util.UUID;

@Value
public class InsuranceDTO {

    UUID insuranceId;
    UUID userId;
    Insurance insuranceType;
    String info;
    LocalDate startDate;
    LocalDate endDate;
    CoverageAmount coverageAmount;
    InvoicePaymentEntity invoicePayment;
    CreditCardPaymentEntity creditCardPayment;
}
