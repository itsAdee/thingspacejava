
# ESIM Status Response

## Structure

`ESIMStatusResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestId` | `String` | Optional | - | String getRequestId() | setRequestId(String requestId) |
| `Status` | `String` | Optional | - | String getStatus() | setStatus(String status) |
| `Subrequests` | [`List<ESIMsubrequest>`](../../doc/models/esi-msubrequest.md) | Optional | **Constraints**: *Maximum Items*: `100` | List<ESIMsubrequest> getSubrequests() | setSubrequests(List<ESIMsubrequest> subrequests) |

## Example (as JSON)

```json
{
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8",
  "status": "Success",
  "subrequests": [
    {
      "id": "id0",
      "kind": "kind8",
      "status": "success"
    },
    {
      "id": "id0",
      "kind": "kind8",
      "status": "success"
    }
  ]
}
```

