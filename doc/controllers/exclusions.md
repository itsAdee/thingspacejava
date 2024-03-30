# Exclusions

Exclude devices from location services.

```java
ExclusionsController exclusionsController = client.getExclusionsController();
```

## Class Name

`ExclusionsController`

## Methods

* [Exclude Devices](../../doc/controllers/exclusions.md#exclude-devices)
* [Remove Devices From Exclusion List](../../doc/controllers/exclusions.md#remove-devices-from-exclusion-list)
* [List Excluded Devices](../../doc/controllers/exclusions.md#list-excluded-devices)


# Exclude Devices

This consents endpoint sets a new exclusion list.

```java
CompletableFuture<ApiResponse<DeviceLocationSuccessResult>> excludeDevicesAsync(
    final ConsentRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ConsentRequest`](../../doc/models/consent-request.md) | Body, Required | Request to update account consent exclusion list. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`DeviceLocationSuccessResult`](../../doc/models/device-location-success-result.md)

## Example Usage

```java
ConsentRequest body = new ConsentRequest.Builder(
    "1234567890-00001"
)
.allDevice(false)
.type("replace")
.exclusion(Arrays.asList(
        "980003420535573",
        "375535024300089",
        "A100003861E585"
    ))
.build();

exclusionsController.excludeDevicesAsync(body).thenAccept(result -> {
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
| 400 | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# Remove Devices From Exclusion List

Removes devices from the exclusion list so that they can be located with Device Location Services requests.

```java
CompletableFuture<ApiResponse<DeviceLocationSuccessResult>> removeDevicesFromExclusionListAsync(
    final String accountName,
    final String deviceList)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Query, Required | The numeric name of the account. |
| `deviceList` | `String` | Query, Required | A list of the device IDs to remove from the exclusion list. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`DeviceLocationSuccessResult`](../../doc/models/device-location-success-result.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String deviceList = "IMEI";

exclusionsController.removeDevicesFromExclusionListAsync(accountName, deviceList).thenAccept(result -> {
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
  "success": true
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |


# List Excluded Devices

This consents endpoint retrieves a list of excluded devices in an account.

```java
CompletableFuture<ApiResponse<DevicesConsentResult>> listExcludedDevicesAsync(
    final String account,
    final String startIndex)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `account` | `String` | Template, Required | Account identifier in "##########-#####". |
| `startIndex` | `String` | Template, Required | Zero-based number of the first record to return. |

## Server

`Server.DEVICE_LOCATION`

## Response Type

[`DevicesConsentResult`](../../doc/models/devices-consent-result.md)

## Example Usage

```java
String account = "0252012345-00001";
String startIndex = "0";

exclusionsController.listExcludedDevicesAsync(account, startIndex).thenAccept(result -> {
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
  "accountName": "2024009649-00001",
  "allDevice": false,
  "hasMoreData": false,
  "totalCount": 4,
  "updateTime": "2018-05-18 19:20:50.076 +0000 UTC",
  "exclusion": [
    "990003420535375",
    "420535399000375",
    "A100003861E585",
    "205353759900034"
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Unexpected error. | [`DeviceLocationResultException`](../../doc/models/device-location-result-exception.md) |

