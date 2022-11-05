/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GeneratedObject4 type.
 */
public class GeneratedObject4 {
    private String name;
    private String date;
    private double totalShares;
    private double totalAssets;
    private int currentShares;
    private int change;
    private double changeP;

    /**
     * Default constructor.
     */
    public GeneratedObject4() {
    }

    /**
     * Initialization constructor.
     * @param  name  String value for name.
     * @param  date  String value for date.
     * @param  totalShares  double value for totalShares.
     * @param  totalAssets  double value for totalAssets.
     * @param  currentShares  int value for currentShares.
     * @param  change  int value for change.
     * @param  changeP  double value for changeP.
     */
    public GeneratedObject4(
            String name,
            String date,
            double totalShares,
            double totalAssets,
            int currentShares,
            int change,
            double changeP) {
        this.name = name;
        this.date = date;
        this.totalShares = totalShares;
        this.totalAssets = totalAssets;
        this.currentShares = currentShares;
        this.change = change;
        this.changeP = changeP;
    }

    /**
     * Getter for Name.
     * @return Returns the String
     */
    @JsonGetter("name")
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
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
     * Getter for TotalShares.
     * @return Returns the double
     */
    @JsonGetter("totalShares")
    public double getTotalShares() {
        return totalShares;
    }

    /**
     * Setter for TotalShares.
     * @param totalShares Value for double
     */
    @JsonSetter("totalShares")
    public void setTotalShares(double totalShares) {
        this.totalShares = totalShares;
    }

    /**
     * Getter for TotalAssets.
     * @return Returns the double
     */
    @JsonGetter("totalAssets")
    public double getTotalAssets() {
        return totalAssets;
    }

    /**
     * Setter for TotalAssets.
     * @param totalAssets Value for double
     */
    @JsonSetter("totalAssets")
    public void setTotalAssets(double totalAssets) {
        this.totalAssets = totalAssets;
    }

    /**
     * Getter for CurrentShares.
     * @return Returns the int
     */
    @JsonGetter("currentShares")
    public int getCurrentShares() {
        return currentShares;
    }

    /**
     * Setter for CurrentShares.
     * @param currentShares Value for int
     */
    @JsonSetter("currentShares")
    public void setCurrentShares(int currentShares) {
        this.currentShares = currentShares;
    }

    /**
     * Getter for Change.
     * @return Returns the int
     */
    @JsonGetter("change")
    public int getChange() {
        return change;
    }

    /**
     * Setter for Change.
     * @param change Value for int
     */
    @JsonSetter("change")
    public void setChange(int change) {
        this.change = change;
    }

    /**
     * Getter for ChangeP.
     * @return Returns the double
     */
    @JsonGetter("change_p")
    public double getChangeP() {
        return changeP;
    }

    /**
     * Setter for ChangeP.
     * @param changeP Value for double
     */
    @JsonSetter("change_p")
    public void setChangeP(double changeP) {
        this.changeP = changeP;
    }

    /**
     * Converts this GeneratedObject4 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneratedObject4 [" + "name=" + name + ", date=" + date + ", totalShares="
                + totalShares + ", totalAssets=" + totalAssets + ", currentShares=" + currentShares
                + ", change=" + change + ", changeP=" + changeP + "]";
    }

    /**
     * Builds a new {@link GeneratedObject4.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneratedObject4.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(name, date, totalShares, totalAssets, currentShares, change,
                changeP);
        return builder;
    }

    /**
     * Class to build instances of {@link GeneratedObject4}.
     */
    public static class Builder {
        private String name;
        private String date;
        private double totalShares;
        private double totalAssets;
        private int currentShares;
        private int change;
        private double changeP;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  name  String value for name.
         * @param  date  String value for date.
         * @param  totalShares  double value for totalShares.
         * @param  totalAssets  double value for totalAssets.
         * @param  currentShares  int value for currentShares.
         * @param  change  int value for change.
         * @param  changeP  double value for changeP.
         */
        public Builder(String name, String date, double totalShares, double totalAssets,
                int currentShares, int change, double changeP) {
            this.name = name;
            this.date = date;
            this.totalShares = totalShares;
            this.totalAssets = totalAssets;
            this.currentShares = currentShares;
            this.change = change;
            this.changeP = changeP;
        }

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
         * Setter for date.
         * @param  date  String value for date.
         * @return Builder
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * Setter for totalShares.
         * @param  totalShares  double value for totalShares.
         * @return Builder
         */
        public Builder totalShares(double totalShares) {
            this.totalShares = totalShares;
            return this;
        }

        /**
         * Setter for totalAssets.
         * @param  totalAssets  double value for totalAssets.
         * @return Builder
         */
        public Builder totalAssets(double totalAssets) {
            this.totalAssets = totalAssets;
            return this;
        }

        /**
         * Setter for currentShares.
         * @param  currentShares  int value for currentShares.
         * @return Builder
         */
        public Builder currentShares(int currentShares) {
            this.currentShares = currentShares;
            return this;
        }

        /**
         * Setter for change.
         * @param  change  int value for change.
         * @return Builder
         */
        public Builder change(int change) {
            this.change = change;
            return this;
        }

        /**
         * Setter for changeP.
         * @param  changeP  double value for changeP.
         * @return Builder
         */
        public Builder changeP(double changeP) {
            this.changeP = changeP;
            return this;
        }

        /**
         * Builds a new {@link GeneratedObject4} object using the set fields.
         * @return {@link GeneratedObject4}
         */
        public GeneratedObject4 build() {
            return new GeneratedObject4(name, date, totalShares, totalAssets, currentShares, change,
                    changeP);
        }
    }
}
