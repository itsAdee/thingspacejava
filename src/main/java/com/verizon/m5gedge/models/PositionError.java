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
 * This is a model class for PositionError type.
 */
public class PositionError {
    private String time;
    private String utcoffset;
    private String type;
    private String info;

    /**
     * Default constructor.
     */
    public PositionError() {
    }

    /**
     * Initialization constructor.
     * @param  time  String value for time.
     * @param  utcoffset  String value for utcoffset.
     * @param  type  String value for type.
     * @param  info  String value for info.
     */
    public PositionError(
            String time,
            String utcoffset,
            String type,
            String info) {
        this.time = time;
        this.utcoffset = utcoffset;
        this.type = type;
        this.info = info;
    }

    /**
     * Getter for Time.
     * Time location obtained.
     * @return Returns the String
     */
    @JsonGetter("time")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTime() {
        return time;
    }

    /**
     * Setter for Time.
     * Time location obtained.
     * @param time Value for String
     */
    @JsonSetter("time")
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * Getter for Utcoffset.
     * UTC offset of time.
     * @return Returns the String
     */
    @JsonGetter("utcoffset")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUtcoffset() {
        return utcoffset;
    }

    /**
     * Setter for Utcoffset.
     * UTC offset of time.
     * @param utcoffset Value for String
     */
    @JsonSetter("utcoffset")
    public void setUtcoffset(String utcoffset) {
        this.utcoffset = utcoffset;
    }

    /**
     * Getter for Type.
     * Error type returned from location server.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Setter for Type.
     * Error type returned from location server.
     * @param type Value for String
     */
    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for Info.
     * Additional information about the error.
     * @return Returns the String
     */
    @JsonGetter("info")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getInfo() {
        return info;
    }

    /**
     * Setter for Info.
     * Additional information about the error.
     * @param info Value for String
     */
    @JsonSetter("info")
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * Converts this PositionError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PositionError [" + "time=" + time + ", utcoffset=" + utcoffset + ", type=" + type
                + ", info=" + info + "]";
    }

    /**
     * Builds a new {@link PositionError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PositionError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .time(getTime())
                .utcoffset(getUtcoffset())
                .type(getType())
                .info(getInfo());
        return builder;
    }

    /**
     * Class to build instances of {@link PositionError}.
     */
    public static class Builder {
        private String time;
        private String utcoffset;
        private String type;
        private String info;



        /**
         * Setter for time.
         * @param  time  String value for time.
         * @return Builder
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        /**
         * Setter for utcoffset.
         * @param  utcoffset  String value for utcoffset.
         * @return Builder
         */
        public Builder utcoffset(String utcoffset) {
            this.utcoffset = utcoffset;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for info.
         * @param  info  String value for info.
         * @return Builder
         */
        public Builder info(String info) {
            this.info = info;
            return this;
        }

        /**
         * Builds a new {@link PositionError} object using the set fields.
         * @return {@link PositionError}
         */
        public PositionError build() {
            return new PositionError(time, utcoffset, type, info);
        }
    }
}
