package com.urbanist.template.navigation.settings.di

import com.urbanist.template.feature.settings.presentation.navigation.SettingsNavCommandProvider
import com.urbanist.template.navigation.settings.SettingsNavCommandProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface SettingsNavigationModule {

    @Binds
    fun bindSettingsNavigator(impl: SettingsNavCommandProviderImpl): SettingsNavCommandProvider
}