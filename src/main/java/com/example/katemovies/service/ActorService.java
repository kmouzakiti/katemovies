package com.example.katemovies.service;

        import com.example.katemovies.domain.Actor;
        import com.example.katemovies.domain.Movie;
        import com.example.katemovies.transfer.KeyValue;


        import java.math.BigDecimal;
        import java.util.List;

public interface ActorService extends BaseService<Actor, Long> {
    Actor findActorbyAge(String age);



}