package com.westeros.moviesclient;

import com.westeros.moviesclient.contract.*;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

public class MoviesClient implements IMoviesClient {

    RestTemplate restClient;
    String baseUrl;
    String apiKey;
    int version;

    public MoviesClient(IMoviesClientSettings settings) {
        restClient = new RestTemplate();
        this.baseUrl=settings.getBaseUrl();
        this.apiKey= settings.getApiKey();
        this.version= settings.getApiVersion();
    }

    @Override
    public PagedResultDto getByDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public PagedResultDto getByDateRange(LocalDate from, LocalDate to, int page) {
        return null;
    }

    @Override
    public MovieDto getMovie(int id) {
        String url = baseUrl+"/"+version+"/movie/"+id;
        var response = restClient.getForEntity(url, MovieDto.class).getBody();
        return response;
    }

    @Override
    public CreditsDto getCredits(int id) {
        return null;
    }

    @Override
    public ActorDto getActorDetails(int id) {
        return null;
    }
}
