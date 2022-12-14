/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.Map;

/**
 * This is a model class for Holders type.
 */
public class Holders {
    private Map<String, GeneratedObject3> institutions;
    private Map<String, GeneratedObject5> funds;

    /**
     * Default constructor.
     */
    public Holders() {
    }

    /**
     * Initialization constructor.
     * @param  institutions  Map of String, value for institutions.
     * @param  funds  Map of String, value for funds.
     */
    public Holders(
            Map<String, GeneratedObject3> institutions,
            Map<String, GeneratedObject5> funds) {
        this.institutions = institutions;
        this.funds = funds;
    }

    /**
     * Getter for Institutions.
     * @return Returns the Map of String, GeneratedObject3
     */
    @JsonGetter("Institutions")
    public Map<String, GeneratedObject3> getInstitutions() {
        return institutions;
    }

    /**
     * Setter for Institutions.
     * @param institutions Value for Map of String, GeneratedObject3
     */
    @JsonSetter("Institutions")
    public void setInstitutions(Map<String, GeneratedObject3> institutions) {
        this.institutions = institutions;
    }

    /**
     * Getter for Funds.
     * @return Returns the Map of String, GeneratedObject5
     */
    @JsonGetter("Funds")
    public Map<String, GeneratedObject5> getFunds() {
        return funds;
    }

    /**
     * Setter for Funds.
     * @param funds Value for Map of String, GeneratedObject5
     */
    @JsonSetter("Funds")
    public void setFunds(Map<String, GeneratedObject5> funds) {
        this.funds = funds;
    }

    /**
     * Converts this Holders into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Holders [" + "institutions=" + institutions + ", funds=" + funds + "]";
    }

    /**
     * Builds a new {@link Holders.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Holders.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(institutions, funds);
        return builder;
    }

    /**
     * Class to build instances of {@link Holders}.
     */
    public static class Builder {
        private Map<String, GeneratedObject3> institutions;
        private Map<String, GeneratedObject5> funds;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  institutions  Map of String, value for institutions.
         * @param  funds  Map of String, value for funds.
         */
        public Builder(Map<String, GeneratedObject3> institutions,
                Map<String, GeneratedObject5> funds) {
            this.institutions = institutions;
            this.funds = funds;
        }

        /**
         * Setter for institutions.
         * @param  institutions  Map of String, value for institutions.
         * @return Builder
         */
        public Builder institutions(Map<String, GeneratedObject3> institutions) {
            this.institutions = institutions;
            return this;
        }

        /**
         * Setter for funds.
         * @param  funds  Map of String, value for funds.
         * @return Builder
         */
        public Builder funds(Map<String, GeneratedObject5> funds) {
            this.funds = funds;
            return this;
        }

        /**
         * Builds a new {@link Holders} object using the set fields.
         * @return {@link Holders}
         */
        public Holders build() {
            return new Holders(institutions, funds);
        }
    }
}
