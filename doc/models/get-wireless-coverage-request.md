
# Get Wireless Coverage Request

Get wireless coverage.

## Structure

`GetWirelessCoverageRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account name.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9-]{3,32}$` | String getAccountName() | setAccountName(String accountName) |
| `RequestType` | `String` | Required | Type of request.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `12`, *Pattern*: `^[A-Za-z]{2,12}$` | String getRequestType() | setRequestType(String requestType) |
| `LocationType` | `String` | Required | Type of location detail.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `12`, *Pattern*: `^[A-Za-z]{3,12}$` | String getLocationType() | setLocationType(String locationType) |
| `Locations` | [`Locationscoord`](../../doc/models/locationscoord.md) | Required | Location coordinates. | Locationscoord getLocations() | setLocations(Locationscoord locations) |
| `NetworkTypesList` | [`List<NetworkType>`](../../doc/models/network-type.md) | Required | **Constraints**: *Maximum Items*: `100` | List<NetworkType> getNetworkTypesList() | setNetworkTypesList(List<NetworkType> networkTypesList) |

## Example (as JSON)

```json
{
  "accountName": "0000123456-00001",
  "requestType": "NW",
  "locationType": "LONGLAT",
  "locations": {
    "coordinatesList": [
      {
        "latitude": "-33.84819",
        "longitude": "151.22049"
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

