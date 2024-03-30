
# SMS Message

SMS messages sent by all M2M devices associated with a billing account.

## Structure

`SMSMessage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<DeviceId>`](../../doc/models/device-id.md) | Optional | One or more IDs of the device that sent the message. | List<DeviceId> getDeviceIds() | setDeviceIds(List<DeviceId> deviceIds) |
| `Message` | `String` | Optional | The contents of the SMS message. | String getMessage() | setMessage(String message) |
| `Timestamp` | `String` | Optional | The date and time that the message was received by the Verizon ThingSpace Platform. | String getTimestamp() | setTimestamp(String timestamp) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "09623489171",
      "kind": "esn"
    }
  ],
  "message": "testmessage1",
  "timestamp": "2016-01-01T12:29:49-08:00"
}
```

