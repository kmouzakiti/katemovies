package com.example.katemovies.controller;

import com.example.katemovies.domain.Movie;
import com.example.katemovies.service.MovieService;
import com.example.katemovies.service.BaseService;

import com.example.katemovies.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController extends AbstractController<Movie> {
    private final MovieService movieService;

    @Override
    public BaseService<Movie, Long> getBaseService() {return movieService;}

    @RequestMapping("/moviebyTitle")
    @GetMapping(params = {"title"})
    public ResponseEntity<ApiResponse<Movie>> findMovieDetails(String title) {


        final Movie results = movieService.findByTitle(title);

        return ResponseEntity.ok(ApiResponse.<Movie>builder().data(results).build());
    }

    @RequestMapping("/moviebyActor")
    @GetMapping(params = {"actorname,actorlastname"})
    public ResponseEntity<ApiResponse<Movie>> findmoviesbyActorDetails(String actorfirstname, String actorlastname) {

        logger.trace(" actorname={},actorlastname={}",actorfirstname,actorlastname);
        final Movie results = movieService.findMovieByActor(actorfirstname,actorlastname);

        return ResponseEntity.ok(ApiResponse.<Movie>builder().data(results).build());
    }

}
