`lib` is a gradle plugin module which use kotlin language and kotlin dsl.

## How to publish gradle plugin to local maven repository?
Use `publishPluginMavenPulicationToLocalRepository` task to publish gradle plugin.

## How to use custom gradle plugin in project?
1. add local maven into root `build.gradle` file
```
buildscript {
   
    repositories {
        ....
        maven { url "/Users/XXXXX/Workspace/Android/KotlinPlugin/repo" }
    }
    dependencies {
        ....
    }
}
```
2. add `class path` into root `build.gradle` file
```
buildscript {
   
    repositories {
        ....
        maven { url "/Users/XXXXX/Workspace/Android/KotlinPlugin/repo" }
    }
    dependencies {
        ....
        classpath "my:lib:1.2"
    }
}
```
3. add custom gradle plugin into module's `build.gradle.kts` file
```
//build.gradle.kts
import com.lzp.kotlin.lib.ConfigureManager

plugins {
    ....
    id("my-plugin")
}
```

***!!!NOTICE:***
Modules's `build.gradle` file must be converted to `build.gradle.kts` .
Because we can use code completion, navigation to sources, documentation, refactorings etc... only in Gradle Kotlin DSL scripts.