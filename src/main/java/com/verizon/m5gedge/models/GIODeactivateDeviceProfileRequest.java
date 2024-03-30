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
 * This is a model class for GIODeactivateDeviceProfileRequest type.
 */
public class GIODeactivateDeviceProfileRequest {
    private List<GIODeviceList> devices;
    private String accountName;
    private String servicePlan;
    private Boolean etfWaiver;
    private String reasonCode;

    /**
     * Default constructor.
     */
    public GIODeactivateDeviceProfileRequest() {
        etfWaiver = false;
    }

    /**
     * Initialization constructor.
     * @param  devices  List of GIODeviceList value for devices.
     * @param  accountName  String value for accountName.
     * @param  servicePlan  String value for servicePlan.
     * @param  etfWaiver  Boolean value for etfWaiver.
     * @param  reasonCode  String value for reasonCode.
     */
    public GIODeactivateDeviceProfileRequest(
            List<GIODeviceList> devices,
            String accountName,
            String servicePlan,
            Boolean etfWaiver,
            String reasonCode) {
        this.devices = devices;
        this.accountName = accountName;
        this.servicePlan = servicePlan;
        this.etfWaiver = etfWaiver;
        this.reasonCode = reasonCode;
    }

    /**
     * Getter for Devices.
     * @return Returns the List of GIODeviceList
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<GIODeviceList> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * @param devices Value for List of GIODeviceList
     */
    @JsonSetter("devices")
    public void setDevices(List<GIODeviceList> devices) {
        this.devices = devices;
    }

    /**
     * Getter for AccountName.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for ServicePlan.
     * @return Returns the String
     */
    @JsonGetter("servicePlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServicePlan() {
        return servicePlan;
    }

    /**
     * Setter for ServicePlan.
     * @param servicePlan Value for String
     */
    @JsonSetter("servicePlan")
    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    /**
     * Getter for EtfWaiver.
     * @return Returns the Boolean
     */
    @JsonGetter("etfWaiver")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEtfWaiver() {
        return etfWaiver;
    }

    /**
     * Setter for EtfWaiver.
     * @param etfWaiver Value for Boolean
     */
    @JsonSetter("etfWaiver")
    public void setEtfWaiver(Boolean etfWaiver) {
        this.etfWaiver = etfWaiver;
    }

    /**
     * Getter for ReasonCode.
     * @return Returns the String
     */
    @JsonGetter("reasonCode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Setter for ReasonCode.
     * @param reasonCode Value for String
     */
    @JsonSetter("reasonCode")
    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * Converts this GIODeactivateDeviceProfileRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GIODeactivateDeviceProfileRequest [" + "devices=" + devices + ", accountName="
                + accountName + ", servicePlan=" + servicePlan + ", etfWaiver=" + etfWaiver
                + ", reasonCode=" + reasonCode + "]";
    }

    /**
     * Builds a new {@link GIODeactivateDeviceProfileRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GIODeactivateDeviceProfileRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .devices(getDevices())
                .accountName(getAccountName())
                .servicePlan(getServicePlan())
                .etfWaiver(getEtfWaiver())
                .reasonCode(getReasonCode());
        return builder;
    }

    /**
     * Class to build instances of {@link GIODeactivateDeviceProfileRequest}.
     */
    public static class Builder {
        private List<GIODeviceList> devices;
        private String accountName;
        private String servicePlan;
        private Boolean etfWaiver = false;
        private String reasonCode;



        /**
         * Setter for devices.
         * @param  devices  List of GIODeviceList value for devices.
         * @return Builder
         */
        public Builder devices(List<GIODeviceList> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * Setter for accountName.
         * @param  accountName  String value for accountName.
         * @return Builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * Setter for servicePlan.
         * @param  servicePlan  String value for servicePlan.
         * @return Builder
         */
        public Builder servicePlan(String servicePlan) {
            this.servicePlan = servicePlan;
            return this;
        }

        /**
         * Setter for etfWaiver.
         * @param  etfWaiver  Boolean value for etfWaiver.
         * @return Builder
         */
        public Builder etfWaiver(Boolean etfWaiver) {
            this.etfWaiver = etfWaiver;
            return this;
        }

        /**
         * Setter for reasonCode.
         * @param  reasonCode  String value for reasonCode.
         * @return Builder
         */
        public Builder reasonCode(String reasonCode) {
            this.reasonCode = reasonCode;
            return this;
        }

        /**
         * Builds a new {@link GIODeactivateDeviceProfileRequest} object using the set fields.
         * @return {@link GIODeactivateDeviceProfileRequest}
         */
        public GIODeactivateDeviceProfileRequest build() {
            return new GIODeactivateDeviceProfileRequest(devices, accountName, servicePlan,
                    etfWaiver, reasonCode);
        }
    }
}