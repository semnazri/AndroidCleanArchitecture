object Deps {
    const val compileSDK = 33
    const val minSDK = 24
    const val versionCode = 1
    const val versionName = "1.0.0"

    object Glide {
        const val glideCore = "com.github.bumptech.glide:glide:${Version.glideVersion}"
        const val glideAnotation = "com.github.bumptech.glide:compiler:${Version.glideVersion}"
    }

    object Retrofit {
        const val retrofitCore = "com.squareup.retrofit2:retrofit:${Version.retrofitVersion}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofitVersion}"
    }

    object OkHttp3 {
        const val okHttpCore = "com.squareup.okhttp3:okhttp:${Version.okHttpVersion}"
        const val okHttpInterceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okHttpVersion}"
    }

    object Gson{
        const val gsonConverter ="com.google.code.gson:gson:${Version.gsonVersion}"
    }

    object AndroidX{
        const val materialDesign = "com.google.android.material:material:${Version.materialDesign}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${Version.constraint}"
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val fragment = "androidx.fragment:fragment:${Version.androidx}"
        const val annotation = "androidx.annotation:annotation:${Version.androidx}"
        const val ktxCore = "androidx.core:core-ktx:${Version.ktxVer}"
    }


}