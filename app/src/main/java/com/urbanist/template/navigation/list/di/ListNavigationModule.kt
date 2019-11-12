package com.urbanist.template.navigation.list.di

import com.urbanist.template.feature.list.presentation.navigation.ListNavCommandProvider
import com.urbanist.template.navigation.list.ListNavCommandProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface ListNavigationModule {

    @Binds
    fun bindListNavigator(impl: ListNavCommandProviderImpl): ListNavCommandProvider
}