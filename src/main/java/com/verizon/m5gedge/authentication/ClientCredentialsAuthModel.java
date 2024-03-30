/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.authentication;

import com.verizon.m5gedge.models.OauthScopeEnum;
import com.verizon.m5gedge.models.OauthToken;
import java.util.List;

/**
 * A data class for OAuth 2 Client Credentials Grant credentials.
 */
public class ClientCredentialsAuthModel {
    private String oauthClientId;
    private String oauthClientSecret;
    private OauthToken oauthToken;
    private List<OauthScopeEnum> oauthScopes;

    /**
     * A Constructor for ClientCredentialsAuthModel.
     */
    private ClientCredentialsAuthModel(String oauthClientId, String oauthClientSecret,
            OauthToken oauthToken, List<OauthScopeEnum> oauthScopes) {
        this.oauthClientId = oauthClientId;
        this.oauthClientSecret = oauthClientSecret;
        this.oauthToken = oauthToken;
        this.oauthScopes = oauthScopes;
    }

    /**
     * Getter for oauthClientId.
     * @return oauthClientId The value of OAuthClientId.
     */
    public String getOauthClientId() {
        return this.oauthClientId;
    }

    /**
     * Getter for oauthClientSecret.
     * @return oauthClientSecret The value of OAuthClientSecret.
     */
    public String getOauthClientSecret() {
        return this.oauthClientSecret;
    }

    /**
     * Getter for oauthToken.
     * @return oauthToken The value of OAuthToken.
     */
    public OauthToken getOauthToken() {
        return this.oauthToken;
    }

    /**
     * Getter for oauthScopes.
     * @return oauthScopes The value of OAuthScopes.
     */
    public List<OauthScopeEnum> getOauthScopes() {
        return this.oauthScopes;
    }

    /**
     * Builds a new {@link ClientCredentialsAuthModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link ClientCredentialsAuthModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getOauthClientId(), getOauthClientSecret())
            .oauthToken(getOauthToken())
            .oauthScopes(getOauthScopes());
    }

    /**
     * A Builder class for OAuth 2 Client Credentials Grant credentials.
     */
    public static class Builder {
        private String oauthClientId;
        private String oauthClientSecret;
        private OauthToken oauthToken;
        private List<OauthScopeEnum> oauthScopes;

        /**
         * The constructor with required auth credentials.
         * @param oauthClientId The value of OauthClientId.
         * @param oauthClientSecret The value of OauthClientSecret.
         */
        public Builder(String oauthClientId, String oauthClientSecret) {
            if (oauthClientId == null) {
                throw new NullPointerException("OauthClientId cannot be null.");
            }

            if (oauthClientSecret == null) {
                throw new NullPointerException("OauthClientSecret cannot be null.");
            }

            this.oauthClientId = oauthClientId;
            this.oauthClientSecret = oauthClientSecret;
        }

        /**
         * Setter for oauthClientId.
         * @param oauthClientId The value of OAuthClientId.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthClientId(String oauthClientId) {
            if (oauthClientId == null) {
                throw new NullPointerException("OauthClientId cannot be null.");
            }

            this.oauthClientId = oauthClientId;
            return this;
        }

        /**
         * Setter for oauthClientSecret.
         * @param oauthClientSecret The value of OAuthClientSecret.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthClientSecret(String oauthClientSecret) {
            if (oauthClientSecret == null) {
                throw new NullPointerException("OauthClientSecret cannot be null.");
            }

            this.oauthClientSecret = oauthClientSecret;
            return this;
        }

        /**
         * Setter for oauthToken.
         * @param oauthToken The value of OAuthToken.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthToken(OauthToken oauthToken) {
            this.oauthToken = oauthToken;
            return this;
        }

        /**
         * Setter for oauthScopes.
         * @param oauthScopes The value of OAuthScopes.
         * @return Builder The current instance of Builder.
         */
        public Builder oauthScopes(List<OauthScopeEnum> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        /**
         * Builds the instance of ClientCredentialsAuthModel using the provided credentials.
         * @return The instance of ClientCredentialsAuthModel.
         */
        public ClientCredentialsAuthModel build() {
            return new ClientCredentialsAuthModel(oauthClientId, oauthClientSecret, oauthToken,
                    oauthScopes);
        }
    }
}