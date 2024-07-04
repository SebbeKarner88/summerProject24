package org.example.summerproject24.Controller.InsuranceController;

import org.example.summerproject24.DTO.InsuranceDTO;
import org.example.summerproject24.Service.InsuranceService.InsuranceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    public final InsuranceService insuranceService;

    public InsuranceController(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    @GetMapping("/getInsurances")
    public List<InsuranceDTO> getInsurances(@RequestHeader UUID userId) {
        return insuranceService.getInsurances(userId);
    }

    @PostMapping("/addNewInsurance")
    public List<InsuranceDTO> addNewInsurance(@RequestBody InsuranceDTO insurance) {
        return insuranceService.addNewInsurance(insurance);
    }

    @DeleteMapping("/deleteInsurance")
    public List<InsuranceDTO> deleteInsurance(@RequestHeader UUID userId, @RequestHeader UUID insuranceId) {
        return insuranceService.deleteInsurance(userId, insuranceId);
    }

}
