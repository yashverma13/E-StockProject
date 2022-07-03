package com.code.stockmarket.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CompanyDetailsDto {
    private String code;
    private String name;
    private String CEO;
    private BigDecimal turnover;
    private String website;
    private List<String> stockExchange;
    private BigDecimal latestTradedPrice;
}
