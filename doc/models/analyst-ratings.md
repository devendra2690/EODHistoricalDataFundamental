
# Analyst Ratings

## Structure

`AnalystRatings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Rating` | `double` | Required | - | double getRating() | setRating(double rating) |
| `TargetPrice` | `double` | Required | - | double getTargetPrice() | setTargetPrice(double targetPrice) |
| `StrongBuy` | `int` | Required | - | int getStrongBuy() | setStrongBuy(int strongBuy) |
| `Buy` | `int` | Required | - | int getBuy() | setBuy(int buy) |
| `Hold` | `int` | Required | - | int getHold() | setHold(int hold) |
| `Sell` | `int` | Required | - | int getSell() | setSell(int sell) |
| `StrongSell` | `int` | Required | - | int getStrongSell() | setStrongSell(int strongSell) |

## Example (as JSON)

```json
{
  "Rating": 4.3333,
  "TargetPrice": 169.8754,
  "StrongBuy": 28,
  "Buy": 7,
  "Hold": 8,
  "Sell": 1,
  "StrongSell": 1
}
```

