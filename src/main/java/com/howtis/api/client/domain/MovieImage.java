package com.howtis.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import com.howtis.api.client.domain.general.Poster;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieImage {
    @JsonProperty("id")
    private int id;
    @JsonProperty("posters")
    private List<Poster> posters;
    // private Logo logos;
    // private Backdrop backdrops;

    public int getId() {
        return id;
    }

    public List<Poster> getPosters() {
        return posters;
    }

    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("posters", posters)
                .toString();
    }
}
