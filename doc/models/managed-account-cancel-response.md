
# Managed Account Cancel Response

## Structure

`ManagedAccountCancelResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Txid` | `String` | Required | Transaction identifier | String getTxid() | setTxid(String txid) |
| `AccountName` | `String` | Required | Managed account identifier | String getAccountName() | setAccountName(String accountName) |
| `PaccountName` | `String` | Required | Primary account identifier | String getPaccountName() | setPaccountName(String paccountName) |
| `ServiceName` | [`ServiceNameEnum`](../../doc/models/service-name-enum.md) | Required | Service name<br>**Default**: `ServiceNameEnum.LOCATION` | ServiceNameEnum getServiceName() | setServiceName(ServiceNameEnum serviceName) |
| `Status` | `String` | Required | Deactivate/cancel status, Success or Fail | String getStatus() | setStatus(String status) |
| `Reason` | `String` | Required | Detailed reason | String getReason() | setReason(String reason) |

## Example (as JSON)

```json
{
  "txid": "4fbff332-ece4-42ef-9f02-7e3bdc90bd28",
  "accountName": "1223334444-00001",
  "paccountName": "1223334444-00001",
  "serviceName": "Location",
  "status": "Success",
  "reason": "Success"
}
```

