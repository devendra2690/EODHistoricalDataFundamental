
# Splits Dividends

## Structure

`SplitsDividends`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ForwardAnnualDividendRate` | `double` | Required | - | double getForwardAnnualDividendRate() | setForwardAnnualDividendRate(double forwardAnnualDividendRate) |
| `ForwardAnnualDividendYield` | `double` | Required | - | double getForwardAnnualDividendYield() | setForwardAnnualDividendYield(double forwardAnnualDividendYield) |
| `PayoutRatio` | `double` | Required | - | double getPayoutRatio() | setPayoutRatio(double payoutRatio) |
| `DividendDate` | `String` | Required | - | String getDividendDate() | setDividendDate(String dividendDate) |
| `ExDividendDate` | `String` | Required | - | String getExDividendDate() | setExDividendDate(String exDividendDate) |
| `LastSplitFactor` | `String` | Required | - | String getLastSplitFactor() | setLastSplitFactor(String lastSplitFactor) |
| `LastSplitDate` | `String` | Required | - | String getLastSplitDate() | setLastSplitDate(String lastSplitDate) |
| `NumberDividendsByYear` | [`Map<String, GeneratedObject2>`](../../doc/models/generated-object-2.md) | Required | - | Map<String, GeneratedObject2> getNumberDividendsByYear() | setNumberDividendsByYear(Map<String, GeneratedObject2> numberDividendsByYear) |

## Example (as JSON)

```json
{
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
}
```

