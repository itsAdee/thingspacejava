/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for LogInRequest type.
 */
public class LogInRequest {
    private String username;
    private String password;

    /**
     * Default constructor.
     */
    public LogInRequest() {
    }

    /**
     * Initialization constructor.
     * @param  username  String value for username.
     * @param  password  String value for password.
     */
    public LogInRequest(
            String username,
            String password) {
        this.username = username;
        this.password = password;
    }

    /**
     * Getter for Username.
     * The username for authentication.
     * @return Returns the String
     */
    @JsonGetter("username")
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * The username for authentication.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Getter for Password.
     * The password for authentication.
     * @return Returns the String
     */
    @JsonGetter("password")
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * The password for authentication.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Converts this LogInRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LogInRequest [" + "username=" + username + ", password=" + password + "]";
    }

    /**
     * Builds a new {@link LogInRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LogInRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(username, password);
        return builder;
    }

    /**
     * Class to build instances of {@link LogInRequest}.
     */
    public static class Builder {
        private String username;
        private String password;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  username  String value for username.
         * @param  password  String value for password.
         */
        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        /**
         * Setter for username.
         * @param  username  String value for username.
         * @return Builder
         */
        public Builder username(String username) {
            this.username = username;
            return this;
        }

        /**
         * Setter for password.
         * @param  password  String value for password.
         * @return Builder
         */
        public Builder password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Builds a new {@link LogInRequest} object using the set fields.
         * @return {@link LogInRequest}
         */
        public LogInRequest build() {
            return new LogInRequest(username, password);
        }
    }
}
