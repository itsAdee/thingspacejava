
# V2 Software Info

Software information.

## Structure

`V2SoftwareInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Required | Software name. | String getName() | setName(String name) |
| `Version` | `String` | Required | Software version. | String getVersion() | setVersion(String version) |
| `UpgradeTime` | `String` | Required | Upgrade time. | String getUpgradeTime() | setUpgradeTime(String upgradeTime) |

## Example (as JSON)

```json
{
  "name": "FOTA_Verizon_Model-A_02To03_HF",
  "version": "3",
  "upgradeTime": "2020-09-08T19:00:51.541Z"
}
```

