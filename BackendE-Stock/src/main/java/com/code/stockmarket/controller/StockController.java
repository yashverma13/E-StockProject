package com.code.stockmarket.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.stockmarket.model.Stock;
import com.code.stockmarket.service.serviceImpl.StockService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1.0/market/stock/")
public class StockController {
    @Autowired
    private StockService stockService;

    @PostMapping("add")
    public Stock createStock(@Valid @RequestBody Stock stock) {
        return stockService.createStock(stock);
    }

    @GetMapping("get/{companyCode}/{startDate}/{endDate}")
    public List<Stock> fetchCompanyStocks(@PathVariable String companyCode,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime startDate,
            @PathVariable @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime endDate) {
        return stockService.fetchCompanyStocks(companyCode, startDate, endDate);
    }

}
