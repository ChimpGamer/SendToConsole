plugins {
    kotlin("jvm") version "1.7.20"
}

group = "nl.chimpgamer.sendtoconsole"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    implementation(kotlin("test"))

    compileOnly("io.papermc.paper:paper-api:1.19.2-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "17"
    }

    processResources {
        expand("version" to project.version)
    }
}