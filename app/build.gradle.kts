plugins { 
    id("com.android.application")
    id("org.jetbrains.kotlin.android") 
}
android {
    namespace = "com.barakah.smartboard"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.barakah.smartboard"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}
