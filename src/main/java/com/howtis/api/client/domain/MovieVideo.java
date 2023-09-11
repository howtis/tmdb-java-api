package com.howtis.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import com.howtis.api.client.domain.general.Video;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieVideo {
    @JsonProperty("id")
    private int id;
    @JsonProperty("results")
    private List<Video> results;

    public int getId() {
        return id;
    }

    public List<Video> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("results", results)
                .toString();
    }
}