# java-api-client

[![CircleCI](https://circleci.com/gh/ClouDesire/java-api-client.svg?style=svg)](https://circleci.com/gh/ClouDesire/java-api-client) [ ![Download](https://api.bintray.com/packages/cloudesire/maven-releases/cloudesire-api-client/images/download.svg) ](https://bintray.com/cloudesire/maven-releases/cloudesire-api-client/_latestVersion)

Java 7 client to consume the cloudesire API, based on [retrofit](https://github.com/square/retrofit).

Configure latest version number showed in the upper badge instead of `[VERSION_HERE]` mentioned below.

## Maven usage

Add the dependency to your pom.xml:

```
<dependency>
  <groupId>com.cloudesire.platform</groupId>
  <artifactId>cloudesire-api-client</artifactId>
  <version>[VERSION_HERE]</version>
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

    compile 'com.cloudesire.platform:cloudesire-api-client:[VERSION_HERE]'
    
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
