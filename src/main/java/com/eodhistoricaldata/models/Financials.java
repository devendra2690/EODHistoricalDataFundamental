/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Financials type.
 */
public class Financials {
    private BalanceSheet balanceSheet;
    private CashFlow cashFlow;
    private IncomeStatement incomeStatement;

    /**
     * Default constructor.
     */
    public Financials() {
    }

    /**
     * Initialization constructor.
     * @param  balanceSheet  BalanceSheet value for balanceSheet.
     * @param  cashFlow  CashFlow value for cashFlow.
     * @param  incomeStatement  IncomeStatement value for incomeStatement.
     */
    public Financials(
            BalanceSheet balanceSheet,
            CashFlow cashFlow,
            IncomeStatement incomeStatement) {
        this.balanceSheet = balanceSheet;
        this.cashFlow = cashFlow;
        this.incomeStatement = incomeStatement;
    }

    /**
     * Getter for BalanceSheet.
     * @return Returns the BalanceSheet
     */
    @JsonGetter("BalanceSheet")
    public BalanceSheet getBalanceSheet() {
        return balanceSheet;
    }

    /**
     * Setter for BalanceSheet.
     * @param balanceSheet Value for BalanceSheet
     */
    @JsonSetter("BalanceSheet")
    public void setBalanceSheet(BalanceSheet balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    /**
     * Getter for CashFlow.
     * @return Returns the CashFlow
     */
    @JsonGetter("Cash_Flow")
    public CashFlow getCashFlow() {
        return cashFlow;
    }

    /**
     * Setter for CashFlow.
     * @param cashFlow Value for CashFlow
     */
    @JsonSetter("Cash_Flow")
    public void setCashFlow(CashFlow cashFlow) {
        this.cashFlow = cashFlow;
    }

    /**
     * Getter for IncomeStatement.
     * @return Returns the IncomeStatement
     */
    @JsonGetter("Income_Statement")
    public IncomeStatement getIncomeStatement() {
        return incomeStatement;
    }

    /**
     * Setter for IncomeStatement.
     * @param incomeStatement Value for IncomeStatement
     */
    @JsonSetter("Income_Statement")
    public void setIncomeStatement(IncomeStatement incomeStatement) {
        this.incomeStatement = incomeStatement;
    }

    /**
     * Converts this Financials into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Financials [" + "balanceSheet=" + balanceSheet + ", cashFlow=" + cashFlow
                + ", incomeStatement=" + incomeStatement + "]";
    }

    /**
     * Builds a new {@link Financials.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Financials.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(balanceSheet, cashFlow, incomeStatement);
        return builder;
    }

    /**
     * Class to build instances of {@link Financials}.
     */
    public static class Builder {
        private BalanceSheet balanceSheet;
        private CashFlow cashFlow;
        private IncomeStatement incomeStatement;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  balanceSheet  BalanceSheet value for balanceSheet.
         * @param  cashFlow  CashFlow value for cashFlow.
         * @param  incomeStatement  IncomeStatement value for incomeStatement.
         */
        public Builder(BalanceSheet balanceSheet, CashFlow cashFlow,
                IncomeStatement incomeStatement) {
            this.balanceSheet = balanceSheet;
            this.cashFlow = cashFlow;
            this.incomeStatement = incomeStatement;
        }

        /**
         * Setter for balanceSheet.
         * @param  balanceSheet  BalanceSheet value for balanceSheet.
         * @return Builder
         */
        public Builder balanceSheet(BalanceSheet balanceSheet) {
            this.balanceSheet = balanceSheet;
            return this;
        }

        /**
         * Setter for cashFlow.
         * @param  cashFlow  CashFlow value for cashFlow.
         * @return Builder
         */
        public Builder cashFlow(CashFlow cashFlow) {
            this.cashFlow = cashFlow;
            return this;
        }

        /**
         * Setter for incomeStatement.
         * @param  incomeStatement  IncomeStatement value for incomeStatement.
         * @return Builder
         */
        public Builder incomeStatement(IncomeStatement incomeStatement) {
            this.incomeStatement = incomeStatement;
            return this;
        }

        /**
         * Builds a new {@link Financials} object using the set fields.
         * @return {@link Financials}
         */
        public Financials build() {
            return new Financials(balanceSheet, cashFlow, incomeStatement);
        }
    }
}
