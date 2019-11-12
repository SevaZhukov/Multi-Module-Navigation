package com.urbanist.template.feature.list.presentation.di

import androidx.lifecycle.ViewModelProvider
import com.urbanist.template.core.di.presentation.viewmodel.ViewModelFactory
import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.list.presentation.ListFragment
import com.urbanist.template.feature.list.presentation.ListViewModel
import dagger.Module
import dagger.Provides

@Module
class ListFragmentModule {

	@Provides
	@FragmentScope
	fun provideViewModel(
		owner: ListFragment
	): ListViewModel = ViewModelFactory {
        ListViewModel(

        )
    }.let { viewModelFactory ->
		ViewModelProvider(owner, viewModelFactory)[ListViewModel::class.java]
	}
}