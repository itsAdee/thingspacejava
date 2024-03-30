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
 * This is a model class for ListRegionsResult type.
 */
public class ListRegionsResult {
    private List<Region> regions;

    /**
     * Default constructor.
     */
    public ListRegionsResult() {
    }

    /**
     * Initialization constructor.
     * @param  regions  List of Region value for regions.
     */
    public ListRegionsResult(
            List<Region> regions) {
        this.regions = regions;
    }

    /**
     * Getter for Regions.
     * An array of all regions in the Verizon 5G Edge service.
     * @return Returns the List of Region
     */
    @JsonGetter("regions")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<Region> getRegions() {
        return regions;
    }

    /**
     * Setter for Regions.
     * An array of all regions in the Verizon 5G Edge service.
     * @param regions Value for List of Region
     */
    @JsonSetter("regions")
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    /**
     * Converts this ListRegionsResult into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListRegionsResult [" + "regions=" + regions + "]";
    }

    /**
     * Builds a new {@link ListRegionsResult.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListRegionsResult.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .regions(getRegions());
        return builder;
    }

    /**
     * Class to build instances of {@link ListRegionsResult}.
     */
    public static class Builder {
        private List<Region> regions;



        /**
         * Setter for regions.
         * @param  regions  List of Region value for regions.
         * @return Builder
         */
        public Builder regions(List<Region> regions) {
            this.regions = regions;
            return this;
        }

        /**
         * Builds a new {@link ListRegionsResult} object using the set fields.
         * @return {@link ListRegionsResult}
         */
        public ListRegionsResult build() {
            return new ListRegionsResult(regions);
        }
    }
}
