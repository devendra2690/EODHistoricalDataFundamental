/*
 * EODHistoricalDataFundamentalLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.eodhistoricaldata.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for Highlights type.
 */
public class Highlights {
    private long marketCapitalization;
    private double marketCapitalizationMln;
    private long eBITDA;
    private double pERatio;
    private double pEGRatio;
    private double wallStreetTargetPrice;
    private double bookValue;
    private double dividendShare;
    private double dividendYield;
    private double earningsShare;
    private double ePSEstimateCurrentYear;
    private double ePSEstimateNextYear;
    private double ePSEstimateNextQuarter;
    private double ePSEstimateCurrentQuarter;
    private String mostRecentQuarter;
    private double profitMargin;
    private double operatingMarginTTM;
    private double returnOnAssetsTTM;
    private double returnOnEquityTTM;
    private long revenueTTM;
    private double revenuePerShareTTM;
    private double quarterlyRevenueGrowthYOY;
    private long grossProfitTTM;
    private double dilutedEpsTTM;
    private double quarterlyEarningsGrowthYOY;

    /**
     * Default constructor.
     */
    public Highlights() {
    }

    /**
     * Initialization constructor.
     * @param  marketCapitalization  long value for marketCapitalization.
     * @param  marketCapitalizationMln  double value for marketCapitalizationMln.
     * @param  eBITDA  long value for eBITDA.
     * @param  pERatio  double value for pERatio.
     * @param  pEGRatio  double value for pEGRatio.
     * @param  wallStreetTargetPrice  double value for wallStreetTargetPrice.
     * @param  bookValue  double value for bookValue.
     * @param  dividendShare  double value for dividendShare.
     * @param  dividendYield  double value for dividendYield.
     * @param  earningsShare  double value for earningsShare.
     * @param  ePSEstimateCurrentYear  double value for ePSEstimateCurrentYear.
     * @param  ePSEstimateNextYear  double value for ePSEstimateNextYear.
     * @param  ePSEstimateNextQuarter  double value for ePSEstimateNextQuarter.
     * @param  ePSEstimateCurrentQuarter  double value for ePSEstimateCurrentQuarter.
     * @param  mostRecentQuarter  String value for mostRecentQuarter.
     * @param  profitMargin  double value for profitMargin.
     * @param  operatingMarginTTM  double value for operatingMarginTTM.
     * @param  returnOnAssetsTTM  double value for returnOnAssetsTTM.
     * @param  returnOnEquityTTM  double value for returnOnEquityTTM.
     * @param  revenueTTM  long value for revenueTTM.
     * @param  revenuePerShareTTM  double value for revenuePerShareTTM.
     * @param  quarterlyRevenueGrowthYOY  double value for quarterlyRevenueGrowthYOY.
     * @param  grossProfitTTM  long value for grossProfitTTM.
     * @param  dilutedEpsTTM  double value for dilutedEpsTTM.
     * @param  quarterlyEarningsGrowthYOY  double value for quarterlyEarningsGrowthYOY.
     */
    public Highlights(
            long marketCapitalization,
            double marketCapitalizationMln,
            long eBITDA,
            double pERatio,
            double pEGRatio,
            double wallStreetTargetPrice,
            double bookValue,
            double dividendShare,
            double dividendYield,
            double earningsShare,
            double ePSEstimateCurrentYear,
            double ePSEstimateNextYear,
            double ePSEstimateNextQuarter,
            double ePSEstimateCurrentQuarter,
            String mostRecentQuarter,
            double profitMargin,
            double operatingMarginTTM,
            double returnOnAssetsTTM,
            double returnOnEquityTTM,
            long revenueTTM,
            double revenuePerShareTTM,
            double quarterlyRevenueGrowthYOY,
            long grossProfitTTM,
            double dilutedEpsTTM,
            double quarterlyEarningsGrowthYOY) {
        this.marketCapitalization = marketCapitalization;
        this.marketCapitalizationMln = marketCapitalizationMln;
        this.eBITDA = eBITDA;
        this.pERatio = pERatio;
        this.pEGRatio = pEGRatio;
        this.wallStreetTargetPrice = wallStreetTargetPrice;
        this.bookValue = bookValue;
        this.dividendShare = dividendShare;
        this.dividendYield = dividendYield;
        this.earningsShare = earningsShare;
        this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
        this.ePSEstimateNextYear = ePSEstimateNextYear;
        this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
        this.ePSEstimateCurrentQuarter = ePSEstimateCurrentQuarter;
        this.mostRecentQuarter = mostRecentQuarter;
        this.profitMargin = profitMargin;
        this.operatingMarginTTM = operatingMarginTTM;
        this.returnOnAssetsTTM = returnOnAssetsTTM;
        this.returnOnEquityTTM = returnOnEquityTTM;
        this.revenueTTM = revenueTTM;
        this.revenuePerShareTTM = revenuePerShareTTM;
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
        this.grossProfitTTM = grossProfitTTM;
        this.dilutedEpsTTM = dilutedEpsTTM;
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    /**
     * Getter for MarketCapitalization.
     * @return Returns the long
     */
    @JsonGetter("MarketCapitalization")
    public long getMarketCapitalization() {
        return marketCapitalization;
    }

    /**
     * Setter for MarketCapitalization.
     * @param marketCapitalization Value for long
     */
    @JsonSetter("MarketCapitalization")
    public void setMarketCapitalization(long marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    /**
     * Getter for MarketCapitalizationMln.
     * @return Returns the double
     */
    @JsonGetter("MarketCapitalizationMln")
    public double getMarketCapitalizationMln() {
        return marketCapitalizationMln;
    }

    /**
     * Setter for MarketCapitalizationMln.
     * @param marketCapitalizationMln Value for double
     */
    @JsonSetter("MarketCapitalizationMln")
    public void setMarketCapitalizationMln(double marketCapitalizationMln) {
        this.marketCapitalizationMln = marketCapitalizationMln;
    }

    /**
     * Getter for EBITDA.
     * @return Returns the long
     */
    @JsonGetter("EBITDA")
    public long getEBITDA() {
        return eBITDA;
    }

    /**
     * Setter for EBITDA.
     * @param eBITDA Value for long
     */
    @JsonSetter("EBITDA")
    public void setEBITDA(long eBITDA) {
        this.eBITDA = eBITDA;
    }

    /**
     * Getter for PERatio.
     * @return Returns the double
     */
    @JsonGetter("PERatio")
    public double getPERatio() {
        return pERatio;
    }

    /**
     * Setter for PERatio.
     * @param pERatio Value for double
     */
    @JsonSetter("PERatio")
    public void setPERatio(double pERatio) {
        this.pERatio = pERatio;
    }

    /**
     * Getter for PEGRatio.
     * @return Returns the double
     */
    @JsonGetter("PEGRatio")
    public double getPEGRatio() {
        return pEGRatio;
    }

    /**
     * Setter for PEGRatio.
     * @param pEGRatio Value for double
     */
    @JsonSetter("PEGRatio")
    public void setPEGRatio(double pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    /**
     * Getter for WallStreetTargetPrice.
     * @return Returns the double
     */
    @JsonGetter("WallStreetTargetPrice")
    public double getWallStreetTargetPrice() {
        return wallStreetTargetPrice;
    }

    /**
     * Setter for WallStreetTargetPrice.
     * @param wallStreetTargetPrice Value for double
     */
    @JsonSetter("WallStreetTargetPrice")
    public void setWallStreetTargetPrice(double wallStreetTargetPrice) {
        this.wallStreetTargetPrice = wallStreetTargetPrice;
    }

    /**
     * Getter for BookValue.
     * @return Returns the double
     */
    @JsonGetter("BookValue")
    public double getBookValue() {
        return bookValue;
    }

    /**
     * Setter for BookValue.
     * @param bookValue Value for double
     */
    @JsonSetter("BookValue")
    public void setBookValue(double bookValue) {
        this.bookValue = bookValue;
    }

    /**
     * Getter for DividendShare.
     * @return Returns the double
     */
    @JsonGetter("DividendShare")
    public double getDividendShare() {
        return dividendShare;
    }

    /**
     * Setter for DividendShare.
     * @param dividendShare Value for double
     */
    @JsonSetter("DividendShare")
    public void setDividendShare(double dividendShare) {
        this.dividendShare = dividendShare;
    }

    /**
     * Getter for DividendYield.
     * @return Returns the double
     */
    @JsonGetter("DividendYield")
    public double getDividendYield() {
        return dividendYield;
    }

    /**
     * Setter for DividendYield.
     * @param dividendYield Value for double
     */
    @JsonSetter("DividendYield")
    public void setDividendYield(double dividendYield) {
        this.dividendYield = dividendYield;
    }

    /**
     * Getter for EarningsShare.
     * @return Returns the double
     */
    @JsonGetter("EarningsShare")
    public double getEarningsShare() {
        return earningsShare;
    }

    /**
     * Setter for EarningsShare.
     * @param earningsShare Value for double
     */
    @JsonSetter("EarningsShare")
    public void setEarningsShare(double earningsShare) {
        this.earningsShare = earningsShare;
    }

    /**
     * Getter for EPSEstimateCurrentYear.
     * @return Returns the double
     */
    @JsonGetter("EPSEstimateCurrentYear")
    public double getEPSEstimateCurrentYear() {
        return ePSEstimateCurrentYear;
    }

    /**
     * Setter for EPSEstimateCurrentYear.
     * @param ePSEstimateCurrentYear Value for double
     */
    @JsonSetter("EPSEstimateCurrentYear")
    public void setEPSEstimateCurrentYear(double ePSEstimateCurrentYear) {
        this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
    }

    /**
     * Getter for EPSEstimateNextYear.
     * @return Returns the double
     */
    @JsonGetter("EPSEstimateNextYear")
    public double getEPSEstimateNextYear() {
        return ePSEstimateNextYear;
    }

    /**
     * Setter for EPSEstimateNextYear.
     * @param ePSEstimateNextYear Value for double
     */
    @JsonSetter("EPSEstimateNextYear")
    public void setEPSEstimateNextYear(double ePSEstimateNextYear) {
        this.ePSEstimateNextYear = ePSEstimateNextYear;
    }

    /**
     * Getter for EPSEstimateNextQuarter.
     * @return Returns the double
     */
    @JsonGetter("EPSEstimateNextQuarter")
    public double getEPSEstimateNextQuarter() {
        return ePSEstimateNextQuarter;
    }

    /**
     * Setter for EPSEstimateNextQuarter.
     * @param ePSEstimateNextQuarter Value for double
     */
    @JsonSetter("EPSEstimateNextQuarter")
    public void setEPSEstimateNextQuarter(double ePSEstimateNextQuarter) {
        this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
    }

    /**
     * Getter for EPSEstimateCurrentQuarter.
     * @return Returns the double
     */
    @JsonGetter("EPSEstimateCurrentQuarter")
    public double getEPSEstimateCurrentQuarter() {
        return ePSEstimateCurrentQuarter;
    }

    /**
     * Setter for EPSEstimateCurrentQuarter.
     * @param ePSEstimateCurrentQuarter Value for double
     */
    @JsonSetter("EPSEstimateCurrentQuarter")
    public void setEPSEstimateCurrentQuarter(double ePSEstimateCurrentQuarter) {
        this.ePSEstimateCurrentQuarter = ePSEstimateCurrentQuarter;
    }

    /**
     * Getter for MostRecentQuarter.
     * @return Returns the String
     */
    @JsonGetter("MostRecentQuarter")
    public String getMostRecentQuarter() {
        return mostRecentQuarter;
    }

    /**
     * Setter for MostRecentQuarter.
     * @param mostRecentQuarter Value for String
     */
    @JsonSetter("MostRecentQuarter")
    public void setMostRecentQuarter(String mostRecentQuarter) {
        this.mostRecentQuarter = mostRecentQuarter;
    }

    /**
     * Getter for ProfitMargin.
     * @return Returns the double
     */
    @JsonGetter("ProfitMargin")
    public double getProfitMargin() {
        return profitMargin;
    }

    /**
     * Setter for ProfitMargin.
     * @param profitMargin Value for double
     */
    @JsonSetter("ProfitMargin")
    public void setProfitMargin(double profitMargin) {
        this.profitMargin = profitMargin;
    }

    /**
     * Getter for OperatingMarginTTM.
     * @return Returns the double
     */
    @JsonGetter("OperatingMarginTTM")
    public double getOperatingMarginTTM() {
        return operatingMarginTTM;
    }

    /**
     * Setter for OperatingMarginTTM.
     * @param operatingMarginTTM Value for double
     */
    @JsonSetter("OperatingMarginTTM")
    public void setOperatingMarginTTM(double operatingMarginTTM) {
        this.operatingMarginTTM = operatingMarginTTM;
    }

    /**
     * Getter for ReturnOnAssetsTTM.
     * @return Returns the double
     */
    @JsonGetter("ReturnOnAssetsTTM")
    public double getReturnOnAssetsTTM() {
        return returnOnAssetsTTM;
    }

    /**
     * Setter for ReturnOnAssetsTTM.
     * @param returnOnAssetsTTM Value for double
     */
    @JsonSetter("ReturnOnAssetsTTM")
    public void setReturnOnAssetsTTM(double returnOnAssetsTTM) {
        this.returnOnAssetsTTM = returnOnAssetsTTM;
    }

    /**
     * Getter for ReturnOnEquityTTM.
     * @return Returns the double
     */
    @JsonGetter("ReturnOnEquityTTM")
    public double getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    /**
     * Setter for ReturnOnEquityTTM.
     * @param returnOnEquityTTM Value for double
     */
    @JsonSetter("ReturnOnEquityTTM")
    public void setReturnOnEquityTTM(double returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    /**
     * Getter for RevenueTTM.
     * @return Returns the long
     */
    @JsonGetter("RevenueTTM")
    public long getRevenueTTM() {
        return revenueTTM;
    }

    /**
     * Setter for RevenueTTM.
     * @param revenueTTM Value for long
     */
    @JsonSetter("RevenueTTM")
    public void setRevenueTTM(long revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    /**
     * Getter for RevenuePerShareTTM.
     * @return Returns the double
     */
    @JsonGetter("RevenuePerShareTTM")
    public double getRevenuePerShareTTM() {
        return revenuePerShareTTM;
    }

    /**
     * Setter for RevenuePerShareTTM.
     * @param revenuePerShareTTM Value for double
     */
    @JsonSetter("RevenuePerShareTTM")
    public void setRevenuePerShareTTM(double revenuePerShareTTM) {
        this.revenuePerShareTTM = revenuePerShareTTM;
    }

    /**
     * Getter for QuarterlyRevenueGrowthYOY.
     * @return Returns the double
     */
    @JsonGetter("QuarterlyRevenueGrowthYOY")
    public double getQuarterlyRevenueGrowthYOY() {
        return quarterlyRevenueGrowthYOY;
    }

    /**
     * Setter for QuarterlyRevenueGrowthYOY.
     * @param quarterlyRevenueGrowthYOY Value for double
     */
    @JsonSetter("QuarterlyRevenueGrowthYOY")
    public void setQuarterlyRevenueGrowthYOY(double quarterlyRevenueGrowthYOY) {
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    /**
     * Getter for GrossProfitTTM.
     * @return Returns the long
     */
    @JsonGetter("GrossProfitTTM")
    public long getGrossProfitTTM() {
        return grossProfitTTM;
    }

    /**
     * Setter for GrossProfitTTM.
     * @param grossProfitTTM Value for long
     */
    @JsonSetter("GrossProfitTTM")
    public void setGrossProfitTTM(long grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    /**
     * Getter for DilutedEpsTTM.
     * @return Returns the double
     */
    @JsonGetter("DilutedEpsTTM")
    public double getDilutedEpsTTM() {
        return dilutedEpsTTM;
    }

    /**
     * Setter for DilutedEpsTTM.
     * @param dilutedEpsTTM Value for double
     */
    @JsonSetter("DilutedEpsTTM")
    public void setDilutedEpsTTM(double dilutedEpsTTM) {
        this.dilutedEpsTTM = dilutedEpsTTM;
    }

    /**
     * Getter for QuarterlyEarningsGrowthYOY.
     * @return Returns the double
     */
    @JsonGetter("QuarterlyEarningsGrowthYOY")
    public double getQuarterlyEarningsGrowthYOY() {
        return quarterlyEarningsGrowthYOY;
    }

    /**
     * Setter for QuarterlyEarningsGrowthYOY.
     * @param quarterlyEarningsGrowthYOY Value for double
     */
    @JsonSetter("QuarterlyEarningsGrowthYOY")
    public void setQuarterlyEarningsGrowthYOY(double quarterlyEarningsGrowthYOY) {
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    /**
     * Converts this Highlights into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Highlights [" + "marketCapitalization=" + marketCapitalization
                + ", marketCapitalizationMln=" + marketCapitalizationMln + ", eBITDA=" + eBITDA
                + ", pERatio=" + pERatio + ", pEGRatio=" + pEGRatio + ", wallStreetTargetPrice="
                + wallStreetTargetPrice + ", bookValue=" + bookValue + ", dividendShare="
                + dividendShare + ", dividendYield=" + dividendYield + ", earningsShare="
                + earningsShare + ", ePSEstimateCurrentYear=" + ePSEstimateCurrentYear
                + ", ePSEstimateNextYear=" + ePSEstimateNextYear + ", ePSEstimateNextQuarter="
                + ePSEstimateNextQuarter + ", ePSEstimateCurrentQuarter="
                + ePSEstimateCurrentQuarter + ", mostRecentQuarter=" + mostRecentQuarter
                + ", profitMargin=" + profitMargin + ", operatingMarginTTM=" + operatingMarginTTM
                + ", returnOnAssetsTTM=" + returnOnAssetsTTM + ", returnOnEquityTTM="
                + returnOnEquityTTM + ", revenueTTM=" + revenueTTM + ", revenuePerShareTTM="
                + revenuePerShareTTM + ", quarterlyRevenueGrowthYOY=" + quarterlyRevenueGrowthYOY
                + ", grossProfitTTM=" + grossProfitTTM + ", dilutedEpsTTM=" + dilutedEpsTTM
                + ", quarterlyEarningsGrowthYOY=" + quarterlyEarningsGrowthYOY + "]";
    }

    /**
     * Builds a new {@link Highlights.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Highlights.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(marketCapitalization, marketCapitalizationMln, eBITDA,
                pERatio, pEGRatio, wallStreetTargetPrice, bookValue, dividendShare, dividendYield,
                earningsShare, ePSEstimateCurrentYear, ePSEstimateNextYear, ePSEstimateNextQuarter,
                ePSEstimateCurrentQuarter, mostRecentQuarter, profitMargin, operatingMarginTTM,
                returnOnAssetsTTM, returnOnEquityTTM, revenueTTM, revenuePerShareTTM,
                quarterlyRevenueGrowthYOY, grossProfitTTM, dilutedEpsTTM,
                quarterlyEarningsGrowthYOY);
        return builder;
    }

    /**
     * Class to build instances of {@link Highlights}.
     */
    public static class Builder {
        private long marketCapitalization;
        private double marketCapitalizationMln;
        private long eBITDA;
        private double pERatio;
        private double pEGRatio;
        private double wallStreetTargetPrice;
        private double bookValue;
        private double dividendShare;
        private double dividendYield;
        private double earningsShare;
        private double ePSEstimateCurrentYear;
        private double ePSEstimateNextYear;
        private double ePSEstimateNextQuarter;
        private double ePSEstimateCurrentQuarter;
        private String mostRecentQuarter;
        private double profitMargin;
        private double operatingMarginTTM;
        private double returnOnAssetsTTM;
        private double returnOnEquityTTM;
        private long revenueTTM;
        private double revenuePerShareTTM;
        private double quarterlyRevenueGrowthYOY;
        private long grossProfitTTM;
        private double dilutedEpsTTM;
        private double quarterlyEarningsGrowthYOY;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  marketCapitalization  long value for marketCapitalization.
         * @param  marketCapitalizationMln  double value for marketCapitalizationMln.
         * @param  eBITDA  long value for eBITDA.
         * @param  pERatio  double value for pERatio.
         * @param  pEGRatio  double value for pEGRatio.
         * @param  wallStreetTargetPrice  double value for wallStreetTargetPrice.
         * @param  bookValue  double value for bookValue.
         * @param  dividendShare  double value for dividendShare.
         * @param  dividendYield  double value for dividendYield.
         * @param  earningsShare  double value for earningsShare.
         * @param  ePSEstimateCurrentYear  double value for ePSEstimateCurrentYear.
         * @param  ePSEstimateNextYear  double value for ePSEstimateNextYear.
         * @param  ePSEstimateNextQuarter  double value for ePSEstimateNextQuarter.
         * @param  ePSEstimateCurrentQuarter  double value for ePSEstimateCurrentQuarter.
         * @param  mostRecentQuarter  String value for mostRecentQuarter.
         * @param  profitMargin  double value for profitMargin.
         * @param  operatingMarginTTM  double value for operatingMarginTTM.
         * @param  returnOnAssetsTTM  double value for returnOnAssetsTTM.
         * @param  returnOnEquityTTM  double value for returnOnEquityTTM.
         * @param  revenueTTM  long value for revenueTTM.
         * @param  revenuePerShareTTM  double value for revenuePerShareTTM.
         * @param  quarterlyRevenueGrowthYOY  double value for quarterlyRevenueGrowthYOY.
         * @param  grossProfitTTM  long value for grossProfitTTM.
         * @param  dilutedEpsTTM  double value for dilutedEpsTTM.
         * @param  quarterlyEarningsGrowthYOY  double value for quarterlyEarningsGrowthYOY.
         */
        public Builder(long marketCapitalization, double marketCapitalizationMln, long eBITDA,
                double pERatio, double pEGRatio, double wallStreetTargetPrice, double bookValue,
                double dividendShare, double dividendYield, double earningsShare,
                double ePSEstimateCurrentYear, double ePSEstimateNextYear,
                double ePSEstimateNextQuarter, double ePSEstimateCurrentQuarter,
                String mostRecentQuarter, double profitMargin, double operatingMarginTTM,
                double returnOnAssetsTTM, double returnOnEquityTTM, long revenueTTM,
                double revenuePerShareTTM, double quarterlyRevenueGrowthYOY, long grossProfitTTM,
                double dilutedEpsTTM, double quarterlyEarningsGrowthYOY) {
            this.marketCapitalization = marketCapitalization;
            this.marketCapitalizationMln = marketCapitalizationMln;
            this.eBITDA = eBITDA;
            this.pERatio = pERatio;
            this.pEGRatio = pEGRatio;
            this.wallStreetTargetPrice = wallStreetTargetPrice;
            this.bookValue = bookValue;
            this.dividendShare = dividendShare;
            this.dividendYield = dividendYield;
            this.earningsShare = earningsShare;
            this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
            this.ePSEstimateNextYear = ePSEstimateNextYear;
            this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
            this.ePSEstimateCurrentQuarter = ePSEstimateCurrentQuarter;
            this.mostRecentQuarter = mostRecentQuarter;
            this.profitMargin = profitMargin;
            this.operatingMarginTTM = operatingMarginTTM;
            this.returnOnAssetsTTM = returnOnAssetsTTM;
            this.returnOnEquityTTM = returnOnEquityTTM;
            this.revenueTTM = revenueTTM;
            this.revenuePerShareTTM = revenuePerShareTTM;
            this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
            this.grossProfitTTM = grossProfitTTM;
            this.dilutedEpsTTM = dilutedEpsTTM;
            this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
        }

        /**
         * Setter for marketCapitalization.
         * @param  marketCapitalization  long value for marketCapitalization.
         * @return Builder
         */
        public Builder marketCapitalization(long marketCapitalization) {
            this.marketCapitalization = marketCapitalization;
            return this;
        }

        /**
         * Setter for marketCapitalizationMln.
         * @param  marketCapitalizationMln  double value for marketCapitalizationMln.
         * @return Builder
         */
        public Builder marketCapitalizationMln(double marketCapitalizationMln) {
            this.marketCapitalizationMln = marketCapitalizationMln;
            return this;
        }

        /**
         * Setter for eBITDA.
         * @param  eBITDA  long value for eBITDA.
         * @return Builder
         */
        public Builder eBITDA(long eBITDA) {
            this.eBITDA = eBITDA;
            return this;
        }

        /**
         * Setter for pERatio.
         * @param  pERatio  double value for pERatio.
         * @return Builder
         */
        public Builder pERatio(double pERatio) {
            this.pERatio = pERatio;
            return this;
        }

        /**
         * Setter for pEGRatio.
         * @param  pEGRatio  double value for pEGRatio.
         * @return Builder
         */
        public Builder pEGRatio(double pEGRatio) {
            this.pEGRatio = pEGRatio;
            return this;
        }

        /**
         * Setter for wallStreetTargetPrice.
         * @param  wallStreetTargetPrice  double value for wallStreetTargetPrice.
         * @return Builder
         */
        public Builder wallStreetTargetPrice(double wallStreetTargetPrice) {
            this.wallStreetTargetPrice = wallStreetTargetPrice;
            return this;
        }

        /**
         * Setter for bookValue.
         * @param  bookValue  double value for bookValue.
         * @return Builder
         */
        public Builder bookValue(double bookValue) {
            this.bookValue = bookValue;
            return this;
        }

        /**
         * Setter for dividendShare.
         * @param  dividendShare  double value for dividendShare.
         * @return Builder
         */
        public Builder dividendShare(double dividendShare) {
            this.dividendShare = dividendShare;
            return this;
        }

        /**
         * Setter for dividendYield.
         * @param  dividendYield  double value for dividendYield.
         * @return Builder
         */
        public Builder dividendYield(double dividendYield) {
            this.dividendYield = dividendYield;
            return this;
        }

        /**
         * Setter for earningsShare.
         * @param  earningsShare  double value for earningsShare.
         * @return Builder
         */
        public Builder earningsShare(double earningsShare) {
            this.earningsShare = earningsShare;
            return this;
        }

        /**
         * Setter for ePSEstimateCurrentYear.
         * @param  ePSEstimateCurrentYear  double value for ePSEstimateCurrentYear.
         * @return Builder
         */
        public Builder ePSEstimateCurrentYear(double ePSEstimateCurrentYear) {
            this.ePSEstimateCurrentYear = ePSEstimateCurrentYear;
            return this;
        }

        /**
         * Setter for ePSEstimateNextYear.
         * @param  ePSEstimateNextYear  double value for ePSEstimateNextYear.
         * @return Builder
         */
        public Builder ePSEstimateNextYear(double ePSEstimateNextYear) {
            this.ePSEstimateNextYear = ePSEstimateNextYear;
            return this;
        }

        /**
         * Setter for ePSEstimateNextQuarter.
         * @param  ePSEstimateNextQuarter  double value for ePSEstimateNextQuarter.
         * @return Builder
         */
        public Builder ePSEstimateNextQuarter(double ePSEstimateNextQuarter) {
            this.ePSEstimateNextQuarter = ePSEstimateNextQuarter;
            return this;
        }

        /**
         * Setter for ePSEstimateCurrentQuarter.
         * @param  ePSEstimateCurrentQuarter  double value for ePSEstimateCurrentQuarter.
         * @return Builder
         */
        public Builder ePSEstimateCurrentQuarter(double ePSEstimateCurrentQuarter) {
            this.ePSEstimateCurrentQuarter = ePSEstimateCurrentQuarter;
            return this;
        }

        /**
         * Setter for mostRecentQuarter.
         * @param  mostRecentQuarter  String value for mostRecentQuarter.
         * @return Builder
         */
        public Builder mostRecentQuarter(String mostRecentQuarter) {
            this.mostRecentQuarter = mostRecentQuarter;
            return this;
        }

        /**
         * Setter for profitMargin.
         * @param  profitMargin  double value for profitMargin.
         * @return Builder
         */
        public Builder profitMargin(double profitMargin) {
            this.profitMargin = profitMargin;
            return this;
        }

        /**
         * Setter for operatingMarginTTM.
         * @param  operatingMarginTTM  double value for operatingMarginTTM.
         * @return Builder
         */
        public Builder operatingMarginTTM(double operatingMarginTTM) {
            this.operatingMarginTTM = operatingMarginTTM;
            return this;
        }

        /**
         * Setter for returnOnAssetsTTM.
         * @param  returnOnAssetsTTM  double value for returnOnAssetsTTM.
         * @return Builder
         */
        public Builder returnOnAssetsTTM(double returnOnAssetsTTM) {
            this.returnOnAssetsTTM = returnOnAssetsTTM;
            return this;
        }

        /**
         * Setter for returnOnEquityTTM.
         * @param  returnOnEquityTTM  double value for returnOnEquityTTM.
         * @return Builder
         */
        public Builder returnOnEquityTTM(double returnOnEquityTTM) {
            this.returnOnEquityTTM = returnOnEquityTTM;
            return this;
        }

        /**
         * Setter for revenueTTM.
         * @param  revenueTTM  long value for revenueTTM.
         * @return Builder
         */
        public Builder revenueTTM(long revenueTTM) {
            this.revenueTTM = revenueTTM;
            return this;
        }

        /**
         * Setter for revenuePerShareTTM.
         * @param  revenuePerShareTTM  double value for revenuePerShareTTM.
         * @return Builder
         */
        public Builder revenuePerShareTTM(double revenuePerShareTTM) {
            this.revenuePerShareTTM = revenuePerShareTTM;
            return this;
        }

        /**
         * Setter for quarterlyRevenueGrowthYOY.
         * @param  quarterlyRevenueGrowthYOY  double value for quarterlyRevenueGrowthYOY.
         * @return Builder
         */
        public Builder quarterlyRevenueGrowthYOY(double quarterlyRevenueGrowthYOY) {
            this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
            return this;
        }

        /**
         * Setter for grossProfitTTM.
         * @param  grossProfitTTM  long value for grossProfitTTM.
         * @return Builder
         */
        public Builder grossProfitTTM(long grossProfitTTM) {
            this.grossProfitTTM = grossProfitTTM;
            return this;
        }

        /**
         * Setter for dilutedEpsTTM.
         * @param  dilutedEpsTTM  double value for dilutedEpsTTM.
         * @return Builder
         */
        public Builder dilutedEpsTTM(double dilutedEpsTTM) {
            this.dilutedEpsTTM = dilutedEpsTTM;
            return this;
        }

        /**
         * Setter for quarterlyEarningsGrowthYOY.
         * @param  quarterlyEarningsGrowthYOY  double value for quarterlyEarningsGrowthYOY.
         * @return Builder
         */
        public Builder quarterlyEarningsGrowthYOY(double quarterlyEarningsGrowthYOY) {
            this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
            return this;
        }

        /**
         * Builds a new {@link Highlights} object using the set fields.
         * @return {@link Highlights}
         */
        public Highlights build() {
            return new Highlights(marketCapitalization, marketCapitalizationMln, eBITDA, pERatio,
                    pEGRatio, wallStreetTargetPrice, bookValue, dividendShare, dividendYield,
                    earningsShare, ePSEstimateCurrentYear, ePSEstimateNextYear,
                    ePSEstimateNextQuarter, ePSEstimateCurrentQuarter, mostRecentQuarter,
                    profitMargin, operatingMarginTTM, returnOnAssetsTTM, returnOnEquityTTM,
                    revenueTTM, revenuePerShareTTM, quarterlyRevenueGrowthYOY, grossProfitTTM,
                    dilutedEpsTTM, quarterlyEarningsGrowthYOY);
        }
    }
}