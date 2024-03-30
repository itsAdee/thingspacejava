
# OAuth 2 Client Credentials Grant



Documentation for accessing and setting credentials for oAuth2.

## Auth Credentials

| Name | Type | Description | Setter | Getter |
|  --- | --- | --- | --- | --- |
| OAuthClientId | `String` | OAuth 2 Client ID | `oauthClientId` | `getOauthClientId()` |
| OAuthClientSecret | `String` | OAuth 2 Client Secret | `oauthClientSecret` | `getOauthClientSecret()` |
| OAuthToken | `OauthToken` | Object for storing information about the OAuth token | `oauthToken` | `getOauthToken()` |
| OAuthScopes | `List<OauthScopeEnum>` | List of scopes that apply to the OAuth token | `oauthScopes` | `getOauthScopes()` |



**Note:** Auth credentials can be set using `clientCredentialsAuth` in the client builder and accessed through `getClientCredentialsAuth` method in the client instance.

## Usage Example

### Client Initialization

You must initialize the client with *OAuth 2.0 Client Credentials Grant* credentials as shown in the following code snippet.

```java
VerizonClient client = new VerizonClient.Builder()
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oauthScopes(Arrays.asList(
                OauthScopeEnum.DISCOVERYREAD,
                OauthScopeEnum.SERVICEPROFILEREAD
            ))
        .build())
    .build();
```



Your application must obtain user authorization before it can execute an endpoint call in case this SDK chooses to use *OAuth 2.0 Client Credentials Grant*. This authorization includes the following steps.

The `fetchToken()` method will exchange the OAuth client credentials for an *access token*. The access token is an object containing information for authorizing client requests and refreshing the token itself.

You must have initialized the client with scopes for which you need permission to access.

```java
try {
    OAuthToken token = client.getClientCredentialsAuth().fetchToken();
    // re-instantiate the client with oauth token
    client = client.newBuilder()
            .clientCredentialsAuth(client.getClientCredentialsAuthModel().toBuilder()
                    .oauthToken(token)
                    .build())
            .build();
} catch (Throwable e) {
    // TODO Handle exception
}
```

The client can now make authorized endpoint calls.

### Scopes

Scopes enable your application to only request access to the resources it needs while enabling users to control the amount of access they grant to your application. Available scopes are defined in the [`OauthScopeEnum`](../../doc/models/oauth-scope-enum.md) enumeration.

| Scope Name | Description |
|  --- | --- |
| `DISCOVERYREAD` | Grant read-only access to discovery data |
| `SERVICEPROFILEREAD` | Grant read-only access to service profile data |
| `SERVICEPROFILEWRITE` | Grant write access to service profile data |
| `SERVICEREGISTRYREAD` | Grant read-only access to Service registry data |
| `SERVICEREGISTRYWRITE` | Grant write access to Service registry data |
| `TS_MEC_FULLACCESS` | Full access for /serviceprofiles and /serviceendpoints. |
| `TS_MEC_LIMITACCESS` | Limited access. Will not allow use of /serviceprofiles and /serviceendpoints but will allow discovery. |
| `TS_APPLICATION_RO` |  |
| `READ` | read access |
| `WRITE` | read/write access |

### Storing an access token for reuse

It is recommended that you store the access token for reuse.

```java
// store token
storeAccessToken(client.getClientCredentialsAuth().getOauthToken());
```

### Creating a client from a stored token

To authorize a client from a stored access token, just set the access token in Configuration along with the other configuration parameters before creating the client:

```java
// load token later...
OauthToken token = loadAccessToken();

// re-instantiate the client with oauth token
client = client.newBuilder()
        .clientCredentialsAuth(client.getClientCredentialsAuthModel().toBuilder()
                .oauthToken(token)
                .build())
        .build();
```

### Complete example



```java
package com.example;

import com.verizon.m5gedge.models.OauthScopeEnum;
import java.util.Arrays;

public class Main {
    public Main() {
        VerizonClient client = new VerizonClient.Builder()
            .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
                    "OAuthClientId",
                    "OAuthClientSecret"
                )
                .oauthScopes(Arrays.asList(
                        OauthScopeEnum.DISCOVERYREAD,
                        OauthScopeEnum.SERVICEPROFILEREAD
                    ))
                .build())
            .build();


        try {
            OAuthToken token = client.getClientCredentialsAuth().fetchToken();
            // re-instantiate the client with oauth token
            client = client.newBuilder()
                    .clientCredentialsAuth(client.getClientCredentialsAuthModel().toBuilder()
                            .oauthToken(token)
                            .build())
                    .build();
        } catch (Throwable e) {
            // TODO Handle exception
        }

        // the client is now authorized; you can use client to make endpoint calls
    }
}
```


