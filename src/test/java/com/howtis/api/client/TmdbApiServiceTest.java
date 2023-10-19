package com.howtis.api.client;

import com.howtis.api.client.domain.MovieDetail;
import com.howtis.api.client.domain.MovieImage;
import com.howtis.api.client.domain.MovieResponse;
import com.howtis.api.client.domain.MovieVideo;
import com.howtis.api.client.domain.values.MovieGenre;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Random;

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
    void testNowPlaying() {
        Map<String, Object> queryMap = Map.of(
                "sort_by", "popularity.desc"
        );
        MovieResponse nowPlaying = tmdbApiRestClient.discoverMovie(queryMap);
        System.out.println(nowPlaying);
    }

    @Test
    void testUpcoming() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        Map<String, Object> queryMap = Map.of(
                "primary_release_date.gte", LocalDate.now().format(formatter),
                "sort_by", "primary_release_date.asc"
        );
        MovieResponse upcoming = tmdbApiRestClient.discoverMovie(queryMap);
        System.out.println(upcoming);
    }

    @Test
    void testByGenre() {
        MovieGenre[] genres = MovieGenre.values();
        MovieGenre randomGenre = genres[new Random().nextInt(genres.length)];

        System.out.println(randomGenre.getName());

        Map<String, Object> queryMap = Map.of(
                "with_genres", randomGenre.getId(),
                "sort_by", "popularity.desc"
        );
        MovieResponse genreMovies = tmdbApiRestClient.discoverMovie(queryMap);
        System.out.println(genreMovies);
    }

    @Test
    void testSearch() {
        String search = "장화";
        MovieResponse results = tmdbApiRestClient.searchMovie(search);
        System.out.println(results);
    }

    @Test
    void testSearchMap() {
        Map<String, Object> searchMap = Map.of(
                "query", "엘",
                "page", 2
        );
        MovieResponse results = tmdbApiRestClient.searchMovie(searchMap);
        System.out.println(results);
    }

    @Test
    void testSimilarMovie() {
        int movieId = 315162;
        MovieResponse similarMovie = tmdbApiRestClient.getSimilarMovie(movieId);
        System.out.println(similarMovie);
    }

    @Test
    void testSimilarMovieWithOptions() {
        int movieId = 315162;
        Map<String, Object> queryMap = Map.of(
                "sort_by", "popularity.desc"
        );
        MovieResponse similarMovie = tmdbApiRestClient.getSimilarMovie(movieId, queryMap);
        System.out.println(similarMovie);
    }

    @Test
    void testMovieDetail() {
        int movieId = 315162;
        MovieDetail movieDetail = tmdbApiRestClient.getMovieDetail(movieId);
        System.out.println(movieDetail);
    }

    @Test
    void testMovieImage() {
        int movieId = 315162;
        MovieImage movieImage = tmdbApiRestClient.getMovieImage(movieId);
        System.out.println(movieImage);
    }

    @Test
    void testMovieVideo() {
        int movieId = 315162;
        MovieVideo movieVideo = tmdbApiRestClient.getMovieVideo(movieId);
        System.out.println(movieVideo);
    }
}
