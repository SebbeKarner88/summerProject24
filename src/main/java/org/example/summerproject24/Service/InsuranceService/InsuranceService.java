package org.example.summerproject24.Service.InsuranceService;

import org.example.summerproject24.Repository.InsuranceRepository.InsuranceRepository;
import org.example.summerproject24.Repository.UserRepopsitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {

    private final InsuranceRepository insuranceRepository;
    private final UserRepository userRepository;

    @Autowired
    public InsuranceService(InsuranceRepository insuranceRepository, UserRepository userRepository) {
        this.insuranceRepository = insuranceRepository;
        this.userRepository = userRepository;
    }



}
