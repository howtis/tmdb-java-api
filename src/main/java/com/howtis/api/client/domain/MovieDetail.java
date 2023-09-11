package com.howtis.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import com.howtis.api.client.domain.general.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetail {
    @JsonProperty("adult")
    private boolean adult;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("belongs_to_collection")
    private Collection belongsToCollection;

    @JsonProperty("budget")
    private int budget;

    @JsonProperty("genres")
    private List<Genre> genres;

    @JsonProperty("homepage")
    private String homepage;

    @JsonProperty("id")
    private int id;

    @JsonProperty("imdb_id")
    private String imdbId;

    @JsonProperty("original_language")
    private String originalLanguage;

    @JsonProperty("original_title")
    private String originalTitle;

    @JsonProperty("overview")
    private String overview;

    @JsonProperty("popularity")
    private double popularity;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("production_companies")
    private List<Company> productionCompanies;

    @JsonProperty("production_countries")
    private List<Country> productionCountries;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("revenue")
    private int revenue;

    @JsonProperty("runtime")
    private double runtime;

    @JsonProperty("spoken_languages")
    private List<Language> spokenLanguages;

    @JsonProperty("status")
    private String status;

    @JsonProperty("tagline")
    private String tagline;

    @JsonProperty("title")
    private String title;

    @JsonProperty("video")
    private boolean video;

    @JsonProperty("vote_average")
    private double voteAverage;

    @JsonProperty("vote_count")
    private int voteCount;

    public boolean isAdult() {
        return adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public Collection getBelongsToCollection() {
        return belongsToCollection;
    }

    public int getBudget() {
        return budget;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public int getId() {
        return id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public List<Company> getProductionCompanies() {
        return productionCompanies;
    }

    public List<Country> getProductionCountries() {
        return productionCountries;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public int getRevenue() {
        return revenue;
    }

    public double getRuntime() {
        return runtime;
    }

    public List<Language> getSpokenLanguages() {
        return spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public String getTagline() {
        return tagline;
    }

    public String getTitle() {
        return title;
    }

    public boolean isVideo() {
        return video;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("adult", adult)
                .append("backdrop_path", backdropPath)
                .append("belongs_to_collection", belongsToCollection)
                .append("budget", budget)
                .append("genres", genres)
                .append("homepage", homepage)
                .append("id", id)
                .append("imdb_id", imdbId)
                .append("original_language", originalLanguage)
                .append("original_title", originalTitle)
                .append("overview", overview)
                .append("popularity", popularity)
                .append("poster_path", posterPath)
                .append("production_companies", productionCompanies)
                .append("production_countries", productionCountries)
                .append("release_date", releaseDate)
                .append("revenue", revenue)
                .append("runtime", runtime)
                .append("spoken_languages", spokenLanguages)
                .append("status", status)
                .append("tagline", tagline)
                .append("title", title)
                .append("video", video)
                .append("vote_average", voteAverage)
                .append("vote_count", voteCount)
                .toString();
    }
}
