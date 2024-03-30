
# IP Pool

IP pool that is available to the account.

## Structure

`IPPool`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PoolName` | `String` | Optional | The name of the IP pool. | String getPoolName() | setPoolName(String poolName) |
| `PoolType` | `String` | Optional | The type of IP pool, such as “Static IP” or “Dynamic IP.” | String getPoolType() | setPoolType(String poolType) |
| `IsDefaultPool` | `Boolean` | Optional | True if this is the default IP pool for the account. | Boolean getIsDefaultPool() | setIsDefaultPool(Boolean isDefaultPool) |

## Example (as JSON)

```json
{
  "poolName": "ACMESTATIC001",
  "poolType": "Static IP",
  "isDefaultPool": true
}
```

