
# ESI Msubrequest

## Structure

`ESIMsubrequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | - | String getId() | setId(String id) |
| `Kind` | `String` | Optional | - | String getKind() | setKind(String kind) |
| `Status` | [`Status1Enum`](../../doc/models/status-1-enum.md) | Optional | - | Status1Enum getStatus() | setStatus(Status1Enum status) |

## Example (as JSON)

```json
{
  "id": "32-digit EID",
  "kind": "eid",
  "status": "success"
}
```

