package com.urbanist.template.feature.settings.presentation.di

import androidx.lifecycle.ViewModelProvider
import com.memebattle.memes.mvvm.viewmodel.ViewModelFactory
import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.settings.presentation.SettingsFragment
import com.urbanist.template.feature.settings.presentation.SettingsViewModel
import dagger.Module
import dagger.Provides

@Module
class SettingsFragmentModule {

	@Provides
	@FragmentScope
	fun provideViewModel(
		owner: SettingsFragment
	): SettingsViewModel = ViewModelFactory {
        SettingsViewModel(

        )
	}.let { viewModelFactory ->
		ViewModelProvider(owner, viewModelFactory)[SettingsViewModel::class.java]
	}
}