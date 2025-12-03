// File generated from our OpenAPI spec by Stainless.

package com.pgr_service.api.services.async

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
import com.pgr_service.api.core.prepareAsync
import com.pgr_service.api.models.citizenservice.CitizenServiceCreateParams
import com.pgr_service.api.models.citizenservice.CitizenServiceSearchParams
import com.pgr_service.api.models.citizenservice.CitizenServiceUpdateParams
import com.pgr_service.api.models.citizenservice.ServiceResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class CitizenServiceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CitizenServiceServiceAsync {

    private val withRawResponse: CitizenServiceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CitizenServiceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): CitizenServiceServiceAsync =
        CitizenServiceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: CitizenServiceCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceResponse> =
        // post /citizen-service/create
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CitizenServiceUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceResponse> =
        // post /citizen-service/update
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun search(
        params: CitizenServiceSearchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ServiceResponse> =
        // get /citizen-service/search
        withRawResponse().search(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CitizenServiceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CitizenServiceServiceAsync.WithRawResponse =
            CitizenServiceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ServiceResponse> =
            jsonHandler<ServiceResponse>(clientOptions.jsonMapper)

        override fun create(
            params: CitizenServiceCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("citizen-service", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<ServiceResponse> =
            jsonHandler<ServiceResponse>(clientOptions.jsonMapper)

        override fun update(
            params: CitizenServiceUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("citizen-service", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchHandler: Handler<ServiceResponse> =
            jsonHandler<ServiceResponse>(clientOptions.jsonMapper)

        override fun search(
            params: CitizenServiceSearchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ServiceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("citizen-service", "search")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
