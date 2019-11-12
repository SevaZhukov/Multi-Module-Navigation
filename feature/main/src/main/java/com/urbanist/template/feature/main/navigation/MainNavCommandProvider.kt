package com.urbanist.template.feature.main.navigation

import com.urbanist.template.core.di.navigation.NavCommand

interface MainNavCommandProvider {

    val toList: NavCommand
    val toProfile: NavCommand
    val toSettings: NavCommand
}