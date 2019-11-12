package com.urbanist.template.di.module

import com.urbanist.template.core.di.di.scope.FragmentScope
import com.urbanist.template.feature.auth.presentation.AuthFragment
import com.urbanist.template.feature.auth.presentation.di.AuthFragmentModule
import com.urbanist.template.feature.list.presentation.ListFragment
import com.urbanist.template.feature.profile.presentation.ProfileFragment
import com.urbanist.template.feature.settings.presentation.SettingsFragment
import com.urbanist.template.feature.settings.presentation.di.SettingsFragmentModule
import com.urbanist.template.feature.splash.presentation.SplashFragment
import com.urbanist.template.feature.splash.presentation.di.SplashFragmentModule
import com.urbanist.template.navigation.list.di.ListNavigationModule
import com.urbanist.template.navigation.profile.di.ProfileNavigationModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AppActivityModule {

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            SplashFragmentModule::class
        ]
    )
    fun splashFragmentInjector(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            AuthFragmentModule::class
        ]
    )
    fun authFragmentInjector(): AuthFragment

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            SettingsFragmentModule::class
        ]
    )
    fun settingsFragmentInjector(): SettingsFragment

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            ProfileNavigationModule::class
        ]
    )
    fun profileFragmentInjector(): ProfileFragment

    @FragmentScope
    @ContributesAndroidInjector(
        modules = [
            ListNavigationModule::class
        ]
    )
    fun listFragmentInjector(): ListFragment
}