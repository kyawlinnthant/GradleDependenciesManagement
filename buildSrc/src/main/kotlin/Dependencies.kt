object Dependencies {
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val lifecycleKtx = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleKtx}"
    const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    const val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    const val composeTooling = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
    const val material3 = "androidx.compose.material3:material3:${Versions.material3}"

    const val junitTest = "junit:junit:${Versions.unitJunit}"
    const val junitAndroid = "androidx.test.ext:junit:${Versions.androidJunit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    const val composeTest = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"
    const val composeToolingDebug = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    const val composeTestDebug = "androidx.compose.ui:ui-test-manifest:${Versions.compose}"


    //network
    const val retrofitV = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val retrofitCoroutines =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    const val localebro = "com.localebro:okhttpprofiler:${Versions.localebro}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"

    //feature A
    const val permission =
        "com.google.accompanist:accompanist-permissions:${Versions.accompanistPermissions}"
    const val cameraX = "androidx.camera:camera-core:${Versions.cameraX}"

    //feature C
    const val exoPlayer = "com.google.android.exoplayer:exoplayer:${Versions.exoPlayer}"

}