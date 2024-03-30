
# Device List 1

## Structure

`DeviceList1`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<MECDeviceId>`](../../doc/models/mec-device-id.md) | Required | - | List<MECDeviceId> getDeviceIds() | setDeviceIds(List<MECDeviceId> deviceIds) |
| `IpAddress` | `String` | Required | - | String getIpAddress() | setIpAddress(String ipAddress) |
| `Apn` | `String` | Required | - | String getApn() | setApn(String apn) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "99948099913031600000",
      "kind": "iccid"
    }
  ],
  "ipAddress": "10.3.4.9",
  "apn": "1"
}
```

