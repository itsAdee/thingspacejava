# OAuth Authorization

```java
OauthAuthorizationController oauthAuthorizationController = client.getOauthAuthorizationController();
```

## Class Name

`OauthAuthorizationController`


# Request Token

Create a new OAuth 2 token.

:information_source: **Note** This endpoint does not require authentication.

```java
CompletableFuture<ApiResponse<OauthToken>> requestTokenAsync(
    final String authorization,
    final String scope,
    final Map<String, Object> fieldParameters)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `authorization` | `String` | Header, Required | Authorization header in Basic auth format |
| `scope` | `String` | Form, Optional | Requested scopes as a space-delimited list. |
| `fieldParameters` | `Map<String, Object>` | Optional | Pass additional field parameters. |

## Server

`Server.OAUTH_SERVER`

## Response Type

[`OauthToken`](../../doc/models/oauth-token.md)

## Example Usage

```java
String authorization = "Authorization8";

Map<String, Object> fieldParameters = new LinkedHashMap<String, Object>() {{
    put("key0", ApiHelper.deserialize("\"additionalFieldParams9\""));
}};

oauthAuthorizationController.requestTokenAsync(authorization, null, fieldParameters).thenAccept(result -> {
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
| 400 | OAuth 2 provider returned an error. | [`OauthProviderException`](../../doc/models/oauth-provider-exception.md) |
| 401 | OAuth 2 provider says client authentication failed. | [`OauthProviderException`](../../doc/models/oauth-provider-exception.md) |

