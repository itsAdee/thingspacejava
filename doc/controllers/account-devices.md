# Account Devices

```java
AccountDevicesController accountDevicesController = client.getAccountDevicesController();
```

## Class Name

`AccountDevicesController`

## Methods

* [Get Account Device Information](../../doc/controllers/account-devices.md#get-account-device-information)
* [List Account Devices Information](../../doc/controllers/account-devices.md#list-account-devices-information)


# Get Account Device Information

Retrieve account device information such as reported firmware on the devices.

```java
CompletableFuture<ApiResponse<V3AccountDeviceList>> getAccountDeviceInformationAsync(
    final String acc,
    final String lastSeenDeviceId,
    final DevicesProtocolEnum protocol)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `lastSeenDeviceId` | `String` | Query, Optional | Last seen device identifier. |
| `protocol` | [`DevicesProtocolEnum`](../../doc/models/devices-protocol-enum.md) | Query, Optional | Filter to retrieve a specific protocol type used. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`V3AccountDeviceList`](../../doc/models/v3-account-device-list.md)

## Example Usage

```java
String acc = "0000123456-00001";
String lastSeenDeviceId = "0";
DevicesProtocolEnum protocol = DevicesProtocolEnum.LW_M2M;

accountDevicesController.getAccountDeviceInformationAsync(acc, lastSeenDeviceId, protocol).thenAccept(result -> {
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


# List Account Devices Information

Retrieve device information for a list of devices on an account.

```java
CompletableFuture<ApiResponse<DeviceListResult>> listAccountDevicesInformationAsync(
    final String acc,
    final DeviceIMEI body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `acc` | `String` | Template, Required | Account identifier. |
| `body` | [`DeviceIMEI`](../../doc/models/device-imei.md) | Body, Required | Request device list information. |

## Server

`Server.SOFTWARE_MANAGEMENT_V3`

## Response Type

[`DeviceListResult`](../../doc/models/device-list-result.md)

## Example Usage

```java
String acc = "0000123456-00001";
DeviceIMEI body = new DeviceIMEI.Builder(
    Arrays.asList(
        "15-digit IMEI"
    )
)
.build();

accountDevicesController.listAccountDevicesInformationAsync(acc, body).thenAccept(result -> {
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
  "deviceCount": 1,
  "deviceList": [
    {
      "deviceId": "15-digit IMEI",
      "mdn": "10-digit MDN",
      "model": "GM01Q",
      "make": "SEQUANS COMMUNICATIONS",
      "firmware": "SR1.2.0.0-10657",
      "fotaEligible": true,
      "licenseAssigned": true,
      "status": "Active",
      "protocol": "LWM2M",
      "createTime": "2021-06-03 00:03:56.079 +0000 UTC",
      "statusTime": "2021-06-03 00:03:56.079 +0000 UTC",
      "refreshTime": "2021-06-03 00:03:56.079 +0000 UTC",
      "lastConnectionTime": "2012-04-23T18:25:43.511Z"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`FotaV3ResultException`](../../doc/models/fota-v3-result-exception.md) |

