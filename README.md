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

# Maven
可以unit coverage of java and kotlin
```
cd javaLib
// only javaLib/target/jacoco.exec
mvn clean compile jacoco:prepare-agent test

// javaLib/target/jacoco.exec =>, then +javaLib/target/site/jacoco/.html,.csv, .xml, and sonarqube is reading coverage report from .xml
mvn clean compile jacoco:prepare-agent test jacoco:report

// 不加 kotlin:compile，最后javaLib/target/classes没有kotlin
mvn clean kotlin:compile compile jacoco:prepare-agent test jacoco:report


// 不加 kotlin:compile，最后javaLib/target/test-classes没有kotlin
mvn clean compile kotlin:compile jacoco:prepare-agent kotlin:test-compile test jacoco:report
```

Ref :
- https://maven.apache.org/plugins/index.html
- https://www.jacoco.org/jacoco/trunk/doc/
- https://kotlinlang.org/docs/maven.html#attributes-common-to-jvm-and-js
- https://www.jetbrains.com/help/teamcity/jacoco.html#Importing+JaCoCo+coverage+data+to+TeamCity
- https://docs.sonarqube.org/8.9/analyzing-source-code/test-coverage-and-execution/
- https://confluence.jetbrains.com/display/TCD9/JaCoCo#JaCoCo-ImportingJaCoCocoveragedatatoTeamCity
- https://www.lambdatest.com/blog/reporting-code-coverage-using-maven-and-jacoco-plugin/
- https://kotlinlang.org/docs/maven.html#compile-kotlin-only-source-code


# Newest testing on 2022-12-20
branch = master <br/>
TeamCity Professional 2022.10.1 (build 116934) <br/>
SonarQube Community EditionVersion 8.9.10 (build 61524) <br/>


# Refs
- [TeamCity CI](https://github.com/YingVickyCao/YingVickyCao.github.io/blob/master/doc/tools/teamcity/Readme.md)
