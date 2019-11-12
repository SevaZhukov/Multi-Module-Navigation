package com.urbanist.template.feature.auth.data.datasource.di

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.auth.data.datasource.AuthFBDataSource
import com.urbanist.template.feature.auth.data.datasource.AuthFBDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface AuthDataSourceModule {

	@Binds
	@FragmentScope
	fun bindFBDataSource(impl: AuthFBDataSourceImpl): AuthFBDataSource
}