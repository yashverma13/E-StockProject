package com.code.stockmarket.service.serviceImpl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.stockmarket.dto.CompanyDetailsDto;
import com.code.stockmarket.model.Company;
import com.code.stockmarket.model.Stock;
import com.code.stockmarket.repository.CompanyRepo;
import com.code.stockmarket.repository.StockRepo;
import com.code.stockmarket.service.ICompanyService;

@Service
public class CompanyService implements ICompanyService {
    @Autowired
    private CompanyRepo companyRepo;
    @Autowired
    private StockRepo stockRepo;

    @Override
    public Company createCompany(Company company) {
        return companyRepo.save(company);
    }

    @Override
    public CompanyDetailsDto fetchCompany(String companyCode) {
        Optional<Company> checkCompany = companyRepo.findByCode(companyCode);
        List<Stock> checkLts = stockRepo.findByCompanyCodeSortByCreatedOn(companyCode);

        if (!checkCompany.isPresent()) {
            return null;
        }

        Company company = checkCompany.get();

        BigDecimal lts = new BigDecimal(0);

        if(checkLts.size() > 0) {
            lts = checkLts.get(0).getPrice();
        }

        CompanyDetailsDto companyDetailsDto = new CompanyDetailsDto(
                company.getCode(),
                company.getName(),
                company.getCEO(),
                company.getTurnover(),
                company.getWebsite(),
                company.getStockExchange(),
                lts);

        return companyDetailsDto;
    }

    @Override
    public List<Company> fetchAllCompany() {
        return companyRepo.findAll();
    }

    @Override
    public boolean deleteCompany(String companyCode) {
        Optional<Company> checkCompany = companyRepo.findByCode(companyCode);
        if (checkCompany.isPresent()) {
            stockRepo.deleteAllByCompanyCode(companyCode);
            companyRepo.deleteByCode(companyCode);
            return true;
        }
        return false;
    }

}
