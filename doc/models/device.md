
# Device

Identifies a particular IoT device.

## Structure

`Device`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Device identifier. | String getId() | setId(String id) |
| `Kind` | `String` | Required | Device kind identifier. | String getKind() | setKind(String kind) |

## Example (as JSON)

```json
{
  "id": "864508030026238",
  "kind": "IMEI"
}
```

