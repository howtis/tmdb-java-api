package com.howtis.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Country {
    @JsonProperty("iso_3166_1")
    private String countryCode;
    @JsonProperty("name")
    private String name;

    public String getCountryCode() {
        return countryCode;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("iso_3166_1", countryCode)
                .append("name", name)
                .toString();
    }
}
