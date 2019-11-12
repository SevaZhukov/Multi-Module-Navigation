package com.urbanist.template.navigation.auth

import com.memebattle.memes.navigation.NavCommand
import com.urbanist.template.R
import com.urbanist.template.feature.auth.presentation.navigation.AuthNavCommandProvider
import javax.inject.Inject

class AuthNavCommandProviderImpl @Inject constructor() : AuthNavCommandProvider {

    override val toMain: NavCommand = NavCommand(R.id.action_authFragment_to_mainFragment)
}