
# V2 Device Status

Device with id in IMEI.

## Structure

`V2DeviceStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Required | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `Status` | `String` | Required | Success or failure. | String getStatus() | setStatus(String status) |
| `ResultReason` | `String` | Optional | Result reason. | String getResultReason() | setResultReason(String resultReason) |

## Example (as JSON)

```json
{
  "deviceId": "990000473475967",
  "status": "Failure",
  "resultReason": "Device does not exist."
}
```

