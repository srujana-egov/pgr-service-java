// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.services.async

import org.egov.pgr.TestServerExtension
import org.egov.pgr.client.okhttp.PgrServiceOkHttpClientAsync
import org.egov.pgr.core.JsonValue
import org.egov.pgr.models.citizenservice.AuditDetails
import org.egov.pgr.models.citizenservice.CitizenService
import org.egov.pgr.models.citizenservice.CitizenServiceSearchParams
import org.egov.pgr.models.citizenservice.ServiceWrapper
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CitizenServiceServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            PgrServiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val citizenServiceServiceAsync = client.citizenService()

        val serviceResponseFuture =
            citizenServiceServiceAsync.create(
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

        val serviceResponse = serviceResponseFuture.get()
        serviceResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            PgrServiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val citizenServiceServiceAsync = client.citizenService()

        val serviceResponseFuture =
            citizenServiceServiceAsync.update(
                ServiceWrapper.builder()
                    .service(
                        CitizenService.builder()
                            .accountId("acc-10")
                            .action("UPDATE")
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
                            .applicationStatus("IN_PROGRESS")
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
                            .description("Streetlight not working - updated description")
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

        val serviceResponse = serviceResponseFuture.get()
        serviceResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun search() {
        val client =
            PgrServiceOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val citizenServiceServiceAsync = client.citizenService()

        val serviceResponseFuture =
            citizenServiceServiceAsync.search(
                CitizenServiceSearchParams.builder().serviceRequestId("serviceRequestId").build()
            )

        val serviceResponse = serviceResponseFuture.get()
        serviceResponse.validate()
    }
}
