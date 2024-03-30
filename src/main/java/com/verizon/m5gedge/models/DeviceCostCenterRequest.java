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
 * This is a model class for DeviceCostCenterRequest type.
 */
public class DeviceCostCenterRequest {
    private String accountName;
    private String costCenter;
    private List<CustomFields> customFields;
    private List<AccountDeviceList> devices;
    private String groupName;
    private Object primaryPlaceOfUse;
    private Boolean removeCostCenter;
    private String servicePlan;

    /**
     * Default constructor.
     */
    public DeviceCostCenterRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountName  String value for accountName.
     * @param  costCenter  String value for costCenter.
     * @param  customFields  List of CustomFields value for customFields.
     * @param  devices  List of AccountDeviceList value for devices.
     * @param  groupName  String value for groupName.
     * @param  primaryPlaceOfUse  Object value for primaryPlaceOfUse.
     * @param  removeCostCenter  Boolean value for removeCostCenter.
     * @param  servicePlan  String value for servicePlan.
     */
    public DeviceCostCenterRequest(
            String accountName,
            String costCenter,
            List<CustomFields> customFields,
            List<AccountDeviceList> devices,
            String groupName,
            Object primaryPlaceOfUse,
            Boolean removeCostCenter,
            String servicePlan) {
        this.accountName = accountName;
        this.costCenter = costCenter;
        this.customFields = customFields;
        this.devices = devices;
        this.groupName = groupName;
        this.primaryPlaceOfUse = primaryPlaceOfUse;
        this.removeCostCenter = removeCostCenter;
        this.servicePlan = servicePlan;
    }

    /**
     * Getter for AccountName.
     * The name of a billing account.
     * @return Returns the String
     */
    @JsonGetter("accountName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAccountName() {
        return accountName;
    }

    /**
     * Setter for AccountName.
     * The name of a billing account.
     * @param accountName Value for String
     */
    @JsonSetter("accountName")
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * Getter for CostCenter.
     * The new cost center code. Valid values are any string of up to 36 alphanumeric characters,
     * space, dash, exclamation point, and pound sign.
     * @return Returns the String
     */
    @JsonGetter("costCenter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCostCenter() {
        return costCenter;
    }

    /**
     * Setter for CostCenter.
     * The new cost center code. Valid values are any string of up to 36 alphanumeric characters,
     * space, dash, exclamation point, and pound sign.
     * @param costCenter Value for String
     */
    @JsonSetter("costCenter")
    public void setCostCenter(String costCenter) {
        this.costCenter = costCenter;
    }

    /**
     * Getter for CustomFields.
     * Custom field names and values, if you want to only include devices that have matching values.
     * @return Returns the List of CustomFields
     */
    @JsonGetter("customFields")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<CustomFields> getCustomFields() {
        return customFields;
    }

    /**
     * Setter for CustomFields.
     * Custom field names and values, if you want to only include devices that have matching values.
     * @param customFields Value for List of CustomFields
     */
    @JsonSetter("customFields")
    public void setCustomFields(List<CustomFields> customFields) {
        this.customFields = customFields;
    }

    /**
     * Getter for Devices.
     * A list of the devices that you want to change, specified by device identifier. Do not include
     * accountName, groupName, customFields, or servicePlan if you use this parameter.
     * @return Returns the List of AccountDeviceList
     */
    @JsonGetter("devices")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<AccountDeviceList> getDevices() {
        return devices;
    }

    /**
     * Setter for Devices.
     * A list of the devices that you want to change, specified by device identifier. Do not include
     * accountName, groupName, customFields, or servicePlan if you use this parameter.
     * @param devices Value for List of AccountDeviceList
     */
    @JsonSetter("devices")
    public void setDevices(List<AccountDeviceList> devices) {
        this.devices = devices;
    }

    /**
     * Getter for GroupName.
     * The name of a device group, if you want to only include devices in that group.
     * @return Returns the String
     */
    @JsonGetter("groupName")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getGroupName() {
        return groupName;
    }

    /**
     * Setter for GroupName.
     * The name of a device group, if you want to only include devices in that group.
     * @param groupName Value for String
     */
    @JsonSetter("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * Getter for PrimaryPlaceOfUse.
     * The customer name and the address of the device's primary place of use. These values are
     * applied to all devices in the request.The Primary Place of Use location may affect taxation
     * or have other legal implications. You may want to speak with legal and/or financial advisers
     * before entering values for these fields.
     * @return Returns the Object
     */
    @JsonGetter("primaryPlaceOfUse")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getPrimaryPlaceOfUse() {
        return primaryPlaceOfUse;
    }

    /**
     * Setter for PrimaryPlaceOfUse.
     * The customer name and the address of the device's primary place of use. These values are
     * applied to all devices in the request.The Primary Place of Use location may affect taxation
     * or have other legal implications. You may want to speak with legal and/or financial advisers
     * before entering values for these fields.
     * @param primaryPlaceOfUse Value for Object
     */
    @JsonSetter("primaryPlaceOfUse")
    public void setPrimaryPlaceOfUse(Object primaryPlaceOfUse) {
        this.primaryPlaceOfUse = primaryPlaceOfUse;
    }

    /**
     * Getter for RemoveCostCenter.
     * Set to true to remove the cost center code value. This flag takes precedence over a new
     * costCenter value. If this flag is true and costCenter has a value, the cost center code is
     * removed. Do not include this parameter, or set it to false to change the costCenter value.
     * @return Returns the Boolean
     */
    @JsonGetter("removeCostCenter")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getRemoveCostCenter() {
        return removeCostCenter;
    }

    /**
     * Setter for RemoveCostCenter.
     * Set to true to remove the cost center code value. This flag takes precedence over a new
     * costCenter value. If this flag is true and costCenter has a value, the cost center code is
     * removed. Do not include this parameter, or set it to false to change the costCenter value.
     * @param removeCostCenter Value for Boolean
     */
    @JsonSetter("removeCostCenter")
    public void setRemoveCostCenter(Boolean removeCostCenter) {
        this.removeCostCenter = removeCostCenter;
    }

    /**
     * Getter for ServicePlan.
     * The name of a service plan, if you want to only include devices that have that service plan.
     * @return Returns the String
     */
    @JsonGetter("servicePlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServicePlan() {
        return servicePlan;
    }

    /**
     * Setter for ServicePlan.
     * The name of a service plan, if you want to only include devices that have that service plan.
     * @param servicePlan Value for String
     */
    @JsonSetter("servicePlan")
    public void setServicePlan(String servicePlan) {
        this.servicePlan = servicePlan;
    }

    /**
     * Converts this DeviceCostCenterRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceCostCenterRequest [" + "accountName=" + accountName + ", costCenter="
                + costCenter + ", customFields=" + customFields + ", devices=" + devices
                + ", groupName=" + groupName + ", primaryPlaceOfUse=" + primaryPlaceOfUse
                + ", removeCostCenter=" + removeCostCenter + ", servicePlan=" + servicePlan + "]";
    }

    /**
     * Builds a new {@link DeviceCostCenterRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceCostCenterRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .accountName(getAccountName())
                .costCenter(getCostCenter())
                .customFields(getCustomFields())
                .devices(getDevices())
                .groupName(getGroupName())
                .primaryPlaceOfUse(getPrimaryPlaceOfUse())
                .removeCostCenter(getRemoveCostCenter())
                .servicePlan(getServicePlan());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceCostCenterRequest}.
     */
    public static class Builder {
        private String accountName;
        private String costCenter;
        private List<CustomFields> customFields;
        private List<AccountDeviceList> devices;
        private String groupName;
        private Object primaryPlaceOfUse;
        private Boolean removeCostCenter;
        private String servicePlan;



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
         * Setter for costCenter.
         * @param  costCenter  String value for costCenter.
         * @return Builder
         */
        public Builder costCenter(String costCenter) {
            this.costCenter = costCenter;
            return this;
        }

        /**
         * Setter for customFields.
         * @param  customFields  List of CustomFields value for customFields.
         * @return Builder
         */
        public Builder customFields(List<CustomFields> customFields) {
            this.customFields = customFields;
            return this;
        }

        /**
         * Setter for devices.
         * @param  devices  List of AccountDeviceList value for devices.
         * @return Builder
         */
        public Builder devices(List<AccountDeviceList> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * Setter for groupName.
         * @param  groupName  String value for groupName.
         * @return Builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Setter for primaryPlaceOfUse.
         * @param  primaryPlaceOfUse  Object value for primaryPlaceOfUse.
         * @return Builder
         */
        public Builder primaryPlaceOfUse(Object primaryPlaceOfUse) {
            this.primaryPlaceOfUse = primaryPlaceOfUse;
            return this;
        }

        /**
         * Setter for removeCostCenter.
         * @param  removeCostCenter  Boolean value for removeCostCenter.
         * @return Builder
         */
        public Builder removeCostCenter(Boolean removeCostCenter) {
            this.removeCostCenter = removeCostCenter;
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
         * Builds a new {@link DeviceCostCenterRequest} object using the set fields.
         * @return {@link DeviceCostCenterRequest}
         */
        public DeviceCostCenterRequest build() {
            return new DeviceCostCenterRequest(accountName, costCenter, customFields, devices,
                    groupName, primaryPlaceOfUse, removeCostCenter, servicePlan);
        }
    }
}
