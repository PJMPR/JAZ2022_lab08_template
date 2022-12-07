package com.westeros.moviesclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MoviesClientConfiguration {

    @Bean
    public IMoviesClientSettings getSettings(){
        return new MoviesClientSettings("api_key", "api.themoviedb.org", 3);
    }
}
