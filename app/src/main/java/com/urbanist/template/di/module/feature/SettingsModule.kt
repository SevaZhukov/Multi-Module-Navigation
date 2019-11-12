package com.urbanist.template.di.module.feature

import com.urbanist.template.navigation.settings.di.SettingsNavigationModule
import dagger.Module

@Module(includes = [SettingsNavigationModule::class])
interface SettingsModule