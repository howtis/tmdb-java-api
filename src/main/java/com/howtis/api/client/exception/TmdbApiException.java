package com.howtis.api.client.exception;

import com.howtis.api.client.TmdbApiError;

public class TmdbApiException extends RuntimeException {

    private TmdbApiError error;

    public TmdbApiException(TmdbApiError error) {
        this.error = error;
    }

    public TmdbApiException() {
        super();
    }

    public TmdbApiException(String message) {
        super(message);
    }

    public TmdbApiException(Throwable cause) {
        super(cause);
    }

    public TmdbApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public TmdbApiError getError() {
        return error;
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.getStatus_message();
        }
        return super.getMessage();
    }
}
