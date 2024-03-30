# Session Management

```java
SessionManagementController sessionManagementController = client.getSessionManagementController();
```

## Class Name

`SessionManagementController`

## Methods

* [Start Connectivity Management Session](../../doc/controllers/session-management.md#start-connectivity-management-session)
* [End Connectivity Management Session](../../doc/controllers/session-management.md#end-connectivity-management-session)
* [Reset Connectivity Management Password](../../doc/controllers/session-management.md#reset-connectivity-management-password)


# Start Connectivity Management Session

Initiates a Connectivity Management session and returns a VZ-M2M session token that is required in subsequent API requests.

```java
CompletableFuture<ApiResponse<LogInResult>> startConnectivityManagementSessionAsync(
    final LogInRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`LogInRequest`](../../doc/models/log-in-request.md) | Body, Optional | Request to initiate a session. |

## Server

`Server.THINGSPACE`

## Response Type

[`LogInResult`](../../doc/models/log-in-result.md)

## Example Usage

```java
LogInRequest body = new LogInRequest.Builder(
    "zbeeblebrox",
    "IMgr8"
)
.build();

sessionManagementController.startConnectivityManagementSessionAsync(body).thenAccept(result -> {
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
  "sessionToken": "bcce3ea6-fe4f-4952-bacf-eadd80718e83"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`ConnectivityManagementResultException`](../../doc/models/connectivity-management-result-exception.md) |


# End Connectivity Management Session

Ends a Connectivity Management session.

```java
CompletableFuture<ApiResponse<LogOutRequest>> endConnectivityManagementSessionAsync()
```

## Server

`Server.THINGSPACE`

## Response Type

[`LogOutRequest`](../../doc/models/log-out-request.md)

## Example Usage

```java
sessionManagementController.endConnectivityManagementSessionAsync().thenAccept(result -> {
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
  "sessionToken": "bcce3ea6-fe4f-4952-bacf-eadd80718e83"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`ConnectivityManagementResultException`](../../doc/models/connectivity-management-result-exception.md) |


# Reset Connectivity Management Password

The new password is effective immediately. Passwords do not expire, but Verizon recommends changing your password every 90 days.

```java
CompletableFuture<ApiResponse<SessionResetPasswordResult>> resetConnectivityManagementPasswordAsync(
    final SessionResetPasswordRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`SessionResetPasswordRequest`](../../doc/models/session-reset-password-request.md) | Body, Required | Request with current password that needs to be reset. |

## Server

`Server.THINGSPACE`

## Response Type

[`SessionResetPasswordResult`](../../doc/models/session-reset-password-result.md)

## Example Usage

```java
SessionResetPasswordRequest body = new SessionResetPasswordRequest.Builder(
    "grflbk"
)
.build();

sessionManagementController.resetConnectivityManagementPasswordAsync(body).thenAccept(result -> {
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
  "newPassword": "Wh0a1545a84d"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Error response. | [`ConnectivityManagementResultException`](../../doc/models/connectivity-management-result-exception.md) |

