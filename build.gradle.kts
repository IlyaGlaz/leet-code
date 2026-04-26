import org.gradle.kotlin.dsl.test
import org.gradle.kotlin.dsl.testImplementation

plugins {
    kotlin("jvm") version "1.9.25"
}

group = "ru.iglaz"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
