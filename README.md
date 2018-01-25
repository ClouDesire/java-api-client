# java-api-client

[![CircleCI](https://circleci.com/gh/ClouDesire/java-api-client.svg?style=svg)](https://circleci.com/gh/ClouDesire/java-api-client) [ ![Download](https://api.bintray.com/packages/cloudesire/maven-releases/cloudesire-api-client/images/download.svg) ](https://bintray.com/cloudesire/maven-releases/cloudesire-api-client/_latestVersion)

Java 7 client to consume the cloudesire API, based on [retrofit](https://github.com/square/retrofit).

## Maven usage

Add the dependency to your pom.xml:

```
<dependency>
  <groupId>com.cloudesire.platform</groupId>
  <artifactId>cloudesire-api-client</artifactId>
  <version>1.0.0</version>
</dependency>
```

Add JCenter repository to your pom.xml:

```
<repositories>
  <repository>
    <id>jcenter</id>
    <url>https://jcenter.bintray.com/</url>
  </repository>
</repositories>
```

## Gradle usage

Add the dependency to build.gradle:

    compile 'com.cloudesire.platform:cloudesire-api-client:1.0.0'
    
Add jcenter repository to build.gradle:

```
buildscript {
    repositories {
        jcenter()
    }
}
```

## Examples

[Basic usage](https://github.com/ClouDesire/examples/blob/master/java-api-client/src/test/java/org/example/client/ClientTest.java)

[Example project](https://github.com/ClouDesire/examples/tree/master/java-api-client)
