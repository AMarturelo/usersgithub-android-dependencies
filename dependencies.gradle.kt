object VersionApp {
    //Sdk
    const val compileSdkVersion = 31
    const val targetSdkVersion = 31
    const val minSdkVersion = 23

    //Kotlin
    const val kotlinVersion = "1.5.31"
    const val navComponentVersion = "2.4.1"
    const val androidGradlePluginVersion = "7.0.3"

    const val jacocoVersion = "7.0.3"
}

object ClasspathDependencies {
    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${VersionApp.kotlinVersion}"
    const val androidGradlePlugin =
        "com.android.tools.build:gradle:${VersionApp.androidGradlePluginVersion}"
    const val navComponentSafeVarargs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${VersionApp.navComponentVersion}"
    const val jacocoPuglin = "org.jacoco:org.jacoco.core:${VersionApp.jacocoVersion}"
}