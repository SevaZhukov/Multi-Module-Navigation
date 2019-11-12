package com.urbanist.template.di.module.feature

import com.urbanist.template.navigation.auth.di.AuthNavigationModule
import dagger.Module

@Module(includes = [AuthNavigationModule::class])
interface AuthModule