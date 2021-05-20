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


}