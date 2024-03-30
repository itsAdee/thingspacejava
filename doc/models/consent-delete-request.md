
# Consent Delete Request

## Structure

`ConsentDeleteRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | Account identifier. | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | `List<String>` | Optional | Device ID list. | List<String> getDeviceList() | setDeviceList(List<String> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "MyAccount-1",
  "deviceList": [
    "deviceList2",
    "deviceList3"
  ]
}
```

