plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.semnazri.cleanArchitecture"
    compileSdk = Deps.compileSDK

    defaultConfig {
        applicationId = "com.semnazri.cleanArchitecture"
        minSdk = Deps.minSDK
        targetSdk = Deps.compileSDK
        versionCode = Deps.versionCode
        versionName = Deps.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility =  JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation (Deps.AndroidX.ktxCore)
    implementation (Deps.AndroidX.appCompat)
    implementation (Deps.AndroidX.materialDesign)
    implementation (Deps.AndroidX.constraint)
    implementation (Deps.AndroidX.annotation)
    implementation (Deps.AndroidX.fragment)

    implementation (Deps.Retrofit.retrofitCore)
    implementation (Deps.Retrofit.gsonConverter)

    implementation (Deps.OkHttp3.okHttpCore)
    implementation (Deps.OkHttp3.okHttpInterceptor)

    implementation (Deps.Gson.gsonConverter)

    implementation (Deps.Glide.glideCore)
    annotationProcessor (Deps.Glide.glideAnotation)

    testImplementation ("junit:junit:4.13.2")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
}