// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.egov.pgr.client.PgrServiceClient
import org.egov.pgr.client.okhttp.PgrServiceOkHttpClient
import org.egov.pgr.core.JsonValue
import org.egov.pgr.core.http.Headers
import org.egov.pgr.core.jsonMapper
import org.egov.pgr.errors.BadRequestException
import org.egov.pgr.errors.InternalServerException
import org.egov.pgr.errors.NotFoundException
import org.egov.pgr.errors.PermissionDeniedException
import org.egov.pgr.errors.PgrServiceException
import org.egov.pgr.errors.RateLimitException
import org.egov.pgr.errors.UnauthorizedException
import org.egov.pgr.errors.UnexpectedStatusCodeException
import org.egov.pgr.errors.UnprocessableEntityException
import org.egov.pgr.models.citizenservice.AuditDetails
import org.egov.pgr.models.citizenservice.CitizenService
import org.egov.pgr.models.citizenservice.ServiceWrapper
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: PgrServiceClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PgrServiceOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiKey("My API Key")
                .build()
    }

    @Test
    fun citizenServiceCreate400() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate400WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate401() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate401WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate403() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate403WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate404() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate404WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate422() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate422WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate429() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate429WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate500() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate500WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate999() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreate999WithRawResponse() {
        val citizenServiceService = client.citizenService().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                citizenServiceService.create(
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun citizenServiceCreateInvalidJsonBody() {
        val citizenServiceService = client.citizenService()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<PgrServiceException> {
                citizenServiceService.create(
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
