package com.howtis.api.client.config;

import org.apache.commons.lang3.builder.ToStringStyle;

public class TmdbApiConfig {

    private static final String BASE_DOMAIN = "themoviedb.org";
    public static ToStringStyle TO_STRING_BUILDER_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;

    public static String getBaseDomain() {
        return BASE_DOMAIN;
    }

    public static String getApiBaseUrl() {
        return String.format("https://api.%s", getBaseDomain());
    }
}
