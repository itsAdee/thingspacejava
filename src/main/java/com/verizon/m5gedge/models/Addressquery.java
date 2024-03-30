/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for Addressquery type.
 */
public class Addressquery {
    private List<Address> address;

    /**
     * Default constructor.
     */
    public Addressquery() {
    }

    /**
     * Initialization constructor.
     * @param  address  List of Address value for address.
     */
    public Addressquery(
            List<Address> address) {
        this.address = address;
    }

    /**
     * Getter for Address.
     * @return Returns the List of Address
     */
    @JsonGetter("address")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Address> getAddress() {
        return address;
    }

    /**
     * Setter for Address.
     * @param address Value for List of Address
     */
    @JsonSetter("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * Converts this Addressquery into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Addressquery [" + "address=" + address + "]";
    }

    /**
     * Builds a new {@link Addressquery.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Addressquery.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link Addressquery}.
     */
    public static class Builder {
        private List<Address> address;



        /**
         * Setter for address.
         * @param  address  List of Address value for address.
         * @return Builder
         */
        public Builder address(List<Address> address) {
            this.address = address;
            return this;
        }

        /**
         * Builds a new {@link Addressquery} object using the set fields.
         * @return {@link Addressquery}
         */
        public Addressquery build() {
            return new Addressquery(address);
        }
    }
}