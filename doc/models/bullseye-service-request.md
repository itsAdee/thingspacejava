
# Bullseye Service Request

Account number and list of devices.

## Structure

`BullseyeServiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceList` | [`List<DeviceServiceRequest>`](../../doc/models/device-service-request.md) | Required | A list of devices. | List<DeviceServiceRequest> getDeviceList() | setDeviceList(List<DeviceServiceRequest> deviceList) |
| `AccountNumber` | `String` | Required | A unique identifier for an account. | String getAccountNumber() | setAccountNumber(String accountNumber) |

## Example (as JSON)

```json
{
  "deviceList": [
    {
      "imei": "354658090356210",
      "BullseyeEnable": true
    }
  ],
  "accountNumber": "0242080353-00001"
}
```

