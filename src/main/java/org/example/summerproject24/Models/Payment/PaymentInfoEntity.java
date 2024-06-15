package org.example.summerproject24.Models.Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.example.summerproject24.Enums.Payment.PaymentType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public abstract class PaymentInfoEntity {
    @MongoId
    private UUID paymentId;
    private PaymentType paymentType;
}
