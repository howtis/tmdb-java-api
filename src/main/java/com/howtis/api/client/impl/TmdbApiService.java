package com.howtis.api.client.impl;

import com.howtis.api.client.domain.MovieResponse;
import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieImage;
import com.howtis.api.client.domain.MovieVideo;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface TmdbApiService {

    @GET("/3/discover/movie")
    Call<MovieResponse> getMovieDiscover(@QueryMap Map<String, Object> query);

    @GET("/3/search/movie")
    Call<MovieResponse> getMovieSearch(@QueryMap Map<String, Object> query);

    @GET("/3/movie/{movie_id}/similar")
    Call<MovieResponse> getMovieSimilar(@Path("movie_id") int id, @QueryMap Map<String, Object> query);

    @GET("/3/movie/{movie_id}")
    Call<MovieDetail> getMovieDetail(@Path("movie_id") int id, @Query("language") String language);

    @GET("/3/movie/{movie_id}/images")
    Call<MovieImage> getMovieImage(@Path("movie_id") int id, @Query("language") String language);

    @GET("/3/movie/{movie_id}/videos")
    Call<MovieVideo> getMovieVideo(@Path("movie_id") int id, @Query("language") String language);
}
