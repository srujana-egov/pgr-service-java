// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.client

import java.util.function.Consumer
import org.egov.pgr.core.ClientOptions
import org.egov.pgr.core.getPackageVersion
import org.egov.pgr.services.blocking.CitizenServiceService
import org.egov.pgr.services.blocking.CitizenServiceServiceImpl

class PgrServiceClientImpl(private val clientOptions: ClientOptions) : PgrServiceClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: PgrServiceClientAsync by lazy { PgrServiceClientAsyncImpl(clientOptions) }

    private val withRawResponse: PgrServiceClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val citizenService: CitizenServiceService by lazy {
        CitizenServiceServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): PgrServiceClientAsync = async

    override fun withRawResponse(): PgrServiceClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PgrServiceClient =
        PgrServiceClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun citizenService(): CitizenServiceService = citizenService

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PgrServiceClient.WithRawResponse {

        private val citizenService: CitizenServiceService.WithRawResponse by lazy {
            CitizenServiceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PgrServiceClient.WithRawResponse =
            PgrServiceClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun citizenService(): CitizenServiceService.WithRawResponse = citizenService
    }
}
