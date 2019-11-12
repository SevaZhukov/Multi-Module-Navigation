package com.urbanist.template.di.module.feature

import com.urbanist.template.navigation.list.di.ListNavigationModule
import dagger.Module

@Module(includes = [ListNavigationModule::class])
interface ListModule