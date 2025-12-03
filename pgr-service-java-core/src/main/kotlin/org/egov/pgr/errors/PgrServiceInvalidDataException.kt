package org.egov.pgr.errors

class PgrServiceInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    PgrServiceException(message, cause)
