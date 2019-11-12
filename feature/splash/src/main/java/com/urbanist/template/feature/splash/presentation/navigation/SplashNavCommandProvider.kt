package com.urbanist.template.feature.splash.presentation.navigation

import com.urbanist.template.core.di.navigation.NavCommand

interface SplashNavCommandProvider {

    val toAuth: NavCommand
    val toMain: NavCommand
}