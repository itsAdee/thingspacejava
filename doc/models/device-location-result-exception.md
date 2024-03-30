
# Device Location Result Exception

Will be empty if there was no error.

## Structure

`DeviceLocationResultException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `String` | Required | - | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorMessage` | `String` | Required | - | String getErrorMessage() | setErrorMessage(String errorMessage) |

## Example (as JSON)

```json
{
  "errorCode": "The type of error, such as INVALID_REQUEST.",
  "errorMessage": "Additional error information."
}
```

