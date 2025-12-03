// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import org.egov.pgr.core.ClientOptions
import org.egov.pgr.core.RequestOptions
import org.egov.pgr.core.http.HttpResponseFor
import org.egov.pgr.models.citizenservice.CitizenServiceCreateParams
import org.egov.pgr.models.citizenservice.CitizenServiceSearchParams
import org.egov.pgr.models.citizenservice.CitizenServiceUpdateParams
import org.egov.pgr.models.citizenservice.ServiceResponse
import org.egov.pgr.models.citizenservice.ServiceWrapper

interface CitizenServiceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CitizenServiceServiceAsync

    fun create(params: CitizenServiceCreateParams): CompletableFuture<ServiceResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CitizenServiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceResponse>

    /** @see create */
    fun create(
        serviceWrapper: ServiceWrapper,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceResponse> =
        create(
            CitizenServiceCreateParams.builder().serviceWrapper(serviceWrapper).build(),
            requestOptions,
        )

    /** @see create */
    fun create(serviceWrapper: ServiceWrapper): CompletableFuture<ServiceResponse> =
        create(serviceWrapper, RequestOptions.none())

    fun update(params: CitizenServiceUpdateParams): CompletableFuture<ServiceResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CitizenServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceResponse>

    /** @see update */
    fun update(
        serviceWrapper: ServiceWrapper,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceResponse> =
        update(
            CitizenServiceUpdateParams.builder().serviceWrapper(serviceWrapper).build(),
            requestOptions,
        )

    /** @see update */
    fun update(serviceWrapper: ServiceWrapper): CompletableFuture<ServiceResponse> =
        update(serviceWrapper, RequestOptions.none())

    fun search(): CompletableFuture<ServiceResponse> = search(CitizenServiceSearchParams.none())

    /** @see search */
    fun search(
        params: CitizenServiceSearchParams = CitizenServiceSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ServiceResponse>

    /** @see search */
    fun search(
        params: CitizenServiceSearchParams = CitizenServiceSearchParams.none()
    ): CompletableFuture<ServiceResponse> = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): CompletableFuture<ServiceResponse> =
        search(CitizenServiceSearchParams.none(), requestOptions)

    /**
     * A view of [CitizenServiceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CitizenServiceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /citizen-service/create`, but is otherwise the same
         * as [CitizenServiceServiceAsync.create].
         */
        fun create(
            params: CitizenServiceCreateParams
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CitizenServiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceResponse>>

        /** @see create */
        fun create(
            serviceWrapper: ServiceWrapper,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            create(
                CitizenServiceCreateParams.builder().serviceWrapper(serviceWrapper).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            serviceWrapper: ServiceWrapper
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            create(serviceWrapper, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /citizen-service/update`, but is otherwise the same
         * as [CitizenServiceServiceAsync.update].
         */
        fun update(
            params: CitizenServiceUpdateParams
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CitizenServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceResponse>>

        /** @see update */
        fun update(
            serviceWrapper: ServiceWrapper,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            update(
                CitizenServiceUpdateParams.builder().serviceWrapper(serviceWrapper).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            serviceWrapper: ServiceWrapper
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            update(serviceWrapper, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /citizen-service/search`, but is otherwise the same
         * as [CitizenServiceServiceAsync.search].
         */
        fun search(): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            search(CitizenServiceSearchParams.none())

        /** @see search */
        fun search(
            params: CitizenServiceSearchParams = CitizenServiceSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ServiceResponse>>

        /** @see search */
        fun search(
            params: CitizenServiceSearchParams = CitizenServiceSearchParams.none()
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            search(params, RequestOptions.none())

        /** @see search */
        fun search(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> =
            search(CitizenServiceSearchParams.none(), requestOptions)
    }
}
