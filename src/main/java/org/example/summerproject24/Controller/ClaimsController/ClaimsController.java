package org.example.summerproject24.Controller.ClaimsController;

import org.apache.catalina.User;
import org.example.summerproject24.Models.Insurance.ClaimEntity;
import org.example.summerproject24.Models.User.UserEntity;
import org.example.summerproject24.Service.ClaimsService.ClaimsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/claims")
public class ClaimsController {

    public final ClaimsService claimsService;

    public ClaimsController(ClaimsService claimsService) {
        this.claimsService = claimsService;
    }

    @GetMapping("/getAllClaimsByInsuranceId/{userId}/{insuranceId}")
    public List<ClaimEntity> GetAllClaimsByInsuranceId(@PathVariable("userId") UUID userId,
                                                       @PathVariable("insuranceId") UUID insuranceId) {
        return claimsService.getAllClaimsByInsuranceId(userId, insuranceId);
    }

    @PostMapping("/addNewCLaim/{userId}")
    public UserEntity AddNewClaim(@PathVariable("userId") UUID userId,
                                  @RequestBody ClaimEntity claim) {
        return claimsService.addNewClaim(userId, claim);
    }
}
