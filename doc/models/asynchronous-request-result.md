
# Asynchronous Request Result

A successful request returns the request ID and the current status.

## Structure

`AsynchronousRequestResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | The unique ID of the asynchronous request. | String getRequestId() | setRequestId(String requestId) |
| `Status` | [`RequestStatusEnum`](../../doc/models/request-status-enum.md) | Optional | The current status of the callback response. | RequestStatusEnum getStatus() | setStatus(RequestStatusEnum status) |

## Example (as JSON)

```json
{
  "requestId": "86c83330-4bf5-4235-9c4e-a83f93aeae4c",
  "status": "Success"
}
```

