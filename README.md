# EnableCodeCoverage

# Refs
https://docs.gradle.org/current/userguide/jacoco_plugin.html
Enable Android project Code coverage. Repo -> TeamCity -> Sonarqube


# gradle
```
./gradlew / gradle
// 生成apk
gradle  clean :app:assembleDebug :app:testDebug :javaLib:test

// 不生成apk
gradle  clean :app:testDebug :javaLib:test

gradle  clean :androidLib:testDebug


gradle  :javaLib:clean :javaLib:test

gradle  :androidLib:clean  :androidLib:testDebug
```
