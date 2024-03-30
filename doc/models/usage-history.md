
# Usage History

## Structure

`UsageHistory`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BytesUsed` | `Integer` | Optional | - | Integer getBytesUsed() | setBytesUsed(Integer bytesUsed) |
| `Serviceplan` | `String` | Optional | - | String getServiceplan() | setServiceplan(String serviceplan) |
| `SmsUsed` | `Integer` | Optional | - | Integer getSmsUsed() | setSmsUsed(Integer smsUsed) |
| `MoSMS` | `Integer` | Optional | - | Integer getMoSMS() | setMoSMS(Integer moSMS) |
| `MtSMS` | `Integer` | Optional | - | Integer getMtSMS() | setMtSMS(Integer mtSMS) |
| `Source` | `String` | Optional | - | String getSource() | setSource(String source) |
| `EventDateTime` | `LocalDateTime` | Optional | - | LocalDateTime getEventDateTime() | setEventDateTime(LocalDateTime eventDateTime) |

## Example (as JSON)

```json
{
  "bytesUsed": 3072,
  "serviceplan": "The serviceplan name",
  "source": "Raw Usage",
  "eventDateTime": "08/15/2021 00:00:00",
  "smsUsed": 250,
  "moSMS": 100,
  "mtSMS": 92
}
```

