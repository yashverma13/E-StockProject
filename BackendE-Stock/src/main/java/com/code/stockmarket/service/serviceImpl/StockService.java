package com.code.stockmarket.service.serviceImpl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.stockmarket.model.Stock;
import com.code.stockmarket.repository.StockRepo;
import com.code.stockmarket.service.IStockService;

@Service
public class StockService implements IStockService {
    @Autowired
    private StockRepo stockRepo;

    @Override
    public Stock createStock(Stock stock) {
        return stockRepo.save(stock);
    }

    @Override
    public List<Stock> fetchCompanyStocks(String companyCode, LocalDateTime startDate, LocalDateTime endDate) {
        return stockRepo.findAllByCompanyCodeAndCreatedOnBetween(companyCode, startDate, endDate);
    }

}
