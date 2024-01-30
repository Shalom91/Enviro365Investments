package com.enviro.assessment.grad001.shalommothapo.repository;

import com.enviro.assessment.grad001.shalommothapo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
    List<Product> findByInvestorId(Long investorId);
}
