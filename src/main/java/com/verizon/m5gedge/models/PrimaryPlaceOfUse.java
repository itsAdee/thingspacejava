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
 * This is a model class for PrimaryPlaceOfUse type.
 */
public class PrimaryPlaceOfUse {
    private List<CustomerName> customerName;
    private List<Address> address;

    /**
     * Default constructor.
     */
    public PrimaryPlaceOfUse() {
    }

    /**
     * Initialization constructor.
     * @param  customerName  List of CustomerName value for customerName.
     * @param  address  List of Address value for address.
     */
    public PrimaryPlaceOfUse(
            List<CustomerName> customerName,
            List<Address> address) {
        this.customerName = customerName;
        this.address = address;
    }

    /**
     * Getter for CustomerName.
     * @return Returns the List of CustomerName
     */
    @JsonGetter("customerName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomerName> getCustomerName() {
        return customerName;
    }

    /**
     * Setter for CustomerName.
     * @param customerName Value for List of CustomerName
     */
    @JsonSetter("customerName")
    public void setCustomerName(List<CustomerName> customerName) {
        this.customerName = customerName;
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
     * Converts this PrimaryPlaceOfUse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PrimaryPlaceOfUse [" + "customerName=" + customerName + ", address=" + address
                + "]";
    }

    /**
     * Builds a new {@link PrimaryPlaceOfUse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PrimaryPlaceOfUse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .customerName(getCustomerName())
                .address(getAddress());
        return builder;
    }

    /**
     * Class to build instances of {@link PrimaryPlaceOfUse}.
     */
    public static class Builder {
        private List<CustomerName> customerName;
        private List<Address> address;



        /**
         * Setter for customerName.
         * @param  customerName  List of CustomerName value for customerName.
         * @return Builder
         */
        public Builder customerName(List<CustomerName> customerName) {
            this.customerName = customerName;
            return this;
        }

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
         * Builds a new {@link PrimaryPlaceOfUse} object using the set fields.
         * @return {@link PrimaryPlaceOfUse}
         */
        public PrimaryPlaceOfUse build() {
            return new PrimaryPlaceOfUse(customerName, address);
        }
    }
}
