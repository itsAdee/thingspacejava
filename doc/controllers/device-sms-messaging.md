# Device SMS Messaging

```java
DeviceSMSMessagingController deviceSMSMessagingController = client.getDeviceSMSMessagingController();
```

## Class Name

`DeviceSMSMessagingController`

## Methods

* [Send an Sms Message](../../doc/controllers/device-sms-messaging.md#send-an-sms-message)
* [Get Sms Messages](../../doc/controllers/device-sms-messaging.md#get-sms-messages)
* [Start Sms Message Delivery](../../doc/controllers/device-sms-messaging.md#start-sms-message-delivery)
* [List Sms Message History](../../doc/controllers/device-sms-messaging.md#list-sms-message-history)


# Send an Sms Message

Sends an SMS message to one device. Messages are queued on the M2M MC Platform and sent as soon as possible, but they may be delayed due to traffic and routing considerations.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> sendAnSmsMessageAsync(
    final GIOSMSSendRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GIOSMSSendRequest`](../../doc/models/giosms-send-request.md) | Body, Required | SMS message to an indiividual device. |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
GIOSMSSendRequest body = new GIOSMSSendRequest.Builder(
    Arrays.asList(
        new GIODeviceId.Builder(
            "eid",
            "12345678901234567890123456789012"
        )
        .build()
    ),
    "A text message"
)
.build();

deviceSMSMessagingController.sendAnSmsMessageAsync(body).thenAccept(result -> {
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


# Get Sms Messages

Retrieves queued SMS messages sent by all M2M MC devices associated with an account.

```java
CompletableFuture<ApiResponse<SmsMessagesResponse>> getSmsMessagesAsync(
    final String accountName,
    final String next)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Numeric account name |
| `next` | `String` | Query, Optional | Continue the previous query from the pageUrl in Location Header |

## Server

`Server.THINGSPACE`

## Response Type

[`SmsMessagesResponse`](../../doc/models/sms-messages-response.md)

## Example Usage

```java
String accountName = "0000123456-00001";
String next = "TheURLForTheNextQuery";

deviceSMSMessagingController.getSmsMessagesAsync(accountName, next).thenAccept(result -> {
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


# Start Sms Message Delivery

Starts delivery of SMS messages for the specified account.

```java
CompletableFuture<ApiResponse<SuccessResponse>> startSmsMessageDeliveryAsync(
    final String accountName)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountName` | `String` | Template, Required | Numeric account name |

## Server

`Server.THINGSPACE`

## Response Type

[`SuccessResponse`](../../doc/models/success-response.md)

## Example Usage

```java
String accountName = "0000123456-00001";

deviceSMSMessagingController.startSmsMessageDeliveryAsync(accountName).thenAccept(result -> {
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


# List Sms Message History

Returns a list of sms history for a given device during a specified time frame.

```java
CompletableFuture<ApiResponse<GIORequestResponse>> listSmsMessageHistoryAsync(
    final SMSEventHistoryRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SMSEventHistoryRequest`](../../doc/models/sms-event-history-request.md) | Body, Required | Device Query |

## Server

`Server.THINGSPACE`

## Response Type

[`GIORequestResponse`](../../doc/models/gio-request-response.md)

## Example Usage

```java
SMSEventHistoryRequest body = new SMSEventHistoryRequest.Builder(
    new GIODeviceId.Builder(
        "eid",
        "12345678901234567890123456789012"
    )
    .build()
)
.build();

deviceSMSMessagingController.listSmsMessageHistoryAsync(body).thenAccept(result -> {
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

