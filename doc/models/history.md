
# History

History data for a selected device and its attributes at a specific time.

## Structure

`History`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | The name of the billing account for which you want retrieve history data. An account name is usually numeric, and must include any leading zeros. | String getAccountName() | setAccountName(String accountName) |
| `Device` | [`Device`](../../doc/models/device.md) | Required | Identifies a particular IoT device. | Device getDevice() | setDevice(Device device) |
| `Attributes` | [`HistoryAttributeValue`](../../doc/models/history-attribute-value.md) | Optional | Streaming RF parameter for which you want to retrieve history data. | HistoryAttributeValue getAttributes() | setAttributes(HistoryAttributeValue attributes) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "attributes": {
    "createdOn": "2022-02-10T16:02:21.406Z",
    "name": "LINK_QUALITY",
    "value": "47"
  },
  "device": {
    "id": "15-digit IMEI",
    "kind": "IMEI"
  }
}
```

