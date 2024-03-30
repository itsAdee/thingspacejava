
# Change Pmec Device State Activate Request

## Structure

`ChangePmecDeviceStateActivateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<MECDeviceList>`](../../doc/models/mec-device-list.md) | Required | - | List<MECDeviceList> getDeviceList() | setDeviceList(List<MECDeviceList> deviceList) |
| `Activate` | [`Activate`](../../doc/models/activate.md) | Required | - | Activate getActivate() | setActivate(Activate activate) |

## Example (as JSON)

```json
{
  "accountName": "0342351414-00001",
  "deviceList": [
    {
      "deviceIds": [
        {
          "id": "99948099913024600001",
          "kind": "iccid"
        }
      ]
    }
  ],
  "activate": {
    "profile": "HSS EsmProfile Enterprise 5G"
  }
}
```

