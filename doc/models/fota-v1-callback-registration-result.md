
# Fota V1 Callback Registration Result

Registered callback account name and service name.

## Structure

`FotaV1CallbackRegistrationResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | The name of the billing account for which callback messages will be sent. | String getAccountName() | setAccountName(String accountName) |
| `ServiceName` | `String` | Optional | The name of the callback service, which identifies the type and format of messages that will be sent to the registered URL. This will be 'Fota' for the Software Management Services callback. | String getServiceName() | setServiceName(String serviceName) |

## Example (as JSON)

```json
{
  "accountName": "0204563412-00001",
  "serviceName": "Fota"
}
```

