buildscript {

    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath(Dependencies.KOTLIN)
        classpath(Dependencies.GRADLE)
        classpath(Dependencies.GOOGLE_SERVICES)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven("https://jitpack.io")
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}

apply(from = "https://raw.githubusercontent.com/JakeWharton/SdkSearch/master/gradle/projectDependencyGraph.gradle")