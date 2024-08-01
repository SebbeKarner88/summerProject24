package org.example.summerproject24.Service.ClaimsService;

import org.example.summerproject24.Models.Insurance.ClaimEntity;
import org.example.summerproject24.Models.Insurance.InsuranceEntity;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ClaimsService {

    public UserRepository userRepository;

    @Autowired
    public ClaimsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<ClaimEntity> getAllClaimsByInsuranceId(UUID userId, UUID insuranceId) {

        Optional<UserEntity> user = userRepository.findById(userId);

        if (!user.isPresent()) {
            throw new RuntimeException("User not found");
        }
        List<ClaimEntity> claims = user.get().getClaims();

        return claims;
    }

    public UserEntity addNewClaim(UUID userId, ClaimEntity claim) {

        Optional<UserEntity> opUser = userRepository.findById(userId);

        if (opUser.isEmpty()) {
            throw new RuntimeException("User not found");
        }

        UserEntity user = opUser.get();
        user.getClaims().add(claim);

        userRepository.save(user);
        return user;
    }
}
