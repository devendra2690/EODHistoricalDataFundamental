
# Holders

## Structure

`Holders`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Institutions` | [`Map<String, GeneratedObject3>`](../../doc/models/generated-object-3.md) | Required | - | Map<String, GeneratedObject3> getInstitutions() | setInstitutions(Map<String, GeneratedObject3> institutions) |
| `Funds` | [`Map<String, GeneratedObject5>`](../../doc/models/generated-object-5.md) | Required | - | Map<String, GeneratedObject5> getFunds() | setFunds(Map<String, GeneratedObject5> funds) |

## Example (as JSON)

```json
{
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
}
```

