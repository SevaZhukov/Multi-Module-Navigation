package com.urbanist.template.feature.splash.presentation.di

import androidx.lifecycle.ViewModelProvider
import com.memebattle.memes.mvvm.viewmodel.ViewModelFactory
import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.splash.domain.AuthorizedUseCase
import com.urbanist.template.feature.splash.domain.di.AuthorizedUseCaseModule
import com.urbanist.template.feature.splash.presentation.SplashFragment
import com.urbanist.template.feature.splash.presentation.SplashViewModel
import dagger.Module
import dagger.Provides

@Module(includes = [AuthorizedUseCaseModule::class])
class SplashFragmentModule {

	@Provides
	@FragmentScope
	fun provideViewModel(
		owner: SplashFragment,
		authorizedUseCase: AuthorizedUseCase
	): SplashViewModel = ViewModelFactory {
		SplashViewModel(
			authorizedUseCase
		)
	}.let { viewModelFactory ->
		ViewModelProvider(owner, viewModelFactory)[SplashViewModel::class.java]
	}
}