package com.howtis.api.client.impl;

import com.howtis.api.client.TmdbApiRestClient;
import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieVideoList;

import static com.howtis.api.client.impl.TmdbApiServiceGenerator.createService;
import static com.howtis.api.client.impl.TmdbApiServiceGenerator.executeSync;

public class TmdbApiRestClientImpl implements TmdbApiRestClient {

    private final TmdbApiService tmdbApiService;

    public TmdbApiRestClientImpl(String apiAccessToken) {
        tmdbApiService = createService(TmdbApiService.class, apiAccessToken);
    }

    @Override
    public MovieDetail getMovieDetail(String movieId, String language) {
        return executeSync(tmdbApiService.getMovieDetail(movieId, language));
    }

    @Override
    public MovieVideoList getMovieVideoList(String movieId, String language) {
        return executeSync(tmdbApiService.getMovieVideoList(movieId, language));
    }
}
