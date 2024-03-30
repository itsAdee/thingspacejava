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
 * This is a model class for FindDeviceByPropertyResponse type.
 */
public class FindDeviceByPropertyResponse {
    private String billingaccountid;
    private String createdon;
    private String eventretention;
    private String iccid;
    private String id;
    private String imei;
    private String kind;
    private String lastupdated;
    private String providerid;
    private String refid;
    private String refidtype;
    private String state;
    private String version;
    private String versionid;

    /**
     * Default constructor.
     */
    public FindDeviceByPropertyResponse() {
    }

    /**
     * Initialization constructor.
     * @param  billingaccountid  String value for billingaccountid.
     * @param  createdon  String value for createdon.
     * @param  eventretention  String value for eventretention.
     * @param  iccid  String value for iccid.
     * @param  id  String value for id.
     * @param  imei  String value for imei.
     * @param  kind  String value for kind.
     * @param  lastupdated  String value for lastupdated.
     * @param  providerid  String value for providerid.
     * @param  refid  String value for refid.
     * @param  refidtype  String value for refidtype.
     * @param  state  String value for state.
     * @param  version  String value for version.
     * @param  versionid  String value for versionid.
     */
    public FindDeviceByPropertyResponse(
            String billingaccountid,
            String createdon,
            String eventretention,
            String iccid,
            String id,
            String imei,
            String kind,
            String lastupdated,
            String providerid,
            String refid,
            String refidtype,
            String state,
            String version,
            String versionid) {
        this.billingaccountid = billingaccountid;
        this.createdon = createdon;
        this.eventretention = eventretention;
        this.iccid = iccid;
        this.id = id;
        this.imei = imei;
        this.kind = kind;
        this.lastupdated = lastupdated;
        this.providerid = providerid;
        this.refid = refid;
        this.refidtype = refidtype;
        this.state = state;
        this.version = version;
        this.versionid = versionid;
    }

    /**
     * Getter for Billingaccountid.
     * Billing account ID of the resource.
     * @return Returns the String
     */
    @JsonGetter("billingaccountid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getBillingaccountid() {
        return billingaccountid;
    }

    /**
     * Setter for Billingaccountid.
     * Billing account ID of the resource.
     * @param billingaccountid Value for String
     */
    @JsonSetter("billingaccountid")
    public void setBillingaccountid(String billingaccountid) {
        this.billingaccountid = billingaccountid;
    }

    /**
     * Getter for Createdon.
     * The date the resource was created.
     * @return Returns the String
     */
    @JsonGetter("createdon")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCreatedon() {
        return createdon;
    }

    /**
     * Setter for Createdon.
     * The date the resource was created.
     * @param createdon Value for String
     */
    @JsonSetter("createdon")
    public void setCreatedon(String createdon) {
        this.createdon = createdon;
    }

    /**
     * Getter for Eventretention.
     * @return Returns the String
     */
    @JsonGetter("eventretention")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEventretention() {
        return eventretention;
    }

    /**
     * Setter for Eventretention.
     * @param eventretention Value for String
     */
    @JsonSetter("eventretention")
    public void setEventretention(String eventretention) {
        this.eventretention = eventretention;
    }

    /**
     * Getter for Iccid.
     * Cellular SIM card identifier.
     * @return Returns the String
     */
    @JsonGetter("iccid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getIccid() {
        return iccid;
    }

    /**
     * Setter for Iccid.
     * Cellular SIM card identifier.
     * @param iccid Value for String
     */
    @JsonSetter("iccid")
    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    /**
     * Getter for Id.
     * ThingSpace unique ID for the device that was added.
     * @return Returns the String
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getId() {
        return id;
    }

    /**
     * Setter for Id.
     * ThingSpace unique ID for the device that was added.
     * @param id Value for String
     */
    @JsonSetter("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Imei.
     * 4G hardware device identifier.
     * @return Returns the String
     */
    @JsonGetter("imei")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getImei() {
        return imei;
    }

    /**
     * Setter for Imei.
     * 4G hardware device identifier.
     * @param imei Value for String
     */
    @JsonSetter("imei")
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * Getter for Kind.
     * Identifies the resource kind.
     * @return Returns the String
     */
    @JsonGetter("kind")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getKind() {
        return kind;
    }

    /**
     * Setter for Kind.
     * Identifies the resource kind.
     * @param kind Value for String
     */
    @JsonSetter("kind")
    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Getter for Lastupdated.
     * The date the resource was last updated.
     * @return Returns the String
     */
    @JsonGetter("lastupdated")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLastupdated() {
        return lastupdated;
    }

    /**
     * Setter for Lastupdated.
     * The date the resource was last updated.
     * @param lastupdated Value for String
     */
    @JsonSetter("lastupdated")
    public void setLastupdated(String lastupdated) {
        this.lastupdated = lastupdated;
    }

    /**
     * Getter for Providerid.
     * The device’s service provider.
     * @return Returns the String
     */
    @JsonGetter("providerid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getProviderid() {
        return providerid;
    }

    /**
     * Setter for Providerid.
     * The device’s service provider.
     * @param providerid Value for String
     */
    @JsonSetter("providerid")
    public void setProviderid(String providerid) {
        this.providerid = providerid;
    }

    /**
     * Getter for Refid.
     * The value of the refidtype identifier.
     * @return Returns the String
     */
    @JsonGetter("refid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRefid() {
        return refid;
    }

    /**
     * Setter for Refid.
     * The value of the refidtype identifier.
     * @param refid Value for String
     */
    @JsonSetter("refid")
    public void setRefid(String refid) {
        this.refid = refid;
    }

    /**
     * Getter for Refidtype.
     * The device identifier type used to refer to this device.
     * @return Returns the String
     */
    @JsonGetter("refidtype")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRefidtype() {
        return refidtype;
    }

    /**
     * Setter for Refidtype.
     * The device identifier type used to refer to this device.
     * @param refidtype Value for String
     */
    @JsonSetter("refidtype")
    public void setRefidtype(String refidtype) {
        this.refidtype = refidtype;
    }

    /**
     * Getter for State.
     * Service state of the device.
     * @return Returns the String
     */
    @JsonGetter("state")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getState() {
        return state;
    }

    /**
     * Setter for State.
     * Service state of the device.
     * @param state Value for String
     */
    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Getter for Version.
     * Version of the underlying schema resource.
     * @return Returns the String
     */
    @JsonGetter("version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersion() {
        return version;
    }

    /**
     * Setter for Version.
     * Version of the underlying schema resource.
     * @param version Value for String
     */
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Getter for Versionid.
     * The version of the resource.
     * @return Returns the String
     */
    @JsonGetter("versionid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getVersionid() {
        return versionid;
    }

    /**
     * Setter for Versionid.
     * The version of the resource.
     * @param versionid Value for String
     */
    @JsonSetter("versionid")
    public void setVersionid(String versionid) {
        this.versionid = versionid;
    }

    /**
     * Converts this FindDeviceByPropertyResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "FindDeviceByPropertyResponse [" + "billingaccountid=" + billingaccountid
                + ", createdon=" + createdon + ", eventretention=" + eventretention + ", iccid="
                + iccid + ", id=" + id + ", imei=" + imei + ", kind=" + kind + ", lastupdated="
                + lastupdated + ", providerid=" + providerid + ", refid=" + refid + ", refidtype="
                + refidtype + ", state=" + state + ", version=" + version + ", versionid="
                + versionid + "]";
    }

    /**
     * Builds a new {@link FindDeviceByPropertyResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link FindDeviceByPropertyResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .billingaccountid(getBillingaccountid())
                .createdon(getCreatedon())
                .eventretention(getEventretention())
                .iccid(getIccid())
                .id(getId())
                .imei(getImei())
                .kind(getKind())
                .lastupdated(getLastupdated())
                .providerid(getProviderid())
                .refid(getRefid())
                .refidtype(getRefidtype())
                .state(getState())
                .version(getVersion())
                .versionid(getVersionid());
        return builder;
    }

    /**
     * Class to build instances of {@link FindDeviceByPropertyResponse}.
     */
    public static class Builder {
        private String billingaccountid;
        private String createdon;
        private String eventretention;
        private String iccid;
        private String id;
        private String imei;
        private String kind;
        private String lastupdated;
        private String providerid;
        private String refid;
        private String refidtype;
        private String state;
        private String version;
        private String versionid;



        /**
         * Setter for billingaccountid.
         * @param  billingaccountid  String value for billingaccountid.
         * @return Builder
         */
        public Builder billingaccountid(String billingaccountid) {
            this.billingaccountid = billingaccountid;
            return this;
        }

        /**
         * Setter for createdon.
         * @param  createdon  String value for createdon.
         * @return Builder
         */
        public Builder createdon(String createdon) {
            this.createdon = createdon;
            return this;
        }

        /**
         * Setter for eventretention.
         * @param  eventretention  String value for eventretention.
         * @return Builder
         */
        public Builder eventretention(String eventretention) {
            this.eventretention = eventretention;
            return this;
        }

        /**
         * Setter for iccid.
         * @param  iccid  String value for iccid.
         * @return Builder
         */
        public Builder iccid(String iccid) {
            this.iccid = iccid;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for imei.
         * @param  imei  String value for imei.
         * @return Builder
         */
        public Builder imei(String imei) {
            this.imei = imei;
            return this;
        }

        /**
         * Setter for kind.
         * @param  kind  String value for kind.
         * @return Builder
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Setter for lastupdated.
         * @param  lastupdated  String value for lastupdated.
         * @return Builder
         */
        public Builder lastupdated(String lastupdated) {
            this.lastupdated = lastupdated;
            return this;
        }

        /**
         * Setter for providerid.
         * @param  providerid  String value for providerid.
         * @return Builder
         */
        public Builder providerid(String providerid) {
            this.providerid = providerid;
            return this;
        }

        /**
         * Setter for refid.
         * @param  refid  String value for refid.
         * @return Builder
         */
        public Builder refid(String refid) {
            this.refid = refid;
            return this;
        }

        /**
         * Setter for refidtype.
         * @param  refidtype  String value for refidtype.
         * @return Builder
         */
        public Builder refidtype(String refidtype) {
            this.refidtype = refidtype;
            return this;
        }

        /**
         * Setter for state.
         * @param  state  String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for version.
         * @param  version  String value for version.
         * @return Builder
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for versionid.
         * @param  versionid  String value for versionid.
         * @return Builder
         */
        public Builder versionid(String versionid) {
            this.versionid = versionid;
            return this;
        }

        /**
         * Builds a new {@link FindDeviceByPropertyResponse} object using the set fields.
         * @return {@link FindDeviceByPropertyResponse}
         */
        public FindDeviceByPropertyResponse build() {
            return new FindDeviceByPropertyResponse(billingaccountid, createdon, eventretention,
                    iccid, id, imei, kind, lastupdated, providerid, refid, refidtype, state,
                    version, versionid);
        }
    }
}
