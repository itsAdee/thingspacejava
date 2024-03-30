
# Managed Account Cancel Request

## Structure

`ManagedAccountCancelRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Managed account identifier | String getAccountName() | setAccountName(String accountName) |
| `PaccountName` | `String` | Required | Primary Account identifier | String getPaccountName() | setPaccountName(String paccountName) |
| `ServiceName` | [`ServiceNameEnum`](../../doc/models/service-name-enum.md) | Required | Service name<br>**Default**: `ServiceNameEnum.LOCATION` | ServiceNameEnum getServiceName() | setServiceName(ServiceNameEnum serviceName) |
| `Type` | `String` | Required | SKU name | String getType() | setType(String type) |
| `Txid` | `String` | Required | Transaction identifier returned by provision request | String getTxid() | setTxid(String txid) |

## Example (as JSON)

```json
{
  "accountName": "1223334444-00001",
  "paccountName": "1223334444-00001",
  "serviceName": "Location",
  "type": "TS-LOC-COARSE-CellID-5K",
  "txid": "d4fbff33-ece4-9f02-42ef-2c90bd287e3b"
}
```

