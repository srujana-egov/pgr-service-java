package org.egov.pgr.errors

open class PgrServiceException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)
