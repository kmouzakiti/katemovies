package com.example.katemovies.bootstrap;

import com.example.katemovies.domain.Actor;
import com.example.katemovies.service.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("movies-catalog")
@RequiredArgsConstructor
public class SampleContentRunner implements CommandLineRunner {
	private final ActorService actorService;


	@Override
	public void run(String... args) {
		/*Actor newActor = Actor.builder().description("Mobile Phones").build();*/
		//@formatter:off
		List<Actor> actors = List.of(
				Actor.builder().email("katemouza.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build()
/*				Actor.builder().email("twetwt.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("teewr.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("trrrrref.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("treee.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("trrr.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build(),
				Actor.builder().email("tr.com")
						.firstname("John").lastname("Porter")
						.address("2955 Blackwell Street")
						.age(40).build()*/

		);
		//@formatter:on

		/*customerService.save(newCustomer);*/
		actorService.saveAll(actors);
	}
}
