
# GIO Device Id

## Structure

`GIODeviceId`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Kind` | `String` | Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `6`, *Pattern*: `^[A-Za-z]{3,6}$` | String getKind() | setKind(String kind) |
| `Id` | `String` | Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[0-9]{3,32}$` | String getId() | setId(String id) |

## Example (as JSON)

```json
{
  "kind": "eid",
  "id": "12345678901234567890123456789012"
}
```

