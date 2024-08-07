package org.example.summerproject24.Models.Insurance;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Insurance.CoverageAmount;
import org.example.summerproject24.Enums.Insurance.Insurance;
import org.example.summerproject24.Models.Payment.CreditCardPaymentEntity;
import org.example.summerproject24.Models.Payment.InvoicePaymentEntity;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.UUID;

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
    private InvoicePaymentEntity invoicePayment;
    private CreditCardPaymentEntity creditCardPayment;
}
