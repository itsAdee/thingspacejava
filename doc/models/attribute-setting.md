
# Attribute Setting

Describes an attribute being observed and the frequency with which the attribute is being observed.

## Structure

`AttributeSetting`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`AttributeIdentifierEnum`](../../doc/models/attribute-identifier-enum.md) | Optional | Attribute identifier. | AttributeIdentifierEnum getName() | setName(AttributeIdentifierEnum name) |
| `Value` | `String` | Optional | Attribute value. | String getValue() | setValue(String value) |
| `CreatedOn` | `LocalDateTime` | Optional | Date and time request was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `IsObservable` | `Boolean` | Optional | Is the attribute observable? | Boolean getIsObservable() | setIsObservable(Boolean isObservable) |
| `IsObserving` | `Boolean` | Optional | Is the attribute being observed? | Boolean getIsObserving() | setIsObserving(Boolean isObserving) |
| `Frequency` | [`NumericalData`](../../doc/models/numerical-data.md) | Optional | Describes value and unit of time. | NumericalData getFrequency() | setFrequency(NumericalData frequency) |

## Example (as JSON)

```json
{
  "name": "MANUFACTURER",
  "value": "string",
  "createdOn": "2019-09-07T23:08:03.532Z",
  "isObservable": true,
  "isObserving": true,
  "frequency": {
    "value": 5,
    "unit": "SECOND"
  }
}
```

