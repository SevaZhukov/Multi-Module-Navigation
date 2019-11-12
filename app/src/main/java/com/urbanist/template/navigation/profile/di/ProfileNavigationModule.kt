package com.urbanist.template.navigation.profile.di

import com.urbanist.template.feature.profile.presentation.navigation.ProfileNavCommandProvider
import com.urbanist.template.navigation.profile.ProfileNavCommandProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface ProfileNavigationModule {

    @Binds
    fun bindSettingsNavigator(impl: ProfileNavCommandProviderImpl): ProfileNavCommandProvider
}