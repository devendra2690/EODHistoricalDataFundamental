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
 * This is a model class for SplitsDividends type.
 */
public class SplitsDividends {
    private double forwardAnnualDividendRate;
    private double forwardAnnualDividendYield;
    private double payoutRatio;
    private String dividendDate;
    private String exDividendDate;
    private String lastSplitFactor;
    private String lastSplitDate;
    private Map<String, GeneratedObject2> numberDividendsByYear;

    /**
     * Default constructor.
     */
    public SplitsDividends() {
    }

    /**
     * Initialization constructor.
     * @param  forwardAnnualDividendRate  double value for forwardAnnualDividendRate.
     * @param  forwardAnnualDividendYield  double value for forwardAnnualDividendYield.
     * @param  payoutRatio  double value for payoutRatio.
     * @param  dividendDate  String value for dividendDate.
     * @param  exDividendDate  String value for exDividendDate.
     * @param  lastSplitFactor  String value for lastSplitFactor.
     * @param  lastSplitDate  String value for lastSplitDate.
     * @param  numberDividendsByYear  Map of String, value for numberDividendsByYear.
     */
    public SplitsDividends(
            double forwardAnnualDividendRate,
            double forwardAnnualDividendYield,
            double payoutRatio,
            String dividendDate,
            String exDividendDate,
            String lastSplitFactor,
            String lastSplitDate,
            Map<String, GeneratedObject2> numberDividendsByYear) {
        this.forwardAnnualDividendRate = forwardAnnualDividendRate;
        this.forwardAnnualDividendYield = forwardAnnualDividendYield;
        this.payoutRatio = payoutRatio;
        this.dividendDate = dividendDate;
        this.exDividendDate = exDividendDate;
        this.lastSplitFactor = lastSplitFactor;
        this.lastSplitDate = lastSplitDate;
        this.numberDividendsByYear = numberDividendsByYear;
    }

    /**
     * Getter for ForwardAnnualDividendRate.
     * @return Returns the double
     */
    @JsonGetter("ForwardAnnualDividendRate")
    public double getForwardAnnualDividendRate() {
        return forwardAnnualDividendRate;
    }

    /**
     * Setter for ForwardAnnualDividendRate.
     * @param forwardAnnualDividendRate Value for double
     */
    @JsonSetter("ForwardAnnualDividendRate")
    public void setForwardAnnualDividendRate(double forwardAnnualDividendRate) {
        this.forwardAnnualDividendRate = forwardAnnualDividendRate;
    }

    /**
     * Getter for ForwardAnnualDividendYield.
     * @return Returns the double
     */
    @JsonGetter("ForwardAnnualDividendYield")
    public double getForwardAnnualDividendYield() {
        return forwardAnnualDividendYield;
    }

    /**
     * Setter for ForwardAnnualDividendYield.
     * @param forwardAnnualDividendYield Value for double
     */
    @JsonSetter("ForwardAnnualDividendYield")
    public void setForwardAnnualDividendYield(double forwardAnnualDividendYield) {
        this.forwardAnnualDividendYield = forwardAnnualDividendYield;
    }

    /**
     * Getter for PayoutRatio.
     * @return Returns the double
     */
    @JsonGetter("PayoutRatio")
    public double getPayoutRatio() {
        return payoutRatio;
    }

    /**
     * Setter for PayoutRatio.
     * @param payoutRatio Value for double
     */
    @JsonSetter("PayoutRatio")
    public void setPayoutRatio(double payoutRatio) {
        this.payoutRatio = payoutRatio;
    }

    /**
     * Getter for DividendDate.
     * @return Returns the String
     */
    @JsonGetter("DividendDate")
    public String getDividendDate() {
        return dividendDate;
    }

    /**
     * Setter for DividendDate.
     * @param dividendDate Value for String
     */
    @JsonSetter("DividendDate")
    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate;
    }

    /**
     * Getter for ExDividendDate.
     * @return Returns the String
     */
    @JsonGetter("ExDividendDate")
    public String getExDividendDate() {
        return exDividendDate;
    }

    /**
     * Setter for ExDividendDate.
     * @param exDividendDate Value for String
     */
    @JsonSetter("ExDividendDate")
    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    /**
     * Getter for LastSplitFactor.
     * @return Returns the String
     */
    @JsonGetter("LastSplitFactor")
    public String getLastSplitFactor() {
        return lastSplitFactor;
    }

    /**
     * Setter for LastSplitFactor.
     * @param lastSplitFactor Value for String
     */
    @JsonSetter("LastSplitFactor")
    public void setLastSplitFactor(String lastSplitFactor) {
        this.lastSplitFactor = lastSplitFactor;
    }

    /**
     * Getter for LastSplitDate.
     * @return Returns the String
     */
    @JsonGetter("LastSplitDate")
    public String getLastSplitDate() {
        return lastSplitDate;
    }

    /**
     * Setter for LastSplitDate.
     * @param lastSplitDate Value for String
     */
    @JsonSetter("LastSplitDate")
    public void setLastSplitDate(String lastSplitDate) {
        this.lastSplitDate = lastSplitDate;
    }

    /**
     * Getter for NumberDividendsByYear.
     * @return Returns the Map of String, GeneratedObject2
     */
    @JsonGetter("NumberDividendsByYear")
    public Map<String, GeneratedObject2> getNumberDividendsByYear() {
        return numberDividendsByYear;
    }

    /**
     * Setter for NumberDividendsByYear.
     * @param numberDividendsByYear Value for Map of String, GeneratedObject2
     */
    @JsonSetter("NumberDividendsByYear")
    public void setNumberDividendsByYear(Map<String, GeneratedObject2> numberDividendsByYear) {
        this.numberDividendsByYear = numberDividendsByYear;
    }

    /**
     * Converts this SplitsDividends into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SplitsDividends [" + "forwardAnnualDividendRate=" + forwardAnnualDividendRate
                + ", forwardAnnualDividendYield=" + forwardAnnualDividendYield + ", payoutRatio="
                + payoutRatio + ", dividendDate=" + dividendDate + ", exDividendDate="
                + exDividendDate + ", lastSplitFactor=" + lastSplitFactor + ", lastSplitDate="
                + lastSplitDate + ", numberDividendsByYear=" + numberDividendsByYear + "]";
    }

    /**
     * Builds a new {@link SplitsDividends.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SplitsDividends.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(forwardAnnualDividendRate, forwardAnnualDividendYield,
                payoutRatio, dividendDate, exDividendDate, lastSplitFactor, lastSplitDate,
                numberDividendsByYear);
        return builder;
    }

    /**
     * Class to build instances of {@link SplitsDividends}.
     */
    public static class Builder {
        private double forwardAnnualDividendRate;
        private double forwardAnnualDividendYield;
        private double payoutRatio;
        private String dividendDate;
        private String exDividendDate;
        private String lastSplitFactor;
        private String lastSplitDate;
        private Map<String, GeneratedObject2> numberDividendsByYear;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  forwardAnnualDividendRate  double value for forwardAnnualDividendRate.
         * @param  forwardAnnualDividendYield  double value for forwardAnnualDividendYield.
         * @param  payoutRatio  double value for payoutRatio.
         * @param  dividendDate  String value for dividendDate.
         * @param  exDividendDate  String value for exDividendDate.
         * @param  lastSplitFactor  String value for lastSplitFactor.
         * @param  lastSplitDate  String value for lastSplitDate.
         * @param  numberDividendsByYear  Map of String, value for numberDividendsByYear.
         */
        public Builder(double forwardAnnualDividendRate, double forwardAnnualDividendYield,
                double payoutRatio, String dividendDate, String exDividendDate,
                String lastSplitFactor, String lastSplitDate,
                Map<String, GeneratedObject2> numberDividendsByYear) {
            this.forwardAnnualDividendRate = forwardAnnualDividendRate;
            this.forwardAnnualDividendYield = forwardAnnualDividendYield;
            this.payoutRatio = payoutRatio;
            this.dividendDate = dividendDate;
            this.exDividendDate = exDividendDate;
            this.lastSplitFactor = lastSplitFactor;
            this.lastSplitDate = lastSplitDate;
            this.numberDividendsByYear = numberDividendsByYear;
        }

        /**
         * Setter for forwardAnnualDividendRate.
         * @param  forwardAnnualDividendRate  double value for forwardAnnualDividendRate.
         * @return Builder
         */
        public Builder forwardAnnualDividendRate(double forwardAnnualDividendRate) {
            this.forwardAnnualDividendRate = forwardAnnualDividendRate;
            return this;
        }

        /**
         * Setter for forwardAnnualDividendYield.
         * @param  forwardAnnualDividendYield  double value for forwardAnnualDividendYield.
         * @return Builder
         */
        public Builder forwardAnnualDividendYield(double forwardAnnualDividendYield) {
            this.forwardAnnualDividendYield = forwardAnnualDividendYield;
            return this;
        }

        /**
         * Setter for payoutRatio.
         * @param  payoutRatio  double value for payoutRatio.
         * @return Builder
         */
        public Builder payoutRatio(double payoutRatio) {
            this.payoutRatio = payoutRatio;
            return this;
        }

        /**
         * Setter for dividendDate.
         * @param  dividendDate  String value for dividendDate.
         * @return Builder
         */
        public Builder dividendDate(String dividendDate) {
            this.dividendDate = dividendDate;
            return this;
        }

        /**
         * Setter for exDividendDate.
         * @param  exDividendDate  String value for exDividendDate.
         * @return Builder
         */
        public Builder exDividendDate(String exDividendDate) {
            this.exDividendDate = exDividendDate;
            return this;
        }

        /**
         * Setter for lastSplitFactor.
         * @param  lastSplitFactor  String value for lastSplitFactor.
         * @return Builder
         */
        public Builder lastSplitFactor(String lastSplitFactor) {
            this.lastSplitFactor = lastSplitFactor;
            return this;
        }

        /**
         * Setter for lastSplitDate.
         * @param  lastSplitDate  String value for lastSplitDate.
         * @return Builder
         */
        public Builder lastSplitDate(String lastSplitDate) {
            this.lastSplitDate = lastSplitDate;
            return this;
        }

        /**
         * Setter for numberDividendsByYear.
         * @param  numberDividendsByYear  Map of String, value for numberDividendsByYear.
         * @return Builder
         */
        public Builder numberDividendsByYear(
                Map<String, GeneratedObject2> numberDividendsByYear) {
            this.numberDividendsByYear = numberDividendsByYear;
            return this;
        }

        /**
         * Builds a new {@link SplitsDividends} object using the set fields.
         * @return {@link SplitsDividends}
         */
        public SplitsDividends build() {
            return new SplitsDividends(forwardAnnualDividendRate, forwardAnnualDividendYield,
                    payoutRatio, dividendDate, exDividendDate, lastSplitFactor, lastSplitDate,
                    numberDividendsByYear);
        }
    }
}
