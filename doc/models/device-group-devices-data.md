
# Device Group Devices Data

Returns the name, description, and list of devices in a device group.

## Structure

`DeviceGroupDevicesData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Description` | `String` | Optional | The description of the device group. | String getDescription() | setDescription(String description) |
| `Devices` | [`List<AccountDeviceList>`](../../doc/models/account-device-list.md) | Optional | The devices in the device group. | List<AccountDeviceList> getDevices() | setDevices(List<AccountDeviceList> devices) |
| `HasMoreData` | `Boolean` | Optional | False for a status 200 response.True for a status 202 response, indicating that there is more data to be retrieved. | Boolean getHasMoreData() | setHasMoreData(Boolean hasMoreData) |
| `Name` | `String` | Optional | The name of the device group. | String getName() | setName(String name) |

## Example (as JSON)

```json
{
  "name": "Nebraska Trucks",
  "description": "All service trucks in Nebraska.",
  "hasMoreData": false,
  "devices": [
    {
      "deviceIds": [
        {
          "id": "12345",
          "kind": "meid"
        },
        {
          "id": "54321",
          "kind": "mdn"
        }
      ],
      "ipAddress": "ipAddress4"
    }
  ]
}
```

