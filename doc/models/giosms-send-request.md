
# GIOSMS Send Request

## Structure

`GIOSMSSendRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getAccountName() | setAccountName(String accountName) |
| `CustomFields` | [`List<KvPair>`](../../doc/models/kv-pair.md) | Optional | **Constraints**: *Maximum Items*: `5` | List<KvPair> getCustomFields() | setCustomFields(List<KvPair> customFields) |
| `DataEncoding` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getDataEncoding() | setDataEncoding(String dataEncoding) |
| `GroupName` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getGroupName() | setGroupName(String groupName) |
| `ServicePlan` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getServicePlan() | setServicePlan(String servicePlan) |
| `TimeToLive` | `String` | Optional | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `32`, *Pattern*: `^[A-Za-z0-9]{3,32}$` | String getTimeToLive() | setTimeToLive(String timeToLive) |
| `DeviceIds` | [`List<GIODeviceId>`](../../doc/models/gio-device-id.md) | Required | **Constraints**: *Maximum Items*: `100` | List<GIODeviceId> getDeviceIds() | setDeviceIds(List<GIODeviceId> deviceIds) |
| `SmsMessage` | `String` | Required | **Constraints**: *Minimum Length*: `3`, *Maximum Length*: `64`, *Pattern*: `^[A-Za-z0-9 ]{3,64}$` | String getSmsMessage() | setSmsMessage(String smsMessage) |

## Example (as JSON)

```json
{
  "deviceIds": [
    {
      "kind": "eid",
      "id": "12345678901234567890123456789012"
    }
  ],
  "smsMessage": "A text message",
  "accountName": "accountName2",
  "customFields": [
    {
      "key": "key0",
      "value": "value2"
    },
    {
      "key": "key0",
      "value": "value2"
    },
    {
      "key": "key0",
      "value": "value2"
    }
  ],
  "dataEncoding": "dataEncoding0",
  "groupName": "groupName2",
  "servicePlan": "servicePlan2"
}
```

