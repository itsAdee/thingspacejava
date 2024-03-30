
# Query MEC Performance Metrics Request

MEC performance metrics request.

## Structure

`QueryMECPerformanceMetricsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IMEI` | `String` | Required | The 15-digit International Mobile Equipment Identifier. | String getIMEI() | setIMEI(String iMEI) |
| `MSISDN` | `String` | Required | The 12-digit Mobile Station International Subscriber Directory Number. | String getMSISDN() | setMSISDN(String mSISDN) |

## Example (as JSON)

```json
{
  "IMEI": "440246108109673",
  "MSISDN": "10691876598"
}
```

