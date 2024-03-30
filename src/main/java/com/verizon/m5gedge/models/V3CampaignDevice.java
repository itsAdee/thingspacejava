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
 * This is a model class for V3CampaignDevice type.
 */
public class V3CampaignDevice {
    private Integer totalDevice;
    private boolean hasMoreData;
    private String lastSeenDeviceId;
    private int maxPageSize;
    private List<V3DeviceStatus> deviceList;

    /**
     * Default constructor.
     */
    public V3CampaignDevice() {
    }

    /**
     * Initialization constructor.
     * @param  hasMoreData  boolean value for hasMoreData.
     * @param  maxPageSize  int value for maxPageSize.
     * @param  deviceList  List of V3DeviceStatus value for deviceList.
     * @param  totalDevice  Integer value for totalDevice.
     * @param  lastSeenDeviceId  String value for lastSeenDeviceId.
     */
    public V3CampaignDevice(
            boolean hasMoreData,
            int maxPageSize,
            List<V3DeviceStatus> deviceList,
            Integer totalDevice,
            String lastSeenDeviceId) {
        this.totalDevice = totalDevice;
        this.hasMoreData = hasMoreData;
        this.lastSeenDeviceId = lastSeenDeviceId;
        this.maxPageSize = maxPageSize;
        this.deviceList = deviceList;
    }

    /**
     * Getter for TotalDevice.
     * Total device count.
     * @return Returns the Integer
     */
    @JsonGetter("totalDevice")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getTotalDevice() {
        return totalDevice;
    }

    /**
     * Setter for TotalDevice.
     * Total device count.
     * @param totalDevice Value for Integer
     */
    @JsonSetter("totalDevice")
    public void setTotalDevice(Integer totalDevice) {
        this.totalDevice = totalDevice;
    }

    /**
     * Getter for HasMoreData.
     * Has more report flag.
     * @return Returns the boolean
     */
    @JsonGetter("hasMoreData")
    public boolean getHasMoreData() {
        return hasMoreData;
    }

    /**
     * Setter for HasMoreData.
     * Has more report flag.
     * @param hasMoreData Value for boolean
     */
    @JsonSetter("hasMoreData")
    public void setHasMoreData(boolean hasMoreData) {
        this.hasMoreData = hasMoreData;
    }

    /**
     * Getter for LastSeenDeviceId.
     * Device identifier.
     * @return Returns the String
     */
    @JsonGetter("lastSeenDeviceId")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastSeenDeviceId() {
        return lastSeenDeviceId;
    }

    /**
     * Setter for LastSeenDeviceId.
     * Device identifier.
     * @param lastSeenDeviceId Value for String
     */
    @JsonSetter("lastSeenDeviceId")
    public void setLastSeenDeviceId(String lastSeenDeviceId) {
        this.lastSeenDeviceId = lastSeenDeviceId;
    }

    /**
     * Getter for MaxPageSize.
     * Maximum page size.
     * @return Returns the int
     */
    @JsonGetter("maxPageSize")
    public int getMaxPageSize() {
        return maxPageSize;
    }

    /**
     * Setter for MaxPageSize.
     * Maximum page size.
     * @param maxPageSize Value for int
     */
    @JsonSetter("maxPageSize")
    public void setMaxPageSize(int maxPageSize) {
        this.maxPageSize = maxPageSize;
    }

    /**
     * Getter for DeviceList.
     * List of devices with id in IMEI.
     * @return Returns the List of V3DeviceStatus
     */
    @JsonGetter("deviceList")
    public List<V3DeviceStatus> getDeviceList() {
        return deviceList;
    }

    /**
     * Setter for DeviceList.
     * List of devices with id in IMEI.
     * @param deviceList Value for List of V3DeviceStatus
     */
    @JsonSetter("deviceList")
    public void setDeviceList(List<V3DeviceStatus> deviceList) {
        this.deviceList = deviceList;
    }

    /**
     * Converts this V3CampaignDevice into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "V3CampaignDevice [" + "hasMoreData=" + hasMoreData + ", maxPageSize=" + maxPageSize
                + ", deviceList=" + deviceList + ", totalDevice=" + totalDevice
                + ", lastSeenDeviceId=" + lastSeenDeviceId + "]";
    }

    /**
     * Builds a new {@link V3CampaignDevice.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V3CampaignDevice.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(hasMoreData, maxPageSize, deviceList)
                .totalDevice(getTotalDevice())
                .lastSeenDeviceId(getLastSeenDeviceId());
        return builder;
    }

    /**
     * Class to build instances of {@link V3CampaignDevice}.
     */
    public static class Builder {
        private boolean hasMoreData;
        private int maxPageSize;
        private List<V3DeviceStatus> deviceList;
        private Integer totalDevice;
        private String lastSeenDeviceId;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  hasMoreData  boolean value for hasMoreData.
         * @param  maxPageSize  int value for maxPageSize.
         * @param  deviceList  List of V3DeviceStatus value for deviceList.
         */
        public Builder(boolean hasMoreData, int maxPageSize, List<V3DeviceStatus> deviceList) {
            this.hasMoreData = hasMoreData;
            this.maxPageSize = maxPageSize;
            this.deviceList = deviceList;
        }

        /**
         * Setter for hasMoreData.
         * @param  hasMoreData  boolean value for hasMoreData.
         * @return Builder
         */
        public Builder hasMoreData(boolean hasMoreData) {
            this.hasMoreData = hasMoreData;
            return this;
        }

        /**
         * Setter for maxPageSize.
         * @param  maxPageSize  int value for maxPageSize.
         * @return Builder
         */
        public Builder maxPageSize(int maxPageSize) {
            this.maxPageSize = maxPageSize;
            return this;
        }

        /**
         * Setter for deviceList.
         * @param  deviceList  List of V3DeviceStatus value for deviceList.
         * @return Builder
         */
        public Builder deviceList(List<V3DeviceStatus> deviceList) {
            this.deviceList = deviceList;
            return this;
        }

        /**
         * Setter for totalDevice.
         * @param  totalDevice  Integer value for totalDevice.
         * @return Builder
         */
        public Builder totalDevice(Integer totalDevice) {
            this.totalDevice = totalDevice;
            return this;
        }

        /**
         * Setter for lastSeenDeviceId.
         * @param  lastSeenDeviceId  String value for lastSeenDeviceId.
         * @return Builder
         */
        public Builder lastSeenDeviceId(String lastSeenDeviceId) {
            this.lastSeenDeviceId = lastSeenDeviceId;
            return this;
        }

        /**
         * Builds a new {@link V3CampaignDevice} object using the set fields.
         * @return {@link V3CampaignDevice}
         */
        public V3CampaignDevice build() {
            return new V3CampaignDevice(hasMoreData, maxPageSize, deviceList, totalDevice,
                    lastSeenDeviceId);
        }
    }
}
