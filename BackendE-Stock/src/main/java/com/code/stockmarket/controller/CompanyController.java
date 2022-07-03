package com.code.stockmarket.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.stockmarket.dto.CompanyDetailsDto;
import com.code.stockmarket.model.Company;
import com.code.stockmarket.service.serviceImpl.CompanyService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1.0/market/company/")
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("register")
    public Company createCompany(@Valid @RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @GetMapping("info/{companyCode}")
    public CompanyDetailsDto fetchCompany(@PathVariable String companyCode) {
        return companyService.fetchCompany(companyCode);
    }

    @GetMapping("getall")
    public List<Company> fetchAllCompany() {
        return companyService.fetchAllCompany();
    }

    @GetMapping("delete/{companyCode}")
    public boolean deleteCompany(@PathVariable String companyCode) {
        return companyService.deleteCompany(companyCode);
    }
}
