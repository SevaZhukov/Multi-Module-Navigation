plugins {
    id(Plugins.ANDROID_APPLICATION)
    id(Plugins.KOTLIN_ANDROID)
    id(Plugins.KOTLIN_EXTENSIONS)
    id(Plugins.KOTLIN_KAPT)
    id(Plugins.GOOGLE_SERVICES)
}

android {
    compileSdkVersion(Config.COMPILE_SDK)

    defaultConfig {
        applicationId = Config.APPLICATION_ID
        minSdkVersion(Config.MIN_SDK)
        targetSdkVersion(Config.TARGET_SDK)
        versionCode = Config.CODE
        versionName = Config.NAME
        multiDexEnabled = true
    }

    dataBinding {
        isEnabled = true
    }
}

dependencies {
    implementation(Dependencies.KOTLIN_STANDARD_LIBRARY)

    implementation(Dependencies.APP_COMPAT)
    implementation(Dependencies.CORE_KTX)

    implementation(Dependencies.MATERIAL)

    implementation(Dependencies.NAVIGATION)
    implementation(Dependencies.NAVIGATION_UI)

    implementation(Dependencies.RX_JAVA)
    implementation(Dependencies.RX_ANDROID)

    implementation(Dependencies.DESIGN)

    implementation(Dependencies.DAGGER)
    implementation(Dependencies.DAGGER_ANDROID)
    implementation(Dependencies.DAGGER_ANDROID_SUPPORT)
    kapt(Dependencies.DAGGER_COMPILER)
    kapt(Dependencies.DAGGER_ANDROID_PROCESSOR)

    implementation(project(Modules.FEATURE_SPLASH))
    implementation(project(Modules.FEATURE_AUTH))
    implementation(project(Modules.FEATURE_MAIN))
    implementation(project(Modules.FEATURE_SETTINGS))
    implementation(project(Modules.FEATURE_PROFILE))
    implementation(project(Modules.FEATURE_LIST))

    implementation(Dependencies.FIREBASE_AUTH)

    implementation(project(Modules.CORE))
}
