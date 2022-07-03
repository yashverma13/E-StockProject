package com.code.stockmarket.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.code.stockmarket.model.Company;

@Repository
public interface CompanyRepo extends MongoRepository<Company, String> {
    public Optional<Company> findByCode(String companyCode);
    public void deleteByCode(String companyCode);
}
