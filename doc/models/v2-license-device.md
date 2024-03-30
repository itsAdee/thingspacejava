
# V2 License Device

Device IMEI list.

## Structure

`V2LicenseDevice`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Required | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `AssignmentTime` | `String` | Optional | License assignment time. | String getAssignmentTime() | setAssignmentTime(String assignmentTime) |

## Example (as JSON)

```json
{
  "deviceId": "990003425730535",
  "assignmentTime": "2017-11-29T16:03:42.000Z"
}
```

