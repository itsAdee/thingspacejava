
# Device Connection List Request

Request to list of network connection events for a device during a specified time period.

## Structure

`DeviceConnectionListRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`DeviceId`](../../doc/models/device-id.md) | Required | An identifier for a single device. | DeviceId getDeviceId() | setDeviceId(DeviceId deviceId) |
| `Earliest` | `String` | Required | The earliest date and time for which you want connection events. | String getEarliest() | setEarliest(String earliest) |
| `Latest` | `String` | Required | The last date and time for which you want connection events. | String getLatest() | setLatest(String latest) |

## Example (as JSON)

```json
{
  "deviceId": {
    "id": "89141390780800784259",
    "kind": "iccid"
  },
  "earliest": "2015-09-16T00:00:01Z",
  "latest": "2010-09-18T00:00:01Z"
}
```

