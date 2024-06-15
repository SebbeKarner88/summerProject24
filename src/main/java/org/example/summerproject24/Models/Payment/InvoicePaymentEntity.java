package org.example.summerproject24.Models.Payment;

import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Payment.PaymentType;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class InvoicePaymentEntity extends PaymentInfoEntity {
    private LocalDate expirationDate;
    private String billingAddress;
    private long ocr;

    public InvoicePaymentEntity(LocalDate expirationDate, String billingAddress, long ocr) {
        super(UUID.randomUUID(), PaymentType.INVOICE);
        this.expirationDate = expirationDate;
        this.billingAddress = billingAddress;
        this.ocr = ocr;
    }
}