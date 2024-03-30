
# Kv Pair

## Structure

`KvPair`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getKey() | setKey(String key) |
| `Value` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "key6",
  "value": "value8"
}
```

