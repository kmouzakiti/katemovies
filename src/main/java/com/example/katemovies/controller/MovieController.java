package com.example.katemovies.controller;

import com.example.katemovies.domain.Movie;
import com.example.katemovies.service.MovieService;
import com.example.katemovies.service.BaseService;
import com.example.katemovies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController extends AbstractController<Movie> {
    private final MovieService movieService;

    @Override
    public BaseService<Movie, Long> getBaseService() {return movieService;}



}
