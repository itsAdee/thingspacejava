
# Device Labels

A label for a single device.

## Structure

`DeviceLabels`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | The label you want to associate with the device. | String getName() | setName(String name) |
| `Value` | `String` | Required | The value of label | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "name": "VIN",
  "value": "XXUZL54B5YN105457"
}
```

