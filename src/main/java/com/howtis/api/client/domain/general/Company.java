package com.howtis.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

    @JsonProperty("id")
    private int id;
    @JsonProperty("logo_path")
    private String logoPath;
    @JsonProperty("name")
    private String name;
    @JsonProperty("origin_country")
    private String originCountry;

    public int getId() {
        return id;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public String getName() {
        return name;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("logo_path", logoPath)
                .append("name", name)
                .append("origin_country", originCountry)
                .toString();
    }
}
