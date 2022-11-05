
# Income Statement

## Structure

`IncomeStatement`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CurrencySymbol` | `String` | Required | - | String getCurrencySymbol() | setCurrencySymbol(String currencySymbol) |
| `Quarterly` | [`Map<String, GeneratedObject20>`](../../doc/models/generated-object-20.md) | Required | - | Map<String, GeneratedObject20> getQuarterly() | setQuarterly(Map<String, GeneratedObject20> quarterly) |
| `Yearly` | [`Map<String, GeneratedObject21>`](../../doc/models/generated-object-21.md) | Required | - | Map<String, GeneratedObject21> getYearly() | setYearly(Map<String, GeneratedObject21> yearly) |

## Example (as JSON)

```json
{
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
```

