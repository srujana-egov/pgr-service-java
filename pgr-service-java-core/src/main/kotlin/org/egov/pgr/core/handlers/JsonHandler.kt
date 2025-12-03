@file:JvmName("JsonHandler")

package org.egov.pgr.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.egov.pgr.core.http.HttpResponse
import org.egov.pgr.core.http.HttpResponse.Handler
import org.egov.pgr.errors.PgrServiceInvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw PgrServiceInvalidDataException("Error reading response", e)
            }
    }
