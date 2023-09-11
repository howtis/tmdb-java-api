package com.howtis.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Video {
    @JsonProperty("iso_639_1")
    private String languageCode;

    @JsonProperty("iso_3166_1")
    private String countryCode;

    @JsonProperty("name")
    private String name;

    @JsonProperty("key")
    private String key;

    @JsonProperty("site")
    private String site;

    @JsonProperty("size")
    private int size;

    @JsonProperty("type")
    private String type;

    @JsonProperty("official")
    private boolean official;

    @JsonProperty("published_at")
    private String publishedAt;

    @JsonProperty("id")
    private String id;

    public String getLanguageCode() {
        return languageCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    public String getKey() {
        return key;
    }

    public String getSite() {
        return site;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public boolean isOfficial() {
        return official;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("iso_639_1", languageCode)
                .append("iso_3166_1", countryCode)
                .append("name", name)
                .append("key", key)
                .append("site", site)
                .append("size", size)
                .append("type", type)
                .append("official", official)
                .append("published_at", publishedAt)
                .toString();
    }
}
