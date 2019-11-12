package com.urbanist.template.feature.profile.presentation.di

import androidx.lifecycle.ViewModelProvider
import com.urbanist.template.core.di.presentation.viewmodel.ViewModelFactory
import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.profile.presentation.ProfileFragment
import com.urbanist.template.feature.profile.presentation.ProfileViewModel
import dagger.Module
import dagger.Provides

@Module
class ProfileFragmentModule {

    @Provides
    @FragmentScope
    fun provideViewModel(
        owner: ProfileFragment
    ): ProfileViewModel = ViewModelFactory {
        ProfileViewModel(

        )
    }.let { viewModelFactory ->
        ViewModelProvider(owner, viewModelFactory)[ProfileViewModel::class.java]
    }
}