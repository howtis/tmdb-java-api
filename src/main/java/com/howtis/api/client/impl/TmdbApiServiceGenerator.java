package com.howtis.api.client.impl;

import com.howtis.api.client.TmdbApiError;
import com.howtis.api.client.config.TmdbApiConfig;
import com.howtis.api.client.exception.TmdbApiException;
import com.howtis.api.client.security.TokenInterceptor;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;

public class TmdbApiServiceGenerator {

    private static final OkHttpClient sharedClient;
    private static final Converter.Factory converterFactory = JacksonConverterFactory.create();

    @SuppressWarnings("unchecked")
    private static final Converter<ResponseBody, TmdbApiError> errorBodyConverter =
            (Converter<ResponseBody, TmdbApiError>)converterFactory.
                    responseBodyConverter(TmdbApiError.class, new Annotation[0], null);

    static {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(500);
        dispatcher.setMaxRequests(500);
        sharedClient = new OkHttpClient.Builder()
                .dispatcher(dispatcher)
                .pingInterval(20, TimeUnit.SECONDS)
                .build();
    }

    public static <S> S createService(Class<S> serviceClass, String apiAccessToken) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl(TmdbApiConfig.getApiBaseUrl())
                .addConverterFactory(converterFactory);

        TokenInterceptor interceptor = new TokenInterceptor(apiAccessToken);
        OkHttpClient adaptedClient = sharedClient.newBuilder().addInterceptor(interceptor).build();

        Retrofit retrofit = retrofitBuilder
                .client(adaptedClient)
                .build();

        return retrofit.create(serviceClass);
    }

    public static <T> T executeSync(Call<T> call) {
        try {
            Response<T> response = call.execute();

            if (response.isSuccessful())
                return response.body();
            else throw new TmdbApiException(getTmdbApiError(response));

        } catch (IOException e) {
            throw new TmdbApiException(e);
        }
    }

    public static TmdbApiError getTmdbApiError(Response<?> response) throws IOException, TmdbApiException {
        return errorBodyConverter.convert(response.errorBody());
    }

}
