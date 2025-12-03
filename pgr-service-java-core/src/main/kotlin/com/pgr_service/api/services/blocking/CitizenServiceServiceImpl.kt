// File generated from our OpenAPI spec by Stainless.

package com.pgr_service.api.services.blocking

import com.pgr_service.api.core.ClientOptions
import com.pgr_service.api.core.RequestOptions
import com.pgr_service.api.core.handlers.errorBodyHandler
import com.pgr_service.api.core.handlers.errorHandler
import com.pgr_service.api.core.handlers.jsonHandler
import com.pgr_service.api.core.http.HttpMethod
import com.pgr_service.api.core.http.HttpRequest
import com.pgr_service.api.core.http.HttpResponse
import com.pgr_service.api.core.http.HttpResponse.Handler
import com.pgr_service.api.core.http.HttpResponseFor
import com.pgr_service.api.core.http.json
import com.pgr_service.api.core.http.parseable
import com.pgr_service.api.core.prepare
import com.pgr_service.api.models.citizenservice.CitizenServiceCreateParams
import com.pgr_service.api.models.citizenservice.CitizenServiceSearchParams
import com.pgr_service.api.models.citizenservice.CitizenServiceUpdateParams
import com.pgr_service.api.models.citizenservice.ServiceResponse
import java.util.function.Consumer

class CitizenServiceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CitizenServiceService {

    private val withRawResponse: CitizenServiceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CitizenServiceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CitizenServiceService =
        CitizenServiceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CitizenServiceCreateParams,
        requestOptions: RequestOptions,
    ): ServiceResponse =
        // post /citizen-service/create
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: CitizenServiceUpdateParams,
        requestOptions: RequestOptions,
    ): ServiceResponse =
        // post /citizen-service/update
        withRawResponse().update(params, requestOptions).parse()

    override fun search(
        params: CitizenServiceSearchParams,
        requestOptions: RequestOptions,
    ): ServiceResponse =
        // get /citizen-service/search
        withRawResponse().search(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CitizenServiceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CitizenServiceService.WithRawResponse =
            CitizenServiceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ServiceResponse> =
            jsonHandler<ServiceResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CitizenServiceCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("citizen-service", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<ServiceResponse> =
            jsonHandler<ServiceResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CitizenServiceUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("citizen-service", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val searchHandler: Handler<ServiceResponse> =
            jsonHandler<ServiceResponse>(clientOptions.jsonMapper)

        override fun search(
            params: CitizenServiceSearchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ServiceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("citizen-service", "search")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { searchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
