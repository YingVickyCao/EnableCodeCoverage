# EnableCodeCoverage

# Refs
https://docs.gradle.org/current/userguide/jacoco_plugin.html
Enable Android project Code coverage. Repo -> TeamCity -> Sonarqube


# gradle
```
./gradlew :javaLib:clean :javaLib:test
/
gradle :javaLib:clean :javaLib:test

// 生成apk
gradle clean :app:assembleDebug :app:testDebug :javaLib:test

```
