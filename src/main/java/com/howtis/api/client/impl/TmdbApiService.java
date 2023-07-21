package com.howtis.api.client.impl;

import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieVideoList;
import retrofit2.Call;
import retrofit2.http.*;

public interface TmdbApiService {

    @GET("/3/movie/{movie_id}")
    Call<MovieDetail> getMovieDetail(@Path("movie_id") String movieId, @Query("language") String language);

    @GET("/3/movie/{movie_id}/videos")
    Call<MovieVideoList> getMovieVideoList(@Path("movie_id") String movieId, @Query("language") String language);
}