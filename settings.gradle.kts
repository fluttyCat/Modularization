pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Dota2"
include(":app")
include(":core")
include(":constants")
include(":hero")
include(":hero:hero-datasource")
include(":hero:hero-datasource-test")
include(":hero:hero-domain")
include(":hero:hero-interactors")
include(":hero:ui-heroList")
include(":hero:ui-heroDetail")
include(":components")
