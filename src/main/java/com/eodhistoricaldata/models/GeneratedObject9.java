/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GeneratedObject9 type.
 */
public class GeneratedObject9 {
    private String activity;
    private String involvement;

    /**
     * Default constructor.
     */
    public GeneratedObject9() {
    }

    /**
     * Initialization constructor.
     * @param  activity  String value for activity.
     * @param  involvement  String value for involvement.
     */
    public GeneratedObject9(
            String activity,
            String involvement) {
        this.activity = activity;
        this.involvement = involvement;
    }

    /**
     * Getter for Activity.
     * @return Returns the String
     */
    @JsonGetter("Activity")
    public String getActivity() {
        return activity;
    }

    /**
     * Setter for Activity.
     * @param activity Value for String
     */
    @JsonSetter("Activity")
    public void setActivity(String activity) {
        this.activity = activity;
    }

    /**
     * Getter for Involvement.
     * @return Returns the String
     */
    @JsonGetter("Involvement")
    public String getInvolvement() {
        return involvement;
    }

    /**
     * Setter for Involvement.
     * @param involvement Value for String
     */
    @JsonSetter("Involvement")
    public void setInvolvement(String involvement) {
        this.involvement = involvement;
    }

    /**
     * Converts this GeneratedObject9 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneratedObject9 [" + "activity=" + activity + ", involvement=" + involvement + "]";
    }

    /**
     * Builds a new {@link GeneratedObject9.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneratedObject9.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(activity, involvement);
        return builder;
    }

    /**
     * Class to build instances of {@link GeneratedObject9}.
     */
    public static class Builder {
        private String activity;
        private String involvement;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  activity  String value for activity.
         * @param  involvement  String value for involvement.
         */
        public Builder(String activity, String involvement) {
            this.activity = activity;
            this.involvement = involvement;
        }

        /**
         * Setter for activity.
         * @param  activity  String value for activity.
         * @return Builder
         */
        public Builder activity(String activity) {
            this.activity = activity;
            return this;
        }

        /**
         * Setter for involvement.
         * @param  involvement  String value for involvement.
         * @return Builder
         */
        public Builder involvement(String involvement) {
            this.involvement = involvement;
            return this;
        }

        /**
         * Builds a new {@link GeneratedObject9} object using the set fields.
         * @return {@link GeneratedObject9}
         */
        public GeneratedObject9 build() {
            return new GeneratedObject9(activity, involvement);
        }
    }
}