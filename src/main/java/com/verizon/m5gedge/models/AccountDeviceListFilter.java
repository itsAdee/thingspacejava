/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for AccountDeviceListFilter type.
 */
public class AccountDeviceListFilter {
    private List<DeviceIdSearch> deviceIdentifierFilters;

    /**
     * Default constructor.
     */
    public AccountDeviceListFilter() {
    }

    /**
     * Initialization constructor.
     * @param  deviceIdentifierFilters  List of DeviceIdSearch value for deviceIdentifierFilters.
     */
    public AccountDeviceListFilter(
            List<DeviceIdSearch> deviceIdentifierFilters) {
        this.deviceIdentifierFilters = deviceIdentifierFilters;
    }

    /**
     * Getter for DeviceIdentifierFilters.
     * Specify the kind of the device identifier, the type of match, and the string that you want to
     * match.
     * @return Returns the List of DeviceIdSearch
     */
    @JsonGetter("deviceIdentifierFilters")
    public List<DeviceIdSearch> getDeviceIdentifierFilters() {
        return deviceIdentifierFilters;
    }

    /**
     * Setter for DeviceIdentifierFilters.
     * Specify the kind of the device identifier, the type of match, and the string that you want to
     * match.
     * @param deviceIdentifierFilters Value for List of DeviceIdSearch
     */
    @JsonSetter("deviceIdentifierFilters")
    public void setDeviceIdentifierFilters(List<DeviceIdSearch> deviceIdentifierFilters) {
        this.deviceIdentifierFilters = deviceIdentifierFilters;
    }

    /**
     * Converts this AccountDeviceListFilter into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountDeviceListFilter [" + "deviceIdentifierFilters=" + deviceIdentifierFilters
                + "]";
    }

    /**
     * Builds a new {@link AccountDeviceListFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountDeviceListFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(deviceIdentifierFilters);
        return builder;
    }

    /**
     * Class to build instances of {@link AccountDeviceListFilter}.
     */
    public static class Builder {
        private List<DeviceIdSearch> deviceIdentifierFilters;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  deviceIdentifierFilters  List of DeviceIdSearch value for
         *         deviceIdentifierFilters.
         */
        public Builder(List<DeviceIdSearch> deviceIdentifierFilters) {
            this.deviceIdentifierFilters = deviceIdentifierFilters;
        }

        /**
         * Setter for deviceIdentifierFilters.
         * @param  deviceIdentifierFilters  List of DeviceIdSearch value for
         *         deviceIdentifierFilters.
         * @return Builder
         */
        public Builder deviceIdentifierFilters(List<DeviceIdSearch> deviceIdentifierFilters) {
            this.deviceIdentifierFilters = deviceIdentifierFilters;
            return this;
        }

        /**
         * Builds a new {@link AccountDeviceListFilter} object using the set fields.
         * @return {@link AccountDeviceListFilter}
         */
        public AccountDeviceListFilter build() {
            return new AccountDeviceListFilter(deviceIdentifierFilters);
        }
    }
}
