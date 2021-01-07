package com.github.deathnerd.gradlekillerideapluginremux.services

import com.intellij.openapi.project.Project
import com.github.deathnerd.gradlekillerideapluginremux.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
