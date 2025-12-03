// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import org.egov.pgr.core.ClientOptions
import org.egov.pgr.core.RequestOptions
import org.egov.pgr.core.http.HttpResponseFor
import org.egov.pgr.models.citizenservice.CitizenServiceCreateParams
import org.egov.pgr.models.citizenservice.CitizenServiceSearchParams
import org.egov.pgr.models.citizenservice.CitizenServiceUpdateParams
import org.egov.pgr.models.citizenservice.ServiceResponse
import org.egov.pgr.models.citizenservice.ServiceWrapper

interface CitizenServiceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CitizenServiceService

    fun create(params: CitizenServiceCreateParams): ServiceResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CitizenServiceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceResponse

    /** @see create */
    fun create(
        serviceWrapper: ServiceWrapper,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceResponse =
        create(
            CitizenServiceCreateParams.builder().serviceWrapper(serviceWrapper).build(),
            requestOptions,
        )

    /** @see create */
    fun create(serviceWrapper: ServiceWrapper): ServiceResponse =
        create(serviceWrapper, RequestOptions.none())

    fun update(params: CitizenServiceUpdateParams): ServiceResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CitizenServiceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceResponse

    /** @see update */
    fun update(
        serviceWrapper: ServiceWrapper,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceResponse =
        update(
            CitizenServiceUpdateParams.builder().serviceWrapper(serviceWrapper).build(),
            requestOptions,
        )

    /** @see update */
    fun update(serviceWrapper: ServiceWrapper): ServiceResponse =
        update(serviceWrapper, RequestOptions.none())

    fun search(): ServiceResponse = search(CitizenServiceSearchParams.none())

    /** @see search */
    fun search(
        params: CitizenServiceSearchParams = CitizenServiceSearchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ServiceResponse

    /** @see search */
    fun search(
        params: CitizenServiceSearchParams = CitizenServiceSearchParams.none()
    ): ServiceResponse = search(params, RequestOptions.none())

    /** @see search */
    fun search(requestOptions: RequestOptions): ServiceResponse =
        search(CitizenServiceSearchParams.none(), requestOptions)

    /**
     * A view of [CitizenServiceService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CitizenServiceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /citizen-service/create`, but is otherwise the same
         * as [CitizenServiceService.create].
         */
        @MustBeClosed
        fun create(params: CitizenServiceCreateParams): HttpResponseFor<ServiceResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CitizenServiceCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceResponse>

        /** @see create */
        @MustBeClosed
        fun create(
            serviceWrapper: ServiceWrapper,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceResponse> =
            create(
                CitizenServiceCreateParams.builder().serviceWrapper(serviceWrapper).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(serviceWrapper: ServiceWrapper): HttpResponseFor<ServiceResponse> =
            create(serviceWrapper, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /citizen-service/update`, but is otherwise the same
         * as [CitizenServiceService.update].
         */
        @MustBeClosed
        fun update(params: CitizenServiceUpdateParams): HttpResponseFor<ServiceResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CitizenServiceUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceResponse>

        /** @see update */
        @MustBeClosed
        fun update(
            serviceWrapper: ServiceWrapper,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceResponse> =
            update(
                CitizenServiceUpdateParams.builder().serviceWrapper(serviceWrapper).build(),
                requestOptions,
            )

        /** @see update */
        @MustBeClosed
        fun update(serviceWrapper: ServiceWrapper): HttpResponseFor<ServiceResponse> =
            update(serviceWrapper, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /citizen-service/search`, but is otherwise the same
         * as [CitizenServiceService.search].
         */
        @MustBeClosed
        fun search(): HttpResponseFor<ServiceResponse> = search(CitizenServiceSearchParams.none())

        /** @see search */
        @MustBeClosed
        fun search(
            params: CitizenServiceSearchParams = CitizenServiceSearchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ServiceResponse>

        /** @see search */
        @MustBeClosed
        fun search(
            params: CitizenServiceSearchParams = CitizenServiceSearchParams.none()
        ): HttpResponseFor<ServiceResponse> = search(params, RequestOptions.none())

        /** @see search */
        @MustBeClosed
        fun search(requestOptions: RequestOptions): HttpResponseFor<ServiceResponse> =
            search(CitizenServiceSearchParams.none(), requestOptions)
    }
}
