
# V3 License Device

Device IMEI.

## Structure

`V3LicenseDevice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Required | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `AssignmentTime` | `String` | Optional | License assignment time. | String getAssignmentTime() | setAssignmentTime(String assignmentTime) |

## Example (as JSON)

```json
{
  "deviceId": "15-digit IMEI",
  "assignmentTime": "2017-11-29 20:15:42.738 +0000 UTC"
}
```

