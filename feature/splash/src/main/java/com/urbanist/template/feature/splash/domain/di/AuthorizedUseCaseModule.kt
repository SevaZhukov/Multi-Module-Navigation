package com.urbanist.template.feature.splash.domain.di

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.splash.data.repository.di.AuthorizedRepositoryModule
import com.urbanist.template.feature.splash.domain.AuthorizedUseCase
import com.urbanist.template.feature.splash.domain.AuthorizedUseCaseImpl
import dagger.Binds
import dagger.Module

@Module(includes = [AuthorizedRepositoryModule::class])
interface AuthorizedUseCaseModule {

	@Binds
	@FragmentScope
	fun bindUseCase(impl: AuthorizedUseCaseImpl): AuthorizedUseCase
}