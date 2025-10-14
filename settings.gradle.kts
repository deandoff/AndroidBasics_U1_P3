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

rootProject.name = "Happy Birthday"
include(":app")
include(":composebasics")
include(":taskmanager")
include(":composequadrant")
include(":businesscardapp")
include(":diceroller")
include(":lemonade")
include(":affirmations")
include(":topics")
include(":woofapp")
include(":superheroesapp")
include(":a30daysapp")
include(":dessertclicker")
include(":unscramble")
