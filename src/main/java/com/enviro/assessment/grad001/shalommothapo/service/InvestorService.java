package com.enviro.assessment.grad001.shalommothapo.service;

import com.enviro.assessment.grad001.shalommothapo.exceptions.ResourceNotFoundException;
import com.enviro.assessment.grad001.shalommothapo.model.Investor;
import com.enviro.assessment.grad001.shalommothapo.repository.InvestorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InvestorService {

    @Autowired
    private InvestorRepo investorRepo;

    public Optional<Investor> getInvestorById(Long investorId) {
        return Optional.ofNullable(investorRepo.findById(investorId)
                .orElseThrow(() -> new ResourceNotFoundException("Investor not found with id: " + investorId)));
    }

}
