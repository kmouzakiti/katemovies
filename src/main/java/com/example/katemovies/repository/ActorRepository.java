package com.example.katemovies.repository;

import com.example.katemovies.domain.Actor;
import com.example.katemovies.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    @Query(value = "SELECT * FROM ACTORS ACT  \n" +
            "WHERE ACT.AGE LIKE ?1% ",nativeQuery = true)
    Actor findActorbyAge(String age);
}