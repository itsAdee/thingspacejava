
# Device Logging Request

Device logging information.

## Structure

`DeviceLoggingRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | `List<String>` | Required | List of device IMEI identifiers. | List<String> getDeviceIds() | setDeviceIds(List<String> deviceIds) |

## Example (as JSON)

```json
{
  "deviceIds": [
    "990013907835573",
    "991124018926684",
    "992234129057795",
    "998891785613351",
    "990013907835573"
  ]
}
```

