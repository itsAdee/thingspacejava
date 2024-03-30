
# MEC Performance Query Result

Result of the query for obtaining MEC performance metrics.

## Structure

`MECPerformanceQueryResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | Name of the parameter. | String getName() | setName(String name) |
| `Data` | `List<String>` | Optional | Parameter values. | List<String> getData() | setData(List<String> data) |

## Example (as JSON)

```json
{
  "name": "NetworkAvailability",
  "data": [
    "100",
    "percent",
    "high"
  ]
}
```

