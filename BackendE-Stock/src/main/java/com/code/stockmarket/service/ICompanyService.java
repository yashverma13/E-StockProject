package com.code.stockmarket.service;

import java.util.List;

import com.code.stockmarket.dto.CompanyDetailsDto;
import com.code.stockmarket.model.Company;

public interface ICompanyService {
    public Company createCompany(final Company company);

    public CompanyDetailsDto fetchCompany(final String companyCode);

    public List<Company> fetchAllCompany();

    public boolean deleteCompany(final String companyCode);
}
