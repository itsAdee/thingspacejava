# Fixed Wireless Qualification

```java
FixedWirelessQualificationController fixedWirelessQualificationController = client.getFixedWirelessQualificationController();
```

## Class Name

`FixedWirelessQualificationController`


# Domestic 4 G and 5G Fixed Wireless Qualification

Use this query for Fixed Wireless Qualification of an address. Network types include: LTE, C-BAND and MMWAVE.

```java
CompletableFuture<ApiResponse<WNPRequestResponse>> domestic4GAnd5gFixedWirelessQualificationAsync(
    final GetWirelessCoverageRequestFWA body)
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`GetWirelessCoverageRequestFWA`](../../doc/models/get-wireless-coverage-request-fwa.md) | Body, Required | Request for network coverage details. |

## Server

`Server.THINGSPACE`

## Response Type

[`WNPRequestResponse`](../../doc/models/wnp-request-response.md)

## Example Usage

```java
GetWirelessCoverageRequestFWA body = new GetWirelessCoverageRequestFWA.Builder(
    "0000123456-00001",
    "FWA",
    "ADDRESS",
    new Locations.Builder()
        .addressList(Arrays.asList(
            new AddressItem.Builder()
                .addressLine1("street address")
                .city("city")
                .state("LA")
                .country("USA")
                .zip("00000")
                .build()
        ))
        .build(),
    Arrays.asList(
        new NetworkType.Builder()
            .networkType("LTE")
            .build()
    )
)
.build();

fixedWirelessQualificationController.domestic4GAnd5gFixedWirelessQualificationAsync(body).thenAccept(result -> {
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
| Default | Error response | [`WNPRestErrorResponseException`](../../doc/models/wnp-rest-error-response-exception.md) |

