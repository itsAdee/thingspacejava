
# Firmware IMEI

A list of IMEIs for devices to be synchronized between ThingSpace and the FOTA server.

## Structure

`FirmwareIMEI`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceList` | `List<String>` | Required | Device IMEI list.<br>**Constraints**: *Maximum Items*: `1000` | List<String> getDeviceList() | setDeviceList(List<String> deviceList) |

## Example (as JSON)

```json
{
  "deviceList": [
    "15-digit IMEI"
  ]
}
```

