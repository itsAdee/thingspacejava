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
 * This is a model class for DeviceAggregateUsageListRequest type.
 */
public class DeviceAggregateUsageListRequest {
    private String startTime;
    private String endTime;
    private List<DeviceId> deviceIds;
    private String accountName;
    private String groupName;
    private List<Label> label;

    /**
     * Default constructor.
     */
    public DeviceAggregateUsageListRequest() {
    }

    /**
     * Initialization constructor.
     * @param  startTime  String value for startTime.
     * @param  endTime  String value for endTime.
     * @param  deviceIds  List of DeviceId value for deviceIds.
     * @param  accountName  String value for accountName.
     * @param  groupName  String value for groupName.
     * @param  label  List of Label value for label.
     */
    public DeviceAggregateUsageListRequest(
            String startTime,
            String endTime,
            List<DeviceId> deviceIds,
            String accountName,
            String groupName,
            List<Label> label) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.deviceIds = deviceIds;
        this.accountName = accountName;
        this.groupName = groupName;
        this.label = label;
    }

    /**
     * Getter for StartTime.
     * The beginning of the reporting period. The startTime cannot be more than 6 months before the
     * current date.
     * @return Returns the String
     */
    @JsonGetter("startTime")
    public String getStartTime() {
        return startTime;
    }

    /**
     * Setter for StartTime.
     * The beginning of the reporting period. The startTime cannot be more than 6 months before the
     * current date.
     * @param startTime Value for String
     */
    @JsonSetter("startTime")
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Getter for EndTime.
     * The end of the reporting period. The endTime date must be within on month of the startTime
     * date.
     * @return Returns the String
     */
    @JsonGetter("endTime")
    public String getEndTime() {
        return endTime;
    }

    /**
     * Setter for EndTime.
     * The end of the reporting period. The endTime date must be within on month of the startTime
     * date.
     * @param endTime Value for String
     */
    @JsonSetter("endTime")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * Getter for DeviceIds.
     * One or more devices for which you want aggregate data, specified by device ID.
     * @return Returns the List of DeviceId
     */
    @JsonGetter("deviceIds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<DeviceId> getDeviceIds() {
        return deviceIds;
    }

    /**
     * Setter for DeviceIds.
     * One or more devices for which you want aggregate data, specified by device ID.
     * @param deviceIds Value for List of DeviceId
     */
    @JsonSetter("deviceIds")
    public void setDeviceIds(List<DeviceId> deviceIds) {
        this.deviceIds = deviceIds;
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
     * Getter for Label.
     * @return Returns the List of Label
     */
    @JsonGetter("label")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Label> getLabel() {
        return label;
    }

    /**
     * Setter for Label.
     * @param label Value for List of Label
     */
    @JsonSetter("label")
    public void setLabel(List<Label> label) {
        this.label = label;
    }

    /**
     * Converts this DeviceAggregateUsageListRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DeviceAggregateUsageListRequest [" + "startTime=" + startTime + ", endTime="
                + endTime + ", deviceIds=" + deviceIds + ", accountName=" + accountName
                + ", groupName=" + groupName + ", label=" + label + "]";
    }

    /**
     * Builds a new {@link DeviceAggregateUsageListRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeviceAggregateUsageListRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(startTime, endTime)
                .deviceIds(getDeviceIds())
                .accountName(getAccountName())
                .groupName(getGroupName())
                .label(getLabel());
        return builder;
    }

    /**
     * Class to build instances of {@link DeviceAggregateUsageListRequest}.
     */
    public static class Builder {
        private String startTime;
        private String endTime;
        private List<DeviceId> deviceIds;
        private String accountName;
        private String groupName;
        private List<Label> label;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  startTime  String value for startTime.
         * @param  endTime  String value for endTime.
         */
        public Builder(String startTime, String endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        /**
         * Setter for startTime.
         * @param  startTime  String value for startTime.
         * @return Builder
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * Setter for endTime.
         * @param  endTime  String value for endTime.
         * @return Builder
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Setter for deviceIds.
         * @param  deviceIds  List of DeviceId value for deviceIds.
         * @return Builder
         */
        public Builder deviceIds(List<DeviceId> deviceIds) {
            this.deviceIds = deviceIds;
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
         * Setter for groupName.
         * @param  groupName  String value for groupName.
         * @return Builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * Setter for label.
         * @param  label  List of Label value for label.
         * @return Builder
         */
        public Builder label(List<Label> label) {
            this.label = label;
            return this;
        }

        /**
         * Builds a new {@link DeviceAggregateUsageListRequest} object using the set fields.
         * @return {@link DeviceAggregateUsageListRequest}
         */
        public DeviceAggregateUsageListRequest build() {
            return new DeviceAggregateUsageListRequest(startTime, endTime, deviceIds, accountName,
                    groupName, label);
        }
    }
}
