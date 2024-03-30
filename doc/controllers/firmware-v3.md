# Firmware V3

```java
FirmwareV3Controller firmwareV3Controller = client.getFirmwareV3Controller();
```

## Class Name

`FirmwareV3Controller`

## Methods

* [List Available Firmware](../../doc/controllers/firmware-v3.md#list-available-firmware)
* [Synchronize Device Firmware](../../doc/controllers/firmware-v3.md#synchronize-device-firmware)
* [Report Device Firmware](../../doc/controllers/firmware-v3.md#report-device-firmware)


# List Available Firmware

This endpoint allows user to list the firmware of an account.

```java
CompletableFuture<ApiResponse<List<FirmwarePackage>>> listAvailableFirmwareAsync(
    final String acc,
    final FirmwareProtocolEnum protocol)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `protocol` | [`FirmwareProtocolEnum`](../../doc/models/firmware-protocol-enum.md) | Query, Required | Filter to retrieve a specific protocol type used. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`List<FirmwarePackage>`](../../doc/models/firmware-package.md)

## Example Usage

```java
String acc = "0000123456-00001";
FirmwareProtocolEnum protocol = FirmwareProtocolEnum.LW_M2M;

firmwareV3Controller.listAvailableFirmwareAsync(acc, protocol).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
[
  {
    "firmwareName": "VerizonSmartCommunities_LCO-277C4N_BG96MAR04A04M1G_BG96MAR04A04M1G_BETA0130B",
    "firmwareFrom": "BG96MAR04A04M1G",
    "firmwareTo": "BG96MAR04A04M1G_BETA0130B",
    "launchDate": "2012-04-23T18:25:43.511Z",
    "releaseNote": "",
    "model": "LCO-277C4N",
    "make": "Verizon Smart Communities",
    "protocol": "LWM2M"
  }
]
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |


# Synchronize Device Firmware

Synchronize ThingSpace with the FOTA server for up to 100 devices.

```java
CompletableFuture<ApiResponse<DeviceFirmwareList>> synchronizeDeviceFirmwareAsync(
    final String acc,
    final FirmwareIMEI body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `body` | [`FirmwareIMEI`](../../doc/models/firmware-imei.md) | Body, Required | DeviceIds to get firmware info synchronously. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`DeviceFirmwareList`](../../doc/models/device-firmware-list.md)

## Example Usage

```java
String acc = "0000123456-00001";
FirmwareIMEI body = new FirmwareIMEI.Builder(
    Arrays.asList(
        "15-digit IMEI"
    )
)
.build();

firmwareV3Controller.synchronizeDeviceFirmwareAsync(acc, body).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "accountName": "0000123456-00001",
  "deviceFirmwarVersionList": [
    {
      "deviceId": "15-digit IMEI",
      "status": "FirmwareVersionUpdateSuccess",
      "firmwareVersion": "SR1.2.0.0-10657"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |


# Report Device Firmware

Ask a device to report its firmware version asynchronously.

```java
CompletableFuture<ApiResponse<DeviceFirmwareVersionUpdateResult>> reportDeviceFirmwareAsync(
    final String acc,
    final String deviceId)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `deviceId` | `String` | Template, Required | Device identifier. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`DeviceFirmwareVersionUpdateResult`](../../doc/models/device-firmware-version-update-result.md)

## Example Usage

```java
String acc = "0000123456-00001";
String deviceId = "15-digit IMEI";

firmwareV3Controller.reportDeviceFirmwareAsync(acc, deviceId).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    // TODO failure callback handler
    exception.printStackTrace();
    return null;
});
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |

