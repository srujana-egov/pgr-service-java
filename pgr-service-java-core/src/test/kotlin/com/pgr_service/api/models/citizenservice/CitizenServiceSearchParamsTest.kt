// File generated from our OpenAPI spec by Stainless.

package com.pgr_service.api.models.citizenservice

import com.pgr_service.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
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
