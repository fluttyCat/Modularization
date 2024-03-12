package com.dev.pariisa.dota2.dependencies

object BuildPlugins {
    private const val androidBuildToolsVersion = "8.3.0"
    const val androidBuildTools = "com.android.tools.build:gradle:$androidBuildToolsVersion"

    const val kotlinGradlePlugin =
        "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"

    const val hiltAndroid = "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"

    const val sqlDelightGradlePlugin =
        "com.squareup.sqldelight:gradle-plugin:${Versions.sqDelight}"
}
