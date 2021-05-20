package com.example.katemovies.controller;

import com.example.katemovies.domain.Actor;
import com.example.katemovies.service.BaseService;
import com.example.katemovies.service.ActorService;

import com.example.katemovies.transfer.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/actors")
public class ActorController extends AbstractController<Actor> {
    private final ActorService actorService;

    @Override
    public BaseService<Actor, Long> getBaseService() {
        return actorService;
    }

    @RequestMapping("/actorByAge")
    @GetMapping(params = {"age"})
    public ResponseEntity<ApiResponse<Actor>> findActorByAge(String age) {


        final Actor results = actorService.findActorbyAge(age);

        return ResponseEntity.ok(ApiResponse.<Actor>builder().data(results).build());
    }
}
