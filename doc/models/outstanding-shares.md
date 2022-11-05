
# Outstanding Shares

## Structure

`OutstandingShares`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Annual` | [`Map<String, GeneratedObject11>`](../../doc/models/generated-object-11.md) | Required | - | Map<String, GeneratedObject11> getAnnual() | setAnnual(Map<String, GeneratedObject11> annual) |
| `Quarterly` | [`Map<String, GeneratedObject13>`](../../doc/models/generated-object-13.md) | Required | - | Map<String, GeneratedObject13> getQuarterly() | setQuarterly(Map<String, GeneratedObject13> quarterly) |

## Example (as JSON)

```json
{
  "annual": null,
  "quarterly": {
    "0": {
      "date": "2022-Q2",
      "dateFormatted": "2022-06-30",
      "sharesMln": "16262.2030",
      "shares": 16262203000
    }
  }
}
```

