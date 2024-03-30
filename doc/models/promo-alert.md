
# Promo Alert

## Structure

`PromoAlert`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `FilterCriteria` | [`List<ReadySimServicePlan>`](../../doc/models/ready-sim-service-plan.md) | Optional | - | List<ReadySimServicePlan> getFilterCriteria() | setFilterCriteria(List<ReadySimServicePlan> filterCriteria) |
| `Condition` | [`List<Keyschunk2>`](../../doc/models/keyschunk-2.md) | Optional | - | List<Keyschunk2> getCondition() | setCondition(List<Keyschunk2> condition) |
| `EnablePromoExp` | `Boolean` | Optional | - | Boolean getEnablePromoExp() | setEnablePromoExp(Boolean enablePromoExp) |

## Example (as JSON)

```json
{
  "enablePromoExp": true,
  "filterCriteria": [
    {
      "servicePlan": "servicePlan4"
    },
    {
      "servicePlan": "servicePlan4"
    }
  ],
  "condition": [
    {
      "dataPercentage50": false,
      "dataPercentage75": false,
      "dataPercentage90": false,
      "dataPercentage100": false,
      "smsPercentage50": false
    },
    {
      "dataPercentage50": false,
      "dataPercentage75": false,
      "dataPercentage90": false,
      "dataPercentage100": false,
      "smsPercentage50": false
    },
    {
      "dataPercentage50": false,
      "dataPercentage75": false,
      "dataPercentage90": false,
      "dataPercentage100": false,
      "smsPercentage50": false
    }
  ]
}
```

