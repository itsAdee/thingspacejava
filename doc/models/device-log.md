
# Device Log

Device logging information.

## Structure

`DeviceLog`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Required | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `LogTime` | `LocalDateTime` | Required | Time of log. | LocalDateTime getLogTime() | setLogTime(LocalDateTime logTime) |
| `LogType` | `String` | Required | Log type (one of SoftwareUpdate, Event, UserNotification, AgentService, Wireless, WirelessWeb, MobileBroadbandModem, WindowsMDM). | String getLogType() | setLogType(String logType) |
| `EventLog` | `String` | Required | Event log. | String getEventLog() | setEventLog(String eventLog) |
| `BinaryLogFileBase64` | `String` | Required | Base64-encoded contents of binary log file. | String getBinaryLogFileBase64() | setBinaryLogFileBase64(String binaryLogFileBase64) |
| `BinaryLogFilename` | `String` | Required | File name of binary log file. | String getBinaryLogFilename() | setBinaryLogFilename(String binaryLogFilename) |

## Example (as JSON)

```json
{
  "deviceId": "990013907835573",
  "logTime": "10/22/2020 19:29:50",
  "logType": "logType6",
  "eventLog": "eventLog0",
  "binaryLogFileBase64": "binaryLogFileBase644",
  "binaryLogFilename": "binaryLogFilename0"
}
```

