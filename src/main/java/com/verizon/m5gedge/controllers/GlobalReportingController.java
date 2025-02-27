/*
 * VerizonLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.verizon.m5gedge.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.verizon.m5gedge.ApiHelper;
import com.verizon.m5gedge.Server;
import com.verizon.m5gedge.exceptions.ApiException;
import com.verizon.m5gedge.exceptions.ESIMRestErrorResponseException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.ESIMProvhistoryRequest;
import com.verizon.m5gedge.models.ESIMRequestResponse;
import com.verizon.m5gedge.models.ESIMStatusResponse;
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
public final class GlobalReportingController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public GlobalReportingController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Retreive the provisioning history of a specific device or devices.
     * @param  body  Required parameter: Device Provisioning History
     * @return    Returns the ESIMRequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ESIMRequestResponse> deviceprovhistoryUsingPOST(
            final ESIMProvhistoryRequest body) throws ApiException, IOException {
        return prepareDeviceprovhistoryUsingPOSTRequest(body).execute();
    }

    /**
     * Retreive the provisioning history of a specific device or devices.
     * @param  body  Required parameter: Device Provisioning History
     * @return    Returns the ESIMRequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ESIMRequestResponse>> deviceprovhistoryUsingPOSTAsync(
            final ESIMProvhistoryRequest body) {
        try { 
            return prepareDeviceprovhistoryUsingPOSTRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deviceprovhistoryUsingPOST.
     */
    private ApiCall<ApiResponse<ESIMRequestResponse>, ApiException> prepareDeviceprovhistoryUsingPOSTRequest(
            final ESIMProvhistoryRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<ESIMRequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/devices/history/actions/list")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ESIMRequestResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found / Does not exist",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("406",
                                 ErrorCase.setReason("Format / Request Unacceptable",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too many requests",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Get the status of a request made with the Device Actions.
     * @param  accountname  Required parameter: Example:
     * @param  requestID  Required parameter: Example:
     * @return    Returns the ESIMStatusResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ESIMStatusResponse> requeststatususingGET(
            final String accountname,
            final String requestID) throws ApiException, IOException {
        return prepareRequeststatususingGETRequest(accountname, requestID).execute();
    }

    /**
     * Get the status of a request made with the Device Actions.
     * @param  accountname  Required parameter: Example:
     * @param  requestID  Required parameter: Example:
     * @return    Returns the ESIMStatusResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ESIMStatusResponse>> requeststatususingGETAsync(
            final String accountname,
            final String requestID) {
        try { 
            return prepareRequeststatususingGETRequest(accountname, requestID).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for requeststatususingGET.
     */
    private ApiCall<ApiResponse<ESIMStatusResponse>, ApiException> prepareRequeststatususingGETRequest(
            final String accountname,
            final String requestID) throws IOException {
        return new ApiCall.Builder<ApiResponse<ESIMStatusResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v2/accounts/{accountname}/requests/{requestID}/status")
                        .templateParam(param -> param.key("accountname").value(accountname)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("requestID").value(requestID)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ESIMStatusResponse.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Bad request",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("401",
                                 ErrorCase.setReason("Unauthorized",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("403",
                                 ErrorCase.setReason("Forbidden",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("404",
                                 ErrorCase.setReason("Not Found / Does not exist",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("406",
                                 ErrorCase.setReason("Format / Request Unacceptable",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase("429",
                                 ErrorCase.setReason("Too many requests",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new ESIMRestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}