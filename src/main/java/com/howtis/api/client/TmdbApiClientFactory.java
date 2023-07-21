package com.howtis.api.client;

import com.howtis.api.client.impl.TmdbApiRestClientImpl;

public class TmdbApiClientFactory {

    private String apiAccessToken;

    private TmdbApiClientFactory(String apiAccessToken) {
        this.apiAccessToken = apiAccessToken;
    }

    public static TmdbApiClientFactory newInstance(String apiAccessToken) {
        return new TmdbApiClientFactory(apiAccessToken);
    }

    public TmdbApiRestClient newRestClient() {
        return new TmdbApiRestClientImpl(apiAccessToken);
    }
}
