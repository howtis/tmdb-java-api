package com.howtis.api.client;

import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieVideoList;

public interface TmdbApiRestClient {

    MovieDetail getMovieDetail(String movieId, String language);

    MovieVideoList getMovieVideoList(String movieId, String language);
}
