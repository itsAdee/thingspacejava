
# Registered Callbacks

List of registered callback endpoints.

## Structure

`RegisteredCallbacks`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Aname` | `String` | Optional | The name of the billing account for which callback messages will be sent. | String getAname() | setAname(String aname) |
| `Name` | `String` | Optional | The name of the callback service, which identifies the type and format of messages that will be sent to the registered URL. This will be 'Fota' for the Software Management Services callback. | String getName() | setName(String name) |
| `Url` | `String` | Optional | The address to which callback messages will be sent. | String getUrl() | setUrl(String url) |
| `Username` | `String` | Optional | The user name that ThingSpace will return in the callback messages. | String getUsername() | setUsername(String username) |
| `Password` | `String` | Optional | The password that ThingSpace will return in the callback messages. | String getPassword() | setPassword(String password) |

## Example (as JSON)

```json
{
  "aname": "0252012345-00001",
  "name": "Fota",
  "url": "http://10.120.102.183:50559/CallbackListener/FirmwareServiceMessages.asmx",
  "username": "username0",
  "password": "password4"
}
```

