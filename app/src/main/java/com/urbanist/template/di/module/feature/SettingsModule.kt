package com.urbanist.template.di.module.feature

import com.urbanist.template.navigation.host.GlobalHostModule
import com.urbanist.template.navigation.settings.di.SettingsNavigationModule
import dagger.Module

@Module(includes = [SettingsNavigationModule::class, GlobalHostModule::class])
interface SettingsModule