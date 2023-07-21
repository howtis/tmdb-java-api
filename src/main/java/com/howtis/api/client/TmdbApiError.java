package com.howtis.api.client;

import com.howtis.api.client.config.TmdbApiConfig;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TmdbApiError {

    private int status_code;

    private String status_message;

    private boolean success;

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, TmdbApiConfig.TO_STRING_BUILDER_STYLE)
                .append("code", status_code)
                .append("msg", status_message)
                .toString();
    }

}
