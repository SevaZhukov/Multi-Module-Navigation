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

	buildTypes {
		getByName(Config.BUILD_TYPE_RELEASE) {
			buildConfigField(
				Config.TYPE_STRING,
				Config.CONFIG_FIELD_BACKEND_ENDPOINT,
				Config.BACKEND_ENDPOINT_PROD
			)
			isMinifyEnabled = true
			proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
		}
		getByName(Config.BUILD_TYPE_DEBUG) {
			buildConfigField(
				Config.TYPE_STRING,
				Config.CONFIG_FIELD_BACKEND_ENDPOINT,
				Config.BACKEND_ENDPOINT_DEV
			)
			isMinifyEnabled = false
		}
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

	implementation(Dependencies.RETROFIT)
	implementation(Dependencies.RETROFIT_RX_ADAPTER)
	implementation(Dependencies.RETROFIT_CONVERTER_GSON)

	implementation(Dependencies.OKHTTP_INTERCEPTOR)

	implementation(Dependencies.NAVIGATION)
	implementation(Dependencies.NAVIGATION_UI)

	implementation(Dependencies.FIREBASE_AUTH)

	implementation(project(Modules.MEMES_NAVIGATION))
	implementation(project(Modules.MEMES_MVVM))
}
