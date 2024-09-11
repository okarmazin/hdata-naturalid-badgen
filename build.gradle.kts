plugins {
    kotlin("jvm") version "2.0.20"
    kotlin("plugin.jpa") version "2.0.20"
    kotlin("kapt") version "2.0.20"
}

group = "org.acme"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate.orm:hibernate-core:6.6.0.Final")
    implementation("jakarta.data:jakarta.data-api:1.0.0")

    kapt("org.hibernate.orm:hibernate-jpamodelgen:6.6.0.Final")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}