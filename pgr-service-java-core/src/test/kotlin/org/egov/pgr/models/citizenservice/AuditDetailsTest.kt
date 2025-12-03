// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.egov.pgr.core.jsonMapper
import org.junit.jupiter.api.Test

internal class AuditDetailsTest {

    @Test
    fun create() {
        val auditDetails =
            AuditDetails.builder()
                .createdBy("createdBy")
                .createdTime(0L)
                .lastModifiedBy("lastModifiedBy")
                .lastModifiedTime(0L)
                .build()

        assertThat(auditDetails.createdBy()).contains("createdBy")
        assertThat(auditDetails.createdTime()).contains(0L)
        assertThat(auditDetails.lastModifiedBy()).contains("lastModifiedBy")
        assertThat(auditDetails.lastModifiedTime()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val auditDetails =
            AuditDetails.builder()
                .createdBy("createdBy")
                .createdTime(0L)
                .lastModifiedBy("lastModifiedBy")
                .lastModifiedTime(0L)
                .build()

        val roundtrippedAuditDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditDetails),
                jacksonTypeRef<AuditDetails>(),
            )

        assertThat(roundtrippedAuditDetails).isEqualTo(auditDetails)
    }
}
