package com.urbanist.template.navigation.splash.di

import com.urbanist.template.feature.splash.presentation.navigation.SplashNavCommandProvider
import com.urbanist.template.navigation.splash.SplashNavCommandProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface SplashNavigationModule {

    @Binds
    fun bindSplashNavigator(impl: SplashNavCommandProviderImpl): SplashNavCommandProvider
}