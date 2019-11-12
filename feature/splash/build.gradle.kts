plugins {
	id(Plugins.ANDROID_LIBRARY)
	id(Plugins.KOTLIN_ANDROID)
	id(Plugins.KOTLIN_EXTENSIONS)
	id(Plugins.KOTLIN_KAPT)
}

android {
	compileSdkVersion(Config.COMPILE_SDK)

	defaultConfig {
		minSdkVersion(Config.MIN_SDK)
		targetSdkVersion(Config.TARGET_SDK)
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

	implementation(Dependencies.RX_JAVA)
	implementation(Dependencies.RX_ANDROID)

	implementation(Dependencies.DAGGER)
	implementation(Dependencies.DAGGER_ANDROID)
	implementation(Dependencies.DAGGER_ANDROID_SUPPORT)
	kapt(Dependencies.DAGGER_COMPILER)
	kapt(Dependencies.DAGGER_ANDROID_PROCESSOR)

	implementation(Dependencies.NAVIGATION)
	implementation(Dependencies.NAVIGATION_UI)

	implementation(project(Modules.MEMES_MVVM))
	implementation(project(Modules.MEMES_NAVIGATION))

	implementation(Dependencies.FIREBASE_AUTH)

	implementation(project(Modules.CORE))
}
