
# Firmware Upgrade Device List Item

A JSON object for each device that was included in the upgrade, showing the device IMEI, the status of the upgrade, and additional information about the status.

## Structure

`FirmwareUpgradeDeviceListItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Optional | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `Status` | `String` | Optional | The status of the upgrade for this device. | String getStatus() | setStatus(String status) |
| `ResultReason` | `String` | Optional | Additional details about the status. Not included when status='Request Pending.' | String getResultReason() | setResultReason(String resultReason) |

## Example (as JSON)

```json
{
  "deviceId": "900000000000002",
  "status": "Device Accepted",
  "resultReason": "success"
}
```

