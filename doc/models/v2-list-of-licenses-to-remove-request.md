
# V2 List of Licenses to Remove Request

License cancellation candidate devices.

## Structure

`V2ListOfLicensesToRemoveRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | List creation option. | String getType() | setType(String type) |
| `Count` | `Integer` | Optional | The number of devices. | Integer getCount() | setCount(Integer count) |
| `DeviceList` | `List<String>` | Required | Device IMEI list. | List<String> getDeviceList() | setDeviceList(List<String> deviceList) |

## Example (as JSON)

```json
{
  "type": "append",
  "count": 2,
  "deviceList": [
    "990003425730535",
    "990000473475989"
  ]
}
```

