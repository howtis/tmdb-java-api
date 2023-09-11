package com.howtis.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import com.howtis.api.client.domain.general.Dates;
import com.howtis.api.client.domain.general.Movie;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieResponse {
    @JsonProperty("dates")
    private Dates dates;

    @JsonProperty("page")
    private int page;

    @JsonProperty("results")
    private List<Movie> results;

    @JsonProperty("total_pages")
    private int totalPages;

    @JsonProperty("total_results")
    private int totalResults;

    public Dates getDates() {
        return dates;
    }

    public int getPage() {
        return page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("dates", dates)
                .append("page", page)
                .append("results", results)
                .append("total_pages", totalPages)
                .append("total_results", totalResults)
                .toString();
    }
}
