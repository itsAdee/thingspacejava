
# Resources Edge Hosted Service

Edge hosted service represented by Service Endpoint definition.

## Structure

`ResourcesEdgeHostedService`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Ern` | `String` | Optional | Edge Resource Name. A string identifier for a set of edge resources.<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9-_]{3,32}$` | String getErn() | setErn(String ern) |
| `ServiceEndpoint` | [`ResourcesServiceEndpoint`](../../doc/models/resources-service-endpoint.md) | Optional | Service Endpoint path, address, and port. | ResourcesServiceEndpoint getServiceEndpoint() | setServiceEndpoint(ResourcesServiceEndpoint serviceEndpoint) |
| `ApplicationServerProviderId` | `String` | Optional | Unique ID representing the Edge Application Provider.<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getApplicationServerProviderId() | setApplicationServerProviderId(String applicationServerProviderId) |
| `ApplicationId` | `String` | Optional | Unique ID representing the Edge Application.<br>**Constraints**: *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getApplicationId() | setApplicationId(String applicationId) |
| `ServiceDescription` | `String` | Optional | **Constraints**: *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getServiceDescription() | setServiceDescription(String serviceDescription) |

## Example (as JSON)

```json
{
  "ern": "LASVEGAS_NV_WL",
  "applicationServerProviderId": "AWS",
  "applicationId": "IogspaceJan15",
  "serviceDescription": "ThieIt",
  "serviceEndpoint": {
    "URI": "URI6",
    "FQDN": "FQDN2",
    "IPv4Address": "IPv4Address4",
    "IPv6Address": "IPv6Address8",
    "port": 16
  }
}
```

