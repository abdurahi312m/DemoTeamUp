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

rootProject.name = "DemoTeamUp"
include(":app")
include(":domain")
include(":data")
include(":core-ui")
include(":core-common")
include(":core-datastore")
include(":core-network")
include(":core-navigation")
include(":feature-auth")
include(":feature-home")
include(":feature-chat")
include(":feature-games")
include(":feature-notification")
include(":feature-onboarding")
include(":feature-rating")
include(":feature-settings")
include(":feature-splash")
include(":feature-teams")
