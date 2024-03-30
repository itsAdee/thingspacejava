# MEC

```java
MECController mECController = client.getMECController();
```

## Class Name

`MECController`

## Methods

* [KPI List](../../doc/controllers/mec.md#kpi-list)
* [Get Profile List](../../doc/controllers/mec.md#get-profile-list)
* [Change Pmec Device State-Activate](../../doc/controllers/mec.md#change-pmec-device-state-activate)
* [Change Pmec Device State-Bulk Deactivate](../../doc/controllers/mec.md#change-pmec-device-state-bulk-deactivate)
* [Change Pmec Device Profile](../../doc/controllers/mec.md#change-pmec-device-profile)
* [Change Pmec Device I Paddress Bulk](../../doc/controllers/mec.md#change-pmec-device-i-paddress-bulk)
* [Get MEC Performance Consent](../../doc/controllers/mec.md#get-mec-performance-consent)


# KPI List

```java
CompletableFuture<ApiResponse<KPIInfoList>> kPIListAsync(
    final String aname)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `aname` | `String` | Template, Required | Account name. |

## Server

`Server.THINGSPACE`

## Response Type

[`KPIInfoList`](../../doc/models/kpi-info-list.md)

## Example Usage

```java
String aname = "0342351414-00001";

mECController.kPIListAsync(aname).thenAccept(result -> {
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
  "KpiInfoList": [
    {
      "name": "DOWNLINK_THROUGHPUT",
      "value": "23.2",
      "nodeName": "132924_ENB_VZ_EULESS_OLTE_RD-01",
      "nodeType": "BASEBAND",
      "description": "Downlink throughput (4G)",
      "unit": "Mbps",
      "category": "Network Performance Radio",
      "timeOfLastUpdate": "2022-12-07T08:39:59.228Z"
    }
  ]
}
```


# Get Profile List

```java
CompletableFuture<ApiResponse<MECProfileList>> getProfileListAsync(
    final String aname)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `aname` | `String` | Template, Required | Account name. |

## Server

`Server.THINGSPACE`

## Response Type

[`MECProfileList`](../../doc/models/mec-profile-list.md)

## Example Usage

```java
String aname = "0342351414-00001";

mECController.getProfileListAsync(aname).thenAccept(result -> {
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
  "profiles": [
    {
      "profileId": "HSS-EsmProfile_Enterprise",
      "profileName": "HSS EsmProfile Enterprise"
    }
  ]
}
```


# Change Pmec Device State-Activate

```java
CompletableFuture<ApiResponse<ChangeMecDeviceStateResponse>> changePmecDeviceStateActivateAsync(
    final ChangePmecDeviceStateActivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePmecDeviceStateActivateRequest`](../../doc/models/change-pmec-device-state-activate-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangeMecDeviceStateResponse`](../../doc/models/change-mec-device-state-response.md)

## Example Usage

```java
ChangePmecDeviceStateActivateRequest body = new ChangePmecDeviceStateActivateRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new MECDeviceList.Builder(
            Arrays.asList(
                new MECDeviceId.Builder(
                    "99948099913024600001",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    ),
    new Activate.Builder(
        "HSS EsmProfile Enterprise 5G"
    )
    .build()
)
.build();

mECController.changePmecDeviceStateActivateAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Change Pmec Device State-Bulk Deactivate

```java
CompletableFuture<ApiResponse<ChangeMecDeviceStateResponse>> changePmecDeviceStateBulkDeactivateAsync(
    final ChangePmecDeviceStateBulkDeactivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePmecDeviceStateBulkDeactivateRequest`](../../doc/models/change-pmec-device-state-bulk-deactivate-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangeMecDeviceStateResponse`](../../doc/models/change-mec-device-state-response.md)

## Example Usage

```java
ChangePmecDeviceStateBulkDeactivateRequest body = new ChangePmecDeviceStateBulkDeactivateRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new MECDeviceList.Builder(
            Arrays.asList(
                new MECDeviceId.Builder(
                    "99948099913031600000",
                    "iccid"
                )
                .build()
            )
        )
        .build(),
        new MECDeviceList.Builder(
            Arrays.asList(
                new MECDeviceId.Builder(
                    "99948099913031700000",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    )
)
.build();

mECController.changePmecDeviceStateBulkDeactivateAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Change Pmec Device Profile

```java
CompletableFuture<ApiResponse<ChangeMecDeviceProfileResponse>> changePmecDeviceProfileAsync(
    final ChangePmecDeviceProfileRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePmecDeviceProfileRequest`](../../doc/models/change-pmec-device-profile-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangeMecDeviceProfileResponse`](../../doc/models/change-mec-device-profile-response.md)

## Example Usage

```java
ChangePmecDeviceProfileRequest body = new ChangePmecDeviceProfileRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new MECDeviceList.Builder(
            Arrays.asList(
                new MECDeviceId.Builder(
                    "99948099913024600000",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    ),
    "HSS EsmProfile Enterprise 5G internet"
)
.build();

mECController.changePmecDeviceProfileAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Change Pmec Device I Paddress Bulk

```java
CompletableFuture<ApiResponse<ChangeMecDeviceIPAddressResponse>> changePmecDeviceIPaddressBulkAsync(
    final ChangePmecDeviceStateBulkDeactivateRequest body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`ChangePmecDeviceStateBulkDeactivateRequest`](../../doc/models/change-pmec-device-state-bulk-deactivate-request.md) | Body, Required | - |

## Server

`Server.THINGSPACE`

## Response Type

[`ChangeMecDeviceIPAddressResponse`](../../doc/models/change-mec-device-ip-address-response.md)

## Example Usage

```java
ChangePmecDeviceStateBulkDeactivateRequest body = new ChangePmecDeviceStateBulkDeactivateRequest.Builder(
    "0342351414-00001",
    Arrays.asList(
        new MECDeviceList.Builder(
            Arrays.asList(
                new MECDeviceId.Builder(
                    "99948099913031600000",
                    "iccid"
                )
                .build()
            )
        )
        .build(),
        new MECDeviceList.Builder(
            Arrays.asList(
                new MECDeviceId.Builder(
                    "99948099913031700000",
                    "iccid"
                )
                .build()
            )
        )
        .build()
    )
)
.build();

mECController.changePmecDeviceIPaddressBulkAsync(body).thenAccept(result -> {
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
  "requestId": "c7b45cf2-cab1-4e42-82f8-20350f4c4ea3"
}
```


# Get MEC Performance Consent

```java
CompletableFuture<ApiResponse<GetMECPerformanceConsentResponse>> getMECPerformanceConsentAsync(
    final String aname)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `aname` | `String` | Template, Required | Account name. |

## Server

`Server.THINGSPACE`

## Response Type

[`GetMECPerformanceConsentResponse`](../../doc/models/get-mec-performance-consent-response.md)

## Example Usage

```java
String aname = "1533445500-00088";

mECController.getMECPerformanceConsentAsync(aname).thenAccept(result -> {
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
  "consent": "false"
}
```

