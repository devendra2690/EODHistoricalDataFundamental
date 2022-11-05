
# Financials

## Structure

`Financials`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BalanceSheet` | [`BalanceSheet`](../../doc/models/balance-sheet.md) | Required | - | BalanceSheet getBalanceSheet() | setBalanceSheet(BalanceSheet balanceSheet) |
| `CashFlow` | [`CashFlow`](../../doc/models/cash-flow.md) | Required | - | CashFlow getCashFlow() | setCashFlow(CashFlow cashFlow) |
| `IncomeStatement` | [`IncomeStatement`](../../doc/models/income-statement.md) | Required | - | IncomeStatement getIncomeStatement() | setIncomeStatement(IncomeStatement incomeStatement) |

## Example (as JSON)

```json
{
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
```

