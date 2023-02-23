object VersionApp {
    //Sdk
    const val compileSdkVersion = 31
    const val targetSdkVersion = 31
    const val minSdkVersion = 23

    //Kotlin
    const val kotlinVersion = "1.5.31"

    //Graphics
    const val renderscriptVersion = 21

    //Classpath libraries
    const val androidGradlePluginVersion = "7.0.3"
    const val googleServicesGradlePluginVersion = "4.3.10"
    const val dexguardGradlePluginVersion = "1.3.12"
    const val jsoupVersion = "1.14.3"
    const val playPublisherVersion = "3.6.0"
    const val galleryPublisherVersion = "1.0.0"
    const val bciGradlePluginVersion = "2.0"

    //Android libraries
    const val xActivityVersion = "1.4.0"
    const val xFragmentVersion = "1.4.0"
    const val appCompatVersion = "1.4.1"
    const val exifinterfaceVersion = "1.3.3"
    const val mediaVersion = "1.5.0"
    const val vectorDrawableVersion = "1.1.0"
    const val annotationVersion = "1.3.0"
    const val xBiometricVersion = "1.1.0"
    const val materialVersion = "1.5.0"
    const val coreKtxVersion = "1.7.0"
    const val legacyVersion = "1.0.0"
    const val cardViewVersion = "1.0.0"
    const val constraintVersion = "2.1.3"
    const val googleAnalyticsVersion = "18.0.1"
    const val firebaseVersion = "23.0.0"
    const val firebaseIidVersion = "21.1.0"
    const val safetynetVersion = "18.0.1"
    const val navComponentVersion = "2.4.1"

    //Third party libraries A to Z
    const val androidanimationsVersion = "2.4"
    const val androidImageCropperVersion = "2.8.0"
    const val butterKnifeVersion = "10.2.3"
    const val circleindicatorVersion = "2.1.6"
    const val commonsLang3 = "3.12.0"
    const val coroutinesVersion = "1.6.1"
    const val daggerVersion = "2.40.5"
    const val dynatraceVersion = "8.231.2.1007"
    const val easingVersion = "2.4"
    const val ednJavaVersion = "0.7.1"
    const val epoxyVersion = "4.6.4"
    const val eventBusVersion = "3.3.1"
    const val gsonVersion = "2.9.0"
    const val lifecycleVersion = "2.4.1"
    const val lifecycleExtensionVersion = "2.2.0"
    const val lottieVersion = "4.2.2"
    const val lombokVersion = "1.18.22"
    const val mirrajabiJsonMockVersion = "1.1.1"
    const val okhttpVersion = "4.9.3"
    const val parcelerApiVersion = "1.1.13"
    const val picassoVersion = "2.8"
    const val reboundFacebookVersion = "0.3.8"
    const val retrofitVersion = "2.9.0"
    const val scottyabRootVersion = "0.1.0"
    const val shimmerLayoutVersion = "2.1.0"
    const val skeletonVersion = "1.1.0"
    const val timberVersion = "5.0.1"
    const val topsnackbarVersion = "1.1.1"
    const val glideVersion = "4.13.2"
    const val usabillaVersion = "7.4.0"
    const val pdfViewerVersion = "2.8.2"
    const val expandableRecyclerviewVersion = "1.3"
    const val androidChart = "v3.0.3"
    const val prismaVersion = "1.1.10"
    const val flexboxVersion = "2.0.1"
    const val jacocoVersion = "0.8.7"
    const val hiltVersion = "2.38.1"

    //Unit Testing
    const val robolectricVersion = "4.7.3"
    const val junitVersion = "4.13.2"
    const val mockitoVersion = "4.3.1"
    const val mockitoKtVersion = "2.2.0"
    const val truthVersion = "1.1.3"
    const val mockkVersion = "1.12.2"
    const val testCoreVersion = "1.4.0"
    const val testRunnerVersion = "1.4.0"
    const val testRulesVersion = "1.4.0"

    //Acceptance Testing
    const val assertjVersion = "1.2.0"
    const val espressoVersion = "3.4.0"
    const val espressoContribVersion = "3.4.0"
    const val espressoResourceVersion = "3.4.0"
    const val hamcrestVersion = "1.3"

    const val daggerMockVersion = "0.8.4"
    const val xCoreTesting = "2.1.0"
    const val roomVersion = "2.4.1"
    const val huaweiPushVersion = "6.3.0.302"

    //Development
    const val leakCanaryVersion = "2.8.1"

}

object ApplicationModules {
    const val ugCore = "com.amarturelo.usersgithub.android:core:1.0.6-SNAPSHOT"
    const val ugFollowers = "com.amarturelo.usersgithub.android:followers:1.0.2-SNAPSHOT"
}

object ClasspathDependencies {
    const val navComponentSafeVarargs =
        "androidx.navigation:navigation-safe-args-gradle-plugin:${VersionApp.navComponentVersion}"
    const val jacocoPlugin = "org.jacoco:org.jacoco.core:${VersionApp.jacocoVersion}"
    const val hiltPlugin = "com.google.dagger:hilt-android-gradle-plugin:${VersionApp.hiltVersion}"

    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${VersionApp.kotlinVersion}"
    const val androidGradlePlugin =
        "com.android.tools.build:gradle:${VersionApp.androidGradlePluginVersion}"
}

object ApplicationDependencies {
    const val coroutinesCore =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${VersionApp.coroutinesVersion}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${VersionApp.coroutinesVersion}"

    const val hiltAndroid = "com.google.dagger:hilt-android:${VersionApp.hiltVersion}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${VersionApp.hiltVersion}"

    const val dagger = "com.google.dagger:dagger:${VersionApp.daggerVersion}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${VersionApp.daggerVersion}"
    const val daggerSupport = "com.google.dagger:dagger-android-support:${VersionApp.daggerVersion}"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:${VersionApp.daggerVersion}"
    const val daggerAdroidProcessor =
        "com.google.dagger:dagger-android-processor:${VersionApp.daggerVersion}"
    const val timber = "com.jakewharton.timber:timber:${VersionApp.timberVersion}"
    const val okhttp3 = "com.squareup.okhttp3:okhttp:${VersionApp.okhttpVersion}"
    const val okhttp3LoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${VersionApp.okhttpVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${VersionApp.retrofitVersion}"

    const val lifecycleViewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${VersionApp.lifecycleVersion}"
    const val lifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${VersionApp.lifecycleVersion}"
    const val lifecycleLivedata =
        "androidx.lifecycle:lifecycle-livedata-ktx:${VersionApp.lifecycleVersion}"


    const val kotlinStdLib =
        "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${VersionApp.kotlinVersion}"
    const val androidAnimations =
        "com.daimajia.androidanimations:library:${VersionApp.androidanimationsVersion}@aar"
    const val androidImageCropper =
        "com.theartofdev.edmodo:android-image-cropper:${VersionApp.androidImageCropperVersion}"

    const val androidAnnotations =
        "androidx.annotation:annotation:${VersionApp.annotationVersion}"
    const val xActivity = "androidx.activity:activity-ktx:${VersionApp.xActivityVersion}"
    const val xAppCompat = "androidx.appcompat:appcompat:${VersionApp.appCompatVersion}"
    const val xConstraintLayout =
        "androidx.constraintlayout:constraintlayout:${VersionApp.constraintVersion}"
    const val xEspressoIdlingRes =
        "androidx.test.espresso:espresso-idling-resource:${VersionApp.espressoResourceVersion}"
    const val xExifinterface =
        "androidx.exifinterface:exifinterface:${VersionApp.exifinterfaceVersion}"
    const val xCardView = "androidx.cardview:cardview:${VersionApp.cardViewVersion}"
    const val xDesign = "com.google.android.material:material:${VersionApp.materialVersion}"
    const val xFragment = "androidx.fragment:fragment-ktx:${VersionApp.xFragmentVersion}"
    const val xLifecycleCommon =
        "androidx.lifecycle:lifecycle-common-java8:${VersionApp.lifecycleVersion}"

    const val xLifecycleViewmodel =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${VersionApp.lifecycleVersion}"
    const val xLifecycleRuntime =
        "androidx.lifecycle:lifecycle-runtime-ktx:${VersionApp.lifecycleVersion}"
    const val xLifecycleCompiler =
        "androidx.lifecycle:lifecycle-compiler:${VersionApp.lifecycleVersion}"
    const val xLifeData =
        "androidx.lifecycle:lifecycle-livedata-ktx:${VersionApp.lifecycleVersion}"
    const val xSupportMediaCompat = "androidx.media:media:${VersionApp.mediaVersion}"
    const val xSupportVectorDrawable =
        "androidx.vectordrawable:vectordrawable:${VersionApp.vectorDrawableVersion}"
    const val xRoomRuntime = "androidx.room:room-runtime:${VersionApp.roomVersion}"
    const val xRoomCompiler = "androidx.room:room-compiler:${VersionApp.roomVersion}"
    const val xCoreKtx = "androidx.core:core-ktx:${VersionApp.coreKtxVersion}"
    const val xNavComponentCommonKtx =
        "androidx.navigation:navigation-common-ktx:${VersionApp.navComponentVersion}"
    const val xNavComponentFragmentKtx =
        "androidx.navigation:navigation-fragment-ktx:${VersionApp.navComponentVersion}"
    const val xNavComponentUiKtx =
        "androidx.navigation:navigation-ui-ktx:${VersionApp.navComponentVersion}"

    const val daggerAndroidSupport =
        "com.google.dagger:dagger-android-support:${VersionApp.daggerVersion}"
    const val daggerAndroidProcessor =
        "com.google.dagger:dagger-android-processor:${VersionApp.daggerVersion}"
    const val epoxy = "com.airbnb.android:epoxy:${VersionApp.epoxyVersion}"
    const val epoxyProcessor = "com.airbnb.android:epoxy-processor:${VersionApp.epoxyVersion}"
    const val gson = "com.google.code.gson:gson:${VersionApp.gsonVersion}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${VersionApp.okhttpVersion}"
    const val okhttpLoggingInterceptor =
        "com.squareup.okhttp3:logging-interceptor:${VersionApp.okhttpVersion}"
    const val retrofitGson =
        "com.squareup.retrofit2:converter-gson:${VersionApp.retrofitVersion}"
    const val glide = "com.github.bumptech.glide:glide:${VersionApp.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${VersionApp.glideVersion}"
}

object UnitTestingDependencies {
    const val robolectric = "org.robolectric:robolectric:${VersionApp.robolectricVersion}"
    const val robolectricShadow =
        "org.robolectric:shadows-supportv4:${VersionApp.robolectricVersion}"
    const val xCoreTesting = "androidx.arch.core:core-testing:${VersionApp.xCoreTesting}"
    const val junit = "junit:junit:${VersionApp.junitVersion}"
    const val mockito = "org.mockito:mockito-core:${VersionApp.mockitoVersion}"
    const val mockitoInline = "org.mockito:mockito-inline:${VersionApp.mockitoVersion}"
    const val retrofitMock = "com.squareup.retrofit2:retrofit-mock:${VersionApp.retrofitVersion}"
    const val hamcrest = "org.hamcrest:hamcrest-library:${VersionApp.hamcrestVersion}"
    const val assertjAndroid = "com.squareup.assertj:assertj-android:${VersionApp.assertjVersion}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${VersionApp.okhttpVersion}"
    const val daggerMock =
        "com.github.fabioCollini.daggermock:daggermock:${VersionApp.daggerMockVersion}"
    const val truth = "com.google.truth:truth:${VersionApp.truthVersion}"
    const val testCore = "androidx.test:core:${VersionApp.testCoreVersion}"
    const val testRunner = "androidx.test:runner:${VersionApp.testRunnerVersion}"
    const val testRules = "androidx.test:rules:${VersionApp.testRulesVersion}"
    const val mockk = "io.mockk:mockk:${VersionApp.mockkVersion}"
    const val mockitoKotlin =
        "com.nhaarman.mockitokotlin2:mockito-kotlin:${VersionApp.mockitoKtVersion}"
}