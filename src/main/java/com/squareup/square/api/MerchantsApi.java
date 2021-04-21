
package com.squareup.square.api;

import com.squareup.square.exceptions.ApiException;
import com.squareup.square.models.ListMerchantsResponse;
import com.squareup.square.models.RetrieveMerchantResponse;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

/**
 * This interface lists all the endpoints of the group.
 * This can be overridden for the mock calls.
 */
public interface MerchantsApi {
    /**
     * Returns `Merchant` information for a given access token. If you don't know a `Merchant` ID,
     * you can use this endpoint to retrieve the merchant ID for an access token. You can specify
     * your personal access token to get your own merchant information or specify an OAuth token to
     * get the information for the merchant that granted you access. If you know the merchant ID,
     * you can also use the [RetrieveMerchant]($e/Merchants/RetrieveMerchant) endpoint to get the
     * merchant information.
     * @param  cursor  Optional parameter: The cursor generated by the previous response.
     * @return    Returns the ListMerchantsResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    ListMerchantsResponse listMerchants(
            final Integer cursor) throws ApiException, IOException;

    /**
     * Returns `Merchant` information for a given access token. If you don't know a `Merchant` ID,
     * you can use this endpoint to retrieve the merchant ID for an access token. You can specify
     * your personal access token to get your own merchant information or specify an OAuth token to
     * get the information for the merchant that granted you access. If you know the merchant ID,
     * you can also use the [RetrieveMerchant]($e/Merchants/RetrieveMerchant) endpoint to get the
     * merchant information.
     * @param  cursor  Optional parameter: The cursor generated by the previous response.
     * @return    Returns the ListMerchantsResponse response from the API call
     */
    CompletableFuture<ListMerchantsResponse> listMerchantsAsync(
            final Integer cursor);

    /**
     * Retrieve a `Merchant` object for the given `merchant_id`.
     * @param  merchantId  Required parameter: The ID of the merchant to retrieve. If the string
     *         "me" is supplied as the ID, then retrieve the merchant that is currently accessible
     *         to this call.
     * @return    Returns the RetrieveMerchantResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    RetrieveMerchantResponse retrieveMerchant(
            final String merchantId) throws ApiException, IOException;

    /**
     * Retrieve a `Merchant` object for the given `merchant_id`.
     * @param  merchantId  Required parameter: The ID of the merchant to retrieve. If the string
     *         "me" is supplied as the ID, then retrieve the merchant that is currently accessible
     *         to this call.
     * @return    Returns the RetrieveMerchantResponse response from the API call
     */
    CompletableFuture<RetrieveMerchantResponse> retrieveMerchantAsync(
            final String merchantId);

}