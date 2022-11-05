/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GeneratedObject16 type.
 */
public class GeneratedObject16 {
    private String date;
    private double epsActual;

    /**
     * Default constructor.
     */
    public GeneratedObject16() {
    }

    /**
     * Initialization constructor.
     * @param  date  String value for date.
     * @param  epsActual  double value for epsActual.
     */
    public GeneratedObject16(
            String date,
            double epsActual) {
        this.date = date;
        this.epsActual = epsActual;
    }

    /**
     * Getter for Date.
     * @return Returns the String
     */
    @JsonGetter("date")
    public String getDate() {
        return date;
    }

    /**
     * Setter for Date.
     * @param date Value for String
     */
    @JsonSetter("date")
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter for EpsActual.
     * @return Returns the double
     */
    @JsonGetter("epsActual")
    public double getEpsActual() {
        return epsActual;
    }

    /**
     * Setter for EpsActual.
     * @param epsActual Value for double
     */
    @JsonSetter("epsActual")
    public void setEpsActual(double epsActual) {
        this.epsActual = epsActual;
    }

    /**
     * Converts this GeneratedObject16 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneratedObject16 [" + "date=" + date + ", epsActual=" + epsActual + "]";
    }

    /**
     * Builds a new {@link GeneratedObject16.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneratedObject16.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(date, epsActual);
        return builder;
    }

    /**
     * Class to build instances of {@link GeneratedObject16}.
     */
    public static class Builder {
        private String date;
        private double epsActual;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  date  String value for date.
         * @param  epsActual  double value for epsActual.
         */
        public Builder(String date, double epsActual) {
            this.date = date;
            this.epsActual = epsActual;
        }

        /**
         * Setter for date.
         * @param  date  String value for date.
         * @return Builder
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * Setter for epsActual.
         * @param  epsActual  double value for epsActual.
         * @return Builder
         */
        public Builder epsActual(double epsActual) {
            this.epsActual = epsActual;
            return this;
        }

        /**
         * Builds a new {@link GeneratedObject16} object using the set fields.
         * @return {@link GeneratedObject16}
         */
        public GeneratedObject16 build() {
            return new GeneratedObject16(date, epsActual);
        }
    }
}
