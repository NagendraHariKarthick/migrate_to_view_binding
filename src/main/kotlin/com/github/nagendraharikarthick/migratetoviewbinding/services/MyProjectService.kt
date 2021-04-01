package com.github.nagendraharikarthick.migratetoviewbinding.services

import com.github.nagendraharikarthick.migratetoviewbinding.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
