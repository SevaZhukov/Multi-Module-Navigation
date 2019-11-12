package com.urbanist.template.di.module.feature

import com.urbanist.template.navigation.host.GlobalHostModule
import com.urbanist.template.navigation.splash.di.SplashNavigationModule
import dagger.Module

@Module(includes = [SplashNavigationModule::class, GlobalHostModule::class])
interface SplashModule