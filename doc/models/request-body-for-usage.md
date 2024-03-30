
# Request Body for Usage

## Structure

`RequestBodyForUsage`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DeviceId` | [`List<ReadySimDeviceId>`](../../doc/models/ready-sim-device-id.md) | Optional | - | List<ReadySimDeviceId> getDeviceId() | setDeviceId(List<ReadySimDeviceId> deviceId) |
| `StartTime` | `LocalDateTime` | Optional | - | LocalDateTime getStartTime() | setStartTime(LocalDateTime startTime) |
| `EndTime` | `LocalDateTime` | Optional | - | LocalDateTime getEndTime() | setEndTime(LocalDateTime endTime) |

## Example (as JSON)

```json
{
  "startTime": "08/15/2021 00:00:00",
  "endTime": "08/16/2021 00:00:00",
  "deviceId": [
    {
      "kind": "kind8",
      "id": "id0"
    }
  ]
}
```

