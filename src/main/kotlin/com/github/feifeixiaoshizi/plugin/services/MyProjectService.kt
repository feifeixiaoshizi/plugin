package com.github.feifeixiaoshizi.plugin.services

import com.github.feifeixiaoshizi.plugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
