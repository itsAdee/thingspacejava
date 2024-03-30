
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| `vZM2mToken` | `String` | M2M Session Token ([How to generate an M2M session token?](page:getting-started/5g-edge-developer-creds-token#obtaining-a-vz-m2m-session-token-programmatically)) |
| `environment` | `Environment` | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| `httpClientConfig` | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) | Http Client Configuration instance. |
| `clientCredentialsAuth` | [`ClientCredentialsAuth`]($a/oauth-2-client-credentials-grant.md) | The Credentials Setter for OAuth 2 Client Credentials Grant |

The API client can be initialized as follows:

```java
VerizonClient client = new VerizonClient.Builder()
    .httpClientConfig(configBuilder -> configBuilder
            .timeout(0))
    .vZM2mToken("VZ-M2M-Token")
    .clientCredentialsAuth(new ClientCredentialsAuthModel.Builder(
            "OAuthClientId",
            "OAuthClientSecret"
        )
        .oauthScopes(Arrays.asList(
                OauthScopeEnum.DISCOVERYREAD,
                OauthScopeEnum.SERVICEPROFILEREAD
            ))
        .build())
    .environment(Environment.PRODUCTION)
    .build();
```

API calls return an `ApiResponse` object that includes the following fields:

| Field | Description |
|  --- | --- |
| `getStatusCode` | Status code of the HTTP response |
| `getHeaders` | Headers of the HTTP response as a Hash |
| `getResult` | The deserialized body of the HTTP response as a String |

## VerizonClient Class

The gateway for the SDK. This class acts as a factory for the Controllers and also holds the configuration of the SDK.

### Controllers

| Name | Description | Return Type |
|  --- | --- | --- |
| `getM5gEdgePlatformsController()` | Provides access to M5gEdgePlatforms controller. | `M5gEdgePlatformsController` |
| `getServiceEndpointsController()` | Provides access to ServiceEndpoints controller. | `ServiceEndpointsController` |
| `getServiceProfilesController()` | Provides access to ServiceProfiles controller. | `ServiceProfilesController` |
| `getDeviceManagementController()` | Provides access to DeviceManagement controller. | `DeviceManagementController` |
| `getAccountsController()` | Provides access to Accounts controller. | `AccountsController` |
| `getDeviceGroupsController()` | Provides access to DeviceGroups controller. | `DeviceGroupsController` |
| `getSMSController()` | Provides access to SMS controller. | `SMSController` |
| `getSessionManagementController()` | Provides access to SessionManagement controller. | `SessionManagementController` |
| `getConnectivityCallbacksController()` | Provides access to ConnectivityCallbacks controller. | `ConnectivityCallbacksController` |
| `getAccountRequestsController()` | Provides access to AccountRequests controller. | `AccountRequestsController` |
| `getServicePlansController()` | Provides access to ServicePlans controller. | `ServicePlansController` |
| `getDeviceDiagnosticsController()` | Provides access to DeviceDiagnostics controller. | `DeviceDiagnosticsController` |
| `getDeviceProfileManagementController()` | Provides access to DeviceProfileManagement controller. | `DeviceProfileManagementController` |
| `getDeviceMonitoringController()` | Provides access to DeviceMonitoring controller. | `DeviceMonitoringController` |
| `getEUICCDeviceProfileManagementController()` | Provides access to EUICCDeviceProfileManagement controller. | `EUICCDeviceProfileManagementController` |
| `getDevicesLocationsController()` | Provides access to DevicesLocations controller. | `DevicesLocationsController` |
| `getExclusionsController()` | Provides access to Exclusions controller. | `ExclusionsController` |
| `getDevicesLocationSubscriptionsController()` | Provides access to DevicesLocationSubscriptions controller. | `DevicesLocationSubscriptionsController` |
| `getDeviceLocationCallbacksController()` | Provides access to DeviceLocationCallbacks controller. | `DeviceLocationCallbacksController` |
| `getUsageTriggerManagementController()` | Provides access to UsageTriggerManagement controller. | `UsageTriggerManagementController` |
| `getBillingController()` | Provides access to Billing controller. | `BillingController` |
| `getSoftwareManagementSubscriptionsV1Controller()` | Provides access to SoftwareManagementSubscriptionsV1 controller. | `SoftwareManagementSubscriptionsV1Controller` |
| `getSoftwareManagementLicensesV1Controller()` | Provides access to SoftwareManagementLicensesV1 controller. | `SoftwareManagementLicensesV1Controller` |
| `getFirmwareV1Controller()` | Provides access to FirmwareV1 controller. | `FirmwareV1Controller` |
| `getSoftwareManagementCallbacksV1Controller()` | Provides access to SoftwareManagementCallbacksV1 controller. | `SoftwareManagementCallbacksV1Controller` |
| `getSoftwareManagementReportsV1Controller()` | Provides access to SoftwareManagementReportsV1 controller. | `SoftwareManagementReportsV1Controller` |
| `getSoftwareManagementSubscriptionsV2Controller()` | Provides access to SoftwareManagementSubscriptionsV2 controller. | `SoftwareManagementSubscriptionsV2Controller` |
| `getSoftwareManagementLicensesV2Controller()` | Provides access to SoftwareManagementLicensesV2 controller. | `SoftwareManagementLicensesV2Controller` |
| `getCampaignsV2Controller()` | Provides access to CampaignsV2 controller. | `CampaignsV2Controller` |
| `getSoftwareManagementCallbacksV2Controller()` | Provides access to SoftwareManagementCallbacksV2 controller. | `SoftwareManagementCallbacksV2Controller` |
| `getSoftwareManagementReportsV2Controller()` | Provides access to SoftwareManagementReportsV2 controller. | `SoftwareManagementReportsV2Controller` |
| `getClientLoggingController()` | Provides access to ClientLogging controller. | `ClientLoggingController` |
| `getServerLoggingController()` | Provides access to ServerLogging controller. | `ServerLoggingController` |
| `getConfigurationFilesController()` | Provides access to ConfigurationFiles controller. | `ConfigurationFilesController` |
| `getSoftwareManagementSubscriptionsV3Controller()` | Provides access to SoftwareManagementSubscriptionsV3 controller. | `SoftwareManagementSubscriptionsV3Controller` |
| `getSoftwareManagementLicensesV3Controller()` | Provides access to SoftwareManagementLicensesV3 controller. | `SoftwareManagementLicensesV3Controller` |
| `getCampaignsV3Controller()` | Provides access to CampaignsV3 controller. | `CampaignsV3Controller` |
| `getSoftwareManagementReportsV3Controller()` | Provides access to SoftwareManagementReportsV3 controller. | `SoftwareManagementReportsV3Controller` |
| `getFirmwareV3Controller()` | Provides access to FirmwareV3 controller. | `FirmwareV3Controller` |
| `getAccountDevicesController()` | Provides access to AccountDevices controller. | `AccountDevicesController` |
| `getSoftwareManagementCallbacksV3Controller()` | Provides access to SoftwareManagementCallbacksV3 controller. | `SoftwareManagementCallbacksV3Controller` |
| `getSIMSecureforIoTLicensesController()` | Provides access to SIMSecureforIoTLicenses controller. | `SIMSecureforIoTLicensesController` |
| `getAccountSubscriptionsController()` | Provides access to AccountSubscriptions controller. | `AccountSubscriptionsController` |
| `getPerformanceMetricsController()` | Provides access to PerformanceMetrics controller. | `PerformanceMetricsController` |
| `getDiagnosticsSubscriptionsController()` | Provides access to DiagnosticsSubscriptions controller. | `DiagnosticsSubscriptionsController` |
| `getDiagnosticsObservationsController()` | Provides access to DiagnosticsObservations controller. | `DiagnosticsObservationsController` |
| `getDiagnosticsHistoryController()` | Provides access to DiagnosticsHistory controller. | `DiagnosticsHistoryController` |
| `getDiagnosticsSettingsController()` | Provides access to DiagnosticsSettings controller. | `DiagnosticsSettingsController` |
| `getDiagnosticsCallbacksController()` | Provides access to DiagnosticsCallbacks controller. | `DiagnosticsCallbacksController` |
| `getDiagnosticsFactoryResetController()` | Provides access to DiagnosticsFactoryReset controller. | `DiagnosticsFactoryResetController` |
| `getTargetsController()` | Provides access to Targets controller. | `TargetsController` |
| `getCloudConnectorSubscriptionsController()` | Provides access to CloudConnectorSubscriptions controller. | `CloudConnectorSubscriptionsController` |
| `getCloudConnectorDevicesController()` | Provides access to CloudConnectorDevices controller. | `CloudConnectorDevicesController` |
| `getDeviceServiceManagementController()` | Provides access to DeviceServiceManagement controller. | `DeviceServiceManagementController` |
| `getDeviceReportsController()` | Provides access to DeviceReports controller. | `DeviceReportsController` |
| `getHyperPreciseLocationCallbacksController()` | Provides access to HyperPreciseLocationCallbacks controller. | `HyperPreciseLocationCallbacksController` |
| `getAnomalySettingsController()` | Provides access to AnomalySettings controller. | `AnomalySettingsController` |
| `getAnomalyTriggersController()` | Provides access to AnomalyTriggers controller. | `AnomalyTriggersController` |
| `getAnomalyTriggersV2Controller()` | Provides access to AnomalyTriggersV2 controller. | `AnomalyTriggersV2Controller` |
| `getWirelessNetworkPerformanceController()` | Provides access to WirelessNetworkPerformance controller. | `WirelessNetworkPerformanceController` |
| `getFixedWirelessQualificationController()` | Provides access to FixedWirelessQualification controller. | `FixedWirelessQualificationController` |
| `getManagingeSIMProfilesController()` | Provides access to ManagingeSIMProfiles controller. | `ManagingeSIMProfilesController` |
| `getDeviceSMSMessagingController()` | Provides access to DeviceSMSMessaging controller. | `DeviceSMSMessagingController` |
| `getDeviceActionsController()` | Provides access to DeviceActions controller. | `DeviceActionsController` |
| `getThingSpaceQualityofServiceAPIActionsController()` | Provides access to ThingSpaceQualityofServiceAPIActions controller. | `ThingSpaceQualityofServiceAPIActionsController` |
| `getMECController()` | Provides access to MEC controller. | `MECController` |
| `getPromotionPeriodInformationController()` | Provides access to PromotionPeriodInformation controller. | `PromotionPeriodInformationController` |
| `getRetrievetheTriggersController()` | Provides access to RetrievetheTriggers controller. | `RetrievetheTriggersController` |
| `getUpdateTriggersController()` | Provides access to UpdateTriggers controller. | `UpdateTriggersController` |
| `getSIMActionsController()` | Provides access to SIMActions controller. | `SIMActionsController` |
| `getGlobalReportingController()` | Provides access to GlobalReporting controller. | `GlobalReportingController` |
| `getOauthAuthorizationController()` | Provides access to OauthAuthorization controller. | `OauthAuthorizationController` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getVZM2mToken()` | M2M Session Token ([How to generate an M2M session token?](page:getting-started/5g-edge-developer-creds-token#obtaining-a-vz-m2m-session-token-programmatically)). | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](http-client-configuration.md) |
| `getClientCredentialsAuth()` | The credentials to use with ClientCredentialsAuth. | [`ClientCredentialsAuth`]($a/oauth-2-client-credentials-grant.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

