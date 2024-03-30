
# SMS Event History Request

## Structure

`SMSEventHistoryRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`GIODeviceId`](../../doc/models/gio-device-id.md) | Required | - | GIODeviceId getDeviceId() | setDeviceId(GIODeviceId deviceId) |
| `Earliest` | `LocalDateTime` | Optional | - | LocalDateTime getEarliest() | setEarliest(LocalDateTime earliest) |
| `Latest` | `LocalDateTime` | Optional | - | LocalDateTime getLatest() | setLatest(LocalDateTime latest) |

## Example (as JSON)

```json
{
  "deviceId": {
    "kind": "eid",
    "id": "12345678901234567890123456789012"
  },
  "earliest": "2016-03-13T12:52:32.123Z",
  "latest": "2016-03-13T12:52:32.123Z"
}
```

