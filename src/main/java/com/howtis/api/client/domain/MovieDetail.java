package com.howtis.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDetail {

    @JsonProperty("id")
    private String id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("release_date")
    private String releaseDate;

    @JsonProperty("runtime")
    private String runtime;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("popularity")
    private String popularity;

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public String getPopularity() {
        return popularity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("title", title)
                .append("release_date", releaseDate)
                .append("runtime", runtime)
                .append("poster_path", posterPath)
                .append("popularity", popularity)
                .toString();

    }
}
