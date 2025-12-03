// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.services.blocking

import java.util.function.Consumer
import org.egov.pgr.core.ClientOptions
import org.egov.pgr.core.RequestOptions
import org.egov.pgr.core.handlers.errorBodyHandler
import org.egov.pgr.core.handlers.errorHandler
import org.egov.pgr.core.handlers.jsonHandler
import org.egov.pgr.core.http.HttpMethod
import org.egov.pgr.core.http.HttpRequest
import org.egov.pgr.core.http.HttpResponse
import org.egov.pgr.core.http.HttpResponse.Handler
import org.egov.pgr.core.http.HttpResponseFor
import org.egov.pgr.core.http.json
import org.egov.pgr.core.http.parseable
import org.egov.pgr.core.prepare
import org.egov.pgr.models.citizenservice.CitizenServiceCreateParams
import org.egov.pgr.models.citizenservice.CitizenServiceSearchParams
import org.egov.pgr.models.citizenservice.CitizenServiceUpdateParams
import org.egov.pgr.models.citizenservice.ServiceResponse

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
