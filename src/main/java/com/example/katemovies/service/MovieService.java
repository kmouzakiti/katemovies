package com.example.katemovies.service;


import com.example.katemovies.domain.Movie;
import com.example.katemovies.transfer.KeyValue;

import java.math.BigDecimal;
import java.util.List;


public interface MovieService extends BaseService<Movie, Long> {
    Movie findByEmail(String email);

    List<KeyValue<String, BigDecimal>> findCustomersPurchasedMostExpensiveProduct();


}