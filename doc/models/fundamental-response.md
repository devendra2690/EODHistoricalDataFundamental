
# Fundamental Response

## Structure

`FundamentalResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `General` | [`General`](../../doc/models/general.md) | Required | - | General getGeneral() | setGeneral(General general) |
| `Highlights` | [`Highlights`](../../doc/models/highlights.md) | Required | - | Highlights getHighlights() | setHighlights(Highlights highlights) |
| `Valuation` | [`Valuation`](../../doc/models/valuation.md) | Required | - | Valuation getValuation() | setValuation(Valuation valuation) |
| `SharesStats` | [`SharesStats`](../../doc/models/shares-stats.md) | Required | - | SharesStats getSharesStats() | setSharesStats(SharesStats sharesStats) |
| `Technicals` | [`Technicals`](../../doc/models/technicals.md) | Required | - | Technicals getTechnicals() | setTechnicals(Technicals technicals) |
| `SplitsDividends` | [`SplitsDividends`](../../doc/models/splits-dividends.md) | Required | - | SplitsDividends getSplitsDividends() | setSplitsDividends(SplitsDividends splitsDividends) |
| `AnalystRatings` | [`AnalystRatings`](../../doc/models/analyst-ratings.md) | Required | - | AnalystRatings getAnalystRatings() | setAnalystRatings(AnalystRatings analystRatings) |
| `Holders` | [`Holders`](../../doc/models/holders.md) | Required | - | Holders getHolders() | setHolders(Holders holders) |
| `InsiderTransactions` | [`Map<String, GeneratedObject7>`](../../doc/models/generated-object-7.md) | Required | - | Map<String, GeneratedObject7> getInsiderTransactions() | setInsiderTransactions(Map<String, GeneratedObject7> insiderTransactions) |
| `ESGScores` | [`ESGScores`](../../doc/models/esg-scores.md) | Required | - | ESGScores getESGScores() | setESGScores(ESGScores eSGScores) |
| `OutstandingShares` | [`OutstandingShares`](../../doc/models/outstanding-shares.md) | Required | - | OutstandingShares getOutstandingShares() | setOutstandingShares(OutstandingShares outstandingShares) |
| `Earnings` | [`Earnings`](../../doc/models/earnings.md) | Required | - | Earnings getEarnings() | setEarnings(Earnings earnings) |
| `Financials` | [`Financials`](../../doc/models/financials.md) | Required | - | Financials getFinancials() | setFinancials(Financials financials) |

## Example (as JSON)

```json
{
  "General": {
    "Code": "AAPL",
    "Type": "Common Stock",
    "Name": "Apple Inc",
    "Exchange": "NASDAQ",
    "CurrencyCode": "USD",
    "CurrencyName": "US Dollar",
    "CurrencySymbol": "$",
    "CountryName": "USA",
    "CountryISO": "US",
    "ISIN": "US0378331005",
    "CUSIP": "037833100",
    "CIK": "320193",
    "EmployerIdNumber": "94-2404110",
    "FiscalYearEnd": "September",
    "IPODate": "1980-12-12",
    "InternationalDomestic": "International/Domestic",
    "Sector": "Technology",
    "Industry": "Consumer Electronics",
    "GicSector": "Information Technology",
    "GicGroup": "Technology Hardware & Equipment",
    "GicIndustry": "Technology Hardware, Storage & Peripherals",
    "GicSubIndustry": "Technology Hardware, Storage & Peripherals",
    "HomeCategory": "Domestic",
    "IsDelisted": false,
    "Description": "Apple Inc. designs, manufactures, and markets smartphones, personal computers, tablets, wearables, and accessories worldwide. It also sells various related services. In addition, the company offers iPhone, a line of smartphones; Mac, a line of personal computers; iPad, a line of multi-purpose tablets; AirPods Max, an over-ear wireless headphone; and wearables, home, and accessories comprising AirPods, Apple TV, Apple Watch, Beats products, HomePod, and iPod touch. Further, it provides AppleCare support services; cloud services store services; and operates various platforms, including the App Store that allow customers to discover and download applications and digital content, such as books, music, video, games, and podcasts. Additionally, the company offers various services, such as Apple Arcade, a game subscription service; Apple Music, which offers users a curated listening experience with on-demand radio stations; Apple News+, a subscription news and magazine service; Apple TV+, which offers exclusive original content; Apple Card, a co-branded credit card; and Apple Pay, a cashless payment service, as well as licenses its intellectual property. The company serves consumers, and small and mid-sized businesses; and the education, enterprise, and government markets. It distributes third-party applications for its products through the App Store. The company also sells its products through its retail and online stores, and direct sales force; and third-party cellular network carriers, wholesalers, retailers, and resellers. Apple Inc. was incorporated in 1977 and is headquartered in Cupertino, California.",
    "Address": "One Apple Park Way, Cupertino, CA, United States, 95014",
    "AddressData": {
      "Street": "One Apple Park Way",
      "City": "Cupertino",
      "State": "CA",
      "Country": "United States",
      "ZIP": "95014"
    },
    "Listings": {
      "0": {
        "Code": "0R2V",
        "Exchange": "LSE",
        "Name": "Apple Inc."
      }
    },
    "Officers": {
      "0": {
        "Name": "Mr. Timothy D. Cook",
        "Title": "CEO & Director",
        "YearBorn": "1961"
      }
    },
    "Phone": "408 996 1010",
    "WebURL": "https://www.apple.com",
    "LogoURL": "/img/logos/US/aapl.png",
    "FullTimeEmployees": 154000,
    "UpdatedAt": "2022-08-01"
  },
  "Highlights": {
    "MarketCapitalization": 2630256689152,
    "MarketCapitalizationMln": 2630256.6892,
    "EBITDA": 129556996096,
    "PERatio": 26.8612,
    "PEGRatio": 2.7222,
    "WallStreetTargetPrice": 181.87,
    "BookValue": 3.61,
    "DividendShare": 0.89,
    "DividendYield": 0.0057,
    "EarningsShare": 6.05,
    "EPSEstimateCurrentYear": 6.13,
    "EPSEstimateNextYear": 6.51,
    "EPSEstimateNextQuarter": 1.31,
    "EPSEstimateCurrentQuarter": 1.16,
    "MostRecentQuarter": "2022-06-30",
    "ProfitMargin": 0.2571,
    "OperatingMarginTTM": 0.3053,
    "ReturnOnAssetsTTM": 0.222,
    "ReturnOnEquityTTM": 1.6282,
    "RevenueTTM": 387541991424,
    "RevenuePerShareTTM": 23.732,
    "QuarterlyRevenueGrowthYOY": 0.019,
    "GrossProfitTTM": 152836000000,
    "DilutedEpsTTM": 6.05,
    "QuarterlyEarningsGrowthYOY": -0.077
  },
  "Valuation": {
    "TrailingPE": 26.8612,
    "ForwardPE": 24.6914,
    "PriceSalesTTM": 6.787,
    "PriceBookMRQ": 37.786,
    "EnterpriseValue": 2615208230350,
    "EnterpriseValueRevenue": 6.7749,
    "EnterpriseValueEbitda": 19.6671
  },
  "SharesStats": {
    "SharesOutstanding": 16185199616,
    "SharesFloat": 16053877710,
    "PercentInsiders": 0.07200000000000001,
    "PercentInstitutions": 60.082,
    "SharesShort": null,
    "SharesShortPriorMonth": null,
    "ShortRatio": null,
    "ShortPercentOutstanding": null,
    "ShortPercentFloat": null
  },
  "Technicals": {
    "Beta": 1.1946,
    "52WeekHigh": 182.4391,
    "52WeekLow": 129.04,
    "50DayMA": 144.2238,
    "200DayMA": 158.9387,
    "SharesShort": 104993162,
    "SharesShortPriorMonth": 112994371,
    "ShortRatio": 1.32,
    "ShortPercent": 0.0065
  },
  "SplitsDividends": {
    "ForwardAnnualDividendRate": 0.92,
    "ForwardAnnualDividendYield": 0.0057,
    "PayoutRatio": 0.1485,
    "DividendDate": "2022-05-12",
    "ExDividendDate": "2022-05-06",
    "LastSplitFactor": "4:1",
    "LastSplitDate": "2020-08-31",
    "NumberDividendsByYear": {
      "0": {
        "Year": 1989,
        "Count": 2
      }
    }
  },
  "AnalystRatings": {
    "Rating": 4.3333,
    "TargetPrice": 169.8754,
    "StrongBuy": 28,
    "Buy": 7,
    "Hold": 8,
    "Sell": 1,
    "StrongSell": 1
  },
  "Holders": {
    "Institutions": {
      "0": {
        "name": "Vanguard Group Inc",
        "date": "2022-03-31",
        "totalShares": 7.8467,
        "totalAssets": 5.2456,
        "currentShares": 1269995750,
        "change": 8734393,
        "change_p": 0.6925
      },
      "1": {
        "name": "BlackRock Inc",
        "date": "2021-12-31",
        "totalShares": 6.3009,
        "totalAssets": 4.6097,
        "currentShares": 1019810291,
        "change": -6413692,
        "change_p": -0.625
      }
    },
    "Funds": {
      "0": {
        "name": "Vanguard Total Stock Mkt Idx Inv",
        "date": "2022-06-30",
        "totalShares": 2.801,
        "totalAssets": 5.5559,
        "currentShares": 453344258,
        "change": -890694,
        "change_p": -0.1961
      },
      "1": {
        "name": "Vanguard 500 Index Investor",
        "date": "2022-06-30",
        "totalShares": 2.1027,
        "totalAssets": 6.5499,
        "currentShares": 340328725,
        "change": 2558322,
        "change_p": 0.7574
      }
    }
  },
  "InsiderTransactions": {
    "0": {
      "date": "2022-05-04",
      "ownerCik": null,
      "ownerName": "Katherine L Adams",
      "transactionDate": "2022-05-04",
      "transactionCode": "S",
      "transactionAmount": 25000,
      "transactionPrice": 161.72,
      "transactionAcquiredDisposed": "D",
      "postTransactionAmount": 452334,
      "secLink": "http://www.sec.gov/Archives/edgar/data/320193/000032019322000061/xslF345X03/wf-form4_165187623819106.xml"
    },
    "1": {
      "date": "2022-04-18",
      "ownerCik": null,
      "ownerName": "Deirdre O'brien",
      "transactionDate": "2022-04-18",
      "transactionCode": "S",
      "transactionAmount": 8000,
      "transactionPrice": 164.91,
      "transactionAcquiredDisposed": "D",
      "postTransactionAmount": 136290,
      "secLink": "http://www.sec.gov/Archives/edgar/data/320193/000032019322000053/xslF345X03/wf-form4_165040749395911.xml"
    }
  },
  "ESGScores": {
    "Disclaimer": "The ESG data currently in a very early Beta stage and not intended for any production use. It will be removed from the feed on December 31, 2020.",
    "RatingDate": "2019-01-01",
    "TotalEsg": 26.15,
    "TotalEsgPercentile": 36.8,
    "EnvironmentScore": 0.99,
    "EnvironmentScorePercentile": 5,
    "SocialScore": 13.98,
    "SocialScorePercentile": 5,
    "GovernanceScore": 11.18,
    "GovernanceScorePercentile": 5,
    "ControversyLevel": 3,
    "ActivitiesInvolvement": {
      "0": {
        "Activity": "adult",
        "Involvement": "No"
      },
      "1": {
        "Activity": "alcoholic",
        "Involvement": "No"
      }
    }
  },
  "outstandingShares": {
    "annual": null,
    "quarterly": {
      "0": {
        "date": "2022-Q2",
        "dateFormatted": "2022-06-30",
        "sharesMln": "16262.2030",
        "shares": 16262203000
      }
    }
  },
  "Earnings": {
    "History": {
      "0": {
        "reportDate": "2023-04-26",
        "date": "2023-03-31",
        "beforeAfterMarket": "BeforeMarket",
        "currency": "USD",
        "epsActual": null,
        "epsEstimate": null,
        "epsDifference": null,
        "surprisePercent": null
      }
    },
    "Trend": {
      "0": {
        "date": "2023-09-30",
        "period": "+1y",
        "growth": "0.0620",
        "earningsEstimateAvg": "6.5100",
        "earningsEstimateLow": "5.7800",
        "earningsEstimateHigh": "7.3500",
        "earningsEstimateYearAgoEps": "6.1300",
        "earningsEstimateNumberOfAnalysts": "41.0000",
        "earningsEstimateGrowth": "0.0620",
        "revenueEstimateAvg": "414149000000.00",
        "revenueEstimateLow": "386484000000.00",
        "revenueEstimateHigh": "440652000000.00",
        "revenueEstimateYearAgoEps": null,
        "revenueEstimateNumberOfAnalysts": "41.00",
        "revenueEstimateGrowth": "0.0530",
        "epsTrendCurrent": "6.5100",
        "epsTrend7daysAgo": "6.5100",
        "epsTrend30daysAgo": "6.5500",
        "epsTrend60daysAgo": "6.5600",
        "epsTrend90daysAgo": "6.5700",
        "epsRevisionsUpLast7days": "0.0000",
        "epsRevisionsUpLast30days": "4.0000",
        "epsRevisionsDownLast7days": "0.0000",
        "epsRevisionsDownLast30days": "2.0000"
      }
    },
    "Annual": {
      "0": {
        "date": "2022-06-30",
        "epsActual": 4.82
      }
    }
  },
  "Financials": {
    "BalanceSheet": {
      "currencysymbol": "USD",
      "quarterly": {
        "0": {
          "date": "2022-06-30",
          "filing_date": "2022-07-29",
          "currency_symbol": "USD",
          "totalAssets": "336309000000.00",
          "intangibleAssets": null,
          "earningAssets": null,
          "otherCurrentAssets": "16386000000.00",
          "totalLiab": "278202000000.00",
          "totalStockholderEquity": "58107000000.00",
          "deferredLongTermLiab": null,
          "otherCurrentLiab": "48811000000.00",
          "commonStock": "62115000000.00",
          "capitalStock": null,
          "retainedEarnings": "5289000000.00",
          "otherLiab": "53629000000.00",
          "goodWill": null,
          "otherAssets": "52605000000.00",
          "cash": "27502000000.00",
          "cashAndEquivalents": null,
          "totalCurrentLiabilities": "129873000000.00",
          "netDebt": "92189000000.00",
          "shortTermDebt": "24991000000.00",
          "shortLongTermDebt": null,
          "shortLongTermDebtTotal": "119691000000.00",
          "otherStockholderEquity": "-9297000000.00",
          "propertyPlantEquipment": "40335000000.00",
          "totalCurrentAssets": "112292000000.00",
          "longTermInvestments": "131077000000.00",
          "netTangibleAssets": "58107000000.00",
          "shortTermInvestments": "20729000000.00",
          "netReceivables": "42242000000.00",
          "longTermDebt": "94700000000.00",
          "inventory": "5433000000.00",
          "accountsPayable": "48343000000.00",
          "totalPermanentEquity": null,
          "noncontrollingInterestInConsolidatedEntity": null,
          "temporaryEquityRedeemableNoncontrollingInterests": null,
          "accumulatedOtherComprehensiveIncome": "-9297000000.00",
          "additionalPaidInCapital": null,
          "commonStockTotalEquity": "62115000000.00",
          "preferredStockTotalEquity": null,
          "retainedEarningsTotalEquity": "5289000000.00",
          "treasuryStock": null,
          "accumulatedAmortization": null,
          "nonCurrrentAssetsOther": "52605000000.00",
          "deferredLongTermAssetCharges": null,
          "nonCurrentAssetsTotal": "224017000000.00",
          "capitalLeaseObligations": null,
          "longTermDebtTotal": "94700000000.00",
          "nonCurrentLiabilitiesOther": "53629000000.00",
          "nonCurrentLiabilitiesTotal": "148329000000.00",
          "negativeGoodwill": null,
          "warrants": null,
          "preferredStockRedeemable": null,
          "capitalSurpluse": null,
          "liabilitiesAndStockholdersEquity": "336309000000.00",
          "cashAndShortTermInvestments": "48231000000.00",
          "propertyPlantAndEquipmentGross": null,
          "propertyPlantAndEquipmentNet": "40335000000.00",
          "accumulatedDepreciation": null,
          "netWorkingCapital": null,
          "netInvestedCapital": null,
          "commonStockSharesOutstanding": "16262203000.00"
        }
      }
    },
    "Cash_Flow": {
      "currency_symbol": "USD",
      "quarterly": {
        "0": {
          "date": "2022-06-30",
          "filing_date": "2022-07-29",
          "currency_symbol": "USD",
          "investments": "6953000000.00",
          "changeToLiabilities": "-6260000000.00",
          "totalCashflowsFromInvestingActivities": "4234000000.00",
          "netBorrowings": "971000000.00",
          "totalCashFromFinancingActivities": "-27445000000.00",
          "changeToOperatingActivities": "2497000000.00",
          "netIncome": "19442000000.00",
          "changeInCash": "-319000000.00",
          "beginPeriodCashFlow": "29180000000.00",
          "endPeriodCashFlow": "28861000000.00",
          "totalCashFromOperatingActivities": "22892000000.00",
          "depreciation": "2805000000.00",
          "otherCashflowsFromInvestingActivities": "-617000000.00",
          "dividendsPaid": "-3811000000.00",
          "changeToInventory": "-16000000.00",
          "changeToAccountReceivables": "-981000000.00",
          "salePurchaseOfStock": "-21865000000.00",
          "otherCashflowsFromFinancingActivities": "231000000.00",
          "changeToNetincome": "3870000000.00",
          "capitalExpenditures": "2102000000",
          "changeReceivables": "3165000000.00",
          "cashFlowsOtherOperating": "-114000000.00",
          "exchangeRateChanges": null,
          "cashAndCashEquivalentsChanges": "-319000000.00",
          "changeInWorkingCapital": "-3266000000.00",
          "otherNonCashItems": null,
          "freeCashFlow": "20790000000.00"
        }
      },
      "yearly": {
        "0": {
          "date": "2021-09-30",
          "filing_date": "2021-10-29",
          "currency_symbol": "USD",
          "investments": "-3075000000.00",
          "changeToLiabilities": "14002000000.00",
          "totalCashflowsFromInvestingActivities": "-14545000000.00",
          "netBorrowings": "12665000000.00",
          "totalCashFromFinancingActivities": "-93353000000.00",
          "changeToOperatingActivities": "-6146000000.00",
          "netIncome": "94680000000.00",
          "changeInCash": "-3860000000.00",
          "beginPeriodCashFlow": "39789000000.00",
          "endPeriodCashFlow": "35929000000.00",
          "totalCashFromOperatingActivities": "104038000000.00",
          "depreciation": "11284000000.00",
          "otherCashflowsFromInvestingActivities": "-352000000.00",
          "dividendsPaid": "-14467000000.00",
          "changeToInventory": "-2642000000.00",
          "changeToAccountReceivables": "-10125000000.00",
          "salePurchaseOfStock": "-85971000000.00",
          "otherCashflowsFromFinancingActivities": "14730000000.00",
          "changeToNetincome": "2985000000.00",
          "capitalExpenditures": "11085000000",
          "changeReceivables": "-14028000000.00",
          "cashFlowsOtherOperating": "-6366000000.00",
          "exchangeRateChanges": null,
          "cashAndCashEquivalentsChanges": "-3860000000.00",
          "changeInWorkingCapital": "-4911000000.00",
          "otherNonCashItems": "-147000000.00",
          "freeCashFlow": "92953000000.00"
        }
      }
    },
    "Income_Statement": {
      "currency_symbol": "USD",
      "quarterly": {
        "0": {
          "date": "2022-06-30",
          "filing_date": "2022-07-29",
          "currency_symbol": "USD",
          "researchDevelopment": "6797000000.00",
          "effectOfAccountingCharges": null,
          "incomeBeforeTax": "23066000000.00",
          "minorityInterest": null,
          "netIncome": "19442000000.00",
          "sellingGeneralAdministrative": "6012000000.00",
          "sellingAndMarketingExpenses": null,
          "grossProfit": "35885000000.00",
          "reconciledDepreciation": null,
          "ebit": "23066000000.00",
          "ebitda": "25871000000.00",
          "depreciationAndAmortization": "2805000000.00",
          "nonOperatingIncomeNetOther": "-10000000.00",
          "operatingIncome": "23076000000.00",
          "otherOperatingExpenses": "59883000000.00",
          "interestExpense": null,
          "taxProvision": null,
          "interestIncome": null,
          "netInterestIncome": null,
          "extraordinaryItems": null,
          "nonRecurring": null,
          "otherItems": null,
          "incomeTaxExpense": "3624000000.00",
          "totalRevenue": "82959000000.00",
          "totalOperatingExpenses": "12809000000.00",
          "costOfRevenue": "47074000000.00",
          "totalOtherIncomeExpenseNet": "-10000000.00",
          "discontinuedOperations": null,
          "netIncomeFromContinuingOps": "19442000000.00",
          "netIncomeApplicableToCommonShares": "19442000000.00",
          "preferredStockAndOtherAdjustments": null
        }
      },
      "yearly": {
        "0": {
          "date": "2021-09-30",
          "filing_date": "2021-10-29",
          "currency_symbol": "USD",
          "researchDevelopment": "21914000000.00",
          "effectOfAccountingCharges": null,
          "incomeBeforeTax": "109207000000.00",
          "minorityInterest": null,
          "netIncome": "94680000000.00",
          "sellingGeneralAdministrative": "21973000000.00",
          "sellingAndMarketingExpenses": null,
          "grossProfit": "152836000000.00",
          "reconciledDepreciation": "11284000000.00",
          "ebit": "111852000000.00",
          "ebitda": "123136000000.00",
          "depreciationAndAmortization": "11284000000.00",
          "nonOperatingIncomeNetOther": "258000000.00",
          "operatingIncome": "108949000000.00",
          "otherOperatingExpenses": "256868000000.00",
          "interestExpense": "2645000000.00",
          "taxProvision": "14527000000.00",
          "interestIncome": "2843000000.00",
          "netInterestIncome": "198000000.00",
          "extraordinaryItems": null,
          "nonRecurring": null,
          "otherItems": null,
          "incomeTaxExpense": "14527000000.00",
          "totalRevenue": "365817000000.00",
          "totalOperatingExpenses": "43887000000.00",
          "costOfRevenue": "212981000000.00",
          "totalOtherIncomeExpenseNet": "258000000.00",
          "discontinuedOperations": null,
          "netIncomeFromContinuingOps": "94680000000.00",
          "netIncomeApplicableToCommonShares": "94680000000.00",
          "preferredStockAndOtherAdjustments": null
        }
      }
    }
  }
}
```

