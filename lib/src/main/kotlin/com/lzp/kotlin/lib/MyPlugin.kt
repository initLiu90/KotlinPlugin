package com.lzp.kotlin.lib

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.Copy

class MyPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.run {
            tasks.register("myCopyTask", Copy::class.java) {
                group = "sample"
                from("build.gradle.kts")
                into("build/copy")
            }
        }
    }
}