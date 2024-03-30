
# Custom Fields

Custom data that can be included using key-value pairs.

## Structure

`CustomFields`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Required | The key for an extended attribute. | String getKey() | setKey(String key) |
| `Value` | `String` | Required | The value of an extended attribute. | String getValue() | setValue(String value) |

## Example (as JSON)

```json
{
  "key": "CustomField2",
  "value": "SuperVend"
}
```

