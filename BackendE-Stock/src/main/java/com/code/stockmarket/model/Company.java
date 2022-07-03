package com.code.stockmarket.model;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @NotNull
    @Indexed(unique = true)
    private String code;
    @NotNull
    private String name;
    @NotNull
    private String CEO;
    @NotNull
    @Min(value = 100000000)
    private BigDecimal turnover;
    @NotNull
    private String website;
    private List<String> stockExchange;
}
