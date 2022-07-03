package com.code.stockmarket.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.code.stockmarket.model.Stock;

@Repository
public interface StockRepo extends MongoRepository<Stock, String> {
    List<Stock> findAllByCompanyCodeAndCreatedOnBetween(String companyCode, LocalDateTime startDate,
            LocalDateTime endDate);

    void deleteAllByCompanyCode(String companyCode);

    @Query(value = "{companyCode:?0}", sort= "{createdOn:-1}")
    List<Stock> findByCompanyCodeSortByCreatedOn(String companyCode);
}
