
# Change Pmec Device I Paddress Request

## Structure

`ChangePmecDeviceIPaddressRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<DeviceList7>`](../../doc/models/device-list-7.md) | Required | - | List<DeviceList7> getDeviceList() | setDeviceList(List<DeviceList7> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "0342351414-00001",
  "deviceList": [
    {
      "deviceIds": [
        {
          "id": "99948099913024600000",
          "kind": "iccid"
        }
      ],
      "ipAddress": "10.3.4.5"
    },
    {
      "deviceIds": [
        {
          "id": "999480500019111000001",
          "kind": "iccid"
        }
      ],
      "ipAddress": "10.4.5.7"
    }
  ]
}
```

