
# Device Extended Diagnostics Request

Request for obtaining device extended diagnostics.

## Structure

`DeviceExtendedDiagnosticsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | The Verizon billing account that the device belongs to. An account name is usually numeric, and must include any leading zeros. | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<DeviceId>`](../../doc/models/device-id.md) | Required | The device for which you want diagnostic information, specified by the device's MDN. | List<DeviceId> getDeviceList() | setDeviceList(List<DeviceId> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "1223334444-00001",
  "deviceList": [
    {
      "id": "10-digit MDN",
      "kind": "mdn"
    }
  ]
}
```

