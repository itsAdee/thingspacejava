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
 * This is a model class for AccountService type.
 */
public class AccountService {
    private String name;
    private String description;
    private List<State> states;

    /**
     * Default constructor.
     */
    public AccountService() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  description  String value for description.
     * @param  states  List of State value for states.
     */
    public AccountService(
            String name,
            String description,
            List<State> states) {
        this.name = name;
        this.description = description;
        this.states = states;
    }

    /**
     * Getter for Name.
     * The name of the service plan.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * The name of the service plan.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Description.
     * The description of the service plan.
     * @return Returns the String
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * The description of the service plan.
     * @param description Value for String
     */
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter for States.
     * The state of the service plan.
     * @return Returns the List of State
     */
    @JsonGetter("states")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<State> getStates() {
        return states;
    }

    /**
     * Setter for States.
     * The state of the service plan.
     * @param states Value for List of State
     */
    @JsonSetter("states")
    public void setStates(List<State> states) {
        this.states = states;
    }

    /**
     * Converts this AccountService into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AccountService [" + "name=" + name + ", description=" + description + ", states="
                + states + "]";
    }

    /**
     * Builds a new {@link AccountService.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AccountService.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .name(getName())
                .description(getDescription())
                .states(getStates());
        return builder;
    }

    /**
     * Class to build instances of {@link AccountService}.
     */
    public static class Builder {
        private String name;
        private String description;
        private List<State> states;



        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  String value for description.
         * @return Builder
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Setter for states.
         * @param  states  List of State value for states.
         * @return Builder
         */
        public Builder states(List<State> states) {
            this.states = states;
            return this;
        }

        /**
         * Builds a new {@link AccountService} object using the set fields.
         * @return {@link AccountService}
         */
        public AccountService build() {
            return new AccountService(name, description, states);
        }
    }
}
