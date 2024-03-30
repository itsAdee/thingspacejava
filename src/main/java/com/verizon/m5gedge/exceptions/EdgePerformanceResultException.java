/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.exceptions;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.coreinterfaces.http.Context;

/**
 * This is a model class for EdgePerformanceResultException type.
 */
public class EdgePerformanceResultException extends ApiException {
    private static final long serialVersionUID = 4607788691634969935L;
    private String status;
    private String message;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public EdgePerformanceResultException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for Status.
     * HTTP status code.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Setter for Status.
     * HTTP status code.
     * @param status Value for String
     */
    @JsonSetter("status")
    private void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for Message.
     * Error details.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessageField() {
        return this.message;
    }

    /**
     * Setter for Message.
     * Error details.
     * @param messageField Value for String
     */
    @JsonSetter("message")
    private void setMessageField(String messageField) {
        this.message = messageField;
    }
}
