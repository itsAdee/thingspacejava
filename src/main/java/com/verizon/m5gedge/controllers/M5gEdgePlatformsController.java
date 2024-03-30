/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.EdgeDiscoveryResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.ListMECPlatformsResult;
import com.verizon.m5gedge.models.ListRegionsResult;
import com.verizon.m5gedge.models.UserEquipmentIdentityTypeEnum;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class M5gEdgePlatformsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public M5gEdgePlatformsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Returns a list of optimal MEC Platforms where you can register your deployed application.
     * **Note:** If a query is sent with all of the parameters, it will fail with a "400" error. You
     * can search based on the following parameter combinations - region plus Service Profile ID and
     * subscriber density (density is optional but recommended), region plus UEIdentity(Including
     * UEIdentity Type) or Service Profile ID plus UEIdentity(Including UEIdentity Type).
     * @param  region  Optional parameter: MEC region name. Current valid values are US_WEST_2 and
     *         US_EAST_1.
     * @param  serviceProfileId  Optional parameter: Unique identifier of the service profile.
     * @param  subscriberDensity  Optional parameter: Minimum number of 4G/5G subscribers per square
     *         kilometer.
     * @param  uEIdentityType  Optional parameter: Type of User Equipment identifier used in
     *         `UEIdentity`.
     * @param  uEIdentity  Optional parameter: The identifier value for User Equipment. The type of
     *         identifier is defined by the 'UEIdentityType' parameter. The`IPAddress`format can be
     *         IPv4 or IPv6.
     * @return    Returns the ListMECPlatformsResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ListMECPlatformsResult> listMECPlatforms(
            final String region,
            final String serviceProfileId,
            final Integer subscriberDensity,
            final UserEquipmentIdentityTypeEnum uEIdentityType,
            final String uEIdentity) throws ApiException, IOException {
        return prepareListMECPlatformsRequest(region, serviceProfileId, subscriberDensity,
                uEIdentityType, uEIdentity).execute();
    }

    /**
     * Returns a list of optimal MEC Platforms where you can register your deployed application.
     * **Note:** If a query is sent with all of the parameters, it will fail with a "400" error. You
     * can search based on the following parameter combinations - region plus Service Profile ID and
     * subscriber density (density is optional but recommended), region plus UEIdentity(Including
     * UEIdentity Type) or Service Profile ID plus UEIdentity(Including UEIdentity Type).
     * @param  region  Optional parameter: MEC region name. Current valid values are US_WEST_2 and
     *         US_EAST_1.
     * @param  serviceProfileId  Optional parameter: Unique identifier of the service profile.
     * @param  subscriberDensity  Optional parameter: Minimum number of 4G/5G subscribers per square
     *         kilometer.
     * @param  uEIdentityType  Optional parameter: Type of User Equipment identifier used in
     *         `UEIdentity`.
     * @param  uEIdentity  Optional parameter: The identifier value for User Equipment. The type of
     *         identifier is defined by the 'UEIdentityType' parameter. The`IPAddress`format can be
     *         IPv4 or IPv6.
     * @return    Returns the ListMECPlatformsResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ListMECPlatformsResult>> listMECPlatformsAsync(
            final String region,
            final String serviceProfileId,
            final Integer subscriberDensity,
            final UserEquipmentIdentityTypeEnum uEIdentityType,
            final String uEIdentity) {
        try { 
            return prepareListMECPlatformsRequest(region, serviceProfileId, subscriberDensity,
            uEIdentityType, uEIdentity).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listMECPlatforms.
     */
    private ApiCall<ApiResponse<ListMECPlatformsResult>, ApiException> prepareListMECPlatformsRequest(
            final String region,
            final String serviceProfileId,
            final Integer subscriberDensity,
            final UserEquipmentIdentityTypeEnum uEIdentityType,
            final String uEIdentity) throws IOException {
        return new ApiCall.Builder<ApiResponse<ListMECPlatformsResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/mecplatforms")
                        .queryParam(param -> param.key("region")
                                .value(region).isRequired(false))
                        .queryParam(param -> param.key("serviceProfileId")
                                .value(serviceProfileId).isRequired(false))
                        .queryParam(param -> param.key("subscriberDensity")
                                .value(subscriberDensity).isRequired(false))
                        .queryParam(param -> param.key("UEIdentityType")
                                .value((uEIdentityType != null) ? uEIdentityType.value() : null).isRequired(false))
                        .queryParam(param -> param.key("UEIdentity")
                                .value(uEIdentity).isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ListMECPlatformsResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * List the geographical regions available, based on the user's bearer token. **Note:** Country
     * code, Metropolitan area, Area and Zone are future functionality and will currently return a
     * "null" value.
     * @return    Returns the ListRegionsResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ListRegionsResult> listRegions() throws ApiException, IOException {
        return prepareListRegionsRequest().execute();
    }

    /**
     * List the geographical regions available, based on the user's bearer token. **Note:** Country
     * code, Metropolitan area, Area and Zone are future functionality and will currently return a
     * "null" value.
     * @return    Returns the ListRegionsResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ListRegionsResult>> listRegionsAsync() {
        try { 
            return prepareListRegionsRequest().executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listRegions.
     */
    private ApiCall<ApiResponse<ListRegionsResult>, ApiException> prepareListRegionsRequest() throws IOException {
        return new ApiCall.Builder<ApiResponse<ListRegionsResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.EDGE_DISCOVERY.value())
                        .path("/regions")
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ListRegionsResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("HTTP 400 Bad Request.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("HTTP 401 Unauthorized.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("HTTP 500 Internal Server Error.",
                                (reason, context) -> new EdgeDiscoveryResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}