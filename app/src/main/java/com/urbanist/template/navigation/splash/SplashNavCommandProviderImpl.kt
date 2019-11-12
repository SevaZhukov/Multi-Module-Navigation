package com.urbanist.template.navigation.splash

import com.memebattle.memes.navigation.NavCommand
import com.urbanist.template.R
import com.urbanist.template.feature.splash.presentation.navigation.SplashNavCommandProvider
import javax.inject.Inject

class SplashNavCommandProviderImpl @Inject constructor() : SplashNavCommandProvider {

    override val toAuth: NavCommand = NavCommand(R.id.action_splashFragment_to_authFragment)

    override val toMain: NavCommand = NavCommand(R.id.action_splashFragment_to_mainFragment)
}