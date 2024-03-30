
# Device Location Callback

## Structure

`DeviceLocationCallback`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | [`CallbackServiceNameEnum`](../../doc/models/callback-service-name-enum.md) | Required | The name of the callback service. | CallbackServiceNameEnum getName() | setName(CallbackServiceNameEnum name) |
| `Url` | `String` | Required | The location of your callback listener. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "name": "Location",
  "url": "http://10.120.102.183:50559/CallbackListener/LocationServiceMessages.asmx"
}
```

