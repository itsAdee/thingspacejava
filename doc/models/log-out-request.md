
# Log Out Request

Request to end a Connectivity Management session.

## Structure

`LogOutRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `SessionToken` | `String` | Optional | The session token is returned to confirm that it was invalidated. | String getSessionToken() | setSessionToken(String sessionToken) |

## Example (as JSON)

```json
{
  "sessionToken": "bcce3ea6-fe4f-4952-bacf-eadd80718e83"
}
```

