
# Numerical Data

Describes value and unit of time.

## Structure

`NumericalData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `Integer` | Optional | Numerical value. | Integer getValue() | setValue(Integer value) |
| `Unit` | [`NumericalDataUnitEnum`](../../doc/models/numerical-data-unit-enum.md) | Optional | Unit of time. | NumericalDataUnitEnum getUnit() | setUnit(NumericalDataUnitEnum unit) |

## Example (as JSON)

```json
{
  "value": 5,
  "unit": "SECOND"
}
```

