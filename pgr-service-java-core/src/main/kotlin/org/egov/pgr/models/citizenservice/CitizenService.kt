// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.models.citizenservice

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import org.egov.pgr.core.ExcludeMissing
import org.egov.pgr.core.JsonField
import org.egov.pgr.core.JsonMissing
import org.egov.pgr.core.JsonValue
import org.egov.pgr.errors.PgrServiceInvalidDataException

/** Citizen service request with workflow tracking */
class CitizenService
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val accountId: JsonField<String>,
    private val action: JsonField<String>,
    private val address: JsonField<Address>,
    private val applicationStatus: JsonField<String>,
    private val auditDetails: JsonField<AuditDetails>,
    private val boundaryCode: JsonField<String>,
    private val boundaryValid: JsonField<Boolean>,
    private val description: JsonField<String>,
    private val email: JsonField<String>,
    private val fileStoreId: JsonField<String>,
    private val fileValid: JsonField<Boolean>,
    private val mobile: JsonField<String>,
    private val processId: JsonField<String>,
    private val serviceCode: JsonField<String>,
    private val serviceRequestId: JsonField<String>,
    private val source: JsonField<String>,
    private val tenantId: JsonField<String>,
    private val workflowInstanceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("accountId") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action") @ExcludeMissing action: JsonField<String> = JsonMissing.of(),
        @JsonProperty("address") @ExcludeMissing address: JsonField<Address> = JsonMissing.of(),
        @JsonProperty("applicationStatus")
        @ExcludeMissing
        applicationStatus: JsonField<String> = JsonMissing.of(),
        @JsonProperty("auditDetails")
        @ExcludeMissing
        auditDetails: JsonField<AuditDetails> = JsonMissing.of(),
        @JsonProperty("boundaryCode")
        @ExcludeMissing
        boundaryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("boundaryValid")
        @ExcludeMissing
        boundaryValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("description")
        @ExcludeMissing
        description: JsonField<String> = JsonMissing.of(),
        @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileStoreId")
        @ExcludeMissing
        fileStoreId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("fileValid") @ExcludeMissing fileValid: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("mobile") @ExcludeMissing mobile: JsonField<String> = JsonMissing.of(),
        @JsonProperty("processId") @ExcludeMissing processId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serviceCode")
        @ExcludeMissing
        serviceCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("serviceRequestId")
        @ExcludeMissing
        serviceRequestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("tenantId") @ExcludeMissing tenantId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workflowInstanceId")
        @ExcludeMissing
        workflowInstanceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        accountId,
        action,
        address,
        applicationStatus,
        auditDetails,
        boundaryCode,
        boundaryValid,
        description,
        email,
        fileStoreId,
        fileValid,
        mobile,
        processId,
        serviceCode,
        serviceRequestId,
        source,
        tenantId,
        workflowInstanceId,
        mutableMapOf(),
    )

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountId(): Optional<String> = accountId.getOptional("accountId")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun action(): Optional<String> = action.getOptional("action")

    /**
     * Address linked to a citizen service
     *
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun address(): Optional<Address> = address.getOptional("address")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun applicationStatus(): Optional<String> = applicationStatus.getOptional("applicationStatus")

    /**
     * Embedded audit metadata
     *
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun auditDetails(): Optional<AuditDetails> = auditDetails.getOptional("auditDetails")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boundaryCode(): Optional<String> = boundaryCode.getOptional("boundaryCode")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun boundaryValid(): Optional<Boolean> = boundaryValid.getOptional("boundaryValid")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun description(): Optional<String> = description.getOptional("description")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun email(): Optional<String> = email.getOptional("email")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileStoreId(): Optional<String> = fileStoreId.getOptional("fileStoreId")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileValid(): Optional<Boolean> = fileValid.getOptional("fileValid")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mobile(): Optional<String> = mobile.getOptional("mobile")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun processId(): Optional<String> = processId.getOptional("processId")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceCode(): Optional<String> = serviceCode.getOptional("serviceCode")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun serviceRequestId(): Optional<String> = serviceRequestId.getOptional("serviceRequestId")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = source.getOptional("source")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tenantId(): Optional<String> = tenantId.getOptional("tenantId")

    /**
     * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workflowInstanceId(): Optional<String> =
        workflowInstanceId.getOptional("workflowInstanceId")

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("accountId") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<String> = action

    /**
     * Returns the raw JSON value of [address].
     *
     * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<Address> = address

    /**
     * Returns the raw JSON value of [applicationStatus].
     *
     * Unlike [applicationStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("applicationStatus")
    @ExcludeMissing
    fun _applicationStatus(): JsonField<String> = applicationStatus

    /**
     * Returns the raw JSON value of [auditDetails].
     *
     * Unlike [auditDetails], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auditDetails")
    @ExcludeMissing
    fun _auditDetails(): JsonField<AuditDetails> = auditDetails

    /**
     * Returns the raw JSON value of [boundaryCode].
     *
     * Unlike [boundaryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boundaryCode")
    @ExcludeMissing
    fun _boundaryCode(): JsonField<String> = boundaryCode

    /**
     * Returns the raw JSON value of [boundaryValid].
     *
     * Unlike [boundaryValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("boundaryValid")
    @ExcludeMissing
    fun _boundaryValid(): JsonField<Boolean> = boundaryValid

    /**
     * Returns the raw JSON value of [description].
     *
     * Unlike [description], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * Returns the raw JSON value of [email].
     *
     * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

    /**
     * Returns the raw JSON value of [fileStoreId].
     *
     * Unlike [fileStoreId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileStoreId") @ExcludeMissing fun _fileStoreId(): JsonField<String> = fileStoreId

    /**
     * Returns the raw JSON value of [fileValid].
     *
     * Unlike [fileValid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("fileValid") @ExcludeMissing fun _fileValid(): JsonField<Boolean> = fileValid

    /**
     * Returns the raw JSON value of [mobile].
     *
     * Unlike [mobile], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mobile") @ExcludeMissing fun _mobile(): JsonField<String> = mobile

    /**
     * Returns the raw JSON value of [processId].
     *
     * Unlike [processId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("processId") @ExcludeMissing fun _processId(): JsonField<String> = processId

    /**
     * Returns the raw JSON value of [serviceCode].
     *
     * Unlike [serviceCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("serviceCode") @ExcludeMissing fun _serviceCode(): JsonField<String> = serviceCode

    /**
     * Returns the raw JSON value of [serviceRequestId].
     *
     * Unlike [serviceRequestId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("serviceRequestId")
    @ExcludeMissing
    fun _serviceRequestId(): JsonField<String> = serviceRequestId

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [tenantId].
     *
     * Unlike [tenantId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tenantId") @ExcludeMissing fun _tenantId(): JsonField<String> = tenantId

    /**
     * Returns the raw JSON value of [workflowInstanceId].
     *
     * Unlike [workflowInstanceId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("workflowInstanceId")
    @ExcludeMissing
    fun _workflowInstanceId(): JsonField<String> = workflowInstanceId

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

        /** Returns a mutable builder for constructing an instance of [CitizenService]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CitizenService]. */
    class Builder internal constructor() {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var action: JsonField<String> = JsonMissing.of()
        private var address: JsonField<Address> = JsonMissing.of()
        private var applicationStatus: JsonField<String> = JsonMissing.of()
        private var auditDetails: JsonField<AuditDetails> = JsonMissing.of()
        private var boundaryCode: JsonField<String> = JsonMissing.of()
        private var boundaryValid: JsonField<Boolean> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var email: JsonField<String> = JsonMissing.of()
        private var fileStoreId: JsonField<String> = JsonMissing.of()
        private var fileValid: JsonField<Boolean> = JsonMissing.of()
        private var mobile: JsonField<String> = JsonMissing.of()
        private var processId: JsonField<String> = JsonMissing.of()
        private var serviceCode: JsonField<String> = JsonMissing.of()
        private var serviceRequestId: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var tenantId: JsonField<String> = JsonMissing.of()
        private var workflowInstanceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(citizenService: CitizenService) = apply {
            accountId = citizenService.accountId
            action = citizenService.action
            address = citizenService.address
            applicationStatus = citizenService.applicationStatus
            auditDetails = citizenService.auditDetails
            boundaryCode = citizenService.boundaryCode
            boundaryValid = citizenService.boundaryValid
            description = citizenService.description
            email = citizenService.email
            fileStoreId = citizenService.fileStoreId
            fileValid = citizenService.fileValid
            mobile = citizenService.mobile
            processId = citizenService.processId
            serviceCode = citizenService.serviceCode
            serviceRequestId = citizenService.serviceRequestId
            source = citizenService.source
            tenantId = citizenService.tenantId
            workflowInstanceId = citizenService.workflowInstanceId
            additionalProperties = citizenService.additionalProperties.toMutableMap()
        }

        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        fun action(action: String) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<String>) = apply { this.action = action }

        /** Address linked to a citizen service */
        fun address(address: Address) = address(JsonField.of(address))

        /**
         * Sets [Builder.address] to an arbitrary JSON value.
         *
         * You should usually call [Builder.address] with a well-typed [Address] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun address(address: JsonField<Address>) = apply { this.address = address }

        fun applicationStatus(applicationStatus: String) =
            applicationStatus(JsonField.of(applicationStatus))

        /**
         * Sets [Builder.applicationStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.applicationStatus] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun applicationStatus(applicationStatus: JsonField<String>) = apply {
            this.applicationStatus = applicationStatus
        }

        /** Embedded audit metadata */
        fun auditDetails(auditDetails: AuditDetails) = auditDetails(JsonField.of(auditDetails))

        /**
         * Sets [Builder.auditDetails] to an arbitrary JSON value.
         *
         * You should usually call [Builder.auditDetails] with a well-typed [AuditDetails] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun auditDetails(auditDetails: JsonField<AuditDetails>) = apply {
            this.auditDetails = auditDetails
        }

        fun boundaryCode(boundaryCode: String) = boundaryCode(JsonField.of(boundaryCode))

        /**
         * Sets [Builder.boundaryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boundaryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun boundaryCode(boundaryCode: JsonField<String>) = apply {
            this.boundaryCode = boundaryCode
        }

        fun boundaryValid(boundaryValid: Boolean) = boundaryValid(JsonField.of(boundaryValid))

        /**
         * Sets [Builder.boundaryValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.boundaryValid] with a well-typed [Boolean] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun boundaryValid(boundaryValid: JsonField<Boolean>) = apply {
            this.boundaryValid = boundaryValid
        }

        fun description(description: String) = description(JsonField.of(description))

        /**
         * Sets [Builder.description] to an arbitrary JSON value.
         *
         * You should usually call [Builder.description] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        fun email(email: String) = email(JsonField.of(email))

        /**
         * Sets [Builder.email] to an arbitrary JSON value.
         *
         * You should usually call [Builder.email] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun email(email: JsonField<String>) = apply { this.email = email }

        fun fileStoreId(fileStoreId: String) = fileStoreId(JsonField.of(fileStoreId))

        /**
         * Sets [Builder.fileStoreId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileStoreId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileStoreId(fileStoreId: JsonField<String>) = apply { this.fileStoreId = fileStoreId }

        fun fileValid(fileValid: Boolean) = fileValid(JsonField.of(fileValid))

        /**
         * Sets [Builder.fileValid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileValid] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun fileValid(fileValid: JsonField<Boolean>) = apply { this.fileValid = fileValid }

        fun mobile(mobile: String) = mobile(JsonField.of(mobile))

        /**
         * Sets [Builder.mobile] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mobile] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mobile(mobile: JsonField<String>) = apply { this.mobile = mobile }

        fun processId(processId: String) = processId(JsonField.of(processId))

        /**
         * Sets [Builder.processId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.processId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun processId(processId: JsonField<String>) = apply { this.processId = processId }

        fun serviceCode(serviceCode: String) = serviceCode(JsonField.of(serviceCode))

        /**
         * Sets [Builder.serviceCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun serviceCode(serviceCode: JsonField<String>) = apply { this.serviceCode = serviceCode }

        fun serviceRequestId(serviceRequestId: String) =
            serviceRequestId(JsonField.of(serviceRequestId))

        /**
         * Sets [Builder.serviceRequestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.serviceRequestId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun serviceRequestId(serviceRequestId: JsonField<String>) = apply {
            this.serviceRequestId = serviceRequestId
        }

        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun tenantId(tenantId: String) = tenantId(JsonField.of(tenantId))

        /**
         * Sets [Builder.tenantId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tenantId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tenantId(tenantId: JsonField<String>) = apply { this.tenantId = tenantId }

        fun workflowInstanceId(workflowInstanceId: String) =
            workflowInstanceId(JsonField.of(workflowInstanceId))

        /**
         * Sets [Builder.workflowInstanceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workflowInstanceId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun workflowInstanceId(workflowInstanceId: JsonField<String>) = apply {
            this.workflowInstanceId = workflowInstanceId
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
         * Returns an immutable instance of [CitizenService].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): CitizenService =
            CitizenService(
                accountId,
                action,
                address,
                applicationStatus,
                auditDetails,
                boundaryCode,
                boundaryValid,
                description,
                email,
                fileStoreId,
                fileValid,
                mobile,
                processId,
                serviceCode,
                serviceRequestId,
                source,
                tenantId,
                workflowInstanceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CitizenService = apply {
        if (validated) {
            return@apply
        }

        accountId()
        action()
        address().ifPresent { it.validate() }
        applicationStatus()
        auditDetails().ifPresent { it.validate() }
        boundaryCode()
        boundaryValid()
        description()
        email()
        fileStoreId()
        fileValid()
        mobile()
        processId()
        serviceCode()
        serviceRequestId()
        source()
        tenantId()
        workflowInstanceId()
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
        (if (accountId.asKnown().isPresent) 1 else 0) +
            (if (action.asKnown().isPresent) 1 else 0) +
            (address.asKnown().getOrNull()?.validity() ?: 0) +
            (if (applicationStatus.asKnown().isPresent) 1 else 0) +
            (auditDetails.asKnown().getOrNull()?.validity() ?: 0) +
            (if (boundaryCode.asKnown().isPresent) 1 else 0) +
            (if (boundaryValid.asKnown().isPresent) 1 else 0) +
            (if (description.asKnown().isPresent) 1 else 0) +
            (if (email.asKnown().isPresent) 1 else 0) +
            (if (fileStoreId.asKnown().isPresent) 1 else 0) +
            (if (fileValid.asKnown().isPresent) 1 else 0) +
            (if (mobile.asKnown().isPresent) 1 else 0) +
            (if (processId.asKnown().isPresent) 1 else 0) +
            (if (serviceCode.asKnown().isPresent) 1 else 0) +
            (if (serviceRequestId.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (tenantId.asKnown().isPresent) 1 else 0) +
            (if (workflowInstanceId.asKnown().isPresent) 1 else 0)

    /** Address linked to a citizen service */
    class Address
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val address: JsonField<String>,
        private val addressLine2: JsonField<String>,
        private val auditDetails: JsonField<AuditDetails>,
        private val city: JsonField<String>,
        private val latitude: JsonField<Double>,
        private val longitude: JsonField<Double>,
        private val pincode: JsonField<String>,
        private val serviceRequestId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("addressLine2")
            @ExcludeMissing
            addressLine2: JsonField<String> = JsonMissing.of(),
            @JsonProperty("auditDetails")
            @ExcludeMissing
            auditDetails: JsonField<AuditDetails> = JsonMissing.of(),
            @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
            @JsonProperty("latitude")
            @ExcludeMissing
            latitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("longitude")
            @ExcludeMissing
            longitude: JsonField<Double> = JsonMissing.of(),
            @JsonProperty("pincode") @ExcludeMissing pincode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("serviceRequestId")
            @ExcludeMissing
            serviceRequestId: JsonField<String> = JsonMissing.of(),
        ) : this(
            id,
            address,
            addressLine2,
            auditDetails,
            city,
            latitude,
            longitude,
            pincode,
            serviceRequestId,
            mutableMapOf(),
        )

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun address(): Optional<String> = address.getOptional("address")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun addressLine2(): Optional<String> = addressLine2.getOptional("addressLine2")

        /**
         * Embedded audit metadata
         *
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun auditDetails(): Optional<AuditDetails> = auditDetails.getOptional("auditDetails")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun city(): Optional<String> = city.getOptional("city")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun latitude(): Optional<Double> = latitude.getOptional("latitude")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun longitude(): Optional<Double> = longitude.getOptional("longitude")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun pincode(): Optional<String> = pincode.getOptional("pincode")

        /**
         * @throws PgrServiceInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun serviceRequestId(): Optional<String> = serviceRequestId.getOptional("serviceRequestId")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [addressLine2].
         *
         * Unlike [addressLine2], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("addressLine2")
        @ExcludeMissing
        fun _addressLine2(): JsonField<String> = addressLine2

        /**
         * Returns the raw JSON value of [auditDetails].
         *
         * Unlike [auditDetails], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("auditDetails")
        @ExcludeMissing
        fun _auditDetails(): JsonField<AuditDetails> = auditDetails

        /**
         * Returns the raw JSON value of [city].
         *
         * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Returns the raw JSON value of [latitude].
         *
         * Unlike [latitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("latitude") @ExcludeMissing fun _latitude(): JsonField<Double> = latitude

        /**
         * Returns the raw JSON value of [longitude].
         *
         * Unlike [longitude], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("longitude") @ExcludeMissing fun _longitude(): JsonField<Double> = longitude

        /**
         * Returns the raw JSON value of [pincode].
         *
         * Unlike [pincode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("pincode") @ExcludeMissing fun _pincode(): JsonField<String> = pincode

        /**
         * Returns the raw JSON value of [serviceRequestId].
         *
         * Unlike [serviceRequestId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("serviceRequestId")
        @ExcludeMissing
        fun _serviceRequestId(): JsonField<String> = serviceRequestId

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

            /** Returns a mutable builder for constructing an instance of [Address]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Address]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var address: JsonField<String> = JsonMissing.of()
            private var addressLine2: JsonField<String> = JsonMissing.of()
            private var auditDetails: JsonField<AuditDetails> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var latitude: JsonField<Double> = JsonMissing.of()
            private var longitude: JsonField<Double> = JsonMissing.of()
            private var pincode: JsonField<String> = JsonMissing.of()
            private var serviceRequestId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(address: Address) = apply {
                id = address.id
                this.address = address.address
                addressLine2 = address.addressLine2
                auditDetails = address.auditDetails
                city = address.city
                latitude = address.latitude
                longitude = address.longitude
                pincode = address.pincode
                serviceRequestId = address.serviceRequestId
                additionalProperties = address.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

            /**
             * Sets [Builder.addressLine2] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressLine2] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun addressLine2(addressLine2: JsonField<String>) = apply {
                this.addressLine2 = addressLine2
            }

            /** Embedded audit metadata */
            fun auditDetails(auditDetails: AuditDetails) = auditDetails(JsonField.of(auditDetails))

            /**
             * Sets [Builder.auditDetails] to an arbitrary JSON value.
             *
             * You should usually call [Builder.auditDetails] with a well-typed [AuditDetails] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun auditDetails(auditDetails: JsonField<AuditDetails>) = apply {
                this.auditDetails = auditDetails
            }

            fun city(city: String) = city(JsonField.of(city))

            /**
             * Sets [Builder.city] to an arbitrary JSON value.
             *
             * You should usually call [Builder.city] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            fun latitude(latitude: Double) = latitude(JsonField.of(latitude))

            /**
             * Sets [Builder.latitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.latitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun latitude(latitude: JsonField<Double>) = apply { this.latitude = latitude }

            fun longitude(longitude: Double) = longitude(JsonField.of(longitude))

            /**
             * Sets [Builder.longitude] to an arbitrary JSON value.
             *
             * You should usually call [Builder.longitude] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun longitude(longitude: JsonField<Double>) = apply { this.longitude = longitude }

            fun pincode(pincode: String) = pincode(JsonField.of(pincode))

            /**
             * Sets [Builder.pincode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.pincode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun pincode(pincode: JsonField<String>) = apply { this.pincode = pincode }

            fun serviceRequestId(serviceRequestId: String) =
                serviceRequestId(JsonField.of(serviceRequestId))

            /**
             * Sets [Builder.serviceRequestId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.serviceRequestId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun serviceRequestId(serviceRequestId: JsonField<String>) = apply {
                this.serviceRequestId = serviceRequestId
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
             * Returns an immutable instance of [Address].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Address =
                Address(
                    id,
                    address,
                    addressLine2,
                    auditDetails,
                    city,
                    latitude,
                    longitude,
                    pincode,
                    serviceRequestId,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Address = apply {
            if (validated) {
                return@apply
            }

            id()
            address()
            addressLine2()
            auditDetails().ifPresent { it.validate() }
            city()
            latitude()
            longitude()
            pincode()
            serviceRequestId()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (address.asKnown().isPresent) 1 else 0) +
                (if (addressLine2.asKnown().isPresent) 1 else 0) +
                (auditDetails.asKnown().getOrNull()?.validity() ?: 0) +
                (if (city.asKnown().isPresent) 1 else 0) +
                (if (latitude.asKnown().isPresent) 1 else 0) +
                (if (longitude.asKnown().isPresent) 1 else 0) +
                (if (pincode.asKnown().isPresent) 1 else 0) +
                (if (serviceRequestId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Address &&
                id == other.id &&
                address == other.address &&
                addressLine2 == other.addressLine2 &&
                auditDetails == other.auditDetails &&
                city == other.city &&
                latitude == other.latitude &&
                longitude == other.longitude &&
                pincode == other.pincode &&
                serviceRequestId == other.serviceRequestId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                address,
                addressLine2,
                auditDetails,
                city,
                latitude,
                longitude,
                pincode,
                serviceRequestId,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Address{id=$id, address=$address, addressLine2=$addressLine2, auditDetails=$auditDetails, city=$city, latitude=$latitude, longitude=$longitude, pincode=$pincode, serviceRequestId=$serviceRequestId, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CitizenService &&
            accountId == other.accountId &&
            action == other.action &&
            address == other.address &&
            applicationStatus == other.applicationStatus &&
            auditDetails == other.auditDetails &&
            boundaryCode == other.boundaryCode &&
            boundaryValid == other.boundaryValid &&
            description == other.description &&
            email == other.email &&
            fileStoreId == other.fileStoreId &&
            fileValid == other.fileValid &&
            mobile == other.mobile &&
            processId == other.processId &&
            serviceCode == other.serviceCode &&
            serviceRequestId == other.serviceRequestId &&
            source == other.source &&
            tenantId == other.tenantId &&
            workflowInstanceId == other.workflowInstanceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            accountId,
            action,
            address,
            applicationStatus,
            auditDetails,
            boundaryCode,
            boundaryValid,
            description,
            email,
            fileStoreId,
            fileValid,
            mobile,
            processId,
            serviceCode,
            serviceRequestId,
            source,
            tenantId,
            workflowInstanceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CitizenService{accountId=$accountId, action=$action, address=$address, applicationStatus=$applicationStatus, auditDetails=$auditDetails, boundaryCode=$boundaryCode, boundaryValid=$boundaryValid, description=$description, email=$email, fileStoreId=$fileStoreId, fileValid=$fileValid, mobile=$mobile, processId=$processId, serviceCode=$serviceCode, serviceRequestId=$serviceRequestId, source=$source, tenantId=$tenantId, workflowInstanceId=$workflowInstanceId, additionalProperties=$additionalProperties}"
}
