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
import com.verizon.m5gedge.exceptions.DeviceDiagnosticsResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.DiagnosticsObservationResult;
import com.verizon.m5gedge.models.ObservationRequest;
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
public final class DiagnosticsObservationsController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DiagnosticsObservationsController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * This endpoint allows the user to start or change observe diagnostics.
     * @param  body  Required parameter: Request for device observation information.
     * @return    Returns the DiagnosticsObservationResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DiagnosticsObservationResult> startDiagnosticsObservation(
            final ObservationRequest body) throws ApiException, IOException {
        return prepareStartDiagnosticsObservationRequest(body).execute();
    }

    /**
     * This endpoint allows the user to start or change observe diagnostics.
     * @param  body  Required parameter: Request for device observation information.
     * @return    Returns the DiagnosticsObservationResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DiagnosticsObservationResult>> startDiagnosticsObservationAsync(
            final ObservationRequest body) {
        try { 
            return prepareStartDiagnosticsObservationRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for startDiagnosticsObservation.
     */
    private ApiCall<ApiResponse<DiagnosticsObservationResult>, ApiException> prepareStartDiagnosticsObservationRequest(
            final ObservationRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<DiagnosticsObservationResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_DIAGNOSTICS.value())
                        .path("/devices/attributes/actions/observe")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DiagnosticsObservationResult.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new DeviceDiagnosticsResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows the user to stop or reset observe diagnostics.
     * @param  transactionId  Required parameter: The ID value associated with the transaction.
     * @param  accountName  Required parameter: The numeric account name.
     * @return    Returns the DiagnosticsObservationResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<DiagnosticsObservationResult> stopDiagnosticsObservation(
            final String transactionId,
            final String accountName) throws ApiException, IOException {
        return prepareStopDiagnosticsObservationRequest(transactionId, accountName).execute();
    }

    /**
     * This endpoint allows the user to stop or reset observe diagnostics.
     * @param  transactionId  Required parameter: The ID value associated with the transaction.
     * @param  accountName  Required parameter: The numeric account name.
     * @return    Returns the DiagnosticsObservationResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<DiagnosticsObservationResult>> stopDiagnosticsObservationAsync(
            final String transactionId,
            final String accountName) {
        try { 
            return prepareStopDiagnosticsObservationRequest(transactionId, accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for stopDiagnosticsObservation.
     */
    private ApiCall<ApiResponse<DiagnosticsObservationResult>, ApiException> prepareStopDiagnosticsObservationRequest(
            final String transactionId,
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<DiagnosticsObservationResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.DEVICE_DIAGNOSTICS.value())
                        .path("/devices/attributes/actions/observe")
                        .queryParam(param -> param.key("transactionId")
                                .value(transactionId))
                        .queryParam(param -> param.key("accountName")
                                .value(accountName))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, DiagnosticsObservationResult.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response.",
                                (reason, context) -> new DeviceDiagnosticsResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}