package com.code.stockmarket.service;

import java.time.LocalDateTime;
import java.util.List;

import com.code.stockmarket.model.Stock;

public interface IStockService {
    public Stock createStock(final Stock stock);

    public List<Stock> fetchCompanyStocks(final String companyCode, final LocalDateTime startDate,
            final LocalDateTime endDate);
}
