/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

dependencies {
    testImplementation(libs.junit.junit)
}

group = "com.example1"
version = "1.0-SNAPSHOT"
description = "MyMavenToGradle"
java.sourceCompatibility = JavaVersion.VERSION_17

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
tasks.named<Jar>("jar") {
    manifest {
        attributes["Main-Class"] = "com.example1.App"
    }
}

