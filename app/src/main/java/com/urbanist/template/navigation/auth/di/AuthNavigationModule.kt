package com.urbanist.template.navigation.auth.di

import com.urbanist.template.feature.auth.presentation.navigation.AuthNavCommandProvider
import com.urbanist.template.navigation.auth.AuthNavCommandProviderImpl
import dagger.Binds
import dagger.Module

@Module
interface AuthNavigationModule {

    @Binds
    fun bindAuthNavCommandProvide(impl: AuthNavCommandProviderImpl): AuthNavCommandProvider
}