package org.example.summerproject24.Service.InsuranceService.InsuranceUtils;

import org.example.summerproject24.DTO.InsuranceDTO;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.example.summerproject24.Models.User.UserEntity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class InsuranceUtils {

    public static InsuranceEntity toInsuranceEntity(InsuranceDTO insurance) {
        return new InsuranceEntity(
                insurance.getInsuranceId(),
                insurance.getUserId(),
                insurance.getInsuranceType(),
                insurance.getInfo(),
                insurance.getStartDate(),
                insurance.getEndDate(),
                insurance.getCoverageAmount(),
                insurance.getInvoicePayment(),
                insurance.getCreditCardPayment()
        );
    }

    public static InsuranceDTO toInsuranceDTO(InsuranceEntity insurance) {
        return new InsuranceDTO(
                insurance.getInsuranceId(),
                insurance.getUserId(),
                insurance.getInsuranceType(),
                insurance.getInfo(),
                insurance.getStartDate(),
                insurance.getEndDate(),
                insurance.getCoverageAmount(),
                insurance.getInvoicePayment(),
                insurance.getCreditCardPayment()
        );
    }

    public static InsuranceEntity initializeInsurance(InsuranceDTO insurance) {
        return new InsuranceEntity(UUID.randomUUID(),
        insurance.getUserId(),
        insurance.getInsuranceType(),
        insurance.getInfo(),
        insurance.getStartDate(),
        insurance.getEndDate(),
        insurance.getCoverageAmount(),
        insurance.getInvoicePayment(),
                insurance.getCreditCardPayment()
        );
    }

    public static UserEntity addInsuranceToUser(InsuranceDTO insurance, UserEntity user) {
        InsuranceEntity newInsurance = InsuranceUtils.initializeInsurance(insurance);
        List<InsuranceEntity> insurances = user.getInsurances();
        insurances.add(newInsurance);
        user.setInsurances(insurances);
        return user;
    }
}
