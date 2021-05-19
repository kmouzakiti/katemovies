package com.example.katemovies.transfer;

        import java.math.BigDecimal;

public interface PurchasesPerCustomerCategoryDto {
    String getCategory();

    Long getPurchases();

    BigDecimal getCost();
}