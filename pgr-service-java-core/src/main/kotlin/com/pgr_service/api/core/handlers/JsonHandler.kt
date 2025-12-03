@file:JvmName("JsonHandler")

package com.pgr_service.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.pgr_service.api.core.http.HttpResponse
import com.pgr_service.api.core.http.HttpResponse.Handler
import com.pgr_service.api.errors.PgrServiceInvalidDataException

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
