
# Callback Action Result

Response to a callback action.

## Structure

`CallbackActionResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of the billing account. | String getAccountName() | setAccountName(String accountName) |
| `ServiceName` | `String` | Optional | The name of the callback service that was registered/deregistered. | String getServiceName() | setServiceName(String serviceName) |

## Example (as JSON)

```json
{
  "accountName": "122333444-00002",
  "serviceName": "CarrierService"
}
```

