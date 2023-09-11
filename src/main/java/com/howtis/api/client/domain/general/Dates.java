package com.howtis.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Dates {
    @JsonProperty("maximum")
    private String maximum;

    @JsonProperty("minimum")
    private String minimum;

    public String getMaximum() {
        return maximum;
    }

    public String getMinimum() {
        return minimum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("maximum", maximum)
                .append("minimum", minimum)
                .toString();
    }
}
