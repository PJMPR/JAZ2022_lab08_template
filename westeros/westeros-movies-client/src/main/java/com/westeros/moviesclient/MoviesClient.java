package com.westeros.moviesclient;

import com.westeros.moviesclient.contract.*;

import java.time.LocalDate;

public class MoviesClient implements IMoviesClient {
    public MoviesClient(IMoviesClientSettings settings) {
    }

    @Override
    public PagedResultDto<MovieSummaryDto> getByDateRange(LocalDate from, LocalDate to) {
        return null;
    }

    @Override
    public PagedResultDto<MovieSummaryDto> getByDateRange(LocalDate from, LocalDate to, int page) {
        return null;
    }

    @Override
    public MovieDto getMovie(int id) {
        return null;
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
