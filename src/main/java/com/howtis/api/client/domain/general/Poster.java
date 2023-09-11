package com.howtis.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Poster {
    @JsonProperty("aspect_ratio")
    private double aspectRatio;

    @JsonProperty("height")
    private int height;

    @JsonProperty("width")
    private int width;

    @JsonProperty("iso_639_1")
    private String languageCode;

    @JsonProperty("file_path")
    private String filePath;

    @JsonProperty("vote_average")
    private double voteAverage;

    @JsonProperty("vote_count")
    private int voteCount;

    public double getAspectRatio() {
        return aspectRatio;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getFilePath() {
        return filePath;
    }

    public double getVoteAverage() {
        return voteAverage;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("aspect_ratio", aspectRatio)
                .append("height", height)
                .append("width", width)
                .append("iso_639_1", languageCode)
                .append("file_path", filePath)
                .append("vote_average", voteAverage)
                .append("vote_count", voteCount)
                .toString();
    }
}
