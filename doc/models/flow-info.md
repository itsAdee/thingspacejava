
# Flow Info

## Structure

`FlowInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FlowServer` | `String` | Optional | - | String getFlowServer() | setFlowServer(String flowServer) |
| `FlowDevice` | `String` | Optional | - | String getFlowDevice() | setFlowDevice(String flowDevice) |
| `FlowDirection` | `String` | Optional | - | String getFlowDirection() | setFlowDirection(String flowDirection) |
| `FlowProtocol` | `String` | Optional | - | String getFlowProtocol() | setFlowProtocol(String flowProtocol) |
| `QciOption` | `String` | Optional | - | String getQciOption() | setQciOption(String qciOption) |

## Example (as JSON)

```json
{
  "flowServer": "[IPv6 address]:port",
  "flowDevice": "[IPv6 address]:port",
  "flowDirection": "UPLINK",
  "flowProtocol": "UDP",
  "qciOption": "Premium"
}
```

