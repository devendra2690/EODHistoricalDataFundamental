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
 * This is a model class for IncomeStatement type.
 */
public class IncomeStatement {
    private String currencySymbol;
    private Map<String, GeneratedObject20> quarterly;
    private Map<String, GeneratedObject21> yearly;

    /**
     * Default constructor.
     */
    public IncomeStatement() {
    }

    /**
     * Initialization constructor.
     * @param  currencySymbol  String value for currencySymbol.
     * @param  quarterly  Map of String, value for quarterly.
     * @param  yearly  Map of String, value for yearly.
     */
    public IncomeStatement(
            String currencySymbol,
            Map<String, GeneratedObject20> quarterly,
            Map<String, GeneratedObject21> yearly) {
        this.currencySymbol = currencySymbol;
        this.quarterly = quarterly;
        this.yearly = yearly;
    }

    /**
     * Getter for CurrencySymbol.
     * @return Returns the String
     */
    @JsonGetter("currency_symbol")
    public String getCurrencySymbol() {
        return currencySymbol;
    }

    /**
     * Setter for CurrencySymbol.
     * @param currencySymbol Value for String
     */
    @JsonSetter("currency_symbol")
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    /**
     * Getter for Quarterly.
     * @return Returns the Map of String, GeneratedObject20
     */
    @JsonGetter("quarterly")
    public Map<String, GeneratedObject20> getQuarterly() {
        return quarterly;
    }

    /**
     * Setter for Quarterly.
     * @param quarterly Value for Map of String, GeneratedObject20
     */
    @JsonSetter("quarterly")
    public void setQuarterly(Map<String, GeneratedObject20> quarterly) {
        this.quarterly = quarterly;
    }

    /**
     * Getter for Yearly.
     * @return Returns the Map of String, GeneratedObject21
     */
    @JsonGetter("yearly")
    public Map<String, GeneratedObject21> getYearly() {
        return yearly;
    }

    /**
     * Setter for Yearly.
     * @param yearly Value for Map of String, GeneratedObject21
     */
    @JsonSetter("yearly")
    public void setYearly(Map<String, GeneratedObject21> yearly) {
        this.yearly = yearly;
    }

    /**
     * Converts this IncomeStatement into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "IncomeStatement [" + "currencySymbol=" + currencySymbol + ", quarterly=" + quarterly
                + ", yearly=" + yearly + "]";
    }

    /**
     * Builds a new {@link IncomeStatement.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link IncomeStatement.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(currencySymbol, quarterly, yearly);
        return builder;
    }

    /**
     * Class to build instances of {@link IncomeStatement}.
     */
    public static class Builder {
        private String currencySymbol;
        private Map<String, GeneratedObject20> quarterly;
        private Map<String, GeneratedObject21> yearly;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  currencySymbol  String value for currencySymbol.
         * @param  quarterly  Map of String, value for quarterly.
         * @param  yearly  Map of String, value for yearly.
         */
        public Builder(String currencySymbol, Map<String, GeneratedObject20> quarterly,
                Map<String, GeneratedObject21> yearly) {
            this.currencySymbol = currencySymbol;
            this.quarterly = quarterly;
            this.yearly = yearly;
        }

        /**
         * Setter for currencySymbol.
         * @param  currencySymbol  String value for currencySymbol.
         * @return Builder
         */
        public Builder currencySymbol(String currencySymbol) {
            this.currencySymbol = currencySymbol;
            return this;
        }

        /**
         * Setter for quarterly.
         * @param  quarterly  Map of String, value for quarterly.
         * @return Builder
         */
        public Builder quarterly(Map<String, GeneratedObject20> quarterly) {
            this.quarterly = quarterly;
            return this;
        }

        /**
         * Setter for yearly.
         * @param  yearly  Map of String, value for yearly.
         * @return Builder
         */
        public Builder yearly(Map<String, GeneratedObject21> yearly) {
            this.yearly = yearly;
            return this;
        }

        /**
         * Builds a new {@link IncomeStatement} object using the set fields.
         * @return {@link IncomeStatement}
         */
        public IncomeStatement build() {
            return new IncomeStatement(currencySymbol, quarterly, yearly);
        }
    }
}
