
# V1 List of Licenses to Remove Result

List of licenses assigned.

## Structure

`V1ListOfLicensesToRemoveResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Count` | `Integer` | Optional | The total number of devices on the cancellation candidate list. | Integer getCount() | setCount(Integer count) |
| `DeviceList` | `List<String>` | Optional | The IMEIs of the devices. | List<String> getDeviceList() | setDeviceList(List<String> deviceList) |

## Example (as JSON)

```json
{
  "count": 2,
  "deviceList": [
    "900000000000001",
    "900000000000999"
  ]
}
```

