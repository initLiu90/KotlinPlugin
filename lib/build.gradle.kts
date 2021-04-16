plugins {
    `kotlin-dsl`
    `maven-publish`
}

gradlePlugin {
    plugins {
        register("myplugin") {
            id = "my-plugin"
            implementationClass = "com.lzp.kotlin.lib.MyPlugin"
        }
    }
}

group = "my"
version = "1.2"

publishing {
    repositories {
        maven {
            name = "local"
            url = uri("../repo")
        }
    }
}

repositories {
    jcenter()
}