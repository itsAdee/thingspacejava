
# Fota V1 Result Exception

Response in case of any errors.

## Structure

`FotaV1ResultException`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | `String` | Required | Error response code. | String getErrorCode() | setErrorCode(String errorCode) |
| `ErrorMessage` | `String` | Required | Description of the error. | String getErrorMessage() | setErrorMessage(String errorMessage) |

## Example (as JSON)

```json
{
  "errorCode": "error code string",
  "errorMessage": "error message string"
}
```

