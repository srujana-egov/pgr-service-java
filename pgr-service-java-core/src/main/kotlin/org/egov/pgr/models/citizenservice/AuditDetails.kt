// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import org.egov.pgr.core.ExcludeMissing
import org.egov.pgr.core.JsonField
import org.egov.pgr.core.JsonMissing
import org.egov.pgr.core.JsonValue
import org.egov.pgr.errors.PgrServiceInvalidDataException

/** Embedded audit metadata */
class AuditDetails
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdBy: JsonField<String>,
    private val createdTime: JsonField<Long>,
    private val lastModifiedBy: JsonField<String>,
    private val lastModifiedTime: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("createdBy") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("createdTime")
        @ExcludeMissing
        createdTime: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lastModifiedBy")
        @ExcludeMissing
        lastModifiedBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("lastModifiedTime")
        @ExcludeMissing
        lastModifiedTime: JsonField<Long> = JsonMissing.of(),
    ) : this(createdBy, createdTime, lastModifiedBy, lastModifiedTime, mutableMapOf())

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("createdBy")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdTime(): Optional<Long> = createdTime.getOptional("createdTime")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedBy(): Optional<String> = lastModifiedBy.getOptional("lastModifiedBy")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lastModifiedTime(): Optional<Long> = lastModifiedTime.getOptional("lastModifiedTime")

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdBy") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [createdTime].
     *
     * Unlike [createdTime], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("createdTime") @ExcludeMissing fun _createdTime(): JsonField<Long> = createdTime

    /**
     * Returns the raw JSON value of [lastModifiedBy].
     *
     * Unlike [lastModifiedBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lastModifiedBy")
    @ExcludeMissing
    fun _lastModifiedBy(): JsonField<String> = lastModifiedBy

    /**
     * Returns the raw JSON value of [lastModifiedTime].
     *
     * Unlike [lastModifiedTime], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("lastModifiedTime")
    @ExcludeMissing
    fun _lastModifiedTime(): JsonField<Long> = lastModifiedTime

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

        /** Returns a mutable builder for constructing an instance of [AuditDetails]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuditDetails]. */
    class Builder internal constructor() {

        private var createdBy: JsonField<String> = JsonMissing.of()
        private var createdTime: JsonField<Long> = JsonMissing.of()
        private var lastModifiedBy: JsonField<String> = JsonMissing.of()
        private var lastModifiedTime: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(auditDetails: AuditDetails) = apply {
            createdBy = auditDetails.createdBy
            createdTime = auditDetails.createdTime
            lastModifiedBy = auditDetails.lastModifiedBy
            lastModifiedTime = auditDetails.lastModifiedTime
            additionalProperties = auditDetails.additionalProperties.toMutableMap()
        }

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun createdTime(createdTime: Long) = createdTime(JsonField.of(createdTime))

        /**
         * Sets [Builder.createdTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdTime] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdTime(createdTime: JsonField<Long>) = apply { this.createdTime = createdTime }

        fun lastModifiedBy(lastModifiedBy: String) = lastModifiedBy(JsonField.of(lastModifiedBy))

        /**
         * Sets [Builder.lastModifiedBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedBy] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastModifiedBy(lastModifiedBy: JsonField<String>) = apply {
            this.lastModifiedBy = lastModifiedBy
        }

        fun lastModifiedTime(lastModifiedTime: Long) =
            lastModifiedTime(JsonField.of(lastModifiedTime))

        /**
         * Sets [Builder.lastModifiedTime] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lastModifiedTime] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun lastModifiedTime(lastModifiedTime: JsonField<Long>) = apply {
            this.lastModifiedTime = lastModifiedTime
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
         * Returns an immutable instance of [AuditDetails].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): AuditDetails =
            AuditDetails(
                createdBy,
                createdTime,
                lastModifiedBy,
                lastModifiedTime,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuditDetails = apply {
        if (validated) {
            return@apply
        }

        createdBy()
        createdTime()
        lastModifiedBy()
        lastModifiedTime()
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
        (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (createdTime.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedBy.asKnown().isPresent) 1 else 0) +
            (if (lastModifiedTime.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuditDetails &&
            createdBy == other.createdBy &&
            createdTime == other.createdTime &&
            lastModifiedBy == other.lastModifiedBy &&
            lastModifiedTime == other.lastModifiedTime &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdBy, createdTime, lastModifiedBy, lastModifiedTime, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuditDetails{createdBy=$createdBy, createdTime=$createdTime, lastModifiedBy=$lastModifiedBy, lastModifiedTime=$lastModifiedTime, additionalProperties=$additionalProperties}"
}
