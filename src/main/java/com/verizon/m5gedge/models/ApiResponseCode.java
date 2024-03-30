/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ApiResponseCode type.
 */
public class ApiResponseCode {
    private ResponseCodeEnum responseCode;
    private String message;

    /**
     * Default constructor.
     */
    public ApiResponseCode() {
    }

    /**
     * Initialization constructor.
     * @param  responseCode  ResponseCodeEnum value for responseCode.
     * @param  message  String value for message.
     */
    public ApiResponseCode(
            ResponseCodeEnum responseCode,
            String message) {
        this.responseCode = responseCode;
        this.message = message;
    }

    /**
     * Getter for ResponseCode.
     * Possible response codes.
     * @return Returns the ResponseCodeEnum
     */
    @JsonGetter("responseCode")
    public ResponseCodeEnum getResponseCode() {
        return responseCode;
    }

    /**
     * Setter for ResponseCode.
     * Possible response codes.
     * @param responseCode Value for ResponseCodeEnum
     */
    @JsonSetter("responseCode")
    public void setResponseCode(ResponseCodeEnum responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Getter for Message.
     * More details about the responseCode received.
     * @return Returns the String
     */
    @JsonGetter("message")
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * More details about the responseCode received.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Converts this ApiResponseCode into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ApiResponseCode [" + "responseCode=" + responseCode + ", message=" + message + "]";
    }

    /**
     * Builds a new {@link ApiResponseCode.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ApiResponseCode.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(responseCode, message);
        return builder;
    }

    /**
     * Class to build instances of {@link ApiResponseCode}.
     */
    public static class Builder {
        private ResponseCodeEnum responseCode;
        private String message;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  responseCode  ResponseCodeEnum value for responseCode.
         * @param  message  String value for message.
         */
        public Builder(ResponseCodeEnum responseCode, String message) {
            this.responseCode = responseCode;
            this.message = message;
        }

        /**
         * Setter for responseCode.
         * @param  responseCode  ResponseCodeEnum value for responseCode.
         * @return Builder
         */
        public Builder responseCode(ResponseCodeEnum responseCode) {
            this.responseCode = responseCode;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Builds a new {@link ApiResponseCode} object using the set fields.
         * @return {@link ApiResponseCode}
         */
        public ApiResponseCode build() {
            return new ApiResponseCode(responseCode, message);
        }
    }
}