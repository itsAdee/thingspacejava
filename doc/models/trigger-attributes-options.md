
# Trigger Attributes Options

## Structure

`TriggerAttributesOptions`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Key` | `String` | Optional | If present, the NotificationGroupName will be listed here. | String getKey() | setKey(String key) |
| `Value` | `Boolean` | Optional | DataPercentage50<br />True - Trigger on Data percentage is over 50% used<br />False - Do not trigger when over 50% used. | Boolean getValue() | setValue(Boolean value) |

## Example (as JSON)

```json
{
  "key": "DataPercentage50",
  "value": false
}
```

