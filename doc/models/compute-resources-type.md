
# Compute Resources Type

Compute resources of a service profile.

## Structure

`ComputeResourcesType`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `GPU` | [`GPU`](../../doc/models/gpu.md) | Optional | GPU resources of a service profile. | GPU getGPU() | setGPU(GPU gPU) |
| `MinRAMGB` | `Integer` | Optional | Minimum RAM required in Gigabytes.<br>**Constraints**: `>= 1`, `<= 100` | Integer getMinRAMGB() | setMinRAMGB(Integer minRAMGB) |
| `MinStorageGB` | `Integer` | Optional | Minimum storage requirement in Gigabytes.<br>**Constraints**: `>= 1`, `<= 100` | Integer getMinStorageGB() | setMinStorageGB(Integer minStorageGB) |

## Example (as JSON)

```json
{
  "minRAMGB": 1,
  "minStorageGB": 1,
  "GPU": {
    "minCoreClockMHz": 76,
    "minMemoryClockMHz": 20,
    "minBandwidthGBs": 96,
    "minTFLOPS": 100
  }
}
```

