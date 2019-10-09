# EnableCodeCoverage

# Refs
https://docs.gradle.org/current/userguide/jacoco_plugin.html
Enable Android project Code coverage. Repo -> TeamCity -> Sonarqube


# gradle
```
./gradlew / gradle

// 不生成apk
gradle  clean :app:testDebug :javaLib:test

gradle  :javaLib:clean :javaLib:test

gradle  :androidLib:clean  :androidLib:testDebug

gradle  :app:clean  :app:testDebug

gradle  clean :javaLib:test :app:testDebug :androidLib:testDebug 

// 生成apk
gradle  clean :app:assembleDebug :app:testDebug :androidLib:testDebug :javaLib:test

gradle  :javaLib:clean :javaLib:test :javaLib:jacocoTestReport

```
