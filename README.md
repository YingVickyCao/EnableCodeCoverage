# EnableCodeCoverage

# gradle

`./gradlew / gradle`
```

gradle  clean :app:testDebug :javaLib:test

gradle  :javaLib:clean :javaLib:test

gradle  :androidLib:clean  :androidLib:testDebug

gradle  :app:clean  :app:testDebug

// 不生成apk
gradle clean :app:testDebug :androidLib:testDebug :javaLib:test 

// 生成apk
gradle  clean :app:assembleDebug :app:testDebug :androidLib:testDebug :javaLib:test

```


# Refs
- [TeamCity CI](https://github.com/YingVickyCao/YingVickyCao.github.io/blob/master/doc/tools/teamcity/TeamCity_CI_setup.md)