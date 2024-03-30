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
 * This is a model class for Status type.
 */
public class Status {
    private Status1Enum status;

    /**
     * Default constructor.
     */
    public Status() {
    }

    /**
     * Initialization constructor.
     * @param  status  Status1Enum value for status.
     */
    public Status(
            Status1Enum status) {
        this.status = status;
    }

    /**
     * Getter for Status.
     * @return Returns the Status1Enum
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Status1Enum getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * @param status Value for Status1Enum
     */
    @JsonSetter("status")
    public void setStatus(Status1Enum status) {
        this.status = status;
    }

    /**
     * Converts this Status into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Status [" + "status=" + status + "]";
    }

    /**
     * Builds a new {@link Status.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Status.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus());
        return builder;
    }

    /**
     * Class to build instances of {@link Status}.
     */
    public static class Builder {
        private Status1Enum status;



        /**
         * Setter for status.
         * @param  status  Status1Enum value for status.
         * @return Builder
         */
        public Builder status(Status1Enum status) {
            this.status = status;
            return this;
        }

        /**
         * Builds a new {@link Status} object using the set fields.
         * @return {@link Status}
         */
        public Status build() {
            return new Status(status);
        }
    }
}