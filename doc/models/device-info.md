
# Device Info

The devices that you want to locate. The array cannot contain more than 20 devices.

## Structure

`DeviceInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Required | Device identifier. | String getId() | setId(String id) |
| `Kind` | `String` | Required | Device identifier kind. | String getKind() | setKind(String kind) |
| `Mdn` | `String` | Required | Device MDN. | String getMdn() | setMdn(String mdn) |

## Example (as JSON)

```json
{
  "id": "980003420535573",
  "kind": "imei",
  "mdn": "7892345678"
}
```

