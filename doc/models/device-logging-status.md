
# Device Logging Status

Device logging status information.

## Structure

`DeviceLoggingStatus`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Required | Device IMEI. | String getDeviceId() | setDeviceId(String deviceId) |
| `ExpiryDate` | `LocalDate` | Required | The date when device logging expires. | LocalDate getExpiryDate() | setExpiryDate(LocalDate expiryDate) |

## Example (as JSON)

```json
{
  "deviceId": "990013907835573",
  "expiryDate": "2020-10-19"
}
```

