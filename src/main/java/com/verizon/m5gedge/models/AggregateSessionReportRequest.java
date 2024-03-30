/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.OptionalNullable;
import java.util.List;

/**
 * This is a model class for AggregateSessionReportRequest type.
 */
public class AggregateSessionReportRequest {
    private String accountNumber;
    private String startDate;
    private String endDate;
    private List<String> imei;
    private OptionalNullable<String> deviceGroup;
    private OptionalNullable<String> deviceLabel;
    private OptionalNullable<String> dataPlan;
    private String noSessionFlag;

    /**
     * Default constructor.
     */
    public AggregateSessionReportRequest() {
    }

    /**
     * Initialization constructor.
     * @param  accountNumber  String value for accountNumber.
     * @param  imei  List of String value for imei.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  deviceGroup  String value for deviceGroup.
     * @param  deviceLabel  String value for deviceLabel.
     * @param  dataPlan  String value for dataPlan.
     * @param  noSessionFlag  String value for noSessionFlag.
     */
    public AggregateSessionReportRequest(
            String accountNumber,
            List<String> imei,
            String startDate,
            String endDate,
            String deviceGroup,
            String deviceLabel,
            String dataPlan,
            String noSessionFlag) {
        this.accountNumber = accountNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imei = imei;
        this.deviceGroup = OptionalNullable.of(deviceGroup);
        this.deviceLabel = OptionalNullable.of(deviceLabel);
        this.dataPlan = OptionalNullable.of(dataPlan);
        this.noSessionFlag = noSessionFlag;
    }

    /**
     * Initialization constructor.
     * @param  accountNumber  String value for accountNumber.
     * @param  imei  List of String value for imei.
     * @param  startDate  String value for startDate.
     * @param  endDate  String value for endDate.
     * @param  deviceGroup  String value for deviceGroup.
     * @param  deviceLabel  String value for deviceLabel.
     * @param  dataPlan  String value for dataPlan.
     * @param  noSessionFlag  String value for noSessionFlag.
     */

    protected AggregateSessionReportRequest(String accountNumber, List<String> imei,
            String startDate, String endDate, OptionalNullable<String> deviceGroup,
            OptionalNullable<String> deviceLabel, OptionalNullable<String> dataPlan,
            String noSessionFlag) {
        this.accountNumber = accountNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imei = imei;
        this.deviceGroup = deviceGroup;
        this.deviceLabel = deviceLabel;
        this.dataPlan = dataPlan;
        this.noSessionFlag = noSessionFlag;
    }

    /**
     * Getter for AccountNumber.
     * The unique identifier for the account.
     * @return Returns the String
     */
    @JsonGetter("accountNumber")
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Setter for AccountNumber.
     * The unique identifier for the account.
     * @param accountNumber Value for String
     */
    @JsonSetter("accountNumber")
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Getter for StartDate.
     * Start date of session to include. If not specified information will be shown from the
     * earliest available (180 days). Can be either date in ISO 8601 format or predefined constants.
     * @return Returns the String
     */
    @JsonGetter("startDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getStartDate() {
        return startDate;
    }

    /**
     * Setter for StartDate.
     * Start date of session to include. If not specified information will be shown from the
     * earliest available (180 days). Can be either date in ISO 8601 format or predefined constants.
     * @param startDate Value for String
     */
    @JsonSetter("startDate")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * Getter for EndDate.
     * End date of session to include. If not specified information will be shown to the latest
     * available. Can be either date in ISO 8601 format or predefined constants.
     * @return Returns the String
     */
    @JsonGetter("endDate")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEndDate() {
        return endDate;
    }

    /**
     * Setter for EndDate.
     * End date of session to include. If not specified information will be shown to the latest
     * available. Can be either date in ISO 8601 format or predefined constants.
     * @param endDate Value for String
     */
    @JsonSetter("endDate")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Getter for Imei.
     * Devices for which return usage info. Could be 0, 1 or more. In case of 0 will return all
     * devices belonging to customer (except of filtered by other parameters).
     * @return Returns the List of String
     */
    @JsonGetter("imei")
    public List<String> getImei() {
        return imei;
    }

    /**
     * Setter for Imei.
     * Devices for which return usage info. Could be 0, 1 or more. In case of 0 will return all
     * devices belonging to customer (except of filtered by other parameters).
     * @param imei Value for List of String
     */
    @JsonSetter("imei")
    public void setImei(List<String> imei) {
        this.imei = imei;
    }

    /**
     * Internal Getter for DeviceGroup.
     * User defined group name the devices are a member of.
     * @return Returns the Internal String
     */
    @JsonGetter("deviceGroup")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeviceGroup() {
        return this.deviceGroup;
    }

    /**
     * Getter for DeviceGroup.
     * User defined group name the devices are a member of.
     * @return Returns the String
     */
    public String getDeviceGroup() {
        return OptionalNullable.getFrom(deviceGroup);
    }

    /**
     * Setter for DeviceGroup.
     * User defined group name the devices are a member of.
     * @param deviceGroup Value for String
     */
    @JsonSetter("deviceGroup")
    public void setDeviceGroup(String deviceGroup) {
        this.deviceGroup = OptionalNullable.of(deviceGroup);
    }

    /**
     * UnSetter for DeviceGroup.
     * User defined group name the devices are a member of.
     */
    public void unsetDeviceGroup() {
        deviceGroup = null;
    }

    /**
     * Internal Getter for DeviceLabel.
     * Optional filter parameter.
     * @return Returns the Internal String
     */
    @JsonGetter("deviceLabel")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDeviceLabel() {
        return this.deviceLabel;
    }

    /**
     * Getter for DeviceLabel.
     * Optional filter parameter.
     * @return Returns the String
     */
    public String getDeviceLabel() {
        return OptionalNullable.getFrom(deviceLabel);
    }

    /**
     * Setter for DeviceLabel.
     * Optional filter parameter.
     * @param deviceLabel Value for String
     */
    @JsonSetter("deviceLabel")
    public void setDeviceLabel(String deviceLabel) {
        this.deviceLabel = OptionalNullable.of(deviceLabel);
    }

    /**
     * UnSetter for DeviceLabel.
     * Optional filter parameter.
     */
    public void unsetDeviceLabel() {
        deviceLabel = null;
    }

    /**
     * Internal Getter for DataPlan.
     * The data plan the devices beign queried belong to.
     * @return Returns the Internal String
     */
    @JsonGetter("dataPlan")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDataPlan() {
        return this.dataPlan;
    }

    /**
     * Getter for DataPlan.
     * The data plan the devices beign queried belong to.
     * @return Returns the String
     */
    public String getDataPlan() {
        return OptionalNullable.getFrom(dataPlan);
    }

    /**
     * Setter for DataPlan.
     * The data plan the devices beign queried belong to.
     * @param dataPlan Value for String
     */
    @JsonSetter("dataPlan")
    public void setDataPlan(String dataPlan) {
        this.dataPlan = OptionalNullable.of(dataPlan);
    }

    /**
     * UnSetter for DataPlan.
     * The data plan the devices beign queried belong to.
     */
    public void unsetDataPlan() {
        dataPlan = null;
    }

    /**
     * Getter for NoSessionFlag.
     * Optional filter parameter which return only devices with no sessions.
     * @return Returns the String
     */
    @JsonGetter("noSessionFlag")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getNoSessionFlag() {
        return noSessionFlag;
    }

    /**
     * Setter for NoSessionFlag.
     * Optional filter parameter which return only devices with no sessions.
     * @param noSessionFlag Value for String
     */
    @JsonSetter("noSessionFlag")
    public void setNoSessionFlag(String noSessionFlag) {
        this.noSessionFlag = noSessionFlag;
    }

    /**
     * Converts this AggregateSessionReportRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AggregateSessionReportRequest [" + "accountNumber=" + accountNumber + ", imei="
                + imei + ", startDate=" + startDate + ", endDate=" + endDate + ", deviceGroup="
                + deviceGroup + ", deviceLabel=" + deviceLabel + ", dataPlan=" + dataPlan
                + ", noSessionFlag=" + noSessionFlag + "]";
    }

    /**
     * Builds a new {@link AggregateSessionReportRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AggregateSessionReportRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(accountNumber, imei)
                .startDate(getStartDate())
                .endDate(getEndDate())
                .noSessionFlag(getNoSessionFlag());
        builder.deviceGroup = internalGetDeviceGroup();
        builder.deviceLabel = internalGetDeviceLabel();
        builder.dataPlan = internalGetDataPlan();
        return builder;
    }

    /**
     * Class to build instances of {@link AggregateSessionReportRequest}.
     */
    public static class Builder {
        private String accountNumber;
        private List<String> imei;
        private String startDate;
        private String endDate;
        private OptionalNullable<String> deviceGroup;
        private OptionalNullable<String> deviceLabel;
        private OptionalNullable<String> dataPlan;
        private String noSessionFlag;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  accountNumber  String value for accountNumber.
         * @param  imei  List of String value for imei.
         */
        public Builder(String accountNumber, List<String> imei) {
            this.accountNumber = accountNumber;
            this.imei = imei;
        }

        /**
         * Setter for accountNumber.
         * @param  accountNumber  String value for accountNumber.
         * @return Builder
         */
        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        /**
         * Setter for imei.
         * @param  imei  List of String value for imei.
         * @return Builder
         */
        public Builder imei(List<String> imei) {
            this.imei = imei;
            return this;
        }

        /**
         * Setter for startDate.
         * @param  startDate  String value for startDate.
         * @return Builder
         */
        public Builder startDate(String startDate) {
            this.startDate = startDate;
            return this;
        }

        /**
         * Setter for endDate.
         * @param  endDate  String value for endDate.
         * @return Builder
         */
        public Builder endDate(String endDate) {
            this.endDate = endDate;
            return this;
        }

        /**
         * Setter for deviceGroup.
         * @param  deviceGroup  String value for deviceGroup.
         * @return Builder
         */
        public Builder deviceGroup(String deviceGroup) {
            this.deviceGroup = OptionalNullable.of(deviceGroup);
            return this;
        }

        /**
         * UnSetter for deviceGroup.
         * @return Builder
         */
        public Builder unsetDeviceGroup() {
            deviceGroup = null;
            return this;
        }

        /**
         * Setter for deviceLabel.
         * @param  deviceLabel  String value for deviceLabel.
         * @return Builder
         */
        public Builder deviceLabel(String deviceLabel) {
            this.deviceLabel = OptionalNullable.of(deviceLabel);
            return this;
        }

        /**
         * UnSetter for deviceLabel.
         * @return Builder
         */
        public Builder unsetDeviceLabel() {
            deviceLabel = null;
            return this;
        }

        /**
         * Setter for dataPlan.
         * @param  dataPlan  String value for dataPlan.
         * @return Builder
         */
        public Builder dataPlan(String dataPlan) {
            this.dataPlan = OptionalNullable.of(dataPlan);
            return this;
        }

        /**
         * UnSetter for dataPlan.
         * @return Builder
         */
        public Builder unsetDataPlan() {
            dataPlan = null;
            return this;
        }

        /**
         * Setter for noSessionFlag.
         * @param  noSessionFlag  String value for noSessionFlag.
         * @return Builder
         */
        public Builder noSessionFlag(String noSessionFlag) {
            this.noSessionFlag = noSessionFlag;
            return this;
        }

        /**
         * Builds a new {@link AggregateSessionReportRequest} object using the set fields.
         * @return {@link AggregateSessionReportRequest}
         */
        public AggregateSessionReportRequest build() {
            return new AggregateSessionReportRequest(accountNumber, imei, startDate, endDate,
                    deviceGroup, deviceLabel, dataPlan, noSessionFlag);
        }
    }
}
