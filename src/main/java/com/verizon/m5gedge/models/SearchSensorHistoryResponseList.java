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
 * This is a model class for SearchSensorHistoryResponseList type.
 */
public class SearchSensorHistoryResponseList {
    private List<SearchDeviceResponse> searchSensorHistory;

    /**
     * Default constructor.
     */
    public SearchSensorHistoryResponseList() {
    }

    /**
     * Initialization constructor.
     * @param  searchSensorHistory  List of SearchDeviceResponse value for searchSensorHistory.
     */
    public SearchSensorHistoryResponseList(
            List<SearchDeviceResponse> searchSensorHistory) {
        this.searchSensorHistory = searchSensorHistory;
    }

    /**
     * Getter for SearchSensorHistory.
     * @return Returns the List of SearchDeviceResponse
     */
    @JsonGetter("SearchSensorHistory")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<SearchDeviceResponse> getSearchSensorHistory() {
        return searchSensorHistory;
    }

    /**
     * Setter for SearchSensorHistory.
     * @param searchSensorHistory Value for List of SearchDeviceResponse
     */
    @JsonSetter("SearchSensorHistory")
    public void setSearchSensorHistory(List<SearchDeviceResponse> searchSensorHistory) {
        this.searchSensorHistory = searchSensorHistory;
    }

    /**
     * Converts this SearchSensorHistoryResponseList into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SearchSensorHistoryResponseList [" + "searchSensorHistory=" + searchSensorHistory
                + "]";
    }

    /**
     * Builds a new {@link SearchSensorHistoryResponseList.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchSensorHistoryResponseList.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .searchSensorHistory(getSearchSensorHistory());
        return builder;
    }

    /**
     * Class to build instances of {@link SearchSensorHistoryResponseList}.
     */
    public static class Builder {
        private List<SearchDeviceResponse> searchSensorHistory;



        /**
         * Setter for searchSensorHistory.
         * @param  searchSensorHistory  List of SearchDeviceResponse value for searchSensorHistory.
         * @return Builder
         */
        public Builder searchSensorHistory(List<SearchDeviceResponse> searchSensorHistory) {
            this.searchSensorHistory = searchSensorHistory;
            return this;
        }

        /**
         * Builds a new {@link SearchSensorHistoryResponseList} object using the set fields.
         * @return {@link SearchSensorHistoryResponseList}
         */
        public SearchSensorHistoryResponseList build() {
            return new SearchSensorHistoryResponseList(searchSensorHistory);
        }
    }
}
