
# Create Io T Application Response

A success response includes an array of all matching events. Each event includes the full event resource definition.

## Structure

`CreateIoTApplicationResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AppName` | `String` | Optional | An application will be created under the user's Azure subscription with this name and of type IOT central. | String getAppName() | setAppName(String appName) |
| `SharedSecret` | `String` | Optional | Part of the user credentials (from Azure) the user needs to use for calling further TS Core APIs for setting up Azure cloud connector. | String getSharedSecret() | setSharedSecret(String sharedSecret) |
| `Url` | `String` | Optional | An IOT central endpoint the user can use to see the data that is being streamed. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "appName": "newarmapp1",
  "sharedSecret": "SharedAccessSignaturesr={client secret}",
  "url": "https://newarmapp1.azureiotcentral.com"
}
```

