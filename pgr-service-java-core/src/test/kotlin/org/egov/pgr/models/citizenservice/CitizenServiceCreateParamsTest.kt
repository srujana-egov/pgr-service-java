// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import org.assertj.core.api.Assertions.assertThat
import org.egov.pgr.core.JsonValue
import org.junit.jupiter.api.Test

internal class CitizenServiceCreateParamsTest {

    @Test
    fun create() {
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
            .build()
    }

    @Test
    fun body() {
        val params =
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
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CitizenServiceCreateParams.builder()
                .serviceWrapper(ServiceWrapper.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ServiceWrapper.builder().build())
    }
}
