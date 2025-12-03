plugins {
    id("pgr-service.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":pgr-service-java"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :pgr-service-java-example:run` to run `Main`
    // Use `./gradlew :pgr-service-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.pgr_service.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
