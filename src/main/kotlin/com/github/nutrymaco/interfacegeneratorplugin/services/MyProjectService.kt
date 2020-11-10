package com.github.nutrymaco.interfacegeneratorplugin.services

import com.intellij.openapi.project.Project
import com.github.nutrymaco.interfacegeneratorplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
