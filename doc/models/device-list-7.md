
# Device List 7

## Structure

`DeviceList7`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<MECDeviceId>`](../../doc/models/mec-device-id.md) | Required | - | List<MECDeviceId> getDeviceIds() | setDeviceIds(List<MECDeviceId> deviceIds) |
| `IpAddress` | `String` | Required | - | String getIpAddress() | setIpAddress(String ipAddress) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "id": "99948099913024600000",
      "kind": "iccid"
    }
  ],
  "ipAddress": "10.3.4.5"
}
```

