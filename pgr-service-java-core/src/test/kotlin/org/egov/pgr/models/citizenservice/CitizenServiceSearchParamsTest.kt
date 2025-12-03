// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import org.assertj.core.api.Assertions.assertThat
import org.egov.pgr.core.http.QueryParams
import org.junit.jupiter.api.Test

internal class CitizenServiceSearchParamsTest {

    @Test
    fun create() {
        CitizenServiceSearchParams.builder().serviceRequestId("serviceRequestId").build()
    }

    @Test
    fun queryParams() {
        val params =
            CitizenServiceSearchParams.builder().serviceRequestId("serviceRequestId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("serviceRequestId", "serviceRequestId").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CitizenServiceSearchParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
