package com.urbanist.template.feature.splash.presentation.navigation

import com.memebattle.memes.navigation.NavCommand

interface SplashNavCommandProvider {

    val toAuth: NavCommand
    val toMain: NavCommand
}