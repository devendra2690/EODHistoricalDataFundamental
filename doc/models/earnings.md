
# Earnings

## Structure

`Earnings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `History` | [`Map<String, GeneratedObject14>`](../../doc/models/generated-object-14.md) | Required | - | Map<String, GeneratedObject14> getHistory() | setHistory(Map<String, GeneratedObject14> history) |
| `Trend` | [`Map<String, GeneratedObject15>`](../../doc/models/generated-object-15.md) | Required | - | Map<String, GeneratedObject15> getTrend() | setTrend(Map<String, GeneratedObject15> trend) |
| `Annual` | [`Map<String, GeneratedObject16>`](../../doc/models/generated-object-16.md) | Required | - | Map<String, GeneratedObject16> getAnnual() | setAnnual(Map<String, GeneratedObject16> annual) |

## Example (as JSON)

```json
{
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
}
```

