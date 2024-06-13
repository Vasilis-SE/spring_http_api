package com.springapi.service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapi.repository.BeneficiaryRepository;
import com.springapi.dao.BeneficiaryDAO;


@Service
public class BeneficiaryService {
    
    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    public List<BeneficiaryDAO> getAllBeneficiaries() throws IOException, URISyntaxException {
        return beneficiaryRepository.fetchAll();
    }
}
