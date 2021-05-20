package com.example.katemovies.bootstrap;

import com.example.katemovies.domain.Movie;
import com.example.katemovies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("katemovies-catalog")
@RequiredArgsConstructor
public class MovieRunner implements CommandLineRunner {
	private final MovieService movieService;


	@Override
	public void run(String... args) {

		//@formatter:off
		List<Movie> movies = List.of(
				Movie.builder().title("The Postman").year("1990")
						.rating("4/5").producer("Hollywood").type("comedy").build(),
				Movie.builder().title("Shark").year("2008")
						.rating("3/5").producer("Hollywood").type("drama").build(),
				Movie.builder().title("Cast Away").year("2008")
						.rating("1/5").producer("TomHanks").type("action").build(),
				Movie.builder().title("Forest Gamp").year("1994")
						.rating("1/5").producer("Robert Zemeckis").type("action").build()

		);
		//@formatter:on

		/*actorService.save(newActor);*/
		movieService.saveAll(movies);
	}
}
