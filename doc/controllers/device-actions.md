# Device Actions

```java
DeviceActionsController deviceActionsController = client.getDeviceActionsController();
```

## Class Name

`DeviceActionsController`

## Methods

* [Retrieve the Global Device List](../../doc/controllers/device-actions.md#retrieve-the-global-device-list)
* [Retrieve Device Provisioning History](../../doc/controllers/device-actions.md#retrieve-device-provisioning-history)
* [Get Asynchronous Request Status](../../doc/controllers/device-actions.md#get-asynchronous-request-status)


# Retrieve the Global Device List

Allows the profile to fetch the complete device list. This works with Verizon US and Global profiles.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> retrieveTheGlobalDeviceListAsync(
    final GetDeviceListWithProfilesRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetDeviceListWithProfilesRequest`](../../doc/models/get-device-list-with-profiles-request.md) | Body, Required | Device Profile Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GetDeviceListWithProfilesRequest body = new GetDeviceListWithProfilesRequest.Builder(
    "0000123456-00001"
)
.provisioningStatusFilter("ACTIVE")
.profileStatusFilter("UNKNOWN")
.build();

deviceActionsController.retrieveTheGlobalDeviceListAsync(body).thenAccept(result -> {
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
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Retrieve Device Provisioning History

Retreive the provisioning history of a specific device or devices.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> retrieveDeviceProvisioningHistoryAsync(
    final ProvhistoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ProvhistoryRequest`](../../doc/models/provhistory-request.md) | Body, Required | Device Provisioning History |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
ProvhistoryRequest body = new ProvhistoryRequest.Builder()
    .accountName("0000123456-00001")
    .earliest(DateTimeHelper.fromRfc8601DateTime("10/15/2021 04:49:35"))
    .latest(DateTimeHelper.fromRfc8601DateTime("10/15/2021 04:49:49"))
    .build();

deviceActionsController.retrieveDeviceProvisioningHistoryAsync(body).thenAccept(result -> {
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
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |


# Get Asynchronous Request Status

Get the status of an asynchronous request made with the Device Actions.

```java
CompletableFuture<ApiResponse<StatusResponse>> getAsynchronousRequestStatusAsync(
    final String accountName,
    final String requestID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | - |
| `requestID` | `String` | Template, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`StatusResponse`](../../doc/models/status-response.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String requestID = "d1f08526-5443-4054-9a29-4456490ea9f8";

deviceActionsController.getAsynchronousRequestStatusAsync(accountName, requestID).thenAccept(result -> {
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
| Default | Error response | [`GIORestErrorResponseException`](../../doc/models/gio-rest-error-response-exception.md) |

