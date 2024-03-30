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
import com.verizon.m5gedge.exceptions.FotaV1ResultException;
import com.verizon.m5gedge.http.request.HttpMethod;
import com.verizon.m5gedge.http.response.ApiResponse;
import com.verizon.m5gedge.models.Firmware;
import com.verizon.m5gedge.models.FirmwareUpgrade;
import com.verizon.m5gedge.models.FirmwareUpgradeChangeRequest;
import com.verizon.m5gedge.models.FirmwareUpgradeChangeResult;
import com.verizon.m5gedge.models.FirmwareUpgradeRequest;
import com.verizon.m5gedge.models.FotaV1SuccessResult;
import io.apimatic.core.ApiCall;
import io.apimatic.core.ErrorCase;
import io.apimatic.core.GlobalConfiguration;
import io.apimatic.coreinterfaces.http.request.ResponseClassType;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

/**
 * This class lists all the endpoints of the groups.
 */
public final class FirmwareV1Controller extends BaseController {

    /**
     * Initializes the controller.
     * @param globalConfig    Configurations added in client.
     */
    public FirmwareV1Controller(GlobalConfiguration globalConfig) {
        super(globalConfig);
    }

    /**
     * Lists all device firmware images available for an account, based on the devices registered to
     * that account.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @return    Returns the List of Firmware wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<List<Firmware>> listAvailableFirmware(
            final String account) throws ApiException, IOException {
        return prepareListAvailableFirmwareRequest(account).execute();
    }

    /**
     * Lists all device firmware images available for an account, based on the devices registered to
     * that account.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @return    Returns the List of Firmware wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<List<Firmware>>> listAvailableFirmwareAsync(
            final String account) {
        try { 
            return prepareListAvailableFirmwareRequest(account).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listAvailableFirmware.
     */
    private ApiCall<ApiResponse<List<Firmware>>, ApiException> prepareListAvailableFirmwareRequest(
            final String account) throws IOException {
        return new ApiCall.Builder<ApiResponse<List<Firmware>>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/firmware/{account}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserializeArray(response,
                                        Firmware[].class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Schedules a firmware upgrade for devices.
     * @param  body  Required parameter: Details of the firmware upgrade request.
     * @return    Returns the FirmwareUpgrade wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FirmwareUpgrade> scheduleFirmwareUpgrade(
            final FirmwareUpgradeRequest body) throws ApiException, IOException {
        return prepareScheduleFirmwareUpgradeRequest(body).execute();
    }

    /**
     * Schedules a firmware upgrade for devices.
     * @param  body  Required parameter: Details of the firmware upgrade request.
     * @return    Returns the FirmwareUpgrade wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FirmwareUpgrade>> scheduleFirmwareUpgradeAsync(
            final FirmwareUpgradeRequest body) {
        try { 
            return prepareScheduleFirmwareUpgradeRequest(body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for scheduleFirmwareUpgrade.
     */
    private ApiCall<ApiResponse<FirmwareUpgrade>, ApiException> prepareScheduleFirmwareUpgradeRequest(
            final FirmwareUpgradeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<FirmwareUpgrade>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/upgrades")
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
                                response -> ApiHelper.deserialize(response, FirmwareUpgrade.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Returns information about a specified upgrade, include the target date of the upgrade, the
     * list of devices in the upgrade, and the status of the upgrade for each device.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeId  Required parameter: The UUID of the upgrade, returned by POST /upgrades
     *         when the upgrade was scheduled.
     * @return    Returns the FirmwareUpgrade wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FirmwareUpgrade> listFirmwareUpgradeDetails(
            final String account,
            final String upgradeId) throws ApiException, IOException {
        return prepareListFirmwareUpgradeDetailsRequest(account, upgradeId).execute();
    }

    /**
     * Returns information about a specified upgrade, include the target date of the upgrade, the
     * list of devices in the upgrade, and the status of the upgrade for each device.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeId  Required parameter: The UUID of the upgrade, returned by POST /upgrades
     *         when the upgrade was scheduled.
     * @return    Returns the FirmwareUpgrade wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FirmwareUpgrade>> listFirmwareUpgradeDetailsAsync(
            final String account,
            final String upgradeId) {
        try { 
            return prepareListFirmwareUpgradeDetailsRequest(account, upgradeId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for listFirmwareUpgradeDetails.
     */
    private ApiCall<ApiResponse<FirmwareUpgrade>, ApiException> prepareListFirmwareUpgradeDetailsRequest(
            final String account,
            final String upgradeId) throws IOException {
        return new ApiCall.Builder<ApiResponse<FirmwareUpgrade>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/upgrades/{account}/upgrade/{upgradeId}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("upgradeId").value(upgradeId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.GET))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FirmwareUpgrade.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Add or remove devices from a scheduled upgrade.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeId  Required parameter: The UUID of the upgrade, returned by POST /upgrades
     *         when the upgrade was scheduled.
     * @param  body  Required parameter: List of devices to add or remove.
     * @return    Returns the FirmwareUpgradeChangeResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FirmwareUpgradeChangeResult> updateFirmwareUpgradeDevices(
            final String account,
            final String upgradeId,
            final FirmwareUpgradeChangeRequest body) throws ApiException, IOException {
        return prepareUpdateFirmwareUpgradeDevicesRequest(account, upgradeId, body).execute();
    }

    /**
     * Add or remove devices from a scheduled upgrade.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeId  Required parameter: The UUID of the upgrade, returned by POST /upgrades
     *         when the upgrade was scheduled.
     * @param  body  Required parameter: List of devices to add or remove.
     * @return    Returns the FirmwareUpgradeChangeResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FirmwareUpgradeChangeResult>> updateFirmwareUpgradeDevicesAsync(
            final String account,
            final String upgradeId,
            final FirmwareUpgradeChangeRequest body) {
        try { 
            return prepareUpdateFirmwareUpgradeDevicesRequest(account, upgradeId, body).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for updateFirmwareUpgradeDevices.
     */
    private ApiCall<ApiResponse<FirmwareUpgradeChangeResult>, ApiException> prepareUpdateFirmwareUpgradeDevicesRequest(
            final String account,
            final String upgradeId,
            final FirmwareUpgradeChangeRequest body) throws JsonProcessingException, IOException {
        return new ApiCall.Builder<ApiResponse<FirmwareUpgradeChangeResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/upgrades/{account}/upgrade/{upgradeId}")
                        .bodyParam(param -> param.value(body))
                        .bodySerializer(() ->  ApiHelper.serialize(body))
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("upgradeId").value(upgradeId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("Content-Type")
                                .value("*/*").isRequired(false))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.PUT))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FirmwareUpgradeChangeResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }

    /**
     * Cancel a scheduled firmware upgrade.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeId  Required parameter: The UUID of the scheduled upgrade that you want to
     *         cancel.
     * @return    Returns the FotaV1SuccessResult wrapped in ApiResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ApiResponse<FotaV1SuccessResult> cancelScheduledFirmwareUpgrade(
            final String account,
            final String upgradeId) throws ApiException, IOException {
        return prepareCancelScheduledFirmwareUpgradeRequest(account, upgradeId).execute();
    }

    /**
     * Cancel a scheduled firmware upgrade.
     * @param  account  Required parameter: Account identifier in "##########-#####".
     * @param  upgradeId  Required parameter: The UUID of the scheduled upgrade that you want to
     *         cancel.
     * @return    Returns the FotaV1SuccessResult wrapped in ApiResponse response from the API call
     */
    public CompletableFuture<ApiResponse<FotaV1SuccessResult>> cancelScheduledFirmwareUpgradeAsync(
            final String account,
            final String upgradeId) {
        try { 
            return prepareCancelScheduledFirmwareUpgradeRequest(account, upgradeId).executeAsync(); 
        } catch (Exception e) {  
            throw new CompletionException(e); 
        }
    }

    /**
     * Builds the ApiCall object for cancelScheduledFirmwareUpgrade.
     */
    private ApiCall<ApiResponse<FotaV1SuccessResult>, ApiException> prepareCancelScheduledFirmwareUpgradeRequest(
            final String account,
            final String upgradeId) throws IOException {
        return new ApiCall.Builder<ApiResponse<FotaV1SuccessResult>, ApiException>()
                .globalConfig(getGlobalConfiguration())
                .requestBuilder(requestBuilder -> requestBuilder
                        .server(Server.SOFTWARE_MANAGEMENT_V1.value())
                        .path("/upgrades/{account}/upgrade/{upgradeId}")
                        .templateParam(param -> param.key("account").value(account)
                                .shouldEncode(true))
                        .templateParam(param -> param.key("upgradeId").value(upgradeId)
                                .shouldEncode(true))
                        .headerParam(param -> param.key("accept").value("application/json"))
                        .withAuth(auth -> auth
                                .add("oAuth2"))
                        .httpMethod(HttpMethod.DELETE))
                .responseHandler(responseHandler -> responseHandler
                        .responseClassType(ResponseClassType.API_RESPONSE)
                        .apiResponseDeserializer(
                                response -> ApiHelper.deserialize(response, FotaV1SuccessResult.class))
                        .nullify404(false)
                        .localErrorCase("400",
                                 ErrorCase.setReason("Unexpected error.",
                                (reason, context) -> new FotaV1ResultException(reason, context)))
                        .globalErrorCase(GLOBAL_ERROR_CASES))
                .build();
    }
}