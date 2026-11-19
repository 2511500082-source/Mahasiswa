plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.a2511500082.myapplication"
    compileSdk {
        version = release(37)
    }

    //View Binding memungkinkan akses komponen UI dari XML layout
    //langsung melalui objek binding, tanpa findViewById()
    buildFeatures {
        viewBinding = true
    }

    defaultConfig {
        applicationId = "com.a2511500082.myapplication"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)

    //Retrofit & Gson
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    //Gson
    implementation("com.google.code.gson:gson:2.11.0")

    //OkHttp Logging
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")

    //Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-corotines-android:1.8.1")

    //Lifecycle
    implementation("androidx.lifecycle-routime-ktx:2.8.7")
}
