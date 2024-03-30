
# Intelligence Result Exception

An error occurred.

## Structure

`IntelligenceResultException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `String` | Optional | The 3-digit HTML error code.<br>**Constraints**: *Maximum Length*: `3`, *Pattern*: `^[0-9]{3}$` | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorMessage` | `String` | Optional | Error Message.<br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `1000`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getErrorMessage() | setErrorMessage(String errorMessage) |

## Example (as JSON)

```json
{
  "errorCode": "errorCode6",
  "errorMessage": "errorMessage8"
}
```

