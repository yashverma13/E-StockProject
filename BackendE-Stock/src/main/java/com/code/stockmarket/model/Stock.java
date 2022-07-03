package com.code.stockmarket.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
    @NotNull
    private String companyCode;
    @NotNull
    private BigDecimal price;
    @NotNull
    private LocalDateTime createdOn;
}
