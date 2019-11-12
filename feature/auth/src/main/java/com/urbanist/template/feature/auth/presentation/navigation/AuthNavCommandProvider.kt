package com.urbanist.template.feature.auth.presentation.navigation

import com.memebattle.memes.navigation.NavCommand

interface AuthNavCommandProvider {

    val toMain: NavCommand
}