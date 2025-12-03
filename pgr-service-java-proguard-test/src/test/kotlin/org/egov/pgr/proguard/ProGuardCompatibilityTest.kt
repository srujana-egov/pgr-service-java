// File generated from our OpenAPI spec by Stainless.

package org.egov.pgr.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.egov.pgr.client.okhttp.PgrServiceOkHttpClient
import org.egov.pgr.core.jsonMapper
import org.egov.pgr.models.citizenservice.AuditDetails
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/pgr-service-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = PgrServiceOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.citizenService()).isNotNull()
    }

    @Test
    fun auditDetailsRoundtrip() {
        val jsonMapper = jsonMapper()
        val auditDetails =
            AuditDetails.builder()
                .createdBy("createdBy")
                .createdTime(0L)
                .lastModifiedBy("lastModifiedBy")
                .lastModifiedTime(0L)
                .build()

        val roundtrippedAuditDetails =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(auditDetails),
                jacksonTypeRef<AuditDetails>(),
            )

        assertThat(roundtrippedAuditDetails).isEqualTo(auditDetails)
    }
}
