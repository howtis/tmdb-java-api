package com.howtis.api.client.security;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class TokenInterceptor implements Interceptor {

    private final String apiAccessToken;

    public TokenInterceptor(String apiAccessToken) {
        this.apiAccessToken = apiAccessToken;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request originalRequest = chain.request();
        Request.Builder newRequestBuilder = originalRequest.newBuilder();

        newRequestBuilder.addHeader("Authorization", "Bearer " + apiAccessToken);
        Request newRequest = newRequestBuilder.build();

        return chain.proceed(newRequest);
    }
}
