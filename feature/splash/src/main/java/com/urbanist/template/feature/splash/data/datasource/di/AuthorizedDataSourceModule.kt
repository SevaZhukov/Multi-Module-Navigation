package com.urbanist.template.feature.splash.data.datasource.di

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.splash.data.datasource.AuthorizedDataSource
import com.urbanist.template.feature.splash.data.datasource.AuthorizedDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface AuthorizedDataSourceModule {

	@Binds
	@FragmentScope
	fun bindDataSource(impl: AuthorizedDataSourceImpl): AuthorizedDataSource
}