plugins {
    application
    wrapper
}

buildscript {
    dependencies {
        classpath("org.bouncycastle:bcprov-jdk18on:1.72")
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.BIN
    gradleVersion = "8.9"
    distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-bin.zip"
    distributionSha256Sum = "d725d707bfabd4dfdc958c624003b3c80accc03f7037b5122c4b1d0ef15cecab"
}
