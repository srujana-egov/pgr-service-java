@file:JvmName("StringHandler")

package org.egov.pgr.core.handlers

import org.egov.pgr.core.http.HttpResponse
import org.egov.pgr.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
