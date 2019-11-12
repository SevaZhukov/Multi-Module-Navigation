package com.urbanist.template.feature.auth.presentation.navigation

import com.urbanist.template.core.di.navigation.NavCommand

interface AuthNavCommandProvider {

    val toMain: NavCommand
}