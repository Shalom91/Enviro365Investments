package com.enviro.assessment.grad001.shalommothapo.repository;

import com.enviro.assessment.grad001.shalommothapo.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestorRepo extends JpaRepository<Investor, Long> {
}
