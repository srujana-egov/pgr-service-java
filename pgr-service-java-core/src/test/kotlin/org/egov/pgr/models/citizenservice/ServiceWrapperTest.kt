// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.egov.pgr.core.JsonValue
import org.egov.pgr.core.jsonMapper
import org.junit.jupiter.api.Test

internal class ServiceWrapperTest {

    @Test
    fun create() {
        val serviceWrapper =
            ServiceWrapper.builder()
                .service(
                    CitizenService.builder()
                        .accountId("accountId")
                        .action("action")
                        .address(
                            CitizenService.Address.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address("address")
                                .addressLine2("addressLine2")
                                .auditDetails(
                                    AuditDetails.builder()
                                        .createdBy("createdBy")
                                        .createdTime(0L)
                                        .lastModifiedBy("lastModifiedBy")
                                        .lastModifiedTime(0L)
                                        .build()
                                )
                                .city("city")
                                .latitude(0.0)
                                .longitude(0.0)
                                .pincode("pincode")
                                .serviceRequestId("serviceRequestId")
                                .build()
                        )
                        .applicationStatus("applicationStatus")
                        .auditDetails(
                            AuditDetails.builder()
                                .createdBy("createdBy")
                                .createdTime(0L)
                                .lastModifiedBy("lastModifiedBy")
                                .lastModifiedTime(0L)
                                .build()
                        )
                        .boundaryCode("boundaryCode")
                        .boundaryValid(true)
                        .description("description")
                        .email("email")
                        .fileStoreId("fileStoreId")
                        .fileValid(true)
                        .mobile("mobile")
                        .processId("processId")
                        .serviceCode("serviceCode")
                        .serviceRequestId("serviceRequestId")
                        .source("source")
                        .tenantId("tenantId")
                        .workflowInstanceId("workflowInstanceId")
                        .build()
                )
                .workflow(JsonValue.from(mapOf<String, Any>()))
                .build()

        assertThat(serviceWrapper.service())
            .contains(
                CitizenService.builder()
                    .accountId("accountId")
                    .action("action")
                    .address(
                        CitizenService.Address.builder()
                            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .address("address")
                            .addressLine2("addressLine2")
                            .auditDetails(
                                AuditDetails.builder()
                                    .createdBy("createdBy")
                                    .createdTime(0L)
                                    .lastModifiedBy("lastModifiedBy")
                                    .lastModifiedTime(0L)
                                    .build()
                            )
                            .city("city")
                            .latitude(0.0)
                            .longitude(0.0)
                            .pincode("pincode")
                            .serviceRequestId("serviceRequestId")
                            .build()
                    )
                    .applicationStatus("applicationStatus")
                    .auditDetails(
                        AuditDetails.builder()
                            .createdBy("createdBy")
                            .createdTime(0L)
                            .lastModifiedBy("lastModifiedBy")
                            .lastModifiedTime(0L)
                            .build()
                    )
                    .boundaryCode("boundaryCode")
                    .boundaryValid(true)
                    .description("description")
                    .email("email")
                    .fileStoreId("fileStoreId")
                    .fileValid(true)
                    .mobile("mobile")
                    .processId("processId")
                    .serviceCode("serviceCode")
                    .serviceRequestId("serviceRequestId")
                    .source("source")
                    .tenantId("tenantId")
                    .workflowInstanceId("workflowInstanceId")
                    .build()
            )
        assertThat(serviceWrapper._workflow()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val serviceWrapper =
            ServiceWrapper.builder()
                .service(
                    CitizenService.builder()
                        .accountId("accountId")
                        .action("action")
                        .address(
                            CitizenService.Address.builder()
                                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                                .address("address")
                                .addressLine2("addressLine2")
                                .auditDetails(
                                    AuditDetails.builder()
                                        .createdBy("createdBy")
                                        .createdTime(0L)
                                        .lastModifiedBy("lastModifiedBy")
                                        .lastModifiedTime(0L)
                                        .build()
                                )
                                .city("city")
                                .latitude(0.0)
                                .longitude(0.0)
                                .pincode("pincode")
                                .serviceRequestId("serviceRequestId")
                                .build()
                        )
                        .applicationStatus("applicationStatus")
                        .auditDetails(
                            AuditDetails.builder()
                                .createdBy("createdBy")
                                .createdTime(0L)
                                .lastModifiedBy("lastModifiedBy")
                                .lastModifiedTime(0L)
                                .build()
                        )
                        .boundaryCode("boundaryCode")
                        .boundaryValid(true)
                        .description("description")
                        .email("email")
                        .fileStoreId("fileStoreId")
                        .fileValid(true)
                        .mobile("mobile")
                        .processId("processId")
                        .serviceCode("serviceCode")
                        .serviceRequestId("serviceRequestId")
                        .source("source")
                        .tenantId("tenantId")
                        .workflowInstanceId("workflowInstanceId")
                        .build()
                )
                .workflow(JsonValue.from(mapOf<String, Any>()))
                .build()

        val roundtrippedServiceWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(serviceWrapper),
                jacksonTypeRef<ServiceWrapper>(),
            )

        assertThat(roundtrippedServiceWrapper).isEqualTo(serviceWrapper)
    }
}
