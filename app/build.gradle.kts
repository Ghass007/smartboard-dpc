plugins { 
    id("com.android.application")
}

android {
    namespace = "com.barakah.smartboard"
    compileSdk = 36
    
    defaultConfig {
        applicationId = "com.barakah.smartboard"
        minSdk = 28
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"
    }
}