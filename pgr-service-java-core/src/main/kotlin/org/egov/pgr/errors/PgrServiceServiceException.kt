// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.errors

import org.egov.pgr.core.JsonValue
import org.egov.pgr.core.http.Headers

abstract class PgrServiceServiceException
protected constructor(message: String, cause: Throwable? = null) :
    PgrServiceException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
