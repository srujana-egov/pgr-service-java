// File generated from our OpenAPI spec by Stainless.

package com.pgr_service.api.client

import com.pgr_service.api.core.ClientOptions
import com.pgr_service.api.core.getPackageVersion
import com.pgr_service.api.services.async.CitizenServiceServiceAsync
import com.pgr_service.api.services.async.CitizenServiceServiceAsyncImpl
import java.util.function.Consumer

class PgrServiceClientAsyncImpl(private val clientOptions: ClientOptions) : PgrServiceClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: PgrServiceClient by lazy { PgrServiceClientImpl(clientOptions) }

    private val withRawResponse: PgrServiceClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val citizenService: CitizenServiceServiceAsync by lazy {
        CitizenServiceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): PgrServiceClient = sync

    override fun withRawResponse(): PgrServiceClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PgrServiceClientAsync =
        PgrServiceClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun citizenService(): CitizenServiceServiceAsync = citizenService

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PgrServiceClientAsync.WithRawResponse {

        private val citizenService: CitizenServiceServiceAsync.WithRawResponse by lazy {
            CitizenServiceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PgrServiceClientAsync.WithRawResponse =
            PgrServiceClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun citizenService(): CitizenServiceServiceAsync.WithRawResponse = citizenService
    }
}
