
# Notification Report Request

## Structure

`NotificationReportRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `RequestType` | `String` | Required | - | String getRequestType() | setRequestType(String requestType) |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Required | - | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |
| `MonitorExpirationTime` | `String` | Required | - | String getMonitorExpirationTime() | setMonitorExpirationTime(String monitorExpirationTime) |

## Example (as JSON)

```json
{
  "accountName": "0242072320-00001",
  "requestType": "REACHABLE_FOR_DATA",
  "devices": [
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ],
  "monitorExpirationTime": "2019-12-02T15:00:00-08:00Z"
}
```

