
# Firmware Upgrade Request

Details of the firmware upgrade request.

## Structure

`FirmwareUpgradeRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `AccountName` | `String` | Required | Account identifier in "##########-#####". | String getAccountName() | setAccountName(String accountName) |
| `FirmwareName` | `String` | Required | The name of the firmware image that will be used for the upgrade, from a GET /firmware response. | String getFirmwareName() | setFirmwareName(String firmwareName) |
| `FirmwareTo` | `String` | Required | The name of the firmware version that will be on the devices after a successful upgrade. | String getFirmwareTo() | setFirmwareTo(String firmwareTo) |
| `StartDate` | `LocalDateTime` | Required | The date that the upgrade should begin. | LocalDateTime getStartDate() | setStartDate(LocalDateTime startDate) |
| `DeviceList` | `List<String>` | Required | The IMEIs of the devices. | List<String> getDeviceList() | setDeviceList(List<String> deviceList) |

## Example (as JSON)

```json
{
  "accountName": "0402196254-00001",
  "firmwareName": "FOTA_Verizon_Model-A_01To02_HF",
  "firmwareTo": "VerizonFirmwareVersion-02",
  "startDate": "2018-04-01T16:03:00.000Z",
  "deviceList": [
    "990003425730535",
    "990000473475989"
  ]
}
```

