package com.example.katemovies.service;


import com.example.katemovies.domain.Movie;
import com.example.katemovies.transfer.KeyValue;




public interface MovieService extends BaseService<Movie, Long> {
    Movie findByTitle(String title);


    //Movie findMovieByActor(String firstName,String lastName);-->


}