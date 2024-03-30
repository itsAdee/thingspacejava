
# Account Labels

Maximum of 2,000 objects are allowed in the array.

## Structure

`AccountLabels`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Devices` | [`List<DeviceList>`](../../doc/models/device-list.md) | Required | - | List<DeviceList> getDevices() | setDevices(List<DeviceList> devices) |
| `Label` | [`List<DeviceLabels>`](../../doc/models/device-labels.md) | Optional | - | List<DeviceLabels> getLabel() | setLabel(List<DeviceLabels> label) |

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
  "label": [
    {
      "name": "name0",
      "value": "value2"
    },
    {
      "name": "name0",
      "value": "value2"
    },
    {
      "name": "name0",
      "value": "value2"
    }
  ]
}
```

