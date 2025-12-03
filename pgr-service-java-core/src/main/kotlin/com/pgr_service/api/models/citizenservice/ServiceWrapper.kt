// File generated from our OpenAPI spec by Stainless.

package com.pgr_service.api.models.citizenservice

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.pgr_service.api.core.ExcludeMissing
import com.pgr_service.api.core.JsonField
import com.pgr_service.api.core.JsonMissing
import com.pgr_service.api.core.JsonValue
import com.pgr_service.api.errors.PgrServiceInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ServiceWrapper
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val service: JsonField<CitizenService>,
    private val workflow: JsonValue,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("service")
        @ExcludeMissing
        service: JsonField<CitizenService> = JsonMissing.of(),
        @JsonProperty("workflow") @ExcludeMissing workflow: JsonValue = JsonMissing.of(),
    ) : this(service, workflow, mutableMapOf())

    /**
     * Citizen service request with workflow tracking
     *
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun service(): Optional<CitizenService> = service.getOptional("service")

    /** External workflow instance reference */
    @JsonProperty("workflow") @ExcludeMissing fun _workflow(): JsonValue = workflow

    /**
     * Returns the raw JSON value of [service].
     *
     * Unlike [service], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("service") @ExcludeMissing fun _service(): JsonField<CitizenService> = service

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /** Returns a mutable builder for constructing an instance of [ServiceWrapper]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ServiceWrapper]. */
    class Builder internal constructor() {

        private var service: JsonField<CitizenService> = JsonMissing.of()
        private var workflow: JsonValue = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(serviceWrapper: ServiceWrapper) = apply {
            service = serviceWrapper.service
            workflow = serviceWrapper.workflow
            additionalProperties = serviceWrapper.additionalProperties.toMutableMap()
        }

        /** Citizen service request with workflow tracking */
        fun service(service: CitizenService) = service(JsonField.of(service))

        /**
         * Sets [Builder.service] to an arbitrary JSON value.
         *
         * You should usually call [Builder.service] with a well-typed [CitizenService] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun service(service: JsonField<CitizenService>) = apply { this.service = service }

        /** External workflow instance reference */
        fun workflow(workflow: JsonValue) = apply { this.workflow = workflow }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [ServiceWrapper].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ServiceWrapper =
            ServiceWrapper(service, workflow, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): ServiceWrapper = apply {
        if (validated) {
            return@apply
        }

        service().ifPresent { it.validate() }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: PgrServiceInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = (service.asKnown().getOrNull()?.validity() ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ServiceWrapper &&
            service == other.service &&
            workflow == other.workflow &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(service, workflow, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ServiceWrapper{service=$service, workflow=$workflow, additionalProperties=$additionalProperties}"
}
