package com.example.katemovies.service;



import com.example.katemovies.domain.Actor;
import com.example.katemovies.domain.Movie;
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
    private final ActorRepository actorRepository;

    @Override
    public JpaRepository<Actor, Long> getRepository() {
        return actorRepository;
    }


    @Override
    public Actor findActorbyAge(String title) {

        return actorRepository.findActorbyAge(title);
    }


}
