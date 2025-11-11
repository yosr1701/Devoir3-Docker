package com.yosr.genre;

import com.yosr.genre.entities.Genre;
import com.yosr.genre.repos.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenreMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(GenreRepository genreRepository) {
        return args -> {
            genreRepository.save(Genre.builder()
                    .genName("homme")
                    .genCode("H")
                    .build());
            genreRepository.save(Genre.builder()
                    .genName("femme")
                    .genCode("F")
                    .build());

        };
    }
}
