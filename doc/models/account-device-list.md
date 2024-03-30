
# Account Device List

A list of deviceId objects to use when requesting information from multiple devices.

## Structure

`AccountDeviceList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceIds` | [`List<DeviceId>`](../../doc/models/device-id.md) | Required | All identifiers for the device. | List<DeviceId> getDeviceIds() | setDeviceIds(List<DeviceId> deviceIds) |
| `IpAddress` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9].[0-9].[0-9].[0-9]{3,32}$` | String getIpAddress() | setIpAddress(String ipAddress) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "kind": "imei",
      "id": "990013907835573"
    },
    {
      "kind": "iccid",
      "id": "89141390780800784259"
    }
  ],
  "ipAddress": "ipAddress2"
}
```

