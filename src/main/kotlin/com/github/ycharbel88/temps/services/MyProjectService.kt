package com.github.ycharbel88.temps.services

import com.github.ycharbel88.temps.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
