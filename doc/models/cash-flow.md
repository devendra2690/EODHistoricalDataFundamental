
# Cash Flow

## Structure

`CashFlow`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencySymbol` | `String` | Required | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Quarterly` | [`Map<String, GeneratedObject18>`](../../doc/models/generated-object-18.md) | Required | - | Map<String, GeneratedObject18> getQuarterly() | setQuarterly(Map<String, GeneratedObject18> quarterly) |
| `Yearly` | [`Map<String, GeneratedObject19>`](../../doc/models/generated-object-19.md) | Required | - | Map<String, GeneratedObject19> getYearly() | setYearly(Map<String, GeneratedObject19> yearly) |

## Example (as JSON)

```json
{
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
}
```

