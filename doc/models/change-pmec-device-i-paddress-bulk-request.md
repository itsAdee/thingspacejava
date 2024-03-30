
# Change Pmec Device I Paddress Bulk Request

## Structure

`ChangePmecDeviceIPaddressBulkRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<MECDeviceList>`](../../doc/models/mec-device-list.md) | Required | - | List<MECDeviceList> getDeviceList() | setDeviceList(List<MECDeviceList> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "0342351414-00001",
  "deviceList": [
    {
      "deviceIds": [
        {
          "id": "99948099913031600000",
          "kind": "iccid"
        }
      ]
    },
    {
      "deviceIds": [
        {
          "id": "99948099913031700000",
          "kind": "iccid"
        }
      ]
    }
  ]
}
```

