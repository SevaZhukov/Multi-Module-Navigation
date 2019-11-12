package com.urbanist.template.feature.auth.presentation.di

import androidx.lifecycle.ViewModelProvider
import com.memebattle.memes.mvvm.viewmodel.ViewModelFactory
import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.auth.domain.signin.SignInUseCase
import com.urbanist.template.feature.auth.domain.di.AuthUseCaseModule
import com.urbanist.template.feature.auth.domain.signup.SignUpUseCase
import com.urbanist.template.feature.auth.presentation.AuthFragment
import com.urbanist.template.feature.auth.presentation.AuthViewModel
import dagger.Module
import dagger.Provides

@Module(includes = [AuthUseCaseModule::class])
class AuthFragmentModule {

	@Provides
	@FragmentScope
	fun provideViewModel(
		owner: AuthFragment,
		signInUseCase: SignInUseCase,
		signUpUseCase: SignUpUseCase
	): AuthViewModel = ViewModelFactory {
		AuthViewModel(
			signInUseCase,
			signUpUseCase
		)
	}.let { viewModelFactory ->
		ViewModelProvider(owner, viewModelFactory)[AuthViewModel::class.java]
	}
}