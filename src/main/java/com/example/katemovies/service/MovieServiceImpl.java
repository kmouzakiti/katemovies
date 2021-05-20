package com.example.katemovies.service;



import com.example.katemovies.domain.Actor;
import com.example.katemovies.domain.Movie;

import com.example.katemovies.repository.MovieRepository;
import com.example.katemovies.transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends AbstractServiceImpl<Movie> implements MovieService {
    private final MovieRepository MovieRepository;

    @Override
    public JpaRepository<Movie, Long> getRepository() {
        return MovieRepository;
    }


    @Override
    public Movie findByEmail(String email) {
        return null;
    }

    @Override
    public List<KeyValue<String, BigDecimal>> findCustomersPurchasedMostExpensiveProduct() {
        return null;
    }
}
