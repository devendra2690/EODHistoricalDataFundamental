
# Valuation

## Structure

`Valuation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TrailingPE` | `double` | Required | - | double getTrailingPE() | setTrailingPE(double trailingPE) |
| `ForwardPE` | `double` | Required | - | double getForwardPE() | setForwardPE(double forwardPE) |
| `PriceSalesTTM` | `double` | Required | - | double getPriceSalesTTM() | setPriceSalesTTM(double priceSalesTTM) |
| `PriceBookMRQ` | `double` | Required | - | double getPriceBookMRQ() | setPriceBookMRQ(double priceBookMRQ) |
| `EnterpriseValue` | `long` | Required | - | long getEnterpriseValue() | setEnterpriseValue(long enterpriseValue) |
| `EnterpriseValueRevenue` | `double` | Required | - | double getEnterpriseValueRevenue() | setEnterpriseValueRevenue(double enterpriseValueRevenue) |
| `EnterpriseValueEbitda` | `double` | Required | - | double getEnterpriseValueEbitda() | setEnterpriseValueEbitda(double enterpriseValueEbitda) |

## Example (as JSON)

```json
{
  "TrailingPE": 26.8612,
  "ForwardPE": 24.6914,
  "PriceSalesTTM": 6.787,
  "PriceBookMRQ": 37.786,
  "EnterpriseValue": 2615208230350,
  "EnterpriseValueRevenue": 6.7749,
  "EnterpriseValueEbitda": 19.6671
}
```

