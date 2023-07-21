package com.howtis.api.client;

import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieVideoList;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TmdbApiServiceTest {

    private TmdbApiRestClient tmdbApiRestClient;
    private static final String API_ACCESS_TOKEN = "<YOUR_API_ACCESS_TOKEN>";

    @BeforeAll
    void before() {
        TmdbApiClientFactory factory = TmdbApiClientFactory.newInstance(API_ACCESS_TOKEN);
        this.tmdbApiRestClient = factory.newRestClient();

    }

    @Test
    void test() {
        MovieDetail movieDetail = tmdbApiRestClient.getMovieDetail("667538", "ko");
        System.out.println(movieDetail.toString());
    }

    @Test
    void test2() {
        MovieVideoList movieVideoList = tmdbApiRestClient.getMovieVideoList("667538", "ko");
        System.out.println(movieVideoList);
    }
}
