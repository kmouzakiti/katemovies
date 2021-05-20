package com.example.katemovies.repository;

import com.example.katemovies.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(value = "SELECT * FROM MOVIES M   \n" +
            "WHERE M.TITLE LIKE ?1% ",nativeQuery = true)
    Movie findByTitle(String title);


    @Query(value = "SELECT * FROM MOVIES M LEFT JOIN ACTORS AC ON M.TITLE = AC.MOVIETITLE  \n" +
            "WHERE AC.FIRSTNAME LIKE ?1% AND AC.LASTNAME LIKE ?2%",nativeQuery = true)
    Movie findMovieByActor(String firstName, String lastName);

}