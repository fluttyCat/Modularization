import com.dev.pariisa.dota2.dependencies.BuildPlugins

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
    alias(libs.plugins.jetbrainsKotlinJvm) apply false
    alias(libs.plugins.androidLibrary) apply false
}
buildscript {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
    dependencies {
//        classpath(BuildPlugins.androidBuildTools)
//        classpath(BuildPlugins.kotlinGradlePlugin)
//        classpath(BuildPlugins.hiltAndroid)
//        classpath(BuildPlugins.sqlDelightGradlePlugin)
    }

    tasks.register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}