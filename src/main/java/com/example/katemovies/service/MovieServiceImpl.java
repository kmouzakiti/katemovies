package com.example.katemovies.service;




import com.example.katemovies.domain.Movie;

import com.example.katemovies.repository.MovieRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
public class MovieServiceImpl extends AbstractServiceImpl<Movie> implements MovieService {
    private final MovieRepository movieRepository;

    @Override
    public JpaRepository<Movie, Long> getRepository() {
        return movieRepository;
    }


    @Override
    public Movie findByTitle(String title) {

        return movieRepository.findByTitle(title);
    }


    @Override
    public Movie findMovieByActor (String firstName,String lastName) {
        logger.info("  FirstName:{},lastName{}",firstName,lastName);
        return movieRepository.findMovieByActor( firstName, lastName);
    }

}
