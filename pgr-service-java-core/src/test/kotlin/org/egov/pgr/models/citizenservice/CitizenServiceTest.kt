// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.egov.pgr.core.jsonMapper
import org.junit.jupiter.api.Test

internal class CitizenServiceTest {

    @Test
    fun create() {
        val citizenService =
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

        assertThat(citizenService.accountId()).contains("accountId")
        assertThat(citizenService.action()).contains("action")
        assertThat(citizenService.address())
            .contains(
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
        assertThat(citizenService.applicationStatus()).contains("applicationStatus")
        assertThat(citizenService.auditDetails())
            .contains(
                AuditDetails.builder()
                    .createdBy("createdBy")
                    .createdTime(0L)
                    .lastModifiedBy("lastModifiedBy")
                    .lastModifiedTime(0L)
                    .build()
            )
        assertThat(citizenService.boundaryCode()).contains("boundaryCode")
        assertThat(citizenService.boundaryValid()).contains(true)
        assertThat(citizenService.description()).contains("description")
        assertThat(citizenService.email()).contains("email")
        assertThat(citizenService.fileStoreId()).contains("fileStoreId")
        assertThat(citizenService.fileValid()).contains(true)
        assertThat(citizenService.mobile()).contains("mobile")
        assertThat(citizenService.processId()).contains("processId")
        assertThat(citizenService.serviceCode()).contains("serviceCode")
        assertThat(citizenService.serviceRequestId()).contains("serviceRequestId")
        assertThat(citizenService.source()).contains("source")
        assertThat(citizenService.tenantId()).contains("tenantId")
        assertThat(citizenService.workflowInstanceId()).contains("workflowInstanceId")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val citizenService =
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

        val roundtrippedCitizenService =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(citizenService),
                jacksonTypeRef<CitizenService>(),
            )

        assertThat(roundtrippedCitizenService).isEqualTo(citizenService)
    }
}
