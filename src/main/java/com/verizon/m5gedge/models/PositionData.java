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
 * This is a model class for PositionData type.
 */
public class PositionData {
    private String time;
    private String utcoffset;
    private String x;
    private String y;
    private String radius;
    private Boolean qos;

    /**
     * Default constructor.
     */
    public PositionData() {
    }

    /**
     * Initialization constructor.
     * @param  time  String value for time.
     * @param  utcoffset  String value for utcoffset.
     * @param  x  String value for x.
     * @param  y  String value for y.
     * @param  radius  String value for radius.
     * @param  qos  Boolean value for qos.
     */
    public PositionData(
            String time,
            String utcoffset,
            String x,
            String y,
            String radius,
            Boolean qos) {
        this.time = time;
        this.utcoffset = utcoffset;
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.qos = qos;
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
     * Getter for X.
     * X coordinate of location.
     * @return Returns the String
     */
    @JsonGetter("x")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getX() {
        return x;
    }

    /**
     * Setter for X.
     * X coordinate of location.
     * @param x Value for String
     */
    @JsonSetter("x")
    public void setX(String x) {
        this.x = x;
    }

    /**
     * Getter for Y.
     * Y coordinate of location.
     * @return Returns the String
     */
    @JsonGetter("y")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getY() {
        return y;
    }

    /**
     * Setter for Y.
     * Y coordinate of location.
     * @param y Value for String
     */
    @JsonSetter("y")
    public void setY(String y) {
        this.y = y;
    }

    /**
     * Getter for Radius.
     * Radius of the location in meters.
     * @return Returns the String
     */
    @JsonGetter("radius")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRadius() {
        return radius;
    }

    /**
     * Setter for Radius.
     * Radius of the location in meters.
     * @param radius Value for String
     */
    @JsonSetter("radius")
    public void setRadius(String radius) {
        this.radius = radius;
    }

    /**
     * Getter for Qos.
     * Whether requested accurary is met or not.
     * @return Returns the Boolean
     */
    @JsonGetter("qos")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getQos() {
        return qos;
    }

    /**
     * Setter for Qos.
     * Whether requested accurary is met or not.
     * @param qos Value for Boolean
     */
    @JsonSetter("qos")
    public void setQos(Boolean qos) {
        this.qos = qos;
    }

    /**
     * Converts this PositionData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PositionData [" + "time=" + time + ", utcoffset=" + utcoffset + ", x=" + x + ", y="
                + y + ", radius=" + radius + ", qos=" + qos + "]";
    }

    /**
     * Builds a new {@link PositionData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PositionData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .time(getTime())
                .utcoffset(getUtcoffset())
                .x(getX())
                .y(getY())
                .radius(getRadius())
                .qos(getQos());
        return builder;
    }

    /**
     * Class to build instances of {@link PositionData}.
     */
    public static class Builder {
        private String time;
        private String utcoffset;
        private String x;
        private String y;
        private String radius;
        private Boolean qos;



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
         * Setter for x.
         * @param  x  String value for x.
         * @return Builder
         */
        public Builder x(String x) {
            this.x = x;
            return this;
        }

        /**
         * Setter for y.
         * @param  y  String value for y.
         * @return Builder
         */
        public Builder y(String y) {
            this.y = y;
            return this;
        }

        /**
         * Setter for radius.
         * @param  radius  String value for radius.
         * @return Builder
         */
        public Builder radius(String radius) {
            this.radius = radius;
            return this;
        }

        /**
         * Setter for qos.
         * @param  qos  Boolean value for qos.
         * @return Builder
         */
        public Builder qos(Boolean qos) {
            this.qos = qos;
            return this;
        }

        /**
         * Builds a new {@link PositionData} object using the set fields.
         * @return {@link PositionData}
         */
        public PositionData build() {
            return new PositionData(time, utcoffset, x, y, radius, qos);
        }
    }
}