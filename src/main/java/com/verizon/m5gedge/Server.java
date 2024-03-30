/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * Server to be used.
 */
public enum Server {
    EDGE_DISCOVERY,

    THINGSPACE,

    OAUTH_SERVER,

    M2M,

    DEVICE_LOCATION,

    SUBSCRIPTION_SERVER,

    SOFTWARE_MANAGEMENT_V1,

    SOFTWARE_MANAGEMENT_V2,

    SOFTWARE_MANAGEMENT_V3,

    PERFORMANCE,

    DEVICE_DIAGNOSTICS,

    CLOUD_CONNECTOR,

    HYPER_PRECISE_LOCATION,

    SERVICES,

    QUALITY_OF_SERVICE;


    private static TreeMap<String, Server> valueMap = new TreeMap<>();
    private String value;

    static {
        EDGE_DISCOVERY.value = "Edge Discovery";
        THINGSPACE.value = "Thingspace";
        OAUTH_SERVER.value = "OAuth Server";
        M2M.value = "M2M";
        DEVICE_LOCATION.value = "Device Location";
        SUBSCRIPTION_SERVER.value = "Subscription Server";
        SOFTWARE_MANAGEMENT_V1.value = "Software Management V1";
        SOFTWARE_MANAGEMENT_V2.value = "Software Management V2";
        SOFTWARE_MANAGEMENT_V3.value = "Software Management V3";
        PERFORMANCE.value = "Performance";
        DEVICE_DIAGNOSTICS.value = "Device Diagnostics";
        CLOUD_CONNECTOR.value = "Cloud Connector";
        HYPER_PRECISE_LOCATION.value = "Hyper Precise Location";
        SERVICES.value = "Services";
        QUALITY_OF_SERVICE.value = "Quality Of Service";

        valueMap.put("Edge Discovery", EDGE_DISCOVERY);
        valueMap.put("Thingspace", THINGSPACE);
        valueMap.put("OAuth Server", OAUTH_SERVER);
        valueMap.put("M2M", M2M);
        valueMap.put("Device Location", DEVICE_LOCATION);
        valueMap.put("Subscription Server", SUBSCRIPTION_SERVER);
        valueMap.put("Software Management V1", SOFTWARE_MANAGEMENT_V1);
        valueMap.put("Software Management V2", SOFTWARE_MANAGEMENT_V2);
        valueMap.put("Software Management V3", SOFTWARE_MANAGEMENT_V3);
        valueMap.put("Performance", PERFORMANCE);
        valueMap.put("Device Diagnostics", DEVICE_DIAGNOSTICS);
        valueMap.put("Cloud Connector", CLOUD_CONNECTOR);
        valueMap.put("Hyper Precise Location", HYPER_PRECISE_LOCATION);
        valueMap.put("Services", SERVICES);
        valueMap.put("Quality Of Service", QUALITY_OF_SERVICE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static Server constructFromString(String toConvert) throws IOException {
        Server enumValue = fromString(toConvert);
        if (enumValue == null)
        {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static Server fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Server values to list of string values.
     * @param toConvert The list of Server values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<Server> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (Server enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 