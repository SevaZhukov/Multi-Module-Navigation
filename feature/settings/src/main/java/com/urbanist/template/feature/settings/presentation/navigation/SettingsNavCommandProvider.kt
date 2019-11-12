package com.urbanist.template.feature.settings.presentation.navigation

import com.urbanist.template.core.di.navigation.NavCommand

interface SettingsNavCommandProvider {

    val toAuth: NavCommand
}