package com.dev.pariisa.dota2.dependencies

object Dependencies {

    object CommonLibs {
        const val corKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val material = "com.google.android.material:material:${Versions.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val navigationFragmentKtx =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigationComponent}"
        const val navigationUiKtx =
            "androidx.navigation:navigation-ui-ktx:${Versions.navigationComponent}"
        const val recycler = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
        const val cardView = "androidx.cardview:cardview:${Versions.cardView}"
        const val preference = "androidx.preference:preference:${Versions.preference}"
        const val indicator = "com.romandanylyk:pageindicatorview:${Versions.pagingIndicatorView}"
        const val legacy = "androidx.legacy:legacy-support-v4:${Versions.legacy}"
        const val multiDex = "androidx.multidex:multidex:${Versions.multidex}"

        const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxJavaAndroid}"

        const val coroutines =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
        const val coroutinesAndroid =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        const val coroutineAdapter =
            "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-experimental-adapter:${Versions.coroutinesAdapter}"

        const val lifeCycleRun = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifeCycle}"
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifeCycle}"
        const val lifecycleLivedata =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifeCycle}"
        const val lifeCycleExt = "androidx.lifecycle:lifecycle-extensions:${Versions.lifeCycle}"
        const val lifeCycleKapt = "androidx.lifecycle:lifecycle-compiler:${Versions.lifeCycle}"
        const val paging = "androidx.paging:paging-runtime-ktx:${Versions.paging}"

        const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
        const val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
        const val daggerAndroid = "com.google.dagger:dagger-android:${Versions.dagger}"
        const val daggerAndroidSupoort =
            "com.google.dagger:dagger-android-support:${Versions.dagger}"
        const val daggerAndroidCompiler =
            "com.google.dagger:dagger-android-processor:${Versions.dagger}"
        const val daggerProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"

        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
        const val hiltViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltViewModel}"
        const val hiltViewModelKapt = "androidx.hilt:hilt-compiler:${Versions.hiltViewModel}"

        const val gson = "com.google.code.gson:gson:${Versions.gson}"
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
        const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
        const val retrofitRx = "com.squareup.retrofit2:adapter-rxjava2:2.6.2"
        const val kotlinSerialConverter =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:${Versions.kotlinConverter}"
        const val jsonSerialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.jsonSerialization}"

        const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
        const val stetho_OkHttp = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
        const val picasso = "com.squareup.picasso:picasso:${Versions.picasso}"
        const val coil = "io.coil-kt:coil-compose:${Versions.coil}"

        const val dataStore = "androidx.datastore:datastore-preferences:${Versions.dataStore}"

        const val room = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomRx = "androidx.room:room-rxjava2:${Versions.room}"
        const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
        const val roomGuava = "androidx.room:room-guava:${Versions.room}"
        const val roomTest = "androidx.room:room-testing:${Versions.room}"

        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    }

    object TestLibs {
        const val junit = "junit:junit:${Versions.junit}"
        const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
        const val testRunner = "androidx.test:runner:${Versions.testRunner}"
        const val mockitoKotlin = "com.nhaarman:mockito-kotlin-kt1.1:${Versions.mockitoKotlin}"
        const val extJUnit = "androidx.test.ext:junit:1.1.2"
        const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    }
}