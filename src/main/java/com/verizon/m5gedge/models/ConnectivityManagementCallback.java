/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for ConnectivityManagementCallback type.
 */
public class ConnectivityManagementCallback {
    private String accountName;
    private String password;
    private String serviceName;
    private String url;
    private String username;

    /**
     * Default constructor.
     */
    public ConnectivityManagementCallback() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  password  String value for password.
     * @param  serviceName  String value for serviceName.
     * @param  url  String value for url.
     * @param  username  String value for username.
     */
    public ConnectivityManagementCallback(
            String accountName,
            String password,
            String serviceName,
            String url,
            String username) {
        this.accountName = accountName;
        this.password = password;
        this.serviceName = serviceName;
        this.url = url;
        this.username = username;
    }

    /**
     * Getter for AccountName.
     * The name of the billing account for which callback messages will be sent.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of the billing account for which callback messages will be sent.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for Password.
     * The password defined when a URL was registered for the callback service, or an empty string
     * if no password was defined.
     * @return Returns the String
     */
    @JsonGetter("password")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPassword() {
        return password;
    }

    /**
     * Setter for Password.
     * The password defined when a URL was registered for the callback service, or an empty string
     * if no password was defined.
     * @param password Value for String
     */
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter for ServiceName.
     * The name of the callback service, which identifies the type and format of messages that will
     * be sent to the registered URL.
     * @return Returns the String
     */
    @JsonGetter("serviceName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Setter for ServiceName.
     * The name of the callback service, which identifies the type and format of messages that will
     * be sent to the registered URL.
     * @param serviceName Value for String
     */
    @JsonSetter("serviceName")
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * Getter for Url.
     * The address of the callback listening service where the ThingSpace Platform will send
     * callback messages for the service type.
     * @return Returns the String
     */
    @JsonGetter("url")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUrl() {
        return url;
    }

    /**
     * Setter for Url.
     * The address of the callback listening service where the ThingSpace Platform will send
     * callback messages for the service type.
     * @param url Value for String
     */
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for Username.
     * The username defined when a URL was registered for the callback service, or an empty string
     * if no username was defined.
     * @return Returns the String
     */
    @JsonGetter("username")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUsername() {
        return username;
    }

    /**
     * Setter for Username.
     * The username defined when a URL was registered for the callback service, or an empty string
     * if no username was defined.
     * @param username Value for String
     */
    @JsonSetter("username")
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Converts this ConnectivityManagementCallback into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ConnectivityManagementCallback [" + "accountName=" + accountName + ", password="
                + password + ", serviceName=" + serviceName + ", url=" + url + ", username="
                + username + "]";
    }

    /**
     * Builds a new {@link ConnectivityManagementCallback.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ConnectivityManagementCallback.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .password(getPassword())
                .serviceName(getServiceName())
                .url(getUrl())
                .username(getUsername());
        return builder;
    }

    /**
     * Class to build instances of {@link ConnectivityManagementCallback}.
     */
    public static class Builder {
        private String accountName;
        private String password;
        private String serviceName;
        private String url;
        private String username;



        /**
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
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
         * Setter for serviceName.
         * @param  serviceName  String value for serviceName.
         * @return Builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * Setter for url.
         * @param  url  String value for url.
         * @return Builder
         */
        public Builder url(String url) {
            this.url = url;
            return this;
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
         * Builds a new {@link ConnectivityManagementCallback} object using the set fields.
         * @return {@link ConnectivityManagementCallback}
         */
        public ConnectivityManagementCallback build() {
            return new ConnectivityManagementCallback(accountName, password, serviceName, url,
                    username);
        }
    }
}