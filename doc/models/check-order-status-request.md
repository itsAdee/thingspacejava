
# Check Order Status Request

The request body identifies the devices to upload.

## Structure

`CheckOrderStatusRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | The name of a billing account. An account name is usually numeric, and must include any leading zeros. | String getAccountName() | setAccountName(String accountName) |
| `OrderRequestId` | `String` | Optional | The request id from the activation order. | String getOrderRequestId() | setOrderRequestId(String orderRequestId) |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Required | The devices to upload, specified by device IDs in a format matching uploadType. | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |

## Example (as JSON)

```json
{
  "accountName": "1223334444-00001",
  "orderRequestId": "f55fea16-3664-4a32-ae9d-c0cbe3eedf1d",
  "devices": [
    {
      "deviceIds": [
        {
          "id": "id0",
          "kind": "kind8"
        }
      ]
    }
  ]
}
```

