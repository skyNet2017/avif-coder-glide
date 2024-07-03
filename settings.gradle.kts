pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven ("https://nexus.hss01248.tech/repository/maven-releases/")
    }
}

rootProject.name = "Avif GlideAppDecoder"
include(":app")
include(":avifglide")
