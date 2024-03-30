
# Check in History Item

Check-in history for a device.

## Structure

`CheckInHistoryItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Required | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `ClientType` | `String` | Required | Type of client. | String getClientType() | setClientType(String clientType) |
| `Result` | `String` | Required | - | String getResult() | setResult(String result) |
| `FailureType` | `String` | Required | - | String getFailureType() | setFailureType(String failureType) |
| `TimeCompleted` | `LocalDateTime` | Required | - | LocalDateTime getTimeCompleted() | setTimeCompleted(LocalDateTime timeCompleted) |

## Example (as JSON)

```json
{
  "deviceId": "990013907835573",
  "clientType": "clientType6",
  "result": "result8",
  "failureType": "failureType8",
  "timeCompleted": "10/22/2020 19:35:07"
}
```

