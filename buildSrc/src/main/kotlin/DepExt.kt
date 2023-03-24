import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.network() {
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.retrofitV
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.okhttp
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.gson
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.retrofitCoroutines
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.localebro
    )
    add(
        configurationName = "testImplementation",
        dependencyNotation = Dependencies.mockWebServer
    )
}

fun DependencyHandlerScope.featureA() {
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.permission
    )
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.cameraX
    )
}

fun DependencyHandlerScope.featureC() {
    add(
        configurationName = "implementation",
        dependencyNotation = Dependencies.exoPlayer
    )
}