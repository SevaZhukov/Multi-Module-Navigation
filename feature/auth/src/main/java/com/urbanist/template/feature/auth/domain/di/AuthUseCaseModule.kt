package com.urbanist.template.feature.auth.domain.di

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.auth.data.repository.di.AuthRepositoryModule
import com.urbanist.template.feature.auth.domain.signin.SignInUseCase
import com.urbanist.template.feature.auth.domain.signin.SignInUseCaseImpl
import com.urbanist.template.feature.auth.domain.signup.SignUpUseCase
import com.urbanist.template.feature.auth.domain.signup.SignUpUseCaseImpl
import dagger.Binds
import dagger.Module

@Module(includes = [AuthRepositoryModule::class])
interface AuthUseCaseModule {

	@Binds
	@FragmentScope
	fun bindSignInUseCase(impl: SignInUseCaseImpl): SignInUseCase

	@Binds
	@FragmentScope
	fun bindSignUpUseCase(impl: SignUpUseCaseImpl): SignUpUseCase
}