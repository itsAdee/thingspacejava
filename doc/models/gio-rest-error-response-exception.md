
# GIO Rest Error Response Exception

## Structure

`GIORestErrorResponseException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3`, *Pattern*: `^[0-9]{3,3}$` | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorMessage` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `1000`, *Pattern*: `^[A-Za-z0-9 ]{3,32}$` | String getErrorMessage() | setErrorMessage(String errorMessage) |

## Example (as JSON)

```json
{
  "errorCode": "400",
  "errorMessage": "a brief description of the error"
}
```

