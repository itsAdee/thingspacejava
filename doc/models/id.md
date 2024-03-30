
# Id

## Structure

`Id`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The value of the device identifier. | String getId() | setId(String id) |
| `Kind` | `String` | Optional | The type of the device identifier. Valid types of identifiers are:ESN (decimal),EID,ICCID (up to 20 digits),IMEI (up to 16 digits),MDN,MEID (hexadecimal),MSISDN. | String getKind() | setKind(String kind) |

## Example (as JSON)

```json
{
  "id": "990013907835573",
  "kind": "imei"
}
```

