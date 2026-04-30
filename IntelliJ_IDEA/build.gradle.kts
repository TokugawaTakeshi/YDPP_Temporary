plugins {
  id("java")
  id("org.jetbrains.kotlin.jvm") version "2.3.0"
  id("org.jetbrains.intellij.platform") version "2.10.2"
}

group = "com.yamatodaiwa"
version = "0.1.0"


repositories {
  mavenCentral()
  intellijPlatform {
    defaultRepositories()
  }
}


/* [ Reference ] https://plugins.jetbrains.com/docs/intellij/tools-intellij-platform-gradle-plugin.html */
dependencies {
  intellijPlatform {
    intellijIdeaUltimate("2026.1")
    testFramework(org.jetbrains.intellij.platform.gradle.TestFrameworkType.Platform)
    jetbrainsRuntime()
  }
}


intellijPlatform {

  pluginConfiguration {

    ideaVersion {
      sinceBuild = "252.25557"
    }

    changeNotes = """
      Initial version
    """.trimIndent()

  }

  instrumentCode = false
}


tasks {
  runIde {
    jvmArgs("-Dkotlinx.coroutines.debug=off")
    systemProperty("kotlinx.coroutines.debug", "off")
  }
  buildSearchableOptions {
    enabled = false
    jvmArgs("-Dkotlinx.coroutines.debug=off")
    systemProperty("kotlinx.coroutines.debug", "off")
  }
  withType<JavaCompile> {
    sourceCompatibility = "21"
    targetCompatibility = "21"
  }
}


kotlin {
  compilerOptions {
    jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
  }
}
