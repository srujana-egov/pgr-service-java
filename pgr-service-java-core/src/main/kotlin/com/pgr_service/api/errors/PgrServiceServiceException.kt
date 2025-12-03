// File generated from our OpenAPI spec by Stainless.

package com.pgr_service.api.errors

import com.pgr_service.api.core.JsonValue
import com.pgr_service.api.core.http.Headers

abstract class PgrServiceServiceException
protected constructor(message: String, cause: Throwable? = null) :
    PgrServiceException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
