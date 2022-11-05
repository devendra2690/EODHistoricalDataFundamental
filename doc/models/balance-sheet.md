
# Balance Sheet

## Structure

`BalanceSheet`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Currencysymbol` | `String` | Required | - | String getCurrencysymbol() | setCurrencysymbol(String currencysymbol) |
| `Quarterly` | [`Map<String, GeneratedObject17>`](../../doc/models/generated-object-17.md) | Required | - | Map<String, GeneratedObject17> getQuarterly() | setQuarterly(Map<String, GeneratedObject17> quarterly) |

## Example (as JSON)

```json
{
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
}
```

