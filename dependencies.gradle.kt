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

    const val coroutinesVersion = "1.6.1"
    const val daggerVersion = "2.40.5"
    const val timberVersion = "5.0.1"

    const val okHttpVersion = "4.9.3"
    const val retrofitVersion = "2.9.0"

    const val coreVersion = "1.0.1-SNAPSHOT"
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


object MainApplicationDependencies {
    const val ugCore = "com.amarturelo.usersgithub.android:core:${VersionApp.coreVersion}"
}

object ApplicationDependencies {
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${VersionApp.coroutinesVersion}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${VersionApp.coroutinesVersion}"

    const val dagger = "com.google.dagger:dagger:${VersionApp.daggerVersion}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${VersionApp.daggerVersion}"
    const val daggerSupport = "com.google.dagger:dagger-android-support:${VersionApp.daggerVersion}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${VersionApp.daggerVersion}"
    const val daggerAdroidProcessor =
        "com.google.dagger:dagger-android-processor:${VersionApp.daggerVersion}"
    const val timber = "com.jakewharton.timber:timber:${VersionApp.timberVersion}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${VersionApp.okHttpVersion}"
    const val okhttp3LoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${VersionApp.okHttpVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${VersionApp.retrofitVersion}"
    const val gson = "com.squareup.retrofit2:converter-gson:${VersionApp.retrofitVersion}"


}