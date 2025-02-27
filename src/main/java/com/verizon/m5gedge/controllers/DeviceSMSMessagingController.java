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
import com.verizon.m5gedge.exceptions.GIORestErrorResponseException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.GIORequestResponse;
import com.verizon.m5gedge.models.GIOSMSSendRequest;
import com.verizon.m5gedge.models.SMSEventHistoryRequest;
import com.verizon.m5gedge.models.SmsMessagesResponse;
import com.verizon.m5gedge.models.SuccessResponse;
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
public final class DeviceSMSMessagingController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public DeviceSMSMessagingController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Sends an SMS message to one device. Messages are queued on the M2M MC Platform and sent as
     * soon as possible, but they may be delayed due to traffic and routing considerations.
     * @param  body  Required parameter: SMS message to an indiividual device.
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<GIORequestResponse> sendAnSmsMessage(
            final GIOSMSSendRequest body) throws ApiException, IOException {
        return prepareSendAnSmsMessageRequest(body).execute();
    }

    /**
     * Sends an SMS message to one device. Messages are queued on the M2M MC Platform and sent as
     * soon as possible, but they may be delayed due to traffic and routing considerations.
     * @param  body  Required parameter: SMS message to an indiividual device.
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<GIORequestResponse>> sendAnSmsMessageAsync(
            final GIOSMSSendRequest body) {
        try { 
            return prepareSendAnSmsMessageRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for sendAnSmsMessage.
     */
    private ApiCall<ApiResponse<GIORequestResponse>, ApiException> prepareSendAnSmsMessageRequest(
            final GIOSMSSendRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<GIORequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/sms")
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
                                response -> ApiHelper.deserialize(response, GIORequestResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Retrieves queued SMS messages sent by all M2M MC devices associated with an account.
     * @param  accountName  Required parameter: Numeric account name
     * @param  next  Optional parameter: Continue the previous query from the pageUrl in Location
     *         Header
     * @return    Returns the SmsMessagesResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SmsMessagesResponse> getSmsMessages(
            final String accountName,
            final String next) throws ApiException, IOException {
        return prepareGetSmsMessagesRequest(accountName, next).execute();
    }

    /**
     * Retrieves queued SMS messages sent by all M2M MC devices associated with an account.
     * @param  accountName  Required parameter: Numeric account name
     * @param  next  Optional parameter: Continue the previous query from the pageUrl in Location
     *         Header
     * @return    Returns the SmsMessagesResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SmsMessagesResponse>> getSmsMessagesAsync(
            final String accountName,
            final String next) {
        try { 
            return prepareGetSmsMessagesRequest(accountName, next).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getSmsMessages.
     */
    private ApiCall<ApiResponse<SmsMessagesResponse>, ApiException> prepareGetSmsMessagesRequest(
            final String accountName,
            final String next) throws IOException {
        return new ApiCall.Builder<ApiResponse<SmsMessagesResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/sms/{accountName}/history")
                        .queryParam(param -> param.key("next")
                                .value(next).isRequired(false))
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SmsMessagesResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Starts delivery of SMS messages for the specified account.
     * @param  accountName  Required parameter: Numeric account name
     * @return    Returns the SuccessResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<SuccessResponse> startSmsMessageDelivery(
            final String accountName) throws ApiException, IOException {
        return prepareStartSmsMessageDeliveryRequest(accountName).execute();
    }

    /**
     * Starts delivery of SMS messages for the specified account.
     * @param  accountName  Required parameter: Numeric account name
     * @return    Returns the SuccessResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<SuccessResponse>> startSmsMessageDeliveryAsync(
            final String accountName) {
        try { 
            return prepareStartSmsMessageDeliveryRequest(accountName).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for startSmsMessageDelivery.
     */
    private ApiCall<ApiResponse<SuccessResponse>, ApiException> prepareStartSmsMessageDeliveryRequest(
            final String accountName) throws IOException {
        return new ApiCall.Builder<ApiResponse<SuccessResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/sms/{accountName}/startCallbacks")
                        .templateParam(param -> param.key("accountName").value(accountName)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, SuccessResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns a list of sms history for a given device during a specified time frame.
     * @param  body  Required parameter: Device Query
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<GIORequestResponse> listSmsMessageHistory(
            final SMSEventHistoryRequest body) throws ApiException, IOException {
        return prepareListSmsMessageHistoryRequest(body).execute();
    }

    /**
     * Returns a list of sms history for a given device during a specified time frame.
     * @param  body  Required parameter: Device Query
     * @return    Returns the GIORequestResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<GIORequestResponse>> listSmsMessageHistoryAsync(
            final SMSEventHistoryRequest body) {
        try { 
            return prepareListSmsMessageHistoryRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listSmsMessageHistory.
     */
    private ApiCall<ApiResponse<GIORequestResponse>, ApiException> prepareListSmsMessageHistoryRequest(
            final SMSEventHistoryRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<GIORequestResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/sms/history/actions/list")
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
                                response -> ApiHelper.deserialize(response, GIORequestResponse.class))
                        .nullify404(false)
                        .localErrorCase(ErrorCase.DEFAULT,
                                 ErrorCase.setReason("Error response",
                                (reason, context) -> new GIORestErrorResponseException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}