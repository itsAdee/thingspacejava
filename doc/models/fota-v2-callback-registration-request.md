
# Fota V2 Callback Registration Request

Callback URL registration.

## Structure

`FotaV2CallbackRegistrationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Url` | `String` | Optional | Callback URL for an subscribed service. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "url": "https://255.255.11.135:50559/CallbackListener/FirmwareServiceMessages.asmx"
}
```

