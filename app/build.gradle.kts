plugins {
  id("org.jetbrains.kotlin.jvm") version "1.9.22"

  application
  id("com.ncorti.ktfmt.gradle") version "0.17.0"
}

repositories { mavenCentral() }

dependencies {
  implementation("com.fasterxml.jackson.core:jackson-databind:2.16.1")
  implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.16.1")
  implementation("io.javalin:javalin:6.0.1")
  implementation("org.slf4j:slf4j-simple:2.0.12")

  testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
  testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
}

application { mainClass.set("bucket.quiz.AppKt") }

tasks.named<Test>("test") { useJUnitPlatform() }
