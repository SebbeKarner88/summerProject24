package org.example.summerproject24.Service.InsuranceService;

import org.example.summerproject24.DTO.InsuranceDTO;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Repository.UserRepository;
import org.example.summerproject24.Service.InsuranceService.InsuranceUtils.InsuranceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class InsuranceService {

    private final UserRepository userRepository;

    @Autowired
    public InsuranceService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public List<InsuranceDTO> addNewInsurance(InsuranceDTO insurance) {

        Optional<UserEntity> user = userRepository.findById(insurance.getUserId());

        if (user.isEmpty()) {
            throw new RuntimeException("No user with id: " + insurance.getUserId());
        }

        UserEntity updatedUser = InsuranceUtils.addInsuranceToUser(insurance, user.get());
        updatedUser.setUpdatedAt(LocalDate.now());
        userRepository.save(updatedUser);

        return updatedUser.getInsurances()
                .stream()
                .map(InsuranceUtils::toInsuranceDTO)
                .toList();
    }
}
