
# State

Each service includes custom states.

## Structure

`State`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the state. | String getName() | setName(String name) |
| `WorkflowSequenceNumber` | `Double` | Optional | The workflow sequence number of this state. | Double getWorkflowSequenceNumber() | setWorkflowSequenceNumber(Double workflowSequenceNumber) |
| `ServicePlans` | `List<String>` | Optional | The service plans that can be used to charge for services for devices in this state. | List<String> getServicePlans() | setServicePlans(List<String> servicePlans) |

## Example (as JSON)

```json
{
  "name": "Svc1 Activate",
  "workflowSequenceNumber": 1.0,
  "servicePlans": [
    "4523aef7250f67205fd5",
    "4d4090c0f2d48814c94d"
  ]
}
```

