
# V3 Device List Item

Device changed.

## Structure

`V3DeviceListItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Optional | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `Status` | `String` | Optional | Success or failure. | String getStatus() | setStatus(String status) |
| `Reason` | `String` | Optional | Result reason. | String getReason() | setReason(String reason) |

## Example (as JSON)

```json
{
  "deviceId": "15-digit IMEI",
  "status": "AddDeviceSucceed",
  "Reason": "Device added Successfully"
}
```

