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
 * This is a model class for RestErrorResponseException type.
 */
public class RestErrorResponseException extends ApiException {
    private static final long serialVersionUID = -1663844968054391701L;
    private String errorCode;
    private String errorMessage;

    /**
     * Initialization constructor.
     * @param   reason  The reason for throwing exception
     * @param   context The context of the API exception
     */
    public RestErrorResponseException(String reason, Context context) {
        super(reason, context);
    }


    /**
     * Getter for ErrorCode.
     * @return Returns the String
     */
    @JsonGetter("errorCode")
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Setter for ErrorCode.
     * @param errorCode Value for String
     */
    @JsonSetter("errorCode")
    private void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * Getter for ErrorMessage.
     * @return Returns the String
     */
    @JsonGetter("errorMessage")
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * Setter for ErrorMessage.
     * @param errorMessage Value for String
     */
    @JsonSetter("errorMessage")
    private void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
