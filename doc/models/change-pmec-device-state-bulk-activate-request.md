
# Change Pmec Device State Bulk Activate Request

## Structure

`ChangePmecDeviceStateBulkActivateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | - | String getAccountName() | setAccountName(String accountName) |
| `DeviceList` | [`List<DeviceList1>`](../../doc/models/device-list-1.md) | Required | - | List<DeviceList1> getDeviceList() | setDeviceList(List<DeviceList1> deviceList) |
| `Activate` | [`Activate`](../../doc/models/activate.md) | Required | - | Activate getActivate() | setActivate(Activate activate) |

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
      ],
      "ipAddress": "10.3.4.9",
      "apn": "1"
    },
    {
      "deviceIds": [
        {
          "id": "99948099913031700000",
          "kind": "iccid"
        }
      ],
      "ipAddress": "10.4.5.2",
      "apn": "2"
    }
  ],
  "activate": {
    "profile": "HSS EsmProfile Enterprise 5G internet"
  }
}
```

