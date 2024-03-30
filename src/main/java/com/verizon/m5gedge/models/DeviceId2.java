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
 * This is a model class for DeviceId2 type.
 */
public class DeviceId2 {
    private String id;
    private String kind;

    /**
     * Default constructor.
     */
    public DeviceId2() {
    }

    /**
     * Initialization constructor.
     * @param  id  String value for id.
     * @param  kind  String value for kind.
     */
    public DeviceId2(
            String id,
            String kind) {
        this.id = id;
        this.kind = kind;
    }

    /**
     * Getter for Id.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Converts this DeviceId2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceId2 [" + "id=" + id + ", kind=" + kind + "]";
    }

    /**
     * Builds a new {@link DeviceId2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceId2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .kind(getKind());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceId2}.
     */
    public static class Builder {
        private String id;
        private String kind;



        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Builds a new {@link DeviceId2} object using the set fields.
         * @return {@link DeviceId2}
         */
        public DeviceId2 build() {
            return new DeviceId2(id, kind);
        }
    }
}
