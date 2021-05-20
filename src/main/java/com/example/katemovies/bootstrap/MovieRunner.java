package com.example.katemovies.bootstrap;

import com.example.katemovies.domain.Movie;
import com.example.katemovies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("movies-catalog")
@RequiredArgsConstructor
public class MovieRunner implements CommandLineRunner {
	private final MovieService movieService;


	@Override
	public void run(String... args) {
		/*Actor newActor = Actor.builder().description("Mobile Phones").build();*/
		//@formatter:off
		List<Movie> movies = List.of(
				Movie.builder().title("The Postman").year("1990")
						.rating("4/5").producer("Hollywood").type("drama").build()


		);
		//@formatter:on

		/*actorService.save(newActor);*/
		movieService.saveAll(movies);
	}
}
