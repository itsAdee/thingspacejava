# Global Reporting

```java
GlobalReportingController globalReportingController = client.getGlobalReportingController();
```

## Class Name

`GlobalReportingController`

## Methods

* [Deviceprovhistory Using POST](../../doc/controllers/global-reporting.md#deviceprovhistory-using-post)
* [Requeststatususing GET](../../doc/controllers/global-reporting.md#requeststatususing-get)


# Deviceprovhistory Using POST

Retreive the provisioning history of a specific device or devices.

```java
CompletableFuture<ApiResponse<ESIMRequestResponse>> deviceprovhistoryUsingPOSTAsync(
    final ESIMProvhistoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ESIMProvhistoryRequest`](../../doc/models/esim-provhistory-request.md) | Body, Required | Device Provisioning History |

## Server

`Server.THINGSPACE`

## Response Type

[`ESIMRequestResponse`](../../doc/models/esim-request-response.md)

## Example Usage

```java
ESIMProvhistoryRequest body = new ESIMProvhistoryRequest.Builder()
    .accountName("0000123456-00001")
    .earliest(DateTimeHelper.fromRfc8601DateTime("10/15/2021 04:49:35"))
    .latest(DateTimeHelper.fromRfc8601DateTime("10/15/2021 04:49:49"))
    .build();

globalReportingController.deviceprovhistoryUsingPOSTAsync(body).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 401 | Unauthorized | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 403 | Forbidden | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 404 | Not Found / Does not exist | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 406 | Format / Request Unacceptable | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 429 | Too many requests | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| Default | Error response | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |


# Requeststatususing GET

Get the status of a request made with the Device Actions.

```java
CompletableFuture<ApiResponse<ESIMStatusResponse>> requeststatususingGETAsync(
    final String accountname,
    final String requestID)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountname` | `String` | Template, Required | - |
| `requestID` | `String` | Template, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ESIMStatusResponse`](../../doc/models/esim-status-response.md)

## Example Usage

```java
String accountname = "0000123456-00001";
String requestID = "86c83330-4bf5-4235-9c4e-a83f93aeae4c";

globalReportingController.requeststatususingGETAsync(accountname, requestID).thenAccept(result -> {
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
  "requestId": "d1f08526-5443-4054-9a29-4456490ea9f8",
  "status": "Success",
  "subrequests": [
    {
      "id": "32-digit EID",
      "kind": "eid"
    },
    {
      "status": "success"
    }
  ]
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad request | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 401 | Unauthorized | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 403 | Forbidden | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 404 | Not Found / Does not exist | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 406 | Format / Request Unacceptable | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| 429 | Too many requests | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |
| Default | Error response | [`ESIMRestErrorResponseException`](../../doc/models/esim-rest-error-response-exception.md) |

