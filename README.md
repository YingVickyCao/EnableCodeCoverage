# EnableCodeCoverage

# gradle

`./gradlew / gradle`
```

// 不生成apk
gradle clean :app:testDebug :androidLib:testDebug :javaLib:test
gradle clean :app:testRelease :androidLib:testRelease :javaLib:test

// 生成apk
gradle clean :app:assembleDebug :app:testDebug :androidLib:testDebug :javaLib:test
gradle clean :app:assembleRelease :app:testRelease :androidLib:testRelease :javaLib:test
```

# Newest testing on 2022-12-20
branch = master
TeamCity Professional 2022.10.1 (build 116934)
SonarQube Community EditionVersion 8.9.10 (build 61524)


# Refs
- [TeamCity CI](https://github.com/YingVickyCao/YingVickyCao.github.io/blob/master/doc/tools/teamcity/Readme.md)