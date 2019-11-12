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
	implementation(Dependencies.CONSTRAINT_LAYOUT)

	implementation(Dependencies.MATERIAL)

	implementation(Dependencies.NAVIGATION)
	implementation(Dependencies.NAVIGATION_UI)

	implementation(project(Modules.CORE))

	implementation(project(Modules.FEATURE_SETTINGS))
	implementation(project(Modules.FEATURE_PROFILE))
	implementation(project(Modules.FEATURE_LIST))

	implementation(project(Modules.MEMES_NAVIGATION))
}
