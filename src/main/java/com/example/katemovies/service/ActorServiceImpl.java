package com.example.katemovies.service;



import com.example.katemovies.domain.Actor;
import com.example.katemovies.repository.ActorRepository;
import com.example.katemovies.transfer.KeyValue;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ActorServiceImpl extends com.example.katemovies.service.AbstractServiceImpl<Actor> implements ActorService {
    private final ActorRepository ActorRepository;

    @Override
    public JpaRepository<Actor, Long> getRepository() {
        return ActorRepository;
    }


    @Override
    public Actor findByEmail(String email) {
        return null;
    }

    @Override
    public List<KeyValue<String, BigDecimal>> findCustomersPurchasedMostExpensiveProduct() {
        return null;
    }
}
