package com.pgr_service.api.errors

class PgrServiceInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) :
    PgrServiceException(message, cause)
