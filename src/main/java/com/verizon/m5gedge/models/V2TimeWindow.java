/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for V2TimeWindow type.
 */
public class V2TimeWindow {
    private int startTime;
    private int endTime;

    /**
     * Default constructor.
     */
    public V2TimeWindow() {
    }

    /**
     * Initialization constructor.
     * @param  startTime  int value for startTime.
     * @param  endTime  int value for endTime.
     */
    public V2TimeWindow(
            int startTime,
            int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * Getter for StartTime.
     * Start hour in range [0..23], current hour &gt;= startTime.
     * @return Returns the int
     */
    @JsonGetter("startTime")
    public int getStartTime() {
        return startTime;
    }

    /**
     * Setter for StartTime.
     * Start hour in range [0..23], current hour &gt;= startTime.
     * @param startTime Value for int
     */
    @JsonSetter("startTime")
    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for EndTime.
     * End hour in range [1..24], current hour &lt; endTime.
     * @return Returns the int
     */
    @JsonGetter("endTime")
    public int getEndTime() {
        return endTime;
    }

    /**
     * Setter for EndTime.
     * End hour in range [1..24], current hour &lt; endTime.
     * @param endTime Value for int
     */
    @JsonSetter("endTime")
    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    /**
     * Converts this V2TimeWindow into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V2TimeWindow [" + "startTime=" + startTime + ", endTime=" + endTime + "]";
    }

    /**
     * Builds a new {@link V2TimeWindow.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V2TimeWindow.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(startTime, endTime);
        return builder;
    }

    /**
     * Class to build instances of {@link V2TimeWindow}.
     */
    public static class Builder {
        private int startTime;
        private int endTime;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  startTime  int value for startTime.
         * @param  endTime  int value for endTime.
         */
        public Builder(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        /**
         * Setter for startTime.
         * @param  startTime  int value for startTime.
         * @return Builder
         */
        public Builder startTime(int startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setter for endTime.
         * @param  endTime  int value for endTime.
         * @return Builder
         */
        public Builder endTime(int endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Builds a new {@link V2TimeWindow} object using the set fields.
         * @return {@link V2TimeWindow}
         */
        public V2TimeWindow build() {
            return new V2TimeWindow(startTime, endTime);
        }
    }
}
