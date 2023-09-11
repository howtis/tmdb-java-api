package com.howtis.api.client.impl;

import com.howtis.api.client.TmdbApiRestClient;
import com.howtis.api.client.domain.MovieResponse;
import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieImage;
import com.howtis.api.client.domain.MovieVideo;
import com.howtis.api.client.domain.values.ReleaseType;

import java.util.*;

import static com.howtis.api.client.impl.TmdbApiServiceGenerator.createService;
import static com.howtis.api.client.impl.TmdbApiServiceGenerator.executeSync;

public class TmdbApiRestClientImpl implements TmdbApiRestClient {

    private final TmdbApiService tmdbApiService;

    private String region = Locale.KOREA.getCountry();
    private String language = Locale.KOREA.getLanguage();
    private String releaseType = ReleaseType.THEATRICAL_ALL;

    public TmdbApiRestClientImpl(String apiAccessToken) {
        tmdbApiService = createService(TmdbApiService.class, apiAccessToken);
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public void setRegion(String region) {
        this.region = region;
    }

    public void setReleaseType(String releaseType) {
        this.releaseType = releaseType;
    }

    public void setReleaseType(int releaseType) {
        this.releaseType = String.valueOf(releaseType);
    }

    @Override
    public MovieResponse discoverMovie(Map<String, Object> queryMap) {
        Map<String, Object> query = setDefaultOptions(queryMap);
        return executeSync(tmdbApiService.getMovieDiscover(query));
    }

    @Override
    public MovieResponse searchMovie(String search, Map<String, Object> queryMap) {
        Map<String, Object> query = setDefaultOptions(queryMap);
        return executeSync(tmdbApiService.getMovieSearch(query));
    }


    @Override
    public MovieResponse searchMovie(String search) {
        Map<String, Object> query = setDefaultOptions(Collections.singletonMap("query", search));
        return executeSync(tmdbApiService.getMovieSearch(query));
    }

    @Override
    public MovieResponse getSimilarMovie(int id, Map<String, Object> queryMap) {
        Map<String, Object> query = setDefaultOptions(queryMap);
        return executeSync(tmdbApiService.getMovieSimilar(id, query));
    }

    @Override
    public MovieResponse getSimilarMovie(int id) {
        Map<String, Object> query = setDefaultOptions(Collections.emptyMap());
        return executeSync(tmdbApiService.getMovieSimilar(id, query));
    }

    @Override
    public MovieDetail getMovieDetail(int id) {
        return executeSync(tmdbApiService.getMovieDetail(id, language));
    }

    @Override
    public MovieImage getMovieImage(int id) {
        return executeSync(tmdbApiService.getMovieImage(id, language));
    }

    @Override
    public MovieVideo getMovieVideo(int id) {
        return executeSync(tmdbApiService.getMovieVideo(id, language));
    }

    public Map<String, Object> setDefaultOptions(Map<String, Object> queryMap) {
        Map<String, Object> mutableMap = new HashMap<>(queryMap);
        mutableMap.put("region", region);
        mutableMap.put("language", language);
        mutableMap.put("with_release_type", releaseType);

        return Map.copyOf(mutableMap);
    }
}