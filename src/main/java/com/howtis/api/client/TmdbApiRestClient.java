package com.howtis.api.client;

import com.howtis.api.client.domain.MovieResponse;
import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieImage;
import com.howtis.api.client.domain.MovieVideo;

import java.util.Map;

public interface TmdbApiRestClient {

    void setLanguage(String language);

    void setRegion(String region);

    void setReleaseType(String releaseType);

    void setReleaseType(int releaseType);

    MovieResponse discoverMovie(Map<String, Object> queryMap);

    MovieResponse searchMovie(String search);

    MovieResponse searchMovie(String search, Map<String, Object> queryMap);

    MovieResponse getSimilarMovie(int id);

    MovieResponse getSimilarMovie(int id, Map<String, Object> queryMap);

    MovieDetail getMovieDetail(int id);

    MovieImage getMovieImage(int id);

    MovieVideo getMovieVideo(int id);
}
