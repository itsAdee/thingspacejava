
# Managed Accounts Add Request

## Structure

`ManagedAccountsAddRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account identifier | String getAccountName() | setAccountName(String accountName) |
| `ServiceName` | [`ServiceNameEnum`](../../doc/models/service-name-enum.md) | Required | Service name<br>**Default**: `ServiceNameEnum.LOCATION` | ServiceNameEnum getServiceName() | setServiceName(ServiceNameEnum serviceName) |
| `Type` | `String` | Required | SKU name | String getType() | setType(String type) |
| `ManagedAccList` | `List<String>` | Required | managed account list | List<String> getManagedAccList() | setManagedAccList(List<String> managedAccList) |

## Example (as JSON)

```json
{
  "accountName": "1234567890-00001",
  "serviceName": "Location",
  "type": "TS-LOC-COARSE-CellID-Aggr",
  "managedAccList": [
    "1223334444-00001",
    "2334445555-00001",
    "3445556666-00001"
  ]
}
```

