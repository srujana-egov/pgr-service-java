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
import com.pgr_service.api.core.checkKnown
import com.pgr_service.api.core.toImmutable
import com.pgr_service.api.errors.PgrServiceInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class ServiceResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val services: JsonField<List<CitizenService>>,
    private val serviceWrappers: JsonField<List<ServiceWrapper>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("services")
        @ExcludeMissing
        services: JsonField<List<CitizenService>> = JsonMissing.of(),
        @JsonProperty("serviceWrappers")
        @ExcludeMissing
        serviceWrappers: JsonField<List<ServiceWrapper>> = JsonMissing.of(),
    ) : this(services, serviceWrappers, mutableMapOf())

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun services(): Optional<List<CitizenService>> = services.getOptional("services")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceWrappers(): Optional<List<ServiceWrapper>> =
        serviceWrappers.getOptional("serviceWrappers")

    /**
     * Returns the raw JSON value of [services].
     *
     * Unlike [services], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("services")
    @ExcludeMissing
    fun _services(): JsonField<List<CitizenService>> = services

    /**
     * Returns the raw JSON value of [serviceWrappers].
     *
     * Unlike [serviceWrappers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serviceWrappers")
    @ExcludeMissing
    fun _serviceWrappers(): JsonField<List<ServiceWrapper>> = serviceWrappers

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

        /** Returns a mutable builder for constructing an instance of [ServiceResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ServiceResponse]. */
    class Builder internal constructor() {

        private var services: JsonField<MutableList<CitizenService>>? = null
        private var serviceWrappers: JsonField<MutableList<ServiceWrapper>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(serviceResponse: ServiceResponse) = apply {
            services = serviceResponse.services.map { it.toMutableList() }
            serviceWrappers = serviceResponse.serviceWrappers.map { it.toMutableList() }
            additionalProperties = serviceResponse.additionalProperties.toMutableMap()
        }

        fun services(services: List<CitizenService>) = services(JsonField.of(services))

        /**
         * Sets [Builder.services] to an arbitrary JSON value.
         *
         * You should usually call [Builder.services] with a well-typed `List<CitizenService>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun services(services: JsonField<List<CitizenService>>) = apply {
            this.services = services.map { it.toMutableList() }
        }

        /**
         * Adds a single [CitizenService] to [services].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addService(service: CitizenService) = apply {
            services =
                (services ?: JsonField.of(mutableListOf())).also {
                    checkKnown("services", it).add(service)
                }
        }

        fun serviceWrappers(serviceWrappers: List<ServiceWrapper>) =
            serviceWrappers(JsonField.of(serviceWrappers))

        /**
         * Sets [Builder.serviceWrappers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceWrappers] with a well-typed
         * `List<ServiceWrapper>` value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun serviceWrappers(serviceWrappers: JsonField<List<ServiceWrapper>>) = apply {
            this.serviceWrappers = serviceWrappers.map { it.toMutableList() }
        }

        /**
         * Adds a single [ServiceWrapper] to [serviceWrappers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addServiceWrapper(serviceWrapper: ServiceWrapper) = apply {
            serviceWrappers =
                (serviceWrappers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("serviceWrappers", it).add(serviceWrapper)
                }
        }

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
         * Returns an immutable instance of [ServiceResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): ServiceResponse =
            ServiceResponse(
                (services ?: JsonMissing.of()).map { it.toImmutable() },
                (serviceWrappers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): ServiceResponse = apply {
        if (validated) {
            return@apply
        }

        services().ifPresent { it.forEach { it.validate() } }
        serviceWrappers().ifPresent { it.forEach { it.validate() } }
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
    @JvmSynthetic
    internal fun validity(): Int =
        (services.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (serviceWrappers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ServiceResponse &&
            services == other.services &&
            serviceWrappers == other.serviceWrappers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(services, serviceWrappers, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "ServiceResponse{services=$services, serviceWrappers=$serviceWrappers, additionalProperties=$additionalProperties}"
}
