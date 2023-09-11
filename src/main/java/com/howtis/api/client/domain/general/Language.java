package com.howtis.api.client.domain.general;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Language {
    @JsonProperty("english_name")
    private String englishName;
    @JsonProperty("iso_639_1")
    private String languageCode;
    @JsonProperty("name")
    private String name;

    public String getEnglishName() {
        return englishName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("english_name", englishName)
                .append("iso_639_1", languageCode)
                .append("name", name)
                .toString();
    }
}