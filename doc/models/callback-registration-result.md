
# Callback Registration Result

## Structure

`CallbackRegistrationResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Account` | `String` | Optional | The name of the account that registered the callback URL. | String getAccount() | setAccount(String account) |
| `Name` | [`CallbackServiceNameEnum`](../../doc/models/callback-service-name-enum.md) | Optional | The name of the callback service. | CallbackServiceNameEnum getName() | setName(CallbackServiceNameEnum name) |

## Example (as JSON)

```json
{
  "account": "0212312345-00001",
  "name": "Location"
}
```

