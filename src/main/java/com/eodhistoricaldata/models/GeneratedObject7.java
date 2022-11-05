/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for GeneratedObject7 type.
 */
public class GeneratedObject7 {
    private String date;
    private String ownerCik;
    private String ownerName;
    private String transactionDate;
    private String transactionCode;
    private int transactionAmount;
    private double transactionPrice;
    private String transactionAcquiredDisposed;
    private int postTransactionAmount;
    private String secLink;

    /**
     * Default constructor.
     */
    public GeneratedObject7() {
    }

    /**
     * Initialization constructor.
     * @param  date  String value for date.
     * @param  ownerCik  String value for ownerCik.
     * @param  ownerName  String value for ownerName.
     * @param  transactionDate  String value for transactionDate.
     * @param  transactionCode  String value for transactionCode.
     * @param  transactionAmount  int value for transactionAmount.
     * @param  transactionPrice  double value for transactionPrice.
     * @param  transactionAcquiredDisposed  String value for transactionAcquiredDisposed.
     * @param  postTransactionAmount  int value for postTransactionAmount.
     * @param  secLink  String value for secLink.
     */
    public GeneratedObject7(
            String date,
            String ownerCik,
            String ownerName,
            String transactionDate,
            String transactionCode,
            int transactionAmount,
            double transactionPrice,
            String transactionAcquiredDisposed,
            int postTransactionAmount,
            String secLink) {
        this.date = date;
        this.ownerCik = ownerCik;
        this.ownerName = ownerName;
        this.transactionDate = transactionDate;
        this.transactionCode = transactionCode;
        this.transactionAmount = transactionAmount;
        this.transactionPrice = transactionPrice;
        this.transactionAcquiredDisposed = transactionAcquiredDisposed;
        this.postTransactionAmount = postTransactionAmount;
        this.secLink = secLink;
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
     * Getter for OwnerCik.
     * @return Returns the String
     */
    @JsonGetter("ownerCik")
    public String getOwnerCik() {
        return ownerCik;
    }

    /**
     * Setter for OwnerCik.
     * @param ownerCik Value for String
     */
    @JsonSetter("ownerCik")
    public void setOwnerCik(String ownerCik) {
        this.ownerCik = ownerCik;
    }

    /**
     * Getter for OwnerName.
     * @return Returns the String
     */
    @JsonGetter("ownerName")
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Setter for OwnerName.
     * @param ownerName Value for String
     */
    @JsonSetter("ownerName")
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * Getter for TransactionDate.
     * @return Returns the String
     */
    @JsonGetter("transactionDate")
    public String getTransactionDate() {
        return transactionDate;
    }

    /**
     * Setter for TransactionDate.
     * @param transactionDate Value for String
     */
    @JsonSetter("transactionDate")
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    /**
     * Getter for TransactionCode.
     * @return Returns the String
     */
    @JsonGetter("transactionCode")
    public String getTransactionCode() {
        return transactionCode;
    }

    /**
     * Setter for TransactionCode.
     * @param transactionCode Value for String
     */
    @JsonSetter("transactionCode")
    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    /**
     * Getter for TransactionAmount.
     * @return Returns the int
     */
    @JsonGetter("transactionAmount")
    public int getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter for TransactionAmount.
     * @param transactionAmount Value for int
     */
    @JsonSetter("transactionAmount")
    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Getter for TransactionPrice.
     * @return Returns the double
     */
    @JsonGetter("transactionPrice")
    public double getTransactionPrice() {
        return transactionPrice;
    }

    /**
     * Setter for TransactionPrice.
     * @param transactionPrice Value for double
     */
    @JsonSetter("transactionPrice")
    public void setTransactionPrice(double transactionPrice) {
        this.transactionPrice = transactionPrice;
    }

    /**
     * Getter for TransactionAcquiredDisposed.
     * @return Returns the String
     */
    @JsonGetter("transactionAcquiredDisposed")
    public String getTransactionAcquiredDisposed() {
        return transactionAcquiredDisposed;
    }

    /**
     * Setter for TransactionAcquiredDisposed.
     * @param transactionAcquiredDisposed Value for String
     */
    @JsonSetter("transactionAcquiredDisposed")
    public void setTransactionAcquiredDisposed(String transactionAcquiredDisposed) {
        this.transactionAcquiredDisposed = transactionAcquiredDisposed;
    }

    /**
     * Getter for PostTransactionAmount.
     * @return Returns the int
     */
    @JsonGetter("postTransactionAmount")
    public int getPostTransactionAmount() {
        return postTransactionAmount;
    }

    /**
     * Setter for PostTransactionAmount.
     * @param postTransactionAmount Value for int
     */
    @JsonSetter("postTransactionAmount")
    public void setPostTransactionAmount(int postTransactionAmount) {
        this.postTransactionAmount = postTransactionAmount;
    }

    /**
     * Getter for SecLink.
     * @return Returns the String
     */
    @JsonGetter("secLink")
    public String getSecLink() {
        return secLink;
    }

    /**
     * Setter for SecLink.
     * @param secLink Value for String
     */
    @JsonSetter("secLink")
    public void setSecLink(String secLink) {
        this.secLink = secLink;
    }

    /**
     * Converts this GeneratedObject7 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "GeneratedObject7 [" + "date=" + date + ", ownerCik=" + ownerCik + ", ownerName="
                + ownerName + ", transactionDate=" + transactionDate + ", transactionCode="
                + transactionCode + ", transactionAmount=" + transactionAmount
                + ", transactionPrice=" + transactionPrice + ", transactionAcquiredDisposed="
                + transactionAcquiredDisposed + ", postTransactionAmount=" + postTransactionAmount
                + ", secLink=" + secLink + "]";
    }

    /**
     * Builds a new {@link GeneratedObject7.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link GeneratedObject7.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(date, ownerCik, ownerName, transactionDate, transactionCode,
                transactionAmount, transactionPrice, transactionAcquiredDisposed,
                postTransactionAmount, secLink);
        return builder;
    }

    /**
     * Class to build instances of {@link GeneratedObject7}.
     */
    public static class Builder {
        private String date;
        private String ownerCik;
        private String ownerName;
        private String transactionDate;
        private String transactionCode;
        private int transactionAmount;
        private double transactionPrice;
        private String transactionAcquiredDisposed;
        private int postTransactionAmount;
        private String secLink;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  date  String value for date.
         * @param  ownerCik  String value for ownerCik.
         * @param  ownerName  String value for ownerName.
         * @param  transactionDate  String value for transactionDate.
         * @param  transactionCode  String value for transactionCode.
         * @param  transactionAmount  int value for transactionAmount.
         * @param  transactionPrice  double value for transactionPrice.
         * @param  transactionAcquiredDisposed  String value for transactionAcquiredDisposed.
         * @param  postTransactionAmount  int value for postTransactionAmount.
         * @param  secLink  String value for secLink.
         */
        public Builder(String date, String ownerCik, String ownerName, String transactionDate,
                String transactionCode, int transactionAmount, double transactionPrice,
                String transactionAcquiredDisposed, int postTransactionAmount, String secLink) {
            this.date = date;
            this.ownerCik = ownerCik;
            this.ownerName = ownerName;
            this.transactionDate = transactionDate;
            this.transactionCode = transactionCode;
            this.transactionAmount = transactionAmount;
            this.transactionPrice = transactionPrice;
            this.transactionAcquiredDisposed = transactionAcquiredDisposed;
            this.postTransactionAmount = postTransactionAmount;
            this.secLink = secLink;
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
         * Setter for ownerCik.
         * @param  ownerCik  String value for ownerCik.
         * @return Builder
         */
        public Builder ownerCik(String ownerCik) {
            this.ownerCik = ownerCik;
            return this;
        }

        /**
         * Setter for ownerName.
         * @param  ownerName  String value for ownerName.
         * @return Builder
         */
        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        /**
         * Setter for transactionDate.
         * @param  transactionDate  String value for transactionDate.
         * @return Builder
         */
        public Builder transactionDate(String transactionDate) {
            this.transactionDate = transactionDate;
            return this;
        }

        /**
         * Setter for transactionCode.
         * @param  transactionCode  String value for transactionCode.
         * @return Builder
         */
        public Builder transactionCode(String transactionCode) {
            this.transactionCode = transactionCode;
            return this;
        }

        /**
         * Setter for transactionAmount.
         * @param  transactionAmount  int value for transactionAmount.
         * @return Builder
         */
        public Builder transactionAmount(int transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }

        /**
         * Setter for transactionPrice.
         * @param  transactionPrice  double value for transactionPrice.
         * @return Builder
         */
        public Builder transactionPrice(double transactionPrice) {
            this.transactionPrice = transactionPrice;
            return this;
        }

        /**
         * Setter for transactionAcquiredDisposed.
         * @param  transactionAcquiredDisposed  String value for transactionAcquiredDisposed.
         * @return Builder
         */
        public Builder transactionAcquiredDisposed(String transactionAcquiredDisposed) {
            this.transactionAcquiredDisposed = transactionAcquiredDisposed;
            return this;
        }

        /**
         * Setter for postTransactionAmount.
         * @param  postTransactionAmount  int value for postTransactionAmount.
         * @return Builder
         */
        public Builder postTransactionAmount(int postTransactionAmount) {
            this.postTransactionAmount = postTransactionAmount;
            return this;
        }

        /**
         * Setter for secLink.
         * @param  secLink  String value for secLink.
         * @return Builder
         */
        public Builder secLink(String secLink) {
            this.secLink = secLink;
            return this;
        }

        /**
         * Builds a new {@link GeneratedObject7} object using the set fields.
         * @return {@link GeneratedObject7}
         */
        public GeneratedObject7 build() {
            return new GeneratedObject7(date, ownerCik, ownerName, transactionDate, transactionCode,
                    transactionAmount, transactionPrice, transactionAcquiredDisposed,
                    postTransactionAmount, secLink);
        }
    }
}
