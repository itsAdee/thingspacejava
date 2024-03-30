
# Device Service Request

Device information.

## Structure

`DeviceServiceRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Imei` | `String` | Required | International Mobile Equipment Identifier. The unique ID of a device.<br>**Constraints**: *Pattern*: `^[0-9]{15}$` | String getImei() | setImei(String imei) |
| `BullseyeEnable` | `boolean` | Required | Set to Enable (true) or Disable (false). | boolean getBullseyeEnable() | setBullseyeEnable(boolean bullseyeEnable) |

## Example (as JSON)

```json
{
  "imei": "354658090356210",
  "BullseyeEnable": true
}
```

