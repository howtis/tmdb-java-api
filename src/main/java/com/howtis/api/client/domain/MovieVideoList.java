package com.howtis.api.client.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieVideoList {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Video {
        @JsonProperty("name")
        private String name;

        @JsonProperty("site")
        private String site;

        @JsonProperty("key")
        private String key;

        public String getName() {
            return name;
        }

        public String getSite() {
            return site;
        }

        public String getKey() {
            return key;
        }

        @Override
        public String toString() {
            return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                    .append("name", name)
                    .append("site", site)
                    .append("key", key)
                    .toString();
        }
    }

    @JsonProperty("id")
    private String id;

    private List<Video> videos;

    public String getId() {
        return id;
    }

    public List<Video> getVideos() {
        return videos;
    }

    @JsonProperty("results")
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("videos", videos)
                .toString();
    }
}
