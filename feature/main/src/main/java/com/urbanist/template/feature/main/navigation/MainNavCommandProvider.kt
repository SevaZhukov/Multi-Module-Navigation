package com.urbanist.template.feature.main.navigation

import com.memebattle.memes.navigation.NavCommand

interface MainNavCommandProvider {

    val toList: NavCommand
    val toProfile: NavCommand
    val toSettings: NavCommand
}