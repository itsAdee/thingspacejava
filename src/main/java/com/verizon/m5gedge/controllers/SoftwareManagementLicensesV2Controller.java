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
import com.verizon.m5gedge.exceptions.FotaV2ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.FotaV2SuccessResult;
import com.verizon.m5gedge.models.V2LicenseIMEI;
import com.verizon.m5gedge.models.V2LicenseSummary;
import com.verizon.m5gedge.models.V2LicensesAssignedRemovedResult;
import com.verizon.m5gedge.models.V2ListOfLicensesToRemove;
import com.verizon.m5gedge.models.V2ListOfLicensesToRemoveRequest;
import com.verizon.m5gedge.models.V2ListOfLicensesToRemoveResult;
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
public final class SoftwareManagementLicensesV2Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public SoftwareManagementLicensesV2Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * The endpoint allows user to list license usage.
     * @param  account  Required parameter: Account identifier.
     * @param  lastSeenDeviceId  Optional parameter: Last seen device identifier.
     * @return    Returns the V2LicenseSummary wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<V2LicenseSummary> getAccountLicenseStatus(
            final String account,
            final String lastSeenDeviceId) throws ApiException, IOException {
        return prepareGetAccountLicenseStatusRequest(account, lastSeenDeviceId).execute();
    }

    /**
     * The endpoint allows user to list license usage.
     * @param  account  Required parameter: Account identifier.
     * @param  lastSeenDeviceId  Optional parameter: Last seen device identifier.
     * @return    Returns the V2LicenseSummary wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<V2LicenseSummary>> getAccountLicenseStatusAsync(
            final String account,
            final String lastSeenDeviceId) {
        try { 
            return prepareGetAccountLicenseStatusRequest(account, lastSeenDeviceId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getAccountLicenseStatus.
     */
    private ApiCall<ApiResponse<V2LicenseSummary>, ApiException> prepareGetAccountLicenseStatusRequest(
            final String account,
            final String lastSeenDeviceId) throws IOException {
        return new ApiCall.Builder<ApiResponse<V2LicenseSummary>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/licenses/{account}")
                        .queryParam(param -> param.key("lastSeenDeviceId")
                                .value(lastSeenDeviceId).isRequired(false))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V2LicenseSummary.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to assign licenses to a list of devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: License assignment.
     * @return    Returns the V2LicensesAssignedRemovedResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public ApiResponse<V2LicensesAssignedRemovedResult> assignLicensesToDevices(
            final String account,
            final V2LicenseIMEI body) throws ApiException, IOException {
        return prepareAssignLicensesToDevicesRequest(account, body).execute();
    }

    /**
     * This endpoint allows user to assign licenses to a list of devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: License assignment.
     * @return    Returns the V2LicensesAssignedRemovedResult wrapped in ApiResponse response from the API call
     */
    @Deprecated
    public CompletableFuture<ApiResponse<V2LicensesAssignedRemovedResult>> assignLicensesToDevicesAsync(
            final String account,
            final V2LicenseIMEI body) {
        try { 
            return prepareAssignLicensesToDevicesRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for assignLicensesToDevices.
     */
    private ApiCall<ApiResponse<V2LicensesAssignedRemovedResult>, ApiException> prepareAssignLicensesToDevicesRequest(
            final String account,
            final V2LicenseIMEI body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<V2LicensesAssignedRemovedResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/licenses/{account}/assign")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V2LicensesAssignedRemovedResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to remove licenses from a list of devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: License removal.
     * @return    Returns the V2LicensesAssignedRemovedResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public ApiResponse<V2LicensesAssignedRemovedResult> removeLicensesFromDevices(
            final String account,
            final V2LicenseIMEI body) throws ApiException, IOException {
        return prepareRemoveLicensesFromDevicesRequest(account, body).execute();
    }

    /**
     * This endpoint allows user to remove licenses from a list of devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: License removal.
     * @return    Returns the V2LicensesAssignedRemovedResult wrapped in ApiResponse response from the API call
     */
    @Deprecated
    public CompletableFuture<ApiResponse<V2LicensesAssignedRemovedResult>> removeLicensesFromDevicesAsync(
            final String account,
            final V2LicenseIMEI body) {
        try { 
            return prepareRemoveLicensesFromDevicesRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for removeLicensesFromDevices.
     */
    private ApiCall<ApiResponse<V2LicensesAssignedRemovedResult>, ApiException> prepareRemoveLicensesFromDevicesRequest(
            final String account,
            final V2LicenseIMEI body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<V2LicensesAssignedRemovedResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/licenses/{account}/remove")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V2LicensesAssignedRemovedResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * The license cancel endpoint allows user to list registered license cancellation candidate
     * devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  startIndex  Optional parameter: Start index to retrieve.
     * @return    Returns the V2ListOfLicensesToRemove wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public ApiResponse<V2ListOfLicensesToRemove> listLicensesToRemove(
            final String account,
            final String startIndex) throws ApiException, IOException {
        return prepareListLicensesToRemoveRequest(account, startIndex).execute();
    }

    /**
     * The license cancel endpoint allows user to list registered license cancellation candidate
     * devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  startIndex  Optional parameter: Start index to retrieve.
     * @return    Returns the V2ListOfLicensesToRemove wrapped in ApiResponse response from the API call
     */
    @Deprecated
    public CompletableFuture<ApiResponse<V2ListOfLicensesToRemove>> listLicensesToRemoveAsync(
            final String account,
            final String startIndex) {
        try { 
            return prepareListLicensesToRemoveRequest(account, startIndex).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listLicensesToRemove.
     */
    private ApiCall<ApiResponse<V2ListOfLicensesToRemove>, ApiException> prepareListLicensesToRemoveRequest(
            final String account,
            final String startIndex) throws IOException {
        return new ApiCall.Builder<ApiResponse<V2ListOfLicensesToRemove>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/licenses/{account}/cancel")
                        .queryParam(param -> param.key("startIndex")
                                .value(startIndex).isRequired(false))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V2ListOfLicensesToRemove.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * The license cancel endpoint allows user to create a list of license cancellation candidate
     * devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: List of licensess to remove.
     * @return    Returns the V2ListOfLicensesToRemoveResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public ApiResponse<V2ListOfLicensesToRemoveResult> createListOfLicensesToRemove(
            final String account,
            final V2ListOfLicensesToRemoveRequest body) throws ApiException, IOException {
        return prepareCreateListOfLicensesToRemoveRequest(account, body).execute();
    }

    /**
     * The license cancel endpoint allows user to create a list of license cancellation candidate
     * devices.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @param  body  Required parameter: List of licensess to remove.
     * @return    Returns the V2ListOfLicensesToRemoveResult wrapped in ApiResponse response from the API call
     */
    @Deprecated
    public CompletableFuture<ApiResponse<V2ListOfLicensesToRemoveResult>> createListOfLicensesToRemoveAsync(
            final String account,
            final V2ListOfLicensesToRemoveRequest body) {
        try { 
            return prepareCreateListOfLicensesToRemoveRequest(account, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for createListOfLicensesToRemove.
     */
    private ApiCall<ApiResponse<V2ListOfLicensesToRemoveResult>, ApiException> prepareCreateListOfLicensesToRemoveRequest(
            final String account,
            final V2ListOfLicensesToRemoveRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<V2ListOfLicensesToRemoveResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/licenses/{account}/cancel")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.POST))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, V2ListOfLicensesToRemoveResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * This endpoint allows user to delete a created cancel candidate device list.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the FotaV2SuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public ApiResponse<FotaV2SuccessResult> deleteListOfLicensesToRemove(
            final String account) throws ApiException, IOException {
        return prepareDeleteListOfLicensesToRemoveRequest(account).execute();
    }

    /**
     * This endpoint allows user to delete a created cancel candidate device list.
     * @deprecated
     * 
     * @param  account  Required parameter: Account identifier.
     * @return    Returns the FotaV2SuccessResult wrapped in ApiResponse response from the API call
     */
    @Deprecated
    public CompletableFuture<ApiResponse<FotaV2SuccessResult>> deleteListOfLicensesToRemoveAsync(
            final String account) {
        try { 
            return prepareDeleteListOfLicensesToRemoveRequest(account).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for deleteListOfLicensesToRemove.
     */
    private ApiCall<ApiResponse<FotaV2SuccessResult>, ApiException> prepareDeleteListOfLicensesToRemoveRequest(
            final String account) throws IOException {
        return new ApiCall.Builder<ApiResponse<FotaV2SuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V2.value())
                        .path("/licenses/{account}/cancel")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV2SuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV2ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}