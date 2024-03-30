
# V2 Licenses Assigned Removed Result

License assignment or removal confirmation.

## Structure

`V2LicensesAssignedRemovedResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account name. | String getAccountName() | setAccountName(String accountName) |
| `LicTotalCount` | `int` | Required | Total license count. | int getLicTotalCount() | setLicTotalCount(int licTotalCount) |
| `LicUsedCount` | `int` | Required | Assigned license count. | int getLicUsedCount() | setLicUsedCount(int licUsedCount) |
| `DeviceList` | [`List<V2DeviceStatus>`](../../doc/models/v2-device-status.md) | Required | List of devices with id in IMEI. | List<V2DeviceStatus> getDeviceList() | setDeviceList(List<V2DeviceStatus> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "0242078689-00001",
  "licTotalCount": 1000,
  "licUsedCount": 502,
  "deviceList": [
    {
      "deviceId": "990003425730524",
      "status": "Success",
      "resultReason": "Success"
    },
    {
      "deviceId": "990000473475967",
      "status": "Failure",
      "resultReason": "Device does not exist."
    }
  ]
}
```

