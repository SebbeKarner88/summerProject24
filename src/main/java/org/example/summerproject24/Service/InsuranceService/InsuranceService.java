package org.example.summerproject24.Service.InsuranceService;

import org.example.summerproject24.DTO.InsuranceDTO;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Repository.InsuranceRepository.InsuranceRepository;
import org.example.summerproject24.Repository.UserRepopsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final UserRepository userRepository;

    @Autowired
    public InsuranceService(InsuranceRepository insuranceRepository, UserRepository userRepository) {
        this.insuranceRepository = insuranceRepository;
        this.userRepository = userRepository;
    }


    public InsuranceDTO addNewInsurance(UUID id, InsuranceDTO insurance) {

        Optional<UserEntity> user = userRepository.findById(id);

        if (user.isEmpty()) {
            throw new RuntimeException("No user with id: " + id);
        }

        List<InsuranceEntity> insurances = user.get().getInsurances();

        return insurance;
    }
}
