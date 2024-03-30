
# Get Wireless Coverage Request FWA

Get wireless coverage FWA.

## Structure

`GetWirelessCoverageRequestFWA`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account name.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9-]{3,32}$` | String getAccountName() | setAccountName(String accountName) |
| `RequestType` | `String` | Required | Type of request.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `12`, *Pattern*: `^[A-Za-z]{3,12}$` | String getRequestType() | setRequestType(String requestType) |
| `LocationType` | `String` | Required | Type of location detail.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `12`, *Pattern*: `^[A-Za-z]{3,12}$` | String getLocationType() | setLocationType(String locationType) |
| `Locations` | [`Locations`](../../doc/models/locations.md) | Required | Location details. | Locations getLocations() | setLocations(Locations locations) |
| `NetworkTypesList` | [`List<NetworkType>`](../../doc/models/network-type.md) | Required | **Constraints**: *Maximum Items*: `100` | List<NetworkType> getNetworkTypesList() | setNetworkTypesList(List<NetworkType> networkTypesList) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "requestType": "FWA",
  "locationType": "ADDRESS",
  "locations": {
    "addressList": [
      {
        "addressLine1": "addressLine10",
        "addressLine2": "addressLine28",
        "city": "city8",
        "state": "state4",
        "country": "country2"
      }
    ]
  },
  "networkTypesList": [
    {
      "networkType": "LTE"
    }
  ]
}
```

