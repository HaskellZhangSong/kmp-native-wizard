plugins {
    kotlin("multiplatform") version "2.0.21"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxArm64("native") { // on Linux
        // macosX64("native") { // on x86_64 macOS
        // macosArm64("native") { // on Apple Silicon macOS
        // mingwX64("native") { // on Windows
        binaries {
            sharedLib {
                baseName = "native" // on Linux and macOS
                // baseName = "libnative" // on Windows
            }
        }
    }
}

tasks.wrapper {
    gradleVersion = "8.5"
    distributionType = Wrapper.DistributionType.ALL
}