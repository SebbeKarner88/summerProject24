package org.example.summerproject24.Controller.InsuranceController;

import org.example.summerproject24.DTO.InsuranceDTO;
import org.example.summerproject24.Service.InsuranceService.InsuranceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    public final InsuranceService insuranceService;

    public InsuranceController(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }


    @PostMapping("/addNewInsurance")
    public InsuranceDTO addNewInsurance(@RequestBody InsuranceDTO insurance) {
        return insuranceService.addNewInsurance(insurance);
    }

}
