package com.springapi.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springapi.dao.BeneficiaryDAO;
import com.springapi.service.BeneficiaryService;

@RestController
@RequestMapping("/api")
public class BeneficiaryController {
    
    @Autowired
    private BeneficiaryService beneficiaryService;

    @GetMapping("/beneficiaries")
    public List<BeneficiaryDAO> getAllBeneficiaries() throws IOException, URISyntaxException {
        return beneficiaryService.getAllBeneficiaries();
    }

}
