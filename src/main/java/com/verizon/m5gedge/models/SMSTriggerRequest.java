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
 * This is a model class for SMSTriggerRequest type.
 */
public class SMSTriggerRequest {
    private String comparator;
    private String smsType;
    private Integer threshold;

    /**
     * Default constructor.
     */
    public SMSTriggerRequest() {
    }

    /**
     * Initialization constructor.
     * @param  comparator  String value for comparator.
     * @param  smsType  String value for smsType.
     * @param  threshold  Integer value for threshold.
     */
    public SMSTriggerRequest(
            String comparator,
            String smsType,
            Integer threshold) {
        this.comparator = comparator;
        this.smsType = smsType;
        this.threshold = threshold;
    }

    /**
     * Getter for Comparator.
     * @return Returns the String
     */
    @JsonGetter("comparator")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getComparator() {
        return comparator;
    }

    /**
     * Setter for Comparator.
     * @param comparator Value for String
     */
    @JsonSetter("comparator")
    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    /**
     * Getter for SmsType.
     * @return Returns the String
     */
    @JsonGetter("smsType")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSmsType() {
        return smsType;
    }

    /**
     * Setter for SmsType.
     * @param smsType Value for String
     */
    @JsonSetter("smsType")
    public void setSmsType(String smsType) {
        this.smsType = smsType;
    }

    /**
     * Getter for Threshold.
     * @return Returns the Integer
     */
    @JsonGetter("threshold")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * Setter for Threshold.
     * @param threshold Value for Integer
     */
    @JsonSetter("threshold")
    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    /**
     * Converts this SMSTriggerRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SMSTriggerRequest [" + "comparator=" + comparator + ", smsType=" + smsType
                + ", threshold=" + threshold + "]";
    }

    /**
     * Builds a new {@link SMSTriggerRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SMSTriggerRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .comparator(getComparator())
                .smsType(getSmsType())
                .threshold(getThreshold());
        return builder;
    }

    /**
     * Class to build instances of {@link SMSTriggerRequest}.
     */
    public static class Builder {
        private String comparator;
        private String smsType;
        private Integer threshold;



        /**
         * Setter for comparator.
         * @param  comparator  String value for comparator.
         * @return Builder
         */
        public Builder comparator(String comparator) {
            this.comparator = comparator;
            return this;
        }

        /**
         * Setter for smsType.
         * @param  smsType  String value for smsType.
         * @return Builder
         */
        public Builder smsType(String smsType) {
            this.smsType = smsType;
            return this;
        }

        /**
         * Setter for threshold.
         * @param  threshold  Integer value for threshold.
         * @return Builder
         */
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            return this;
        }

        /**
         * Builds a new {@link SMSTriggerRequest} object using the set fields.
         * @return {@link SMSTriggerRequest}
         */
        public SMSTriggerRequest build() {
            return new SMSTriggerRequest(comparator, smsType, threshold);
        }
    }
}
