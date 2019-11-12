package com.urbanist.template.di.module.feature

import com.urbanist.template.navigation.profile.di.ProfileNavigationModule
import dagger.Module

@Module(includes = [ProfileNavigationModule::class])
interface ProfileModule