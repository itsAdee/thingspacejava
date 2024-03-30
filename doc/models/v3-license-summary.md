
# V3 License Summary

Information for FOTA licenses assigned to devices.

## Structure

`V3LicenseSummary`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account identifier. | String getAccountName() | setAccountName(String accountName) |
| `TotalLicenses` | `Integer` | Optional | Total FOTA license count. | Integer getTotalLicenses() | setTotalLicenses(Integer totalLicenses) |
| `AssignedLicenses` | `int` | Required | Assigned FOTA license count. | int getAssignedLicenses() | setAssignedLicenses(int assignedLicenses) |
| `HasMoreData` | `boolean` | Required | True if there are more devices to retrieve. | boolean getHasMoreData() | setHasMoreData(boolean hasMoreData) |
| `LastSeenDeviceId` | `String` | Optional | Last seen device identifier. | String getLastSeenDeviceId() | setLastSeenDeviceId(String lastSeenDeviceId) |
| `MaxPageSize` | `int` | Required | Maximum page size. | int getMaxPageSize() | setMaxPageSize(int maxPageSize) |
| `DeviceList` | [`List<V3LicenseDevice>`](../../doc/models/v3-license-device.md) | Optional | Device IMEI list. | List<V3LicenseDevice> getDeviceList() | setDeviceList(List<V3LicenseDevice> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "totalLicenses": 5000,
  "assignedLicenses": 4319,
  "hasMoreData": true,
  "lastSeenDeviceId": "1000",
  "maxPageSize": 1000,
  "deviceList": [
    {
      "deviceId": "15-digit IMEI",
      "assignmentTime": "2017-11-29 20:15:42.738 +0000 UTC"
    },
    {
      "deviceId": "15-digit IMEI",
      "assignmentTime": "2017-11-29 20:15:42.738 +0000 UTC"
    }
  ]
}
```

