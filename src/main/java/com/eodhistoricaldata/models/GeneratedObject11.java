/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GeneratedObject11 type.
 */
public class GeneratedObject11 {
    private String date;
    private String dateFormatted;
    private String sharesMln;
    private long shares;

    /**
     * Default constructor.
     */
    public GeneratedObject11() {
    }

    /**
     * Initialization constructor.
     * @param  date  String value for date.
     * @param  dateFormatted  String value for dateFormatted.
     * @param  sharesMln  String value for sharesMln.
     * @param  shares  long value for shares.
     */
    public GeneratedObject11(
            String date,
            String dateFormatted,
            String sharesMln,
            long shares) {
        this.date = date;
        this.dateFormatted = dateFormatted;
        this.sharesMln = sharesMln;
        this.shares = shares;
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
     * Getter for DateFormatted.
     * @return Returns the String
     */
    @JsonGetter("dateFormatted")
    public String getDateFormatted() {
        return dateFormatted;
    }

    /**
     * Setter for DateFormatted.
     * @param dateFormatted Value for String
     */
    @JsonSetter("dateFormatted")
    public void setDateFormatted(String dateFormatted) {
        this.dateFormatted = dateFormatted;
    }

    /**
     * Getter for SharesMln.
     * @return Returns the String
     */
    @JsonGetter("sharesMln")
    public String getSharesMln() {
        return sharesMln;
    }

    /**
     * Setter for SharesMln.
     * @param sharesMln Value for String
     */
    @JsonSetter("sharesMln")
    public void setSharesMln(String sharesMln) {
        this.sharesMln = sharesMln;
    }

    /**
     * Getter for Shares.
     * @return Returns the long
     */
    @JsonGetter("shares")
    public long getShares() {
        return shares;
    }

    /**
     * Setter for Shares.
     * @param shares Value for long
     */
    @JsonSetter("shares")
    public void setShares(long shares) {
        this.shares = shares;
    }

    /**
     * Converts this GeneratedObject11 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneratedObject11 [" + "date=" + date + ", dateFormatted=" + dateFormatted
                + ", sharesMln=" + sharesMln + ", shares=" + shares + "]";
    }

    /**
     * Builds a new {@link GeneratedObject11.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneratedObject11.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(date, dateFormatted, sharesMln, shares);
        return builder;
    }

    /**
     * Class to build instances of {@link GeneratedObject11}.
     */
    public static class Builder {
        private String date;
        private String dateFormatted;
        private String sharesMln;
        private long shares;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  date  String value for date.
         * @param  dateFormatted  String value for dateFormatted.
         * @param  sharesMln  String value for sharesMln.
         * @param  shares  long value for shares.
         */
        public Builder(String date, String dateFormatted, String sharesMln, long shares) {
            this.date = date;
            this.dateFormatted = dateFormatted;
            this.sharesMln = sharesMln;
            this.shares = shares;
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
         * Setter for dateFormatted.
         * @param  dateFormatted  String value for dateFormatted.
         * @return Builder
         */
        public Builder dateFormatted(String dateFormatted) {
            this.dateFormatted = dateFormatted;
            return this;
        }

        /**
         * Setter for sharesMln.
         * @param  sharesMln  String value for sharesMln.
         * @return Builder
         */
        public Builder sharesMln(String sharesMln) {
            this.sharesMln = sharesMln;
            return this;
        }

        /**
         * Setter for shares.
         * @param  shares  long value for shares.
         * @return Builder
         */
        public Builder shares(long shares) {
            this.shares = shares;
            return this;
        }

        /**
         * Builds a new {@link GeneratedObject11} object using the set fields.
         * @return {@link GeneratedObject11}
         */
        public GeneratedObject11 build() {
            return new GeneratedObject11(date, dateFormatted, sharesMln, shares);
        }
    }
}
