
# Profile Change State Request

## Structure

`ProfileChangeStateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Required | - | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `SmsrOid` | `String` | Required | - | String getSmsrOid() | setSmsrOid(String smsrOid) |

## Example (as JSON)

```json
{
  "devices": [
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ],
  "accountName": "1223334444-00001",
  "smsrOid": "1.3.6.1.4.1.31746.1.500.200.101.5"
}
```

