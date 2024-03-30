
# Managed Accounts Add Response

## Structure

`ManagedAccountsAddResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TxId` | `String` | Optional | Transaction identifier | String getTxId() | setTxId(String txId) |
| `StatusList` | [`List<StatusList>`](../../doc/models/status-list.md) | Optional | - | List<StatusList> getStatusList() | setStatusList(List<StatusList> statusList) |

## Example (as JSON)

```json
{
  "TxId": "2c90bd28-ece4-42ef-9f02-7e3bd4fbff33",
  "statusList": [
    {
      "id": "id6",
      "status": "status8",
      "reason": "reason8"
    }
  ]
}
```

