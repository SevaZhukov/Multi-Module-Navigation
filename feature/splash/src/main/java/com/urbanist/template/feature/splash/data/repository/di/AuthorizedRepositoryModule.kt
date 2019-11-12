package com.urbanist.template.feature.splash.data.repository.di

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.splash.data.datasource.di.AuthorizedDataSourceModule
import com.urbanist.template.feature.splash.data.repository.AuthorizedRepository
import com.urbanist.template.feature.splash.data.repository.AuthorizedRepositoryImpl
import dagger.Binds
import dagger.Module

@Module(includes = [AuthorizedDataSourceModule::class])
interface AuthorizedRepositoryModule {

	@Binds
	@FragmentScope
	fun bindRepository(impl: AuthorizedRepositoryImpl): AuthorizedRepository
}