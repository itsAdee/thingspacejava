# Device Diagnostics

```java
DeviceDiagnosticsController deviceDiagnosticsController = client.getDeviceDiagnosticsController();
```

## Class Name

`DeviceDiagnosticsController`

## Methods

* [Device Reachability Status Using POST](../../doc/controllers/device-diagnostics.md#device-reachability-status-using-post)
* [Retrieve Active Monitors Using POST](../../doc/controllers/device-diagnostics.md#retrieve-active-monitors-using-post)


# Device Reachability Status Using POST

If the devices do not already exist in the account, this API resource adds them before activation.

```java
CompletableFuture<ApiResponse<DeviceManagementResult>> deviceReachabilityStatusUsingPOSTAsync(
    final NotificationReportStatusRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`NotificationReportStatusRequest`](../../doc/models/notification-report-status-request.md) | Body, Required | Retrieve Reachability Report Status for a device. |

## Server

`Server.THINGSPACE`

## Response Type

[`DeviceManagementResult`](../../doc/models/device-management-result.md)

## Example Usage

```java
NotificationReportStatusRequest body = new NotificationReportStatusRequest.Builder(
    "0868924207-00001",
    new DeviceId.Builder(
        "990013907835573",
        "imei"
    )
    .build(),
    "requestType6"
)
.build();

deviceDiagnosticsController.deviceReachabilityStatusUsingPOSTAsync(body).thenAccept(result -> {
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
  "requestId": "595f5c44-c31c-4552-8670-020a1545a84d"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`ConnectivityManagementResultException`](../../doc/models/connectivity-management-result-exception.md) |


# Retrieve Active Monitors Using POST

Retrieve all the active monitors.

```java
CompletableFuture<ApiResponse<DeviceManagementResult>> retrieveActiveMonitorsUsingPOSTAsync(
    final RetrieveMonitorsRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`RetrieveMonitorsRequest`](../../doc/models/retrieve-monitors-request.md) | Body, Required | Retrieve Monitor Request. |

## Server

`Server.THINGSPACE`

## Response Type

[`DeviceManagementResult`](../../doc/models/device-management-result.md)

## Example Usage

```java
RetrieveMonitorsRequest body = new RetrieveMonitorsRequest.Builder(
    "0868924207-00001",
    Arrays.asList(
        new AccountDeviceList.Builder(
            Arrays.asList(
                new DeviceId.Builder(
                    "990013907835573",
                    "imei"
                )
                .build(),
                new DeviceId.Builder(
                    "89141390780800784259",
                    "iccid"
                )
                .build()
            )
        )
        .build(),
        new AccountDeviceList.Builder(
            Arrays.asList(
                new DeviceId.Builder(
                    "990013907884259",
                    "imei"
                )
                .build(),
                new DeviceId.Builder(
                    "89141390780800735573",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    )
)
.monitorType("monitorType")
.build();

deviceDiagnosticsController.retrieveActiveMonitorsUsingPOSTAsync(body).thenAccept(result -> {
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
  "requestId": "595f5c44-c31c-4552-8670-020a1545a84d"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`ConnectivityManagementResultException`](../../doc/models/connectivity-management-result-exception.md) |

