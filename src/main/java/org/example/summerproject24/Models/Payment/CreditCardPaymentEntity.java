package org.example.summerproject24.Models.Payment;

import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Payment.PaymentType;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class CreditCardPaymentEntity extends PaymentInfoEntity {
    private String cardNumber;
    private String cardCarrier;
    private LocalDate expirationDate;
    private String billingAddress;
    private long cvcCode;

    public CreditCardPaymentEntity(String cardNumber, String cardCarrier, LocalDate expirationDate, String billingAddress, long cvcCode) {
        super(UUID.randomUUID(), PaymentType.CREDIT_CARD);
        this.cardNumber = cardNumber;
        this.cardCarrier = cardCarrier;
        this.expirationDate = expirationDate;
        this.billingAddress = billingAddress;
        this.cvcCode = cvcCode;
    }
}