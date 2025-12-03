plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("PGR (Public Grievance Redressal) Service API")
                description.set("API for managing citizen service requests")
                url.set("https://digit-lts.digit.org")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Pgr Service")
                        email.set("pgr-api-support@example.org")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/pgr-service-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/pgr-service-java.git")
                    url.set("https://github.com/stainless-sdks/pgr-service-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
