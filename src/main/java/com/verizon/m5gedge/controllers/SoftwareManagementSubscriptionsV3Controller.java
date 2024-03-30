/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.FotaV3ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.FotaV3Subscription;
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
public final class SoftwareManagementSubscriptionsV3Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SoftwareManagementSubscriptionsV3Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint retrieves a FOTA subscription by account.
     * @param  acc  Required parameter: Account identifier.
     * @return    Returns the FotaV3Subscription wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV3Subscription> getAccountSubscriptionStatus(
            final String acc) throws ApiException, IOException {
        return prepareGetAccountSubscriptionStatusRequest(acc).execute();
    }

    /**
     * This endpoint retrieves a FOTA subscription by account.
     * @param  acc  Required parameter: Account identifier.
     * @return    Returns the FotaV3Subscription wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV3Subscription>> getAccountSubscriptionStatusAsync(
            final String acc) {
        try { 
            return prepareGetAccountSubscriptionStatusRequest(acc).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountSubscriptionStatus.
     */
    private ApiCall<ApiResponse<FotaV3Subscription>, ApiException> prepareGetAccountSubscriptionStatusRequest(
            final String acc) throws IOException {
        return new ApiCall.Builder<ApiResponse<FotaV3Subscription>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V3.value())
                        .path("/subscriptions/{acc}")
                        .templateParam(param -> param.key("acc").value(acc)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV3Subscription.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV3ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}