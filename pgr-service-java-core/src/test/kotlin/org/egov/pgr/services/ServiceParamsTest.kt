// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.egov.pgr.client.PgrServiceClient
import org.egov.pgr.client.okhttp.PgrServiceOkHttpClient
import org.egov.pgr.core.JsonValue
import org.egov.pgr.models.citizenservice.AuditDetails
import org.egov.pgr.models.citizenservice.CitizenService
import org.egov.pgr.models.citizenservice.CitizenServiceCreateParams
import org.egov.pgr.models.citizenservice.ServiceWrapper
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: PgrServiceClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PgrServiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val citizenServiceService = client.citizenService()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

        citizenServiceService.create(
            CitizenServiceCreateParams.builder()
                .serviceWrapper(
                    ServiceWrapper.builder()
                        .service(
                            CitizenService.builder()
                                .accountId("acc-10")
                                .action("CREATE")
                                .address(
                                    CitizenService.Address.builder()
                                        .id("addr-1")
                                        .address("10 MG Road")
                                        .addressLine2("Near Park")
                                        .auditDetails(
                                            AuditDetails.builder()
                                                .createdBy("system")
                                                .createdTime(1700000000000L)
                                                .lastModifiedBy("system")
                                                .lastModifiedTime(1700000000000L)
                                                .build()
                                        )
                                        .city("Hyderabad")
                                        .latitude(17.385)
                                        .longitude(78.4867)
                                        .pincode("500001")
                                        .serviceRequestId("sr-123")
                                        .build()
                                )
                                .applicationStatus("OPEN")
                                .auditDetails(
                                    AuditDetails.builder()
                                        .createdBy("createdBy")
                                        .createdTime(0L)
                                        .lastModifiedBy("lastModifiedBy")
                                        .lastModifiedTime(0L)
                                        .build()
                                )
                                .boundaryCode("BND01")
                                .boundaryValid(true)
                                .description("Streetlight not working")
                                .email("jai@example.com")
                                .fileStoreId("fileStoreId")
                                .fileValid(false)
                                .mobile("9999999999")
                                .processId("proc-1")
                                .serviceCode("PGR001")
                                .serviceRequestId("sr-123")
                                .source("citizen-app")
                                .tenantId("tenant-1")
                                .workflowInstanceId("wf-1")
                                .build()
                        )
                        .workflow(JsonValue.from(mapOf("instanceId" to "wf-123")))
                        .build()
                )
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
        )
    }
}
