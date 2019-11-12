package com.urbanist.template.feature.auth.data.repository.di

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.auth.data.datasource.di.AuthDataSourceModule
import com.urbanist.template.feature.auth.data.repository.AuthRepository
import com.urbanist.template.feature.auth.data.repository.AuthRepositoryImpl
import dagger.Binds
import dagger.Module

@Module(includes = [AuthDataSourceModule::class])
interface AuthRepositoryModule {

	@Binds
	@FragmentScope
	fun bindRepository(impl: AuthRepositoryImpl): AuthRepository
}