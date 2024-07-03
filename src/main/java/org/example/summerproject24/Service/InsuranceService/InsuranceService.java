package org.example.summerproject24.Service.InsuranceService;

import org.example.summerproject24.DTO.InsuranceDTO;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Repository.InsuranceRepository.InsuranceRepository;
import org.example.summerproject24.Repository.UserRepopsitory.UserRepository;
import org.example.summerproject24.Service.InsuranceService.InsuranceUtils.InsuranceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final UserRepository userRepository;

    @Autowired
    public InsuranceService(InsuranceRepository insuranceRepository, UserRepository userRepository) {
        this.insuranceRepository = insuranceRepository;
        this.userRepository = userRepository;
    }


    public InsuranceDTO addNewInsurance(InsuranceDTO insurance) {

        Optional<UserEntity> user = userRepository.findById(insurance.getUserId());

        if (user.isEmpty()) {
            throw new RuntimeException("No user with id: " + insurance.getUserId());
        }

        InsuranceEntity newInsurance = InsuranceUtils.initializeInsurance(insurance);
        List<InsuranceEntity> insurances = user.get().getInsurances();

        insurances.add(newInsurance);
        insuranceRepository.save(newInsurance);

        return InsuranceUtils.toInsuranceDTO(newInsurance);
    }
}
