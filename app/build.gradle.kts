@file:Suppress("UnstableApiUsage")

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.kyawlinnthant.gradledependenciesmanagement"
    compileSdk = AppConfig.compileSdk

    defaultConfig {
        applicationId = "com.kyawlinnthant.gradledependenciesmanagement"
        minSdk = AppConfig.minSdk
        targetSdk = AppConfig.targetSdk
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.composeCompiler
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Dependencies.coreKtx)
    implementation(Dependencies.lifecycleKtx)
    implementation(Dependencies.composeActivity)
    implementation(Dependencies.composeUi)
    implementation(Dependencies.composeTooling)
    implementation(Dependencies.material3)
    testImplementation(Dependencies.junitTest)
    androidTestImplementation(Dependencies.junitAndroid)
    androidTestImplementation(Dependencies.espresso)
    androidTestImplementation(Dependencies.composeTest)
    debugImplementation(Dependencies.composeTestDebug)
    debugImplementation(Dependencies.composeToolingDebug)
}
