
# Firmware Upgrade Change Request

List of devices to add or remove.

## Structure

`FirmwareUpgradeChangeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`FirmwareTypeListEnum`](../../doc/models/firmware-type-list-enum.md) | Required | Possible values are `append` or `remove` | FirmwareTypeListEnum getType() | setType(FirmwareTypeListEnum type) |
| `DeviceList` | `List<String>` | Required | The IMEIs of the devices. | List<String> getDeviceList() | setDeviceList(List<String> deviceList) |

## Example (as JSON)

```json
{
  "type": "append",
  "deviceList": [
    "15-digit IMEI",
    "15-digit IMEI"
  ]
}
```

