package com.example.katemovies.bootstrap;

import com.example.katemovies.domain.Actor;
import com.example.katemovies.domain.Movie;
import com.example.katemovies.service.ActorService;
import com.example.katemovies.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("katemovies-catalog")
@RequiredArgsConstructor
public class SampleContentRunner implements CommandLineRunner {
	private final ActorService actorService;
	private final MovieService movieService;

	@Override
	public void run(String... args) {
		/*Actor newActor = Actor.builder().description("Mobile Phones").build();*/
		//@formatter:off
		List<Actor> actors = List.of(
				Actor.builder().email("johnPorter.com")
						.firstname("Peter").lastname("Sellers")
						.address("2955 Blackwell Street")
						.age("50").movieTitle("The Postman").nationality("American").build(),
				Actor.builder().email("MaryBlood.com")
						.firstname("Mary").lastname("Blood")
						.address("13 Jump Street")
						.age("23").movieTitle("Taxi Driver").nationality("Alien").build(),
				Actor.builder().email("katrinJones.com")
						.firstname("Kathrin").lastname("Jones")
						.address("Plot 43")
						.age("43").movieTitle("Shark").build(),
				Actor.builder().email("katemouza.com")
						.firstname("Kate").lastname("Mouzakiti")
						.address("Gargitou").nationality("Greek")
						.age("41").movieTitle("A Spring Star is Born").build(),
				Actor.builder().email("tomhanks.com")
						.firstname("Tom").lastname("Hanks")
						.address("Dream Street").nationality("HalfGreek")
						.age("40").movieTitle("Forest Gamp").build()

		);
		//@formatter:on


		actorService.saveAll(actors);

		//@formatter:off
		List<Movie> movies = List.of(
				Movie.builder().title("Bohemian Rhapsody").year("2018")
						.rating("5/5").producer("Anthony McCarten").build(),
				Movie.builder().title("Lola ela Ksana").year("2018")
						.rating("5/5").producer("Singer").type("comedy").build()


		);

		movieService.saveAll(movies);
	}
}