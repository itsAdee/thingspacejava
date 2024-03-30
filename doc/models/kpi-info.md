
# KPI Info

KPI Info Object

## Structure

`KPIInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | - | String getName() | setName(String name) |
| `Value` | `String` | Optional | - | String getValue() | setValue(String value) |
| `NodeName` | `String` | Optional | - | String getNodeName() | setNodeName(String nodeName) |
| `NodeType` | `String` | Optional | - | String getNodeType() | setNodeType(String nodeType) |
| `Description` | `String` | Optional | - | String getDescription() | setDescription(String description) |
| `Unit` | `String` | Optional | - | String getUnit() | setUnit(String unit) |
| `Category` | `String` | Optional | - | String getCategory() | setCategory(String category) |
| `TimeOfLastUpdate` | `String` | Optional | - | String getTimeOfLastUpdate() | setTimeOfLastUpdate(String timeOfLastUpdate) |

## Example (as JSON)

```json
{
  "name": "DOWNLINK_THROUGHPUT",
  "value": "23.2",
  "nodeName": "132924_ENB_VZ_EULESS_OLTE_RD-01",
  "nodeType": "BASEBAND",
  "description": "Downlink throughput (4G)",
  "unit": "Mbps",
  "category": "Network Performance Radio",
  "timeOfLastUpdate": "2022-12-07T08:39:59.228Z"
}
```

