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
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.ChangeMecDeviceIPAddressResponse;
import com.verizon.m5gedge.models.ChangeMecDeviceProfileResponse;
import com.verizon.m5gedge.models.ChangeMecDeviceStateResponse;
import com.verizon.m5gedge.models.ChangePmecDeviceProfileRequest;
import com.verizon.m5gedge.models.ChangePmecDeviceStateActivateRequest;
import com.verizon.m5gedge.models.ChangePmecDeviceStateBulkDeactivateRequest;
import com.verizon.m5gedge.models.GetMECPerformanceConsentResponse;
import com.verizon.m5gedge.models.KPIInfoList;
import com.verizon.m5gedge.models.MECProfileList;
import io.apimatic.core.ApiCall;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class MECController extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public MECController(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * @param  aname  Required parameter: Account name.
     * @return    Returns the KPIInfoList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<KPIInfoList> kPIList(
            final String aname) throws ApiException, IOException {
        return prepareKPIListRequest(aname).execute();
    }

    /**
     * @param  aname  Required parameter: Account name.
     * @return    Returns the KPIInfoList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<KPIInfoList>> kPIListAsync(
            final String aname) {
        try { 
            return prepareKPIListRequest(aname).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for kPIList.
     */
    private ApiCall<ApiResponse<KPIInfoList>, ApiException> prepareKPIListRequest(
            final String aname) throws IOException {
        return new ApiCall.Builder<ApiResponse<KPIInfoList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/kpi/list/{aname}")
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, KPIInfoList.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  aname  Required parameter: Account name.
     * @return    Returns the MECProfileList wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<MECProfileList> getProfileList(
            final String aname) throws ApiException, IOException {
        return prepareGetProfileListRequest(aname).execute();
    }

    /**
     * @param  aname  Required parameter: Account name.
     * @return    Returns the MECProfileList wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<MECProfileList>> getProfileListAsync(
            final String aname) {
        try { 
            return prepareGetProfileListRequest(aname).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getProfileList.
     */
    private ApiCall<ApiResponse<MECProfileList>, ApiException> prepareGetProfileListRequest(
            final String aname) throws IOException {
        return new ApiCall.Builder<ApiResponse<MECProfileList>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/profiles/list/{aname}")
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, MECProfileList.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceStateResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChangeMecDeviceStateResponse> changePmecDeviceStateActivate(
            final ChangePmecDeviceStateActivateRequest body) throws ApiException, IOException {
        return prepareChangePmecDeviceStateActivateRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceStateResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChangeMecDeviceStateResponse>> changePmecDeviceStateActivateAsync(
            final ChangePmecDeviceStateActivateRequest body) {
        try { 
            return prepareChangePmecDeviceStateActivateRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for changePmecDeviceStateActivate.
     */
    private ApiCall<ApiResponse<ChangeMecDeviceStateResponse>, ApiException> prepareChangePmecDeviceStateActivateRequest(
            final ChangePmecDeviceStateActivateRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<ChangeMecDeviceStateResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/actions/state/activate")
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
                                response -> ApiHelper.deserialize(response, ChangeMecDeviceStateResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceStateResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChangeMecDeviceStateResponse> changePmecDeviceStateBulkDeactivate(
            final ChangePmecDeviceStateBulkDeactivateRequest body) throws ApiException, IOException {
        return prepareChangePmecDeviceStateBulkDeactivateRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceStateResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChangeMecDeviceStateResponse>> changePmecDeviceStateBulkDeactivateAsync(
            final ChangePmecDeviceStateBulkDeactivateRequest body) {
        try { 
            return prepareChangePmecDeviceStateBulkDeactivateRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for changePmecDeviceStateBulkDeactivate.
     */
    private ApiCall<ApiResponse<ChangeMecDeviceStateResponse>, ApiException> prepareChangePmecDeviceStateBulkDeactivateRequest(
            final ChangePmecDeviceStateBulkDeactivateRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<ChangeMecDeviceStateResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/actions/state/deactivate")
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
                                response -> ApiHelper.deserialize(response, ChangeMecDeviceStateResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceProfileResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChangeMecDeviceProfileResponse> changePmecDeviceProfile(
            final ChangePmecDeviceProfileRequest body) throws ApiException, IOException {
        return prepareChangePmecDeviceProfileRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceProfileResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChangeMecDeviceProfileResponse>> changePmecDeviceProfileAsync(
            final ChangePmecDeviceProfileRequest body) {
        try { 
            return prepareChangePmecDeviceProfileRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for changePmecDeviceProfile.
     */
    private ApiCall<ApiResponse<ChangeMecDeviceProfileResponse>, ApiException> prepareChangePmecDeviceProfileRequest(
            final ChangePmecDeviceProfileRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<ChangeMecDeviceProfileResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/actions/profile")
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
                                response -> ApiHelper.deserialize(response, ChangeMecDeviceProfileResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceIPAddressResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<ChangeMecDeviceIPAddressResponse> changePmecDeviceIPaddressBulk(
            final ChangePmecDeviceStateBulkDeactivateRequest body) throws ApiException, IOException {
        return prepareChangePmecDeviceIPaddressBulkRequest(body).execute();
    }

    /**
     * @param  body  Required parameter: Example:
     * @return    Returns the ChangeMecDeviceIPAddressResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<ChangeMecDeviceIPAddressResponse>> changePmecDeviceIPaddressBulkAsync(
            final ChangePmecDeviceStateBulkDeactivateRequest body) {
        try { 
            return prepareChangePmecDeviceIPaddressBulkRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for changePmecDeviceIPaddressBulk.
     */
    private ApiCall<ApiResponse<ChangeMecDeviceIPAddressResponse>, ApiException> prepareChangePmecDeviceIPaddressBulkRequest(
            final ChangePmecDeviceStateBulkDeactivateRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<ChangeMecDeviceIPAddressResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/actions/ipaddress")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .headerParam(param -> param.key("Content-Type")
                                .value("application/json").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, ChangeMecDeviceIPAddressResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * @param  aname  Required parameter: Account name.
     * @return    Returns the GetMECPerformanceConsentResponse wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<GetMECPerformanceConsentResponse> getMECPerformanceConsent(
            final String aname) throws ApiException, IOException {
        return prepareGetMECPerformanceConsentRequest(aname).execute();
    }

    /**
     * @param  aname  Required parameter: Account name.
     * @return    Returns the GetMECPerformanceConsentResponse wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<GetMECPerformanceConsentResponse>> getMECPerformanceConsentAsync(
            final String aname) {
        try { 
            return prepareGetMECPerformanceConsentRequest(aname).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for getMECPerformanceConsent.
     */
    private ApiCall<ApiResponse<GetMECPerformanceConsentResponse>, ApiException> prepareGetMECPerformanceConsentRequest(
            final String aname) throws IOException {
        return new ApiCall.Builder<ApiResponse<GetMECPerformanceConsentResponse>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.THINGSPACE.value())
                        .path("/m2m/v1/devices/mec/performance/consent/{aname}")
                        .templateParam(param -> param.key("aname").value(aname)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, GetMECPerformanceConsentResponse.class))
                        .nullify404(false)
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}