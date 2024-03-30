
# I Error Message

Error message.

## Structure

`IErrorMessage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ErrorCode` | [`ErrorResponseCodeEnum`](../../doc/models/error-response-code-enum.md) | Optional | Error Code. | ErrorResponseCodeEnum getErrorCode() | setErrorCode(ErrorResponseCodeEnum errorCode) |
| `ErrorMessage` | `String` | Optional | Details and additional information about the error code. | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `HttpStatusCode` | [`HttpStatusCodeEnum`](../../doc/models/http-status-code-enum.md) | Optional | HTML error code and description. | HttpStatusCodeEnum getHttpStatusCode() | setHttpStatusCode(HttpStatusCodeEnum httpStatusCode) |
| `DetailErrorMessage` | `String` | Optional | More detail and information about the HTML error code. | String getDetailErrorMessage() | setDetailErrorMessage(String detailErrorMessage) |

## Example (as JSON)

```json
{
  "httpStatusCode": "200 OK",
  "errorCode": "INVALID_ACCESS",
  "errorMessage": "errorMessage4",
  "detailErrorMessage": "detailErrorMessage6"
}
```

