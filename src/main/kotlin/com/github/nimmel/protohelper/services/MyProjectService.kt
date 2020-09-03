package com.github.nimmel.protohelper.services

import com.intellij.openapi.project.Project
import com.github.nimmel.protohelper.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
