package com.urbanist.template.navigation.settings

import com.urbanist.template.R
import com.urbanist.template.core.di.navigation.NavCommand
import com.urbanist.template.feature.settings.presentation.navigation.SettingsNavCommandProvider
import javax.inject.Inject

class SettingsNavCommandProviderImpl @Inject constructor(

) : SettingsNavCommandProvider {

    override val toAuth: NavCommand = NavCommand(R.id.action_mainFragment_to_authFragment2)

}