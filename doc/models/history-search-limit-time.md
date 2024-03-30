
# History Search Limit Time

The time period for which a request should retrieve data, beginning with the limitTime.startOn and proceeding with the limitTime.duration.

## Structure

`HistorySearchLimitTime`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartOn` | `LocalDateTime` | Optional | The starting date-time for this request. | LocalDateTime getStartOn() | setStartOn(LocalDateTime startOn) |
| `Duration` | [`NumericalData`](../../doc/models/numerical-data.md) | Optional | Describes value and unit of time. | NumericalData getDuration() | setDuration(NumericalData duration) |

## Example (as JSON)

```json
{
  "startOn": "2019-08-29T00:47:59.240Z",
  "duration": {
    "value": 5,
    "unit": "SECOND"
  }
}
```

