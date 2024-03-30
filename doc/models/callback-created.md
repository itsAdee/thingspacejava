
# Callback Created

## Structure

`CallbackCreated`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Aname` | `String` | Required | The billing account number for which callback messages will be sent. | String getAname() | setAname(String aname) |
| `Name` | `String` | Required | The name of the callback service, which identifies the type and format of messages that will be sent to the registered URL. | String getName() | setName(String name) |
| `Url` | `String` | Optional | The address of the callback listening service where the ThingSpace Platform will send callback messages for the service type. | String getUrl() | setUrl(String url) |

## Example (as JSON)

```json
{
  "aname": "0844021539-00001",
  "name": "BullseyeReporting",
  "url": "https://tsustgtests.mocklab.io/notifications/bullseye"
}
```

